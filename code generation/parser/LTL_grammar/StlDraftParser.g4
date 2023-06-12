parser grammar StlDraftParser;

options {
  tokenVocab=StlDraftLexer;
}

stl_input
:
    ( constDeclaration
    | varDeclaration
    | assertion_decl
    | bool_expression SEMI
    | realExpression SEMI
    )+
;

assertion_decl : ASSERTION IDENTIFIER COLON bool_expression SEMI; //only bool expression

bool_expression
    : LPAREN bool_expression RPAREN                                            #BoolParens
    | IDENTIFIER                                                               #BoolId
    | boolValue                                                                #BoolLiteral
    | realComparison                                                           #BoolExprRealComparison
    | bool_expression ASSIGN bool_expression                                   #LogAssign
    | OP_LOG_NOT bool_expression                                               #LogNot
    | bool_expression OP_LOG_AND bool_expression                               #LogAnd
    | bool_expression OP_LOG_OR bool_expression                                #LogOr
    | bool_expression OP_LOG_XOR bool_expression                               #LogXor
    | bool_expression OP_LOG_IMPLIES bool_expression                           #LogImplies
    | bool_expression OP_LOG_IIFF bool_expression                              #LogIff	
	| bool_expression UNTIL all_range_float_literal? bool_expression           #LogUntil
    | bool_expression SINCE all_range_float_literal? bool_expression           #LogSince
    | EVENTUALLY all_range_float_literal? bool_expression                      #LogEventually
    | ONCE all_range_float_literal? bool_expression                            #LogOnce
    | ALWAYS all_range_float_literal? bool_expression                          #LogAlways
    | HISTORICALLY all_range_float_literal? bool_expression                    #LogHistorically
	| previous_temporal_expression											   #LogPrevious
;

previous_temporal_expression											
	: PREVIOUS IDENTIFIER													   #PrevIdentifier
	| PREVIOUS previous_temporal_expression									   #PrevPrevPTE
	| PREVIOUS LPAREN previous_temporal_expression RPAREN					   #PrevLeftPteRight
	| PREVIOUS LPAREN bool_expression RPAREN								   #PrevLeftBoolExprRight
;	
	
all_range_float_literal
    : open_float_literal_range
    | close_float_literal_range
    | left_open_float_literal_range
    | left_closed_float_literal_range
;

open_float_literal_range : LPAREN float_literal_range RPAREN ;

close_float_literal_range : LBRACK float_literal_range RBRACK ;

left_open_float_literal_range : LPAREN float_literal_range RBRACK ;

left_closed_float_literal_range : LBRACK float_literal_range RPAREN ;

float_literal_range : floatNumber COLON floatNumber ;

realComparison
    : realExpression EQUAL realExpression     #RealEqual
    | realExpression NOTEQUAL realExpression  #RealNotEqual
    | realExpression LE realExpression        #RealLessEqual
    | realExpression GE realExpression        #RealGreaterEqual
    | realExpression GT realExpression        #RealGreaterThan
    | realExpression LT realExpression        #RealLessThan
    ;

realExpression
    : LPAREN realExpression RPAREN          #RealParens
    | IDENTIFIER                            #RealId
    | floatNumber                           #RealLiteral
    | realExpression MUL realExpression     #RealMultiply
    | realExpression DIV realExpression     #RealDivide
    | realExpression ADD realExpression     #RealAdd
    | realExpression SUB realExpression     #RealSubtract
    | realExpression ASSIGN realExpression  #RealAssign
;



constDeclaration
    : CONST BOOL IDENTIFIER ASSIGN boolValue SEMI
    | CONST REAL IDENTIFIER ASSIGN floatNumber SEMI
;

/*varDeclaration
    : BOOL IDENTIFIER ( ASSIGN boolValue )? SEMI
    | REAL IDENTIFIER ( ASSIGN floatNumber )? SEMI ;*/
    
varDeclaration
    : BOOL IDENTIFIER ( ALIAS IDENTIFIER )? SEMI
    | REAL IDENTIFIER ( ALIAS IDENTIFIER )? SEMI ;

floatNumber: (SUB)? FLOAT_LITERAL;

boolValue
    : FALSE
    | TRUE
;
