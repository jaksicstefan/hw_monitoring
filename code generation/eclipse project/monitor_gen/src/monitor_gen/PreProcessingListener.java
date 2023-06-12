package monitor_gen;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

public class PreProcessingListener extends StlDraftParserBaseListener {
  
  StlDraftParser parser;
  
  public PreProcessingListener() {
    
  }  
  
  @Override
  public void enterLogHistorically(StlDraftParser.LogHistoricallyContext ctx) {
      System.out.println("historically entered" + ctx.toString());
      List<ParseTree> old_children = new ArrayList<ParseTree> ();
      
      if (ctx.getChildCount() == 3) {  //do preprocessing for bounded historically operator
      
        for (int i = 0; i < ctx.children.size(); i++) {
          System.out.println(ctx.children.get(i));
          old_children.add(ctx.children.get(i));
        }
       
        ctx.children.clear();
        StringBuffer newExpr = new StringBuffer();
        
        for (int i = 0; i < old_children.size(); i++) {
          System.out.println("OLD child "+ i + " " + old_children.get(i).getText());
        }
        
        newExpr.append("not once"); //instead of historically
        newExpr.append(old_children.get(1).getText() + " ");
        
        String aux_str = "(not ("+ old_children.get(2).getText()  +"))";
                
        //add some whitespace
        aux_str = insert_ws(aux_str);        
        newExpr.append(aux_str);
        
        System.err.println(newExpr.toString());
        
        parser = new StlDraftParser(new CommonTokenStream(new StlDraftLexer(new ANTLRInputStream(newExpr.toString()) )));
        
        ParseTree t = parser.bool_expression();
        ParseTreePattern p = parser.compileParseTreePattern(newExpr.toString(), StlDraftParser.RULE_bool_expression);
        ParseTreeMatch m = p.match(t);        
                
        System.out.println("Generated Tree: " + m.getTree().toStringTree());
        //String id = m.get("ID");
        
        ParseTree newTree = m.getTree();
        
        //RuleContext rc = new RuleContext(ctx.parent, ctx.invokingState);
        
        for (int i = 0; i < newTree.getChildCount(); i++) {
          ctx.children.add(newTree.getChild(i));  //manually adding children
        }
        
      }      
  }

  @Override
  public void exitLogHistorically(StlDraftParser.LogHistoricallyContext ctx) {
  }

  /*
  * This function will convert bounded since operator according to the following rule:
  * P since[a:b] Q  <=>  (historically[0:a] ( P and (P since Q))) and (once[4:6]Q);
  *
  */
  
  public void enterLogSince(StlDraftParser.LogSinceContext ctx) {
    List<ParseTree> old_children = new ArrayList<ParseTree> ();
    String operand1, operand2, param_a, param_b;
    int ix_a, ix_b, ix_colon;
    
    if (ctx.getChildCount() == 4) {  //do preprocessing for bounded since operator
      
      operand1 = insert_ws(ctx.getChild(0).getText());
      operand2 = insert_ws(ctx.getChild(3).getText());
      ix_a = ctx.getChild(2).getText().indexOf("[");
      ix_b = ctx.getChild(2).getText().indexOf("]");
      ix_colon = ctx.getChild(2).getText().indexOf(":");
      param_a = ctx.getChild(2).getText().substring(ix_a+1, ix_colon);
      param_b = ctx.getChild(2).getText().substring(ix_colon+1, ix_b);      
      
      System.err.println("" + param_a + "    " + param_b);
      System.out.println("bounded since preprocessing started" + ctx.toString());
    
      for (int i = 0; i < ctx.children.size(); i++) {
        System.out.println(ctx.children.get(i));
        old_children.add(ctx.children.get(i));
      }
     
      ctx.children.clear();    //remove current children
      
      
      StringBuffer newExpr = new StringBuffer();
      
      for (int i = 0; i < old_children.size(); i++) {
        System.out.println("OLD child "+ i + " " + old_children.get(i).getText());
      }
      
      newExpr.append("(historically[0:"+param_a+"] ( " + operand1 + " and ( "  ); //instead of historically
      newExpr.append( operand1 + " since "+ operand2 + " ))) and (once[" + param_a +":" + param_b + "]"+ operand2 +" )" );

             
      System.err.println(newExpr.toString());
      
      parser = new StlDraftParser(new CommonTokenStream(new StlDraftLexer(new ANTLRInputStream(newExpr.toString()) )));
      
      ParseTree t = parser.bool_expression();
      ParseTreePattern p = parser.compileParseTreePattern(newExpr.toString(), StlDraftParser.RULE_bool_expression);
      ParseTreeMatch m = p.match(t);        
              
      System.out.println("Generated Tree: " + m.getTree().toStringTree());
      //String id = m.get("ID");
      
      ParseTree newTree = m.getTree();
      
      //RuleContext rc = new RuleContext(ctx.parent, ctx.invokingState);
      
      for (int i = 0; i < newTree.getChildCount(); i++) {
        ctx.children.add(newTree.getChild(i));  //manually adding children
      }
      
      
    }
    
    
  }

  public void exitLogSince(StlDraftParser.LogSinceContext ctx) {
    
    
    
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
  
  
  public void visitTerminal(TerminalNode node) {
    
    System.err.println(node.getText());
  }

}
