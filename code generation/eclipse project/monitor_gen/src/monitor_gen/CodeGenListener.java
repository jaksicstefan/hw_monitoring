package monitor_gen;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CodeGenListener extends StlDraftParserBaseListener {

  // The list for keeping names of all the input signals
  public HashMap<String, String> inputSignalNames;
  public ArrayList<String> generatedSubformulas;
  public ArrayList<String> generatedInputs;
  public ArrayList<String> generatedSubMonitors;
  public ArrayList<String> generatedSubMonitorInstantiations;
  public ArrayList<String> generatedSubMonErrorSigs;

  public StringBuffer inputFormula;
  public ParseTree replacementSubTree;

  public HashMap<String, String> substitutions;
  public HashMap<String, String> onceSubstitutions;
  public HashMap<String, String> histSubstitutions;
  public HashMap<String, String> removingDuplicateOnce;
  public HashMap<String, String> removingDuplicateUntil;
  
  public ArrayList<StringBuffer> nested_prev_subs;

  ParseTreeProperty<String> nodeStrings = new ParseTreeProperty<String>();
  private int serialId;
  private int ev0TauMonId;
  private int evABMonId;
  private int subMonInstanceId;
  
  /* Determining whether we shall generate buffered monitor or "clocks algorithm" monitor 
   * for once[a,b] operator. This decision should depend on the values of A and B 
   * parameters. TODO
   * */
  private Boolean generate_clocks_alg_mon = true;  
  private Boolean generate_FIFO_RAM_buffer = false;

  public CodeGenListener() {
    inputFormula = new StringBuffer();
    inputSignalNames = new HashMap<String, String>();
    removingDuplicateOnce = new HashMap<String, String>();
    removingDuplicateUntil = new HashMap<String, String>();
    
    generatedSubformulas = new ArrayList<String>();
    generatedInputs = new ArrayList<String>();
    generatedSubMonitors = new ArrayList<String>();
    generatedSubMonitorInstantiations = new ArrayList<String>();
    generatedSubMonErrorSigs = new ArrayList<String>();
    
    nested_prev_subs = new ArrayList<StringBuffer>(10);
    substitutions = new HashMap<String, String>(10);
    onceSubstitutions  = new HashMap<String, String>(10);
    histSubstitutions  = new HashMap<String, String>(10);
    
    serialId = 1000;
  }

  public void enterStl_input(StlDraftParser.Stl_inputContext ctx) {
  }

  public void exitStl_input(StlDraftParser.Stl_inputContext ctx) {

    StringBuffer auxStrBuf;

    Set<String> kset = substitutions.keySet();
    Iterator it = kset.iterator();

    while (it.hasNext()) {

      auxStrBuf = new StringBuffer();
      String curKey = (String) it.next();

      if (substitutions.get(curKey).contains("_ssub")) {
        auxStrBuf.append(substitutions.get(curKey) + " <= " + curKey
            + substitutions.get(curKey) + " )");
      } else
        auxStrBuf.append(substitutions.get(curKey) + " <= " + curKey);

      generatedSubformulas.add(auxStrBuf.toString() + ";");

      it.remove(); // avoids a ConcurrentModificationException
    }

    Set<String> kset1 = inputSignalNames.keySet();
    Iterator it1 = kset1.iterator();

    while (it1.hasNext()) {

      auxStrBuf = new StringBuffer();
      String curKey = (String) it1.next();

      auxStrBuf.append(curKey);
      generatedInputs.add(auxStrBuf.toString());

      it1.remove(); // avoids a ConcurrentModificationException
    }

  }

  @Override
  public void enterAssertion_decl(StlDraftParser.Assertion_declContext ctx) {
  }

  @Override
  public void exitAssertion_decl(StlDraftParser.Assertion_declContext ctx) {
  }

  @Override
  public void enterLogOnce(StlDraftParser.LogOnceContext ctx) {
  }

  public void exitLogOnce(StlDraftParser.LogOnceContext ctx) {
    // System.out.println("/nLOG ONCE EXIT DETECTED/n>>>>>>/n");

  }

  @Override
  public void enterLogHistorically(StlDraftParser.LogHistoricallyContext ctx) {
  }

  @Override
  public void exitLogHistorically(StlDraftParser.LogHistoricallyContext ctx) {
    
  }

  @Override
  public void enterLogEventually(StlDraftParser.LogEventuallyContext ctx) {
  }

  public void exitLogEventually(StlDraftParser.LogEventuallyContext ctx) {
    //System.out.println("\nONCE [0, TAU] OPERATOR DETECTED, RULE EXIT /n>>>>>>/n");
  }

  @Override
  public void enterLogUntil(StlDraftParser.LogUntilContext ctx) {
  }

  @Override
  public void exitLogUntil(StlDraftParser.LogUntilContext ctx) {
  }

  @Override
  public void enterLogXor(StlDraftParser.LogXorContext ctx) {
  }

  @Override
  public void exitLogXor(StlDraftParser.LogXorContext ctx) {
  }

  @Override
  public void enterLogSince(StlDraftParser.LogSinceContext ctx) {
  }

  public void exitLogSince(StlDraftParser.LogSinceContext ctx) {
    // System.out.println("exitLogSince");
    // System.out.println(ctx.toString());
    // System.out.println(ctx.toStringTree());
  }

  @Override
  public void enterLogImplies(StlDraftParser.LogImpliesContext ctx) {
  }

  @Override
  public void exitLogImplies(StlDraftParser.LogImpliesContext ctx) {
  }

  @Override
  public void enterLogAlways(StlDraftParser.LogAlwaysContext ctx) {
  }

  @Override
  public void exitLogAlways(StlDraftParser.LogAlwaysContext ctx) {
  }

  @Override
  public void enterBoolLiteral(StlDraftParser.BoolLiteralContext ctx) {
  }

  @Override
  public void exitBoolLiteral(StlDraftParser.BoolLiteralContext ctx) {
  }

  @Override
  public void enterBoolExprRealComparison(
      StlDraftParser.BoolExprRealComparisonContext ctx) {
  }

  @Override
  public void exitBoolExprRealComparison(
      StlDraftParser.BoolExprRealComparisonContext ctx) {
  }

  @Override
  public void enterLogAnd(StlDraftParser.LogAndContext ctx) {
  }

  @Override
  public void exitLogAnd(StlDraftParser.LogAndContext ctx) {
  }

  public void enterLogNot(StlDraftParser.LogNotContext ctx) {
  }

  @Override
  public void exitLogNot(StlDraftParser.LogNotContext ctx) {
  }

  @Override
  public void enterLogIff(StlDraftParser.LogIffContext ctx) {
  }

  @Override
  public void exitLogIff(StlDraftParser.LogIffContext ctx) {
  }

  @Override
  public void enterBoolId(StlDraftParser.BoolIdContext ctx) {
  }

  @Override
  public void exitBoolId(StlDraftParser.BoolIdContext ctx) {
  }

  @Override
  public void enterBoolParens(StlDraftParser.BoolParensContext ctx) {
  }

  @Override
  public void exitBoolParens(StlDraftParser.BoolParensContext ctx) {
  }

  public void enterLogPrevious(StlDraftParser.LogPreviousContext ctx) {

  }

  public void exitLogPrevious(StlDraftParser.LogPreviousContext ctx) {

    /*
     * StringBuffer propString = new StringBuffer(); ParseTree myCtx =
     * ctx.children.get(0);
     * 
     * for (int i = 0; i < myCtx.getChildCount(); i++) {
     * propString.append(nodeStrings.get(myCtx.getChild(i)).trim()+" "); }
     * 
     * 
     * if (substitutions.containsKey(propString.toString())) //if the
     * substitution exists, use it propString = new
     * StringBuffer(substitutions.get(propString.toString())); else {
     * substitutions.put(propString.toString(), "_sub" + serialId); propString =
     * new StringBuffer("_sub" + serialId++); }
     * 
     * System.out.println("PREV put " + myCtx.toString() +
     * propString.toString());
     * 
     * nodeStrings.put(myCtx, propString.toString());
     */
  }

  @Override
  public void enterLogOr(StlDraftParser.LogOrContext ctx) {    
  }

  @Override
  public void exitLogOr(StlDraftParser.LogOrContext ctx) {
  }

  @Override
  public void enterLogAssign(StlDraftParser.LogAssignContext ctx) {
  }

  @Override
  public void exitLogAssign(StlDraftParser.LogAssignContext ctx) {
  }

  @Override
  public void enterAll_range_float_literal(
      StlDraftParser.All_range_float_literalContext ctx) {
  }

  @Override
  public void exitAll_range_float_literal(
      StlDraftParser.All_range_float_literalContext ctx) {
  }

  @Override
  public void enterOpen_float_literal_range(
      StlDraftParser.Open_float_literal_rangeContext ctx) {
  }

  @Override
  public void exitOpen_float_literal_range(
      StlDraftParser.Open_float_literal_rangeContext ctx) {
  }

  @Override
  public void enterClose_float_literal_range(
      StlDraftParser.Close_float_literal_rangeContext ctx) {
  }

  @Override
  public void exitClose_float_literal_range(
      StlDraftParser.Close_float_literal_rangeContext ctx) {
  }

  @Override
  public void enterLeft_open_float_literal_range(
      StlDraftParser.Left_open_float_literal_rangeContext ctx) {
  }

  @Override
  public void exitLeft_open_float_literal_range(
      StlDraftParser.Left_open_float_literal_rangeContext ctx) {
  }

  @Override
  public void enterLeft_closed_float_literal_range(
      StlDraftParser.Left_closed_float_literal_rangeContext ctx) {
  }

  @Override
  public void exitLeft_closed_float_literal_range(
      StlDraftParser.Left_closed_float_literal_rangeContext ctx) {
  }

  @Override
  public void enterFloat_literal_range(
      StlDraftParser.Float_literal_rangeContext ctx) {
  }

  @Override
  public void exitFloat_literal_range(
      StlDraftParser.Float_literal_rangeContext ctx) {
  }

  @Override
  public void enterRealEqual(StlDraftParser.RealEqualContext ctx) {
  }

  @Override
  public void exitRealEqual(StlDraftParser.RealEqualContext ctx) {
  }

  @Override
  public void enterRealNotEqual(StlDraftParser.RealNotEqualContext ctx) {
  }

  @Override
  public void exitRealNotEqual(StlDraftParser.RealNotEqualContext ctx) {
  }

  @Override
  public void enterRealLessEqual(StlDraftParser.RealLessEqualContext ctx) {
  }

  @Override
  public void exitRealLessEqual(StlDraftParser.RealLessEqualContext ctx) {
  }

  @Override
  public void enterRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx) {
  }

  @Override
  public void exitRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx) {
  }

  @Override
  public void enterRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx) {
  }

  @Override
  public void exitRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx) {
  }

  @Override
  public void enterRealLessThan(StlDraftParser.RealLessThanContext ctx) {
  }

  @Override
  public void exitRealLessThan(StlDraftParser.RealLessThanContext ctx) {
  }

  @Override
  public void enterRealId(StlDraftParser.RealIdContext ctx) {
  }

  @Override
  public void exitRealId(StlDraftParser.RealIdContext ctx) {
  }

  @Override
  public void enterRealLiteral(StlDraftParser.RealLiteralContext ctx) {
  }

  @Override
  public void exitRealLiteral(StlDraftParser.RealLiteralContext ctx) {
  }

  @Override
  public void enterRealSubtract(StlDraftParser.RealSubtractContext ctx) {
  }

  @Override
  public void exitRealSubtract(StlDraftParser.RealSubtractContext ctx) {
  }

  @Override
  public void enterRealAdd(StlDraftParser.RealAddContext ctx) {
  }

  @Override
  public void exitRealAdd(StlDraftParser.RealAddContext ctx) {
  }

  @Override
  public void enterRealDivide(StlDraftParser.RealDivideContext ctx) {
  }

  @Override
  public void exitRealDivide(StlDraftParser.RealDivideContext ctx) {
  }

  @Override
  public void enterRealParens(StlDraftParser.RealParensContext ctx) {
  }

  @Override
  public void exitRealParens(StlDraftParser.RealParensContext ctx) {
  }

  @Override
  public void enterRealAssign(StlDraftParser.RealAssignContext ctx) {
  }

  @Override
  public void exitRealAssign(StlDraftParser.RealAssignContext ctx) {
  }

  @Override
  public void enterRealMultiply(StlDraftParser.RealMultiplyContext ctx) {
  }

  @Override
  public void exitRealMultiply(StlDraftParser.RealMultiplyContext ctx) {
  }

  @Override
  public void enterConstDeclaration(StlDraftParser.ConstDeclarationContext ctx) {
  }

  @Override
  public void exitConstDeclaration(StlDraftParser.ConstDeclarationContext ctx) {
  }

  @Override
  public void enterVarDeclaration(StlDraftParser.VarDeclarationContext ctx) {
  }

  @Override
  public void exitVarDeclaration(StlDraftParser.VarDeclarationContext ctx) {
  }

  @Override
  public void enterFloatNumber(StlDraftParser.FloatNumberContext ctx) {
  }

  @Override
  public void exitFloatNumber(StlDraftParser.FloatNumberContext ctx) {
  }

  @Override
  public void enterBoolValue(StlDraftParser.BoolValueContext ctx) {
  }

  @Override
  public void exitBoolValue(StlDraftParser.BoolValueContext ctx) {
  }

  @Override
  public void enterPrevIdentifier(StlDraftParser.PrevIdentifierContext ctx) {
  }

  @Override
  public void exitPrevIdentifier(StlDraftParser.PrevIdentifierContext ctx) {
  }

  @Override
  public void enterPrevPrevPTE(StlDraftParser.PrevPrevPTEContext ctx) {
  }

  @Override
  public void exitPrevPrevPTE(StlDraftParser.PrevPrevPTEContext ctx) {
  }

  @Override
  public void enterPrevLeftPteRight(StlDraftParser.PrevLeftPteRightContext ctx) {
  }

  @Override
  public void exitPrevLeftPteRight(StlDraftParser.PrevLeftPteRightContext ctx) {
  }

  @Override
  public void enterPrevLeftBoolExprRight(
      StlDraftParser.PrevLeftBoolExprRightContext ctx) {
  }

  @Override
  public void exitPrevLeftBoolExprRight(
      StlDraftParser.PrevLeftBoolExprRightContext ctx) {
  }

  public void enterEveryRule(ParserRuleContext ctx) {
  }

  public void exitEveryRule(ParserRuleContext ctx) {
    String propagate_string;
    StringBuffer propString = new StringBuffer();
    
    if ((ctx.getChildCount() > 1) && (ctx.getChild(1).getText().equalsIgnoreCase("since"))) { // handling since
           
      if (ctx.getChildCount() == 4) {
        
        //TODO - remove this code
        // bounded SINCE operator was covered by rewriting rule in preprocessing stage
        propagate_string = process_bounded_since_op(ctx);
        nodeStrings.put(ctx, propagate_string);                                      // propagate up the tree
      }
      else {  //unbounded since operator
        propagate_string = process_unbounded_since_op(ctx);        
        nodeStrings.put(ctx, propagate_string);                                      // propagate up the tree
      }
    }    
    else if (ctx.getChild(0).getText().equalsIgnoreCase("prev")) {                      // handling PREV operator
      propagate_string = process_prev_op(ctx);
      nodeStrings.put(ctx, propagate_string);
    }
    else if ((ctx.getChild(0).getText().equalsIgnoreCase("once")) && (ctx.getChildCount()>2)) {                // handling ONCE operator      
      String word1 = ctx.getChild(1).getText();
      int rBrace_pos = ctx.getChild(1).getText().indexOf(']');
      int lBrace_pos = ctx.getChild(1).getText().indexOf('[');
      String window_token = ctx.getChild(1).getText();
      int param_a = Integer.parseInt(window_token.substring(lBrace_pos + 1 , window_token.indexOf(":")));
      int param_b = Integer.parseInt(window_token.substring(window_token.indexOf(":")+1, rBrace_pos));
      
      if (word1.trim().indexOf("[0") != -1) {             //generate monitor once[0,TAU]
        propagate_string = process_once_op_0_Tau(ctx);
        nodeStrings.put(ctx, propagate_string);
      }
      else { //  generate monitor once[a,b]F in different ways
             // 1. pure register implementation (with SLR cells) 
             // 2. buffering values with FIFO buffers implemented on bRAMs
             // 3. "clocks" algorithm        

        //TODO - check these values
        //if ((param_a < 1000) && ((param_b - param_a) > 10 )) {  //up to moderate depth and low variability
        if (true) {  //TODO
          propagate_string = process_once_op_clk_alg(ctx);
          nodeStrings.put(ctx, propagate_string);
        }
        //else if (generate_FIFO_RAM_buffer){
        else if (generate_FIFO_RAM_buffer){ //TODO - set clear decision criteria here
          propagate_string = process_once_op_FIFO_bRAM_buffer(ctx);
          nodeStrings.put(ctx, propagate_string);
          
        }
        else {
          
          //TODO - add bounded buffer generation
          //generate buffered once_monitor
          //propagate_string = process_once_op_buffer_alg(ctx);
          //nodeStrings.put(ctx, propagate_string);
        }
        
      }
    }
    else if (ctx.getChild(0).getText().equalsIgnoreCase("once")) {                      //handling ONCE operator
      propagate_string = process_once_op(ctx);
      nodeStrings.put(ctx, propagate_string);
    }
    else if (ctx.getChild(0).getText().equalsIgnoreCase("historically")) {              //handling HISTORICALLY operator
      
      if (ctx.getChildCount() == 3) {                                                   //bounded historically operator
       //BOUNDED HISTORICALLY OPERATOR WILL NEVER APPEAR HERE
       //IT IS RESOLVED BY USING REWRITING RULE IN PRE-PROCESSING
      }
      else {                                                                            //process unbounded historically operator      
        propagate_string = process_historically_op(ctx);
        nodeStrings.put(ctx, propagate_string);
      }
    }
    else if ((ctx.getChildCount() > 1) && (ctx.getChild(1).getText().equalsIgnoreCase("until"))) { //handling UNTIL operator
      
      if (ctx.getChildCount() == 3) {                                                   //unbounded UNTIL operator
        //UNBOUNDED SINCE IS NOT SUPPORTED!
      }
      else {                                                                            //process bounded UNTIL operator      
        propagate_string = process_bounded_until_op(ctx);
        nodeStrings.put(ctx, propagate_string);
      }
    }
    else if (ctx.getRuleIndex() != StlDraftParser.RULE_previous_temporal_expression) { // everything but PREVIOUS_TEMPORAL_EXPRESSION
      propString = new StringBuffer();

      for (int i = 0; i < ctx.getChildCount(); i++)
        propString.append(nodeStrings.get(ctx.getChild(i)).trim() + " ");

      nodeStrings.put(ctx, propString.toString());
    }
  }

  private String process_bounded_until_op(ParserRuleContext ctx) {
    
    String first_op, second_op, to_return;

    first_op = nodeStrings.get(ctx.getChild(0));
    second_op = nodeStrings.get(ctx.getChild(3));
    
    if (first_op.contains("("))                                                             //remove braces
      first_op = first_op.substring(2, first_op.length()-2).trim();
    
    if (second_op.contains("("))                                                             //remove braces
      second_op = second_op.substring(2, second_op.length()-2).trim();
   
    //in case first_op is complex expression
    first_op = first_op.replaceAll(" and ", " && ");
    first_op = first_op.replaceAll(" or ", " || ");
    first_op = first_op.replaceAll(" xor ", " ^ ");
    first_op = first_op.replaceAll(" not ", " ! ");
    
    //in case second_op is complex expression
    second_op = second_op.replaceAll(" and ", " && ");
    second_op = second_op.replaceAll(" or ", " || ");
    second_op = second_op.replaceAll(" xor ", " ^ ");
    second_op = second_op.replaceAll(" not ", " ! ");

    
    int rBrace_pos = ctx.getChild(2).getText().indexOf(']');
    int lBrace_pos = ctx.getChild(2).getText().indexOf('[');
    String window_token = ctx.getChild(2).getText();
    
//    System.err.println("\t\t[DEBUG] rBrace_pos " + rBrace_pos + " lBrace_pos "
//        + lBrace_pos);

    System.out.println(window_token);
    
    int param_a = Integer.parseInt(window_token.substring(lBrace_pos + 1 , window_token.indexOf(":")));
    int param_b = Integer.parseInt(window_token.substring(window_token.indexOf(":")+1, rBrace_pos));    
         
    String key = param_a + " " + param_b + " " + first_op + " " + second_op;
    
    if (!removingDuplicateUntil.containsKey(key)) {                                      //create instantiation string    

      StringBuffer instantiation = new StringBuffer();
      instantiation.append("\tuntil_A_B_mon");
      instantiation.append("#(" + param_a + ", "+ param_b + ") " + "__submon_instance" + subMonInstanceId++ + " (\n");
      instantiation.append("\t.clk(clk),\n\t.rst(rst),\n\t.P" + "("+ first_op + "),\n");
      instantiation.append("\t.Q("+ second_op +"),\n\t.err(__submonitor_error_sig" + generatedSubMonitorInstantiations.size() + ")\n\t);\n");
          
//      System.err.println("[DBG]: INSTANTIATION \n"+instantiation);      
      generatedSubMonitorInstantiations.add(instantiation.toString());      
      to_return = "!__submonitor_error_sig" + (generatedSubMonitorInstantiations.size()-1);
          
      generatedSubMonErrorSigs.add(to_return.substring(1));                                    //without ! operator
      removingDuplicateUntil.put(key, to_return);
    }
    else {                                                                                     //return value, but do not generate new wire
      to_return = removingDuplicateUntil.get(key);
    }
    
    return to_return;
  
  
  }

  private String process_bounded_since_op(ParserRuleContext ctx) {
  
    //?/////////////////////
    //this one is handled by rewriting rule in preprocessing stage
   return "";
  
  }

  private String process_unbounded_since_op(ParserRuleContext ctx) {
    StringBuffer propString = new StringBuffer();
    String first_op, second_op;

    first_op = nodeStrings.get(ctx.getChild(0));
    second_op = nodeStrings.get(ctx.getChild(2));

    propString.append(second_op + " or (" + first_op + " and ");

    if (substitutions.containsKey(propString.toString())) {
      //propString = new StringBuffer(substitutions.get(propString.toString()));
      propString.append(substitutions.get(propString.toString()) + " )");
    }
    else {                                                                            // generate new substitution
      substitutions.put(propString.toString(), "_ssub" + serialId);
      propString.append( "_ssub" + serialId++ + " )");
    }
    
    //needs to propagate combinatorial signal
    return propString.toString();
  }

  /////////////////////////////////////////////////////////////////////////////////////
  private String process_once_op_FIFO_bRAM_buffer(ParserRuleContext ctx) {

    Path path = Paths.get("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\template\\template_once_BRAM.v");
    Charset charset = StandardCharsets.UTF_8;
    
    String template_content;
    
    template_content = "";
    try {
      template_content = new String(Files.readAllBytes(path), charset);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    String sig_name;
    sig_name = nodeStrings.get(ctx.getChild(2));
    
    if (sig_name.contains("("))                                                             //remove braces
      sig_name = sig_name.substring(2, sig_name.length()-2).trim();
    
    //in case sig_name is complex expression
    sig_name = sig_name.replaceAll(" and ", " && ");
    sig_name = sig_name.replaceAll(" or ", " || ");
    sig_name = sig_name.replaceAll(" xor ", " ^ ");
    sig_name = sig_name.replaceAll(" not ", " ! ");
    
    int rBrace_pos = ctx.getChild(1).getText().indexOf(']');
    int lBrace_pos = ctx.getChild(1).getText().indexOf('[');
    String window_token = ctx.getChild(1).getText();
    
    //System.out.println(" rBrace_pos " + rBrace_pos + " lBrace_pos " + lBrace_pos);

    //System.out.println(window_token);
    
    int param_a = Integer.parseInt(window_token.substring(lBrace_pos + 1 , window_token.indexOf(":")));
    int param_b = Integer.parseInt(window_token.substring(window_token.indexOf(":")+1, rBrace_pos));
    //System.out.println(template_content);
    
    //instantiate many times for different A,B; however, define only once
    String inst_key = param_a + " " + param_b + " " + sig_name;
    String definition_key = "_FIFO_" + " " + "_RAM_"+ " " + sig_name;
    String to_return;     

    if (!removingDuplicateOnce.containsKey(definition_key)) {                                      //create instantiation string
      removingDuplicateOnce.put(definition_key, template_content);
      generatedSubMonitors.add(template_content);
    }
    
    if (!removingDuplicateOnce.containsKey(inst_key)) {                                      //create instantiation string    

      StringBuffer instantiation = new StringBuffer();
      
      //TODO - make decision which buffer depth is optimal for which property
      instantiation.append("\tonce_FIFO_RAM_buffer_x8_e2048");
      instantiation.append("#(" + param_a + ", "+ param_b + ") " + "__submon_instance" + subMonInstanceId++ + " (\n");
      instantiation.append("\t.clk(clk),\n\t.rst(rst),\n\t.XXX" + "(" + sig_name + "),\n");
      instantiation.append("\t.err(__submonitor_error_sig" + generatedSubMonitorInstantiations.size() + ")\n\t);\n");
          
      //System.out.println(instantiation);      
      generatedSubMonitorInstantiations.add(instantiation.toString());      
      to_return = "!__submonitor_error_sig" + (generatedSubMonitorInstantiations.size()-1);
          
      generatedSubMonErrorSigs.add(to_return.substring(1));                                    //without ! operator
      removingDuplicateOnce.put(inst_key, to_return);
    }
    else {                                                                                     //return value, but do not generate new wire
      to_return = removingDuplicateOnce.get(inst_key);
    }
    
    return to_return;
    }

  //////////////////////////////////////////////////////////////////////////////////////
  private String process_once_op_clk_alg(ParserRuleContext ctx) {
    
    Path path = Paths.get("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\template\\template_once_clocks_alg.v");
    Charset charset = StandardCharsets.UTF_8;
    
    String template_content;
    
    template_content = "";
    try {
      template_content = new String(Files.readAllBytes(path), charset);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    //generate monitor
    //TODO ! eliminate duplicates
    
    String sig_name;
    sig_name = nodeStrings.get(ctx.getChild(2));
    
    if (sig_name.contains("("))                                                             //remove braces
      sig_name = sig_name.substring(2, sig_name.length()-2).trim();
    
    //in case sig_name is complex expression
    sig_name = sig_name.replaceAll(" and ", " && ");
    sig_name = sig_name.replaceAll(" or ", " || ");
    sig_name = sig_name.replaceAll(" xor ", " ^ ");
    sig_name = sig_name.replaceAll(" not ", " ! ");
    
    int rBrace_pos = ctx.getChild(1).getText().indexOf(']');
    int lBrace_pos = ctx.getChild(1).getText().indexOf('[');
    String window_token = ctx.getChild(1).getText();
    
    System.out.println(" rBrace_pos " + rBrace_pos + " lBrace_pos "
        + lBrace_pos);

    System.out.println(window_token);
    
    int param_a = Integer.parseInt(window_token.substring(lBrace_pos + 1 , window_token.indexOf(":")));
    int param_b = Integer.parseInt(window_token.substring(window_token.indexOf(":")+1, rBrace_pos));

    int clk_reg_width = (int) Math.ceil((Math.log(param_a) / Math.log(2)));
    
    Double xxx = Math.ceil(param_b/((param_b - param_a) + 1.0 + 1.0));              //one extra bit for variability, one for low value of input pulse        
    int clk_reg_num   = 2 * xxx.intValue();    
       
    template_content = template_content.replaceAll("____ONCE_A_B_CLK_MON_NAME____", "once_A_B_monitor" + evABMonId );
    //template_content = template_content.replaceAll("____ONCE_A_B_CLK_MON_INPUT_SIG____", sig_name );
    template_content = template_content.replaceAll("____CLK_REG_WIDTH____",  "" + clk_reg_width);
    template_content = template_content.replaceAll("____CLK_REG_NUM____",  "" + clk_reg_num);

    System.out.println(template_content);
    generatedSubMonitors.add(template_content);
    
    String to_return; 
    
    String key = param_a + " " + param_b + " " + sig_name;
    
    if (!removingDuplicateOnce.containsKey(key)) {                                      //create instantiation string    

      StringBuffer instantiation = new StringBuffer();
      instantiation.append("\tonce_A_B_monitor" + evABMonId++);
      instantiation.append("#(" + param_a + ", "+ param_b + ") " + "__submon_instance" + subMonInstanceId++ + " (\n");
      instantiation.append("\t.clk(clk),\n\t.rst(rst),\n\t." + "XXX" + "("+sig_name+"),\n");
      instantiation.append("\t.err(__submonitor_error_sig" + generatedSubMonitorInstantiations.size() + ")\n\t);\n");
          
      System.out.println(instantiation);      
      generatedSubMonitorInstantiations.add(instantiation.toString());      
      to_return = "!__submonitor_error_sig" + (generatedSubMonitorInstantiations.size()-1);
          
      generatedSubMonErrorSigs.add(to_return.substring(1));                                    //without ! operator
      removingDuplicateOnce.put(key, to_return);
    }
    else {                                                                                     //return value, but do not generate new wire
      to_return = removingDuplicateOnce.get(key);
    }
    
    return to_return;

  }

  private String process_historically_op(ParserRuleContext ctx) {

    StringBuffer operandString = new StringBuffer();
    StringBuffer propString = new StringBuffer();
    String subsString; 
    
    for (int i = 0; i < ctx.getChildCount() - 1; i++)                                 // skip first child - once
      operandString.append(nodeStrings.get(ctx.getChild(i + 1)).trim() + " ");

     System.err.println(operandString);

    if (onceSubstitutions.containsKey(operandString.toString()))                             // use existing substitution, if such exists
      subsString = substitutions.get(propString.toString());
    else {
      subsString = "_hsub" + serialId++;
      propString.append(operandString.toString() + " && " + subsString);
      substitutions.put(propString.toString(), subsString);
    }
    
    return propString.toString();    
  }

  private String process_prev_op(ParserRuleContext ctx) {

    StringBuffer propString = new StringBuffer();

    for (int i = 0; i < ctx.getChildCount() - 1; i++)                                 // skip first child - PREV
      propString.append(nodeStrings.get(ctx.getChild(i + 1)).trim() + " ");

    if (substitutions.containsKey(propString.toString()))                             // use existing substitution, if such exists
      propString = new StringBuffer(substitutions.get(propString.toString()));
    else {
      substitutions.put(propString.toString(), "_sub" + serialId);
      propString = new StringBuffer("_sub" + serialId++);
    }
    
    return propString.toString();
  }

  
  private String process_once_op(ParserRuleContext ctx) {
    
    StringBuffer operandString = new StringBuffer();
    StringBuffer propString = new StringBuffer();
    String subsString; 
    
    for (int i = 0; i < ctx.getChildCount() - 1; i++)                                 // skip first child - once
      operandString.append(nodeStrings.get(ctx.getChild(i + 1)).trim() + " ");

     System.err.println(operandString);

    if (onceSubstitutions.containsKey(operandString.toString()))                             // use existing substitution, if such exists
      subsString = substitutions.get(propString.toString());
    else {
      subsString = "_sub" + serialId++;
      propString.append(operandString.toString() + " || " + subsString);
      substitutions.put(propString.toString(), subsString);
    }
    
    return propString.toString();    
  }

  private String process_once_op_0_Tau(ParserRuleContext ctx) {

    Path path = Paths.get("C:\\HARMONIA_repo\\code\\code generation\\eclipse project\\monitor_gen\\template\\template_once_0_tau.v");
    Charset charset = StandardCharsets.UTF_8;
    
    String template_content, template_content_vars;
    
    template_content = "";
    try {
      template_content = new String(Files.readAllBytes(path), charset);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    //generate monitor
    //TODO ! eliminate duplicates
    
    String sig_name ;
    sig_name = nodeStrings.get(ctx.getChild(2));
    
    if (sig_name.contains("("))                                                             //remove braces
      sig_name = sig_name.substring(2, sig_name.length()-2).trim();
    
    //in case sig_name is complex expression
    sig_name = sig_name.replaceAll(" and ", " && ");
    sig_name = sig_name.replaceAll(" or ", " || ");
    sig_name = sig_name.replaceAll(" xor ", " ^ ");
    sig_name = sig_name.replaceAll(" not ", " ! ");

    
    int rBrace_pos = ctx.getChild(1).getText().indexOf(']');
    String window_token = ctx.getChild(1).getText();       
        
    int window_depth = Integer.parseInt(window_token.substring(window_token.indexOf(":")+1, rBrace_pos));
    
    //take one extra bit due to overflow
    int msb = (int) Math.ceil((Math.log(window_depth) / Math.log(2)));
    
        
    template_content = template_content.replaceAll("____ONCE_0_TAU_MONITOR_NAME____", "once_0_Tau_monitor" + ev0TauMonId );
    //template_content = template_content.replaceAll("____ONCE_0_TAU_INPUT_SIG____", sig_name);
    template_content = template_content.replaceAll("____ONCE_0_TAU_CNTR_MSB____",  "" + msb);

    System.out.println(template_content);
    generatedSubMonitors.add(template_content);
    
    String to_return; 
    
    String key = window_depth + " " + sig_name;
    
    if (!removingDuplicateOnce.containsKey(key)) {                                      //create instantiation string    

      StringBuffer instantiation = new StringBuffer();
      instantiation.append("\tonce_0_Tau_monitor" + ev0TauMonId++);
      instantiation.append("#("+ window_depth + ") " + "__submon_instance" + subMonInstanceId++ + " (\n");
      instantiation.append("\t.clk(clk),\n\t.rst(rst),\n\t." + "XXX" + "(" + sig_name + "),\n");
      instantiation.append("\t.err(__submonitor_error_sig" + generatedSubMonitorInstantiations.size() + ")\n\t);\n");
          
      System.out.println(instantiation);      
      generatedSubMonitorInstantiations.add(instantiation.toString());      
      to_return = "!__submonitor_error_sig" + (generatedSubMonitorInstantiations.size()-1);
          
      generatedSubMonErrorSigs.add(to_return.substring(1));
      removingDuplicateOnce.put(key, to_return);
    }
    else {                                                                                     //return value, but do not generate new wire
      to_return = removingDuplicateOnce.get(key);
    }
    
    return to_return;
  }
  

  public void visitTerminal(TerminalNode node) {
    nodeStrings.put(node, node.getText());

    // System.out.println("visit Terminal" + node.getText());

    if (node.getSymbol().getType() == StlDraftLexer.IDENTIFIER) {
      inputSignalNames.put(node.getText(), " ");
    }

  }

  @Override
  public void visitErrorNode(ErrorNode node) {
  }

}