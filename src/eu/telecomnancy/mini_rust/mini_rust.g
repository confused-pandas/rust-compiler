grammar mini_rustv2;

options {
	language = Java;
	k = 1;
	output = AST;
}

fichier
	:
	(decl)*
	;

decl
	:
	  decl_func
	| decl_struct
	;

decl_func
	:
	'fn' IDF '(' (argument (',' argument)*)? ')' ('->' type)? bloc
	;

decl_struct
	:
	'struct' IDF '{' (IDF ':' type (',' IDF ':' type)*)? '}'
	;

type
	:
	  IDF
	| 'Vec' '<' type '>'
	| '&' type
	| 'i32'
	| 'bool'
	;

argument
	:
	IDF ':' type
	;

bloc
	:
	'{' instruction_bloc '}'
	;

instruction_bloc
	:
	  instruction instruction_bloc
	| (expr)? (';' (instruction_bloc)?)?
	;

instruction
	:
	  ';'
	| 'let' ('mut')? expr ('=' expr (obj_def)?)? ';'
	| 'while' expr bloc
	| 'return' (expr)? ';'
	| if_expr
	;

obj_def
	:
	'{' (IDF ':' expr (obj_def)? (',' IDF ':' expr (obj_def)?)*)? '}'
	;

if_expr
	:
	'if' expr bloc ('else' (bloc | if_expr))?
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
	expr_plus (('<' | '<=' | '>' | '>=' | '==' | '!=') expr_plus)*
	;

expr_plus
	:
	expr_mult (('+' | '-') expr_mult)*
	;

expr_mult
	:
	expr_unaire (('*' | '/') expr_unaire)*
	;

expr_unaire
	:
	('-' | '!' | '*' | '&')* atom
	;

atom
	:
	(
		  CSTE_ENT
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

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';