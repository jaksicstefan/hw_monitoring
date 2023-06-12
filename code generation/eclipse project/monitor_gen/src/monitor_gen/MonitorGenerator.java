package monitor_gen;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class MonitorGenerator {
	
	private static int monitorId;

  public static void main(String[] args) throws Exception {
		
	  System.out.println("STARTED");
	  
    //////////////////////////////////////////////////////////////////////////////////
    ////////////////////   P R E P R O C E S S I N G     /////////////////////////////

	  FileReader processedFileReader = new FileReader("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\src\\monitor_gen\\ptSTLproperty.txt");
		ANTLRInputStream input   = new ANTLRInputStream(processedFileReader);		
		StlDraftLexer lexer      = new StlDraftLexer(input);		
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		StlDraftParser parser    = new StlDraftParser(tokens);
		
		
		ParseTree tree = parser.stl_input();
		System.out.println("\nTHE TREE before preprocessing: \n "+tree.toStringTree());
		
		ParseTreeWalker walker = new ParseTreeWalker();
		PreProcessingListener ppListener = new PreProcessingListener();
		
		//first do the tree preprocessing
		walker.walk( ppListener, tree);		
		String processedFormula = insert_ws(tree.getText());
		System.out.println("Input formula after preprocessing: " + processedFormula);		
		
		
    //////////////////////////////////////////////////////////////////////////////////
		//////////////////   C O D E   G E N E R A T I O N    ////////////////////////////
		
		parser = new StlDraftParser(new CommonTokenStream(new StlDraftLexer(new ANTLRInputStream(processedFormula) )));
		tree = parser.stl_input();
    System.out.println("\nTHE TREE after preprocessing: \n " + tree.toStringTree());
		
		//then do the tree traversal for code generation
    CodeGenListener codeGenListener = new CodeGenListener();
		walker.walk( codeGenListener, tree);
		
	  System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Main input formula is:");
    System.out.println(codeGenListener.nodeStrings.get(tree));

    System.out.println("\nThe generated ptLTL subformulas are :");
    
    StringBuffer init_subs    = new StringBuffer();
    StringBuffer sub_decl     = new StringBuffer();
    StringBuffer gen_formulas = new StringBuffer();

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //generated formulas postprocessing
    
    for (int i = 0; i < codeGenListener.generatedSubformulas.size(); i++) {
      String strAux = codeGenListener.generatedSubformulas.get(i);
      String strAux1 = codeGenListener.generatedSubformulas.get(i);
      //System.out.println("\t"+ strAux );
      
      if (strAux.contains("_hsub"))                                                    //initialize "historically" operator to 1
        init_subs.append(strAux.substring(0, strAux.indexOf("=")+1) + "1'b1;\n\t ");
      else
        init_subs.append(strAux.substring(0, strAux.indexOf("=")+1) + "1'b0;\n\t ");
      
      sub_decl.append("reg "+ strAux1.substring(0, strAux1.indexOf("<")-1) + ";\n\t");
      gen_formulas.append(strAux1 + "\n\t");
    }
    
    String gf = gen_formulas.toString();
    
    gf = gf.replaceAll(" and ", " && ");
    gf = gf.replaceAll(" or ", " || ");
    gf = gf.replaceAll(" xor ", " ^ ");
    gf = gf.replaceAll(" not ", " ! ");
    
    gf = gf.replaceAll("![\\s]+!", "STEFANFACA");
    
    gen_formulas = new StringBuffer(gf);
    System.out.println(gen_formulas);
    
    StringBuilder inputs = new StringBuilder();
    System.out.println("\nThe generated inputs are :");
    
    for (int i = 0; i < codeGenListener.generatedInputs.size(); i++) {
      System.out.println("\t"+codeGenListener.generatedInputs.get(i));      
      if (i>0) inputs.append("\t");      
      inputs.append("input " + codeGenListener.generatedInputs.get(i) + ",\n");      
    }    
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    
    
    System.out.println("\n>>>>>>>CODE INSERTION BEGINS >>>>>");
    
    Path path = Paths.get("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\template\\generated_monitor.v");
    Path template_path = Paths.get("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\template\\template_composition_monitor.v");
    Charset charset = StandardCharsets.UTF_8;
    
    String template_content = new String(Files.readAllBytes(template_path), charset);

    //initialize template.v with initial content
    Files.write(path, template_content.getBytes(charset));
    
    String content = new String(Files.readAllBytes(path), charset);
    content = content.replaceAll("____MONITOR_NAME____", "auto_generated_monitor"+ monitorId++);
    content = content.replaceAll("____INPUT_LIST_INSERT____", inputs.toString());    
    content = content.replaceAll("____INIT_SUBS____", init_subs.toString());
    content = content.replaceAll("____INSERT_SUB_DECLARATIONS____", sub_decl.toString());
    
    String mainFormula = codeGenListener.nodeStrings.get(tree);
    
    //fix main formula
    mainFormula = mainFormula.replaceAll(" and ", " && ");
    mainFormula = mainFormula.replaceAll(" or ", " || ");
    mainFormula = mainFormula.replaceAll(" xor ", " ^ ");
    mainFormula = mainFormula.replaceAll(" not ", " ! ");
    mainFormula = mainFormula.replaceAll("![\\s]+!", "");

    mainFormula = mainFormula.replaceAll(";", " ");
     
    content = content.replaceAll("____INSERT_MAIN_FORMULA____", mainFormula);
    content = content.replaceAll("____INSERT_GEN_FORMULAS____", gen_formulas.toString());
    
    ///////////////////////////////////////////////////////////////////////////////////////
    // TODO - remove this code from here
    // USE IT IN TOP MONITOR TO OR ALL THE MONITOR OUTPUTS
    // StringBuffer submonErrStrings;
    // for (int i = 0; i < listener.generatedSubMonErrorSigs.size(); i++) {
    //   submonErrStrings.append(" || " + listener.generatedSubMonErrorSigs.get(i));
    // } 
    // content = content.replaceAll("____INSERT_GEN_FORMULAS____", gen_formulas.toString());
    ///////////////////////////////////////////////////////////////////////////////////////
    
    StringBuffer errSigDecl = new StringBuffer();
    
    for (int i = 0; i < codeGenListener.generatedSubMonErrorSigs.size(); i++) {
      errSigDecl.append("wire " + codeGenListener.generatedSubMonErrorSigs.get(i) + ";\n\t");      
    }
    content = content.replaceAll("____INSERT_SUBMONITORS_ERR_SIGS_DECLARATIONS____", errSigDecl.toString());    
    
    StringBuffer instances =  new StringBuffer(); 
    
    for (int i = 0; i < codeGenListener.generatedSubMonitorInstantiations.size(); i++) {
      instances.append(codeGenListener.generatedSubMonitorInstantiations.get(i) + "\n");      
    }
    content = content.replaceAll("____INSERT_SUBMONITORS_INSTANTIATIONS____", instances.toString());
        
    Files.write(path, content.getBytes(charset));

    //insert submodule definitions
    
    StringBuffer submon_defs =  new StringBuffer(); 
    
    for (int i = 0; i < codeGenListener.generatedSubMonitors.size(); i++) {
      submon_defs.append("//--------------- generated submonitor"+i+" start ------------- //\n");
      submon_defs.append(codeGenListener.generatedSubMonitors.get(i) + "\n");
      submon_defs.append("//--------------- generated submonitor"+i+" end --------------- //\n");
    }
    content = content.replaceAll("____INSERT_GEN_SUBMONITORS_DEFINITIONS____", submon_defs.toString());
        
    Files.write(path, content.getBytes(charset));
    
    System.out.println("\n>>>>>>>CODE INSERTION ENDS >>>>>");
	}

  private static String insert_ws(String text) {
    
    //inserts whitespaces
    text = text.replaceAll("and", " and ");

    text = text.replaceAll("\\)", " ) ");
    text = text.replaceAll("\\(", " ( ");
    
    text = text.replaceAll("[^{x,t}]or", " or ");
    text = text.replaceAll("xor", " xor ");
    text = text.replaceAll("not", " not ");
    text = text.replaceAll("since", " since ");
    text = text.replaceAll("until", " until ");
    text = text.replaceAll("eventually", " eventually ");
    text = text.replaceAll("once", " once ");
    text = text.replaceAll("historically", " historically ");    
    
    return text;
  }


}
