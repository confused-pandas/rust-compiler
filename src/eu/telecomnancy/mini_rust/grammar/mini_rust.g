grammar mini_rust;

options {
	language = Java;
	k = 1;
	output = AST;
}

tokens{
	FICHIER;
	DECL_FUNC;
	DECL_STRUCT;
	TYPE;
	ARGUMENT;
	BLOC;
	INDEX;
	FUNCTION_CALL;
	UNARY_MINUS;
	OBJ;
	MEMBER;
	LETMUT;
	MUL;
	NEG;
	POINTER;
	REF;

	LPAREN = '(';
	RPAREN = ')';
	LBRACKET = '{';
	RBRACKET = '}';
	LSQBRACKET = '[';
	RSQBRACKET = ']';

	GT = '>';
	GE = '>=';
	LT = '<';
	LE = '<=';
	EQ = '==';
	NE = '!=';
	AND = '&&';
	OR = '||';

	PLUS = '+';
	MINUS = '-';
	DIV = '/';
	STAR = '*';
	EXCL = '!';

	ASSIGN = '=';
	DOT = '.';
	AMPS = '&';
	LEN = 'len';

	LET = 'let';
	MUT = 'mut';
	FN = 'fn';
	STRUCT = 'struct';
	WHILE = 'while';
	IF = 'if';
	ELSE = 'else';
	RETURN = 'return';
	VEC_MACRO = 'vec';
	PRINT_MACRO = 'print';

	VEC_TYPE = 'Vec';
	INT32_TYPE = 'int32';
	BOOL_TYPE = 'bool';
	TRUE = 'true';
	FALSE = 'false';

	COMMA = ',';
	SEMICOLON = ';';
	COLON = ':';
	ARROW = '->';
}

@header {
	package eu.telecomnancy.mini_rust.grammar;
}

@lexer::header {
	package eu.telecomnancy.mini_rust.grammar;
}

fichier
	:
	(decl)* -> ^(FICHIER decl*)
	;

decl
	:
	  decl_func
	| decl_struct
	;

decl_func
	:
	FN IDF LPAREN (argument (COMMA argument)*)? RPAREN (ARROW type)? bloc -> ^(DECL_FUNC IDF bloc (type)? (argument)*)
	;

decl_struct
	:
	STRUCT idf=IDF LBRACKET (i+=IDF COLON t+=type (COMMA i+=IDF COLON t+=type)*)? RBRACKET -> ^(DECL_STRUCT $idf ^(MEMBER $i $t)*)
	;

type
	:
	  IDF
	| VEC_TYPE LT type GT -> ^(VEC_TYPE type)
	| AMPS type
	| INT32_TYPE
	| BOOL_TYPE
	;

argument
	:
	IDF COLON type -> ^(ARGUMENT IDF type)
	;

bloc
	:
	LBRACKET instruction_bloc RBRACKET -> ^(BLOC instruction_bloc?)
	;

instruction_bloc
	:
	  instruction instruction_bloc
	| (expr)? (SEMICOLON instruction_bloc)? -> expr? instruction_bloc?
	;

instruction
	:
	  LET instruction_let SEMICOLON -> instruction_let
	| WHILE expr bloc -> ^(WHILE expr bloc)
	| RETURN (expr)? SEMICOLON -> ^(RETURN expr?)
	| if_expr
	| bloc
	;

instruction_let
	:
	  MUT expr (ASSIGN obj_expr)? -> ^(LETMUT expr (obj_expr)?)
	| expr (ASSIGN obj_expr)? -> ^(LET expr (obj_expr)?)
	;

obj_def
	:
	LBRACKET (i+=IDF COLON o+=obj_expr (COMMA i+=IDF COLON o+=obj_expr)*)? RBRACKET -> ^(MEMBER $i $o)*
	;

obj_expr
	:
	  expr
	  (
	  	  -> expr
	  	| obj_def -> ^(OBJ expr obj_def)
	  )
	;

if_expr
	:
	IF expr bloc (else_expr)? -> ^(IF expr bloc (else_expr)?)
	;

else_expr
	:
	ELSE (bloc -> ^(ELSE bloc) | if_expr -> ^(ELSE if_expr))
	;

expr
	:
	expr_ou
	;

dot_factorisation
	:
	  IDF -> IDF
	| LEN LPAREN RPAREN -> LEN
	;

expr_ou
	:
	(e1=expr_et -> $e1) (OR e2=expr_et -> ^(OR $expr_ou $e2))*
	;

expr_et
	:
	(e1=expr_comp -> $e1) (AND e2=expr_comp -> ^(AND $expr_et $e2))*
	;

expr_comp
	:
	(e1 = expr_plus -> $e1)
	(
		  LT e2=expr_plus -> ^(LT $expr_comp $e2)
		| LE e2=expr_plus -> ^(LE $expr_comp $e2)
		| GT e2=expr_plus -> ^(GT $expr_comp $e2)
		| GE e2=expr_plus -> ^(GE $expr_comp $e2)
		| EQ e2=expr_plus  -> ^(EQ $expr_comp $e2)
		| NE e2=expr_plus  -> ^(NE $expr_comp $e2)
	)*
	;

expr_plus
	:
	(e1=expr_mult -> $e1)
	(
	      PLUS e2=expr_mult -> ^(PLUS $expr_plus $e2)
	    | MINUS e2=expr_mult -> ^(MINUS $expr_plus $e2)
	)*
	;

expr_mult
	:
	(e1=expr_unaire -> $e1)
	(
		  STAR e2=expr_unaire -> ^(MUL $expr_mult $e2)
		| DIV e2=expr_unaire -> ^(DIV $expr_mult $e2)
	)*
	;

expr_unaire
	:
	  MINUS expr_unaire -> ^(UNARY_MINUS expr_unaire)
	| (
	      EXCL expr_unaire -> ^(NEG expr_unaire)
	    | STAR expr_unaire -> ^(POINTER expr_unaire)
	    | AMPS expr_unaire -> ^(REF expr_unaire)
	  )
	| (a=atom -> $a)
	  (LSQBRACKET expr RSQBRACKET -> ^(INDEX $expr_unaire expr))*
	  (DOT dot_factorisation -> ^(DOT $expr_unaire dot_factorisation))*
	;

atom
	:
	  CSTE_ENT
	| CSTE_STR
	| TRUE
	| FALSE
	| IDF
	    (
	          -> IDF
	        | LPAREN (expr (COMMA expr)*)? RPAREN -> ^(FUNCTION_CALL IDF expr*)
	    )
	| LPAREN expr RPAREN -> expr
	| VEC_MACRO EXCL LSQBRACKET (e+=expr (COMMA e+=expr)*)? RSQBRACKET -> ^(VEC_MACRO ($e)*)
	| PRINT_MACRO EXCL LPAREN expr RPAREN -> ^(PRINT_MACRO expr)
	;

IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;
CSTE_STR : '"' .* '"' ;
COMMENTS : '/*' .* '*/' { $channel = HIDDEN ; } ;
WS : (' ' | '\r' | '\n' | '\t') { $channel = HIDDEN ; } ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';