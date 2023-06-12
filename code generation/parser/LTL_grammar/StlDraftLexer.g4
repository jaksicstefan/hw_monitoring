lexer grammar StlDraftLexer;

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

//Operators
ASSIGN          : '=';
//comparison
GT              : '>';
LT              : '<';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
//arithmetic
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';

TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
BANG            : '!';

fragment DIGIT : [0-9];
fragment LETTER : [a-zA-Z];
fragment STLID : [a-zA-Z_];

FLOAT_LITERAL : DIGIT+(DOT DIGIT+)?;

ASSERTION : 'assertion';
ALIAS : 'alias';

//temporal operators
/*TEMPORAL_OPERATOR_RANGE :
	TEMPORAL_OPERATOR |
	EVENTUALLY |
	ONCE |
	ALWAYS_BANG |
	HISTORICALLY_BANG ;


TEMPORAL_OPERATOR :
	ALWAYS |
	HISTORICALLY |
	EVENTUALLY_BANG |
	ONCE_BANG |
	UNTIL |
	SINCE |
	UNTIL_BANG |
	SINCE_BANG;*/

/*
ALWAYS_BANG: 'always!';
EVENTUALLY_BANG : 'eventually!';
UNTIL_BANG : 'until!';
HISTORICALLY_BANG : 'historically!';
ONCE_BANG : 'once!';
SINCE_BANG : 'since!';
*/
ALWAYS : 'always';
PREVIOUS: 'prev'; /*added by StefanJ*/
EVENTUALLY : 'eventually';
UNTIL : 'until';
HISTORICALLY : 'historically';
ONCE : 'once';
SINCE : 'since';


//variables
CONST : 'const';
REAL : 'real';
BOOL : 'bool';
INPUT : 'input';
OUTPUT : 'output';
INTERNAL : 'internal';


//BOOL_LITERAL: TRUE | FALSE;
TRUE : 'true';
FALSE : 'false';

//logical
OP_LOG_AND      : '&&' | 'and' ;
OP_LOG_OR       : '||' | 'or' ;
OP_LOG_XOR      : 'xor' | '^';
OP_LOG_IMPLIES  : 'implies' | '->';
OP_LOG_IIFF     : 'iff' | '<=>' | '<->';
OP_LOG_NOT      : 'not';

IDENTIFIER : STLID+;

//NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
//WS : [ \t\u000C]+ -> skip ;
WS : [ \r\n\t\u000C]+ -> skip ;

COMMENT : '/*' .*? '*/' -> skip;

LINE_COMMENT : '//' ~[\r\n]* -> skip;
