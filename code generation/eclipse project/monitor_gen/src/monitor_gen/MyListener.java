package monitor_gen;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.ast.TerminalAST;

public class MyListener extends StlDraftParserBaseListener {
  
  //The list for keeping names of all the input signals
  public ArrayList<String> inputSignalNames;
  public ArrayList<String> generatedSubformulas;
  public StringBuffer inputFormula;
  public ParseTree replacementSubTree;
  
  public ArrayDeque<TerminalNode> terminalList; 
  public ArrayDeque<TerminalNode> opList;
  public HashMap<String,String> substitutions;
  private static int serialId;
  private static int nestedId;
  public ArrayList<StringBuffer> nested_prev_subs;

  
  TerminalAST ast ;
  private int start_recording;
  
  public MyListener() {
    inputFormula = new StringBuffer(); 
    inputSignalNames = new ArrayList<String>();
    generatedSubformulas = new ArrayList<String>();
    
    nested_prev_subs = new ArrayList<StringBuffer>(10);
    substitutions = new HashMap<String,String>(10);
  }
    
  public void enterStl_input(StlDraftParser.Stl_inputContext ctx) {}  
  public void exitStl_input(StlDraftParser.Stl_inputContext ctx) { 
    
    StringBuffer auxStrBuf;
    
    Set<String> kset = substitutions.keySet();
    Iterator it = kset.iterator();
  
    while (it.hasNext()) {
        
        auxStrBuf = new StringBuffer();  
        String curKey = (String) it.next();
        
        auxStrBuf.append( substitutions.get(curKey) + " <= " + curKey);
        generatedSubformulas.add(auxStrBuf.toString());
        
        it.remove(); // avoids a ConcurrentModificationException
    }

  }

  @Override public void enterAssertion_decl(StlDraftParser.Assertion_declContext ctx) { }
  @Override public void exitAssertion_decl(StlDraftParser.Assertion_declContext ctx) { }
  @Override public void enterLogOnce(StlDraftParser.LogOnceContext ctx) { }
  @Override public void exitLogOnce(StlDraftParser.LogOnceContext ctx) { }
  @Override public void enterLogHistorically(StlDraftParser.LogHistoricallyContext ctx) { }

  @Override public void exitLogHistorically(StlDraftParser.LogHistoricallyContext ctx) { }
  @Override public void enterLogEventually(StlDraftParser.LogEventuallyContext ctx) { }
  @Override public void exitLogEventually(StlDraftParser.LogEventuallyContext ctx) { }
  @Override public void enterLogUntil(StlDraftParser.LogUntilContext ctx) { }
  @Override public void exitLogUntil(StlDraftParser.LogUntilContext ctx) { }
  @Override public void enterLogXor(StlDraftParser.LogXorContext ctx) { }
  @Override public void exitLogXor(StlDraftParser.LogXorContext ctx) { }
  @Override public void enterLogSince(StlDraftParser.LogSinceContext ctx) { }
  @Override public void exitLogSince(StlDraftParser.LogSinceContext ctx) { }
  @Override public void enterLogImplies(StlDraftParser.LogImpliesContext ctx) { }
  @Override public void exitLogImplies(StlDraftParser.LogImpliesContext ctx) { }
  @Override public void enterLogAlways(StlDraftParser.LogAlwaysContext ctx) { }
  @Override public void exitLogAlways(StlDraftParser.LogAlwaysContext ctx) { }
  @Override public void enterBoolLiteral(StlDraftParser.BoolLiteralContext ctx) { }
  @Override public void exitBoolLiteral(StlDraftParser.BoolLiteralContext ctx) { }
  @Override public void enterBoolExprRealComparison(StlDraftParser.BoolExprRealComparisonContext ctx) { }
  @Override public void exitBoolExprRealComparison(StlDraftParser.BoolExprRealComparisonContext ctx) { }
  @Override public void enterLogAnd(StlDraftParser.LogAndContext ctx) { }
  @Override public void exitLogAnd(StlDraftParser.LogAndContext ctx) { }
  
  public void enterLogNot(StlDraftParser.LogNotContext ctx) {  }
  
  @Override public void exitLogNot(StlDraftParser.LogNotContext ctx) { }
  @Override public void enterLogIff(StlDraftParser.LogIffContext ctx) { }
  @Override public void exitLogIff(StlDraftParser.LogIffContext ctx) { }
  @Override public void enterBoolId(StlDraftParser.BoolIdContext ctx) { }
  @Override public void exitBoolId(StlDraftParser.BoolIdContext ctx) { }
  @Override public void enterBoolParens(StlDraftParser.BoolParensContext ctx) { }
  @Override public void exitBoolParens(StlDraftParser.BoolParensContext ctx) { }
  
  public void enterLogPrevious(StlDraftParser.LogPreviousContext ctx) {
    start_recording++;
    
    nested_prev_subs.add(new StringBuffer());
    
    if (start_recording>1) {//nested
      
      //TODO ILI URADI PROLAZAK KROZ HASH I BACKPATCHING
      
      //TODO ILI KADA KONKATENIRAS NESTED_STRING DOBRO PAZI DA LI POSTOJI VEC U HASHU. AKO POSTOJI, DODAJ TAJ IZ HASHA, A ONDA KAD DODJE DO UBACIVANJA U HASH, NEMOJ DA UBACUJES NOVI.
      
      //AKO ODBACUJES UBACIVANJE NOVOG, ONDA TO MORAS DA URADIS I ZA __SHIFT###
      
      nested_prev_subs.get(start_recording - 2).append(" __nested_shift" + (nestedId + start_recording-1));
      
      
    }
  }

  public void exitLogPrevious(StlDraftParser.LogPreviousContext ctx) {
    start_recording--;
    
    if (start_recording > 0) {
      nested_prev_subs.get(start_recording).append("===__nested_shift"+ (nestedId + start_recording));     
    }
    else {   //all nested temporal statements processed
      
      for (int i=0; i< nested_prev_subs.size(); i++) {   //put all "nested previous substitutions" into "substitutions" 
        
        if  (nested_prev_subs.get(i).toString().contains("===__nested_shift")) {  //take "nested_shift###" as a key for "substitutions" HashMap 
          
          String key = nested_prev_subs.get(i).substring(nested_prev_subs.get(i).indexOf("===__")+3, nested_prev_subs.get(i).length());          
          nested_prev_subs.get(i).delete(nested_prev_subs.get(i).indexOf("===__"), nested_prev_subs.get(i).length());      
          
          
          
          /*
            if (substitutions.containsKey(nested_prev_subs.get(i).toString())) {
              //backpatching necessary
              
              
            
            }
          */
          
          
          
          
          
          substitutions.put(nested_prev_subs.get(i).toString(), key);
          
        }
        else { //ordinary prev shift , non-nested
          
          if (substitutions.containsKey(nested_prev_subs.get(i).toString())) {   //replace old shift with new shift in input formula

            if (substitutions.get(nested_prev_subs.get(i).toString()).contains("___nested_shift")){   //nested shifts backpatch
              
              //iterate over hash table and re-evaluate keys containing ___nested_shift...
              //TODO
              
              
              
              
            }
            else {  //ordinary backpatch
                    //replace newly initialized shift in inputFormula, which was 
                    //unnecessary, because the shift already exists in the table
                    // with the existing shift from the table
              
              StringBuffer auxInputFormula = new StringBuffer(inputFormula);              
              String shiftName = substitutions.get(nested_prev_subs.get(i).toString());              
              auxInputFormula = new StringBuffer(auxInputFormula.substring(0, auxInputFormula.lastIndexOf("__shift")) + shiftName);              
              inputFormula = auxInputFormula;
              
              /* old_shift = substitutions.get(nested_prev_subs.get(i).toString());
              
              StringBuffer newInputFormula = new StringBuffer(inputFormula);
              StringBuffer auxBuf;
              
              while (newInputFormula.indexOf(old_shift) != -1 ) {
                auxBuf = new StringBuffer(newInputFormula.substring(0, newInputFormula.indexOf(old_shift)) + "__shift" + (serialId) + 
                                          newInputFormula.substring(newInputFormula.indexOf(old_shift) + old_shift.length(), newInputFormula.length()));
                newInputFormula = auxBuf;
                System.out.println("AUX_BUF=" + auxBuf.toString());
              }
              
              inputFormula = newInputFormula; */
            }
          }          
          else 
            substitutions.put(nested_prev_subs.get(i).toString(), "__shift" + serialId++);  //implicitly removes duplicates
          
        }
      }
      nestedId += 10000;    //randomly large value that cannot be reached in previous algorithm interation

      nested_prev_subs.clear();
      
      //eliminate duplicates
      /*  for (int i = 0; i < nested_prev_subs.size(); i++) {
        StringBuffer str2shift = nested_prev_subs.get(i);
        
        if (!substitutions.containsKey(str2shift)) substitutions.put(key, value)
      }
     */ 
    }//last prev
      
      
      
  }
  
  
  @Override public void enterLogOr(StlDraftParser.LogOrContext ctx) { }
  @Override public void exitLogOr(StlDraftParser.LogOrContext ctx) { }
  @Override public void enterLogAssign(StlDraftParser.LogAssignContext ctx) { }
  @Override public void exitLogAssign(StlDraftParser.LogAssignContext ctx) { }
  @Override public void enterAll_range_float_literal(StlDraftParser.All_range_float_literalContext ctx) { }
  @Override public void exitAll_range_float_literal(StlDraftParser.All_range_float_literalContext ctx) { }
  @Override public void enterOpen_float_literal_range(StlDraftParser.Open_float_literal_rangeContext ctx) { }
  @Override public void exitOpen_float_literal_range(StlDraftParser.Open_float_literal_rangeContext ctx) { }
  @Override public void enterClose_float_literal_range(StlDraftParser.Close_float_literal_rangeContext ctx) { }
  @Override public void exitClose_float_literal_range(StlDraftParser.Close_float_literal_rangeContext ctx) { }
  @Override public void enterLeft_open_float_literal_range(StlDraftParser.Left_open_float_literal_rangeContext ctx) { }
  @Override public void exitLeft_open_float_literal_range(StlDraftParser.Left_open_float_literal_rangeContext ctx) { }
  @Override public void enterLeft_closed_float_literal_range(StlDraftParser.Left_closed_float_literal_rangeContext ctx) { }
  @Override public void exitLeft_closed_float_literal_range(StlDraftParser.Left_closed_float_literal_rangeContext ctx) { }
  @Override public void enterFloat_literal_range(StlDraftParser.Float_literal_rangeContext ctx) { }
  @Override public void exitFloat_literal_range(StlDraftParser.Float_literal_rangeContext ctx) { }
  @Override public void enterRealEqual(StlDraftParser.RealEqualContext ctx) { }
  @Override public void exitRealEqual(StlDraftParser.RealEqualContext ctx) { }
  @Override public void enterRealNotEqual(StlDraftParser.RealNotEqualContext ctx) { }
  @Override public void exitRealNotEqual(StlDraftParser.RealNotEqualContext ctx) { }
  @Override public void enterRealLessEqual(StlDraftParser.RealLessEqualContext ctx) { }
  @Override public void exitRealLessEqual(StlDraftParser.RealLessEqualContext ctx) { }
  @Override public void enterRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx) { }
  @Override public void exitRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx) { }
  @Override public void enterRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx) { }
  @Override public void exitRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx) { }
  @Override public void enterRealLessThan(StlDraftParser.RealLessThanContext ctx) { }
  @Override public void exitRealLessThan(StlDraftParser.RealLessThanContext ctx) { }
  @Override public void enterRealId(StlDraftParser.RealIdContext ctx) { }
  @Override public void exitRealId(StlDraftParser.RealIdContext ctx) { }
  @Override public void enterRealLiteral(StlDraftParser.RealLiteralContext ctx) { }
  @Override public void exitRealLiteral(StlDraftParser.RealLiteralContext ctx) { }
  @Override public void enterRealSubtract(StlDraftParser.RealSubtractContext ctx) { }
  @Override public void exitRealSubtract(StlDraftParser.RealSubtractContext ctx) { }
  @Override public void enterRealAdd(StlDraftParser.RealAddContext ctx) { }
  @Override public void exitRealAdd(StlDraftParser.RealAddContext ctx) { }
  @Override public void enterRealDivide(StlDraftParser.RealDivideContext ctx) { }
  @Override public void exitRealDivide(StlDraftParser.RealDivideContext ctx) { }
  @Override public void enterRealParens(StlDraftParser.RealParensContext ctx) { }
  @Override public void exitRealParens(StlDraftParser.RealParensContext ctx) { }
  @Override public void enterRealAssign(StlDraftParser.RealAssignContext ctx) { }
  @Override public void exitRealAssign(StlDraftParser.RealAssignContext ctx) { }
  @Override public void enterRealMultiply(StlDraftParser.RealMultiplyContext ctx) { }
  @Override public void exitRealMultiply(StlDraftParser.RealMultiplyContext ctx) { }
  @Override public void enterConstDeclaration(StlDraftParser.ConstDeclarationContext ctx) { }
  @Override public void exitConstDeclaration(StlDraftParser.ConstDeclarationContext ctx) { }
  @Override public void enterVarDeclaration(StlDraftParser.VarDeclarationContext ctx) { }
  @Override public void exitVarDeclaration(StlDraftParser.VarDeclarationContext ctx) { }
  @Override public void enterFloatNumber(StlDraftParser.FloatNumberContext ctx) { }
  @Override public void exitFloatNumber(StlDraftParser.FloatNumberContext ctx) { }
  @Override public void enterBoolValue(StlDraftParser.BoolValueContext ctx) { }
  @Override public void exitBoolValue(StlDraftParser.BoolValueContext ctx) { }
  
  @Override public void enterPrevIdentifier(StlDraftParser.PrevIdentifierContext ctx) { }
  @Override public void exitPrevIdentifier(StlDraftParser.PrevIdentifierContext ctx) { }
  @Override public void enterPrevPrevPTE(StlDraftParser.PrevPrevPTEContext ctx) { }
  @Override public void exitPrevPrevPTE(StlDraftParser.PrevPrevPTEContext ctx) { }
  @Override public void enterPrevLeftPteRight(StlDraftParser.PrevLeftPteRightContext ctx) { }
  @Override public void exitPrevLeftPteRight(StlDraftParser.PrevLeftPteRightContext ctx) { }
  @Override public void enterPrevLeftBoolExprRight(StlDraftParser.PrevLeftBoolExprRightContext ctx) { }
  @Override public void exitPrevLeftBoolExprRight(StlDraftParser.PrevLeftBoolExprRightContext ctx) { }
  
  public void enterEveryRule(ParserRuleContext ctx) { }
  public void exitEveryRule(ParserRuleContext ctx) { }

  public void visitTerminal(TerminalNode node) { 
   
    //build main formula    
    
    if (start_recording == 1) //create shift text
      if (node.getSymbol().getType() == StlDraftLexer.PREVIOUS)
        inputFormula.append(" __shift"+ serialId);
      else
        nested_prev_subs.get(start_recording-1).append(" "+ node.getText());
      
    else if (start_recording == 0)  //append non-PREVIOUS tokens
          inputFormula.append(" "+ node.getText());
    else {
       if (node.getSymbol().getType() != StlDraftLexer.PREVIOUS) 
         nested_prev_subs.get(start_recording-1).append(" "+ node.getText());
    }
    
    
    //building input formula string

  }

  @Override public void visitErrorNode(ErrorNode node) { }

}
