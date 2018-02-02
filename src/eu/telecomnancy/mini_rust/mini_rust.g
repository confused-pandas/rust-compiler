grammar mini_rust;

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
	  decl_fun
	| decl_struct
	;

decl_struct
	:
	'struct' IDF '{' (IDF ':' type (',' IDF ':' type)?)* '}'
	;

decl_fun
	:
	'fn' IDF '(' (argument (',' argument)*)? ')' ('->' type)? bloc
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
	'{' (instruction)* (expr)? '}'
;

instruction
	:
	  ';'
	| expr ';'
	| 'let' ('mut')? IDF '=' instruction_let ';'
	| 'return' (expr)? ';'
	| 'while' expr bloc
	| if_expr
	;

instruction_let
	:
	  expr_bis
	| IDF instruction_let_idf
	;

instruction_let_idf
	:
	  expr_idf expr_prim
	| '{' (IDF ':' expr (',' IDF ':' expr)*)? '}'
	;

if_expr
	:
	'if' expr bloc ('else' (bloc | if_expr))?
	;


expr
	:
	(
		  expr_bis
		| IDF expr_idf
	) expr_prim
	;

expr_bis
	:
	(
		  CSTE_ENT 
		| 'true'
		| 'false'
		| unaire expr
		| 'vec' '!' '[' (expr (',' expr)?)* ']'
		| 'print' '!' '(' expr ')'
		| bloc
		| '(' expr ')'
	) expr_prim
	;

expr_prim
	:
	  binaire expr expr_prim
	| '.' expr_prim_dot
	| '[' expr ']' expr_prim
	|
	;

expr_prim_dot
	:
	  IDF expr_prim
	| 'len' '(' ')' expr_prim
	;

expr_idf
	:
	  '(' (expr (',' expr)*)? ')' 
	  | 
	;

binaire
	:
	'+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '='
	;

unaire
	:
	'-' | '!' | '*' | '&'
	;

IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;
WS : ('\n' | '\r' | '\t' | ' ')+ { $channel = HIDDEN; } ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';