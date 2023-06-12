// Generated from LTL_grammar/StlDraftParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StlDraftParser}.
 */
public interface StlDraftParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#stl_input}.
	 * @param ctx the parse tree
	 */
	void enterStl_input(StlDraftParser.Stl_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#stl_input}.
	 * @param ctx the parse tree
	 */
	void exitStl_input(StlDraftParser.Stl_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#assertion_decl}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_decl(StlDraftParser.Assertion_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#assertion_decl}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_decl(StlDraftParser.Assertion_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogOnce}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogOnce(StlDraftParser.LogOnceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogOnce}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogOnce(StlDraftParser.LogOnceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogHistorically}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogHistorically(StlDraftParser.LogHistoricallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogHistorically}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogHistorically(StlDraftParser.LogHistoricallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogEventually}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogEventually(StlDraftParser.LogEventuallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogEventually}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogEventually(StlDraftParser.LogEventuallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogUntil}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogUntil(StlDraftParser.LogUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogUntil}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogUntil(StlDraftParser.LogUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogXor}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogXor(StlDraftParser.LogXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogXor}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogXor(StlDraftParser.LogXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogSince}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogSince(StlDraftParser.LogSinceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogSince}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogSince(StlDraftParser.LogSinceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogImplies}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogImplies(StlDraftParser.LogImpliesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogImplies}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogImplies(StlDraftParser.LogImpliesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogAlways}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogAlways(StlDraftParser.LogAlwaysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogAlways}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogAlways(StlDraftParser.LogAlwaysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(StlDraftParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(StlDraftParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprRealComparison}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprRealComparison(StlDraftParser.BoolExprRealComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprRealComparison}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprRealComparison(StlDraftParser.BoolExprRealComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogAnd}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogAnd(StlDraftParser.LogAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogAnd}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogAnd(StlDraftParser.LogAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogNot}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogNot(StlDraftParser.LogNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogNot}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogNot(StlDraftParser.LogNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogIff}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogIff(StlDraftParser.LogIffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogIff}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogIff(StlDraftParser.LogIffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolId}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolId(StlDraftParser.BoolIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolId}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolId(StlDraftParser.BoolIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParens}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolParens(StlDraftParser.BoolParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParens}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolParens(StlDraftParser.BoolParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogPrevious}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogPrevious(StlDraftParser.LogPreviousContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogPrevious}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogPrevious(StlDraftParser.LogPreviousContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogOr}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogOr(StlDraftParser.LogOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogOr}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogOr(StlDraftParser.LogOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogAssign}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogAssign(StlDraftParser.LogAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogAssign}
	 * labeled alternative in {@link StlDraftParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogAssign(StlDraftParser.LogAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#all_range_float_literal}.
	 * @param ctx the parse tree
	 */
	void enterAll_range_float_literal(StlDraftParser.All_range_float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#all_range_float_literal}.
	 * @param ctx the parse tree
	 */
	void exitAll_range_float_literal(StlDraftParser.All_range_float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#open_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void enterOpen_float_literal_range(StlDraftParser.Open_float_literal_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#open_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void exitOpen_float_literal_range(StlDraftParser.Open_float_literal_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#close_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void enterClose_float_literal_range(StlDraftParser.Close_float_literal_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#close_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void exitClose_float_literal_range(StlDraftParser.Close_float_literal_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#left_open_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void enterLeft_open_float_literal_range(StlDraftParser.Left_open_float_literal_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#left_open_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void exitLeft_open_float_literal_range(StlDraftParser.Left_open_float_literal_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#left_closed_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void enterLeft_closed_float_literal_range(StlDraftParser.Left_closed_float_literal_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#left_closed_float_literal_range}.
	 * @param ctx the parse tree
	 */
	void exitLeft_closed_float_literal_range(StlDraftParser.Left_closed_float_literal_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#float_literal_range}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal_range(StlDraftParser.Float_literal_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#float_literal_range}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal_range(StlDraftParser.Float_literal_rangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealEqual(StlDraftParser.RealEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealEqual(StlDraftParser.RealEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealNotEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealNotEqual(StlDraftParser.RealNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealNotEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealNotEqual(StlDraftParser.RealNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealLessEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealLessEqual(StlDraftParser.RealLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLessEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealLessEqual(StlDraftParser.RealLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealGreaterEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealGreaterEqual}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealGreaterEqual(StlDraftParser.RealGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealGreaterThan}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealGreaterThan}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealGreaterThan(StlDraftParser.RealGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealLessThan}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void enterRealLessThan(StlDraftParser.RealLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLessThan}
	 * labeled alternative in {@link StlDraftParser#realComparison}.
	 * @param ctx the parse tree
	 */
	void exitRealLessThan(StlDraftParser.RealLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealId}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealId(StlDraftParser.RealIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealId}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealId(StlDraftParser.RealIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(StlDraftParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(StlDraftParser.RealLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealSubtract}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealSubtract(StlDraftParser.RealSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealSubtract}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealSubtract(StlDraftParser.RealSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealAdd}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealAdd(StlDraftParser.RealAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealAdd}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealAdd(StlDraftParser.RealAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealDivide}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealDivide(StlDraftParser.RealDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealDivide}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealDivide(StlDraftParser.RealDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealParens}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealParens(StlDraftParser.RealParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealParens}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealParens(StlDraftParser.RealParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealAssign}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealAssign(StlDraftParser.RealAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealAssign}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealAssign(StlDraftParser.RealAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealMultiply}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void enterRealMultiply(StlDraftParser.RealMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealMultiply}
	 * labeled alternative in {@link StlDraftParser#realExpression}.
	 * @param ctx the parse tree
	 */
	void exitRealMultiply(StlDraftParser.RealMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(StlDraftParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(StlDraftParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(StlDraftParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(StlDraftParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#floatNumber}.
	 * @param ctx the parse tree
	 */
	void enterFloatNumber(StlDraftParser.FloatNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#floatNumber}.
	 * @param ctx the parse tree
	 */
	void exitFloatNumber(StlDraftParser.FloatNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link StlDraftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(StlDraftParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StlDraftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(StlDraftParser.BoolValueContext ctx);
}