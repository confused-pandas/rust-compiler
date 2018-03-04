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
	IF;
	WHILE;
	PRINT;
	RETURN;
	VEC;
	FUNC_CALL;
	COND;
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
	'fn' IDF '(' (argument (',' argument)*)? ')' ('->' type)? bloc -> ^(DECL_FUNC IDF (argument)* (type)? bloc)
	;

decl_struct
	:
	'struct' idf=IDF '{' (i+=IDF ':' t+=type (',' i+=IDF ':' t+=type)*)? '}' -> ^(DECL_STRUCT $idf ($i $t)*)
	;

type
	:
	  IDF
	| 'Vec' '<' type '>' -> ^(VEC type)
	| '&' type
	| 'i32'
	| 'bool'
	;

argument
	:
	IDF ':' type -> ^(ARGUMENT IDF type)
	;

bloc
	:
	'{' instruction_bloc '}' -> ^(BLOC instruction_bloc)
	;

instruction_bloc
	:
	  instruction instruction_bloc
	| (expr)? (';' instruction_bloc)?
	;

instruction
	:
	  ';' ->
	| 'let' ('mut')? expr ('=' expr (obj_def)?)? ';'
	| 'while' expr bloc -> ^(WHILE expr bloc)
	| 'return' (expr)? ';' -> ^(RETURN expr?)
	| if_expr
	;

obj_def
	:
	'{' (IDF ':' expr (obj_def)? (',' IDF ':' expr (obj_def)?)*)? '}'
	;

if_expr
	:
	'if'^ expr bloc ('else'^ (bloc | if_expr))?
	;

expr
	:
	(
		  bloc
		| expr_ou
	)
	;

dot_factorisation
	:
	  IDF
	| 'len' '(' ')'
	;

expr_ou
	:
	expr_et ('||' expr_ou)*
	;

expr_et
	:
	expr_comp ('&&' expr_comp)*
	;

expr_comp
	:
	(e1=expr_plus -> $e1)(op=('<' | '<=' | '>' | '>=' | '==' | '!=') e2=expr_plus -> ^($op $expr_comp $e2))*
	;

expr_plus
	:
	(e1=expr_mult -> $e1)(op=('+' | '-') e2=expr_mult -> ^($op $expr_plus $e2))*
	;

expr_mult
	:
	(e1=expr_unaire -> $e1)(op=('*' | '/') e2=expr_unaire -> ^($op $expr_mult $e2))*
	;

expr_unaire
	:
	('-' | '!' | '*' | '&')* atom
	;

atom
	:
	(
		  CSTE_ENT
		| CSTE_STR
		| 'true'
		| 'false'
		| IDF ('(' (expr (',' expr)*)?')')?
		| '(' expr ')'
		| ('Vec'|'vec') '!' '[' (expr (',' expr)*)? ']'
		| 'print' '!' '(' expr ')'
	)
	(
		 '[' expr ']'
	)*
	(
		'.' dot_factorisation
	)*
	;


IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;
CSTE_STR : '"' .* '"' ;
COMMENTS : '/*' .* '*/' { $channel = HIDDEN ; } ;
WS : (' ' | '\r' | '\n') { $channel = HIDDEN ; } ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';