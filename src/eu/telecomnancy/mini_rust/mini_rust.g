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
	'struct' IDENT '{' (IDENT ':' type (',' IDENT ':' type)*)? '}'
	;

decl_fun
	:
	'fn' IDENT '(' (argument (',' argument)*)? ')' ('->' type)? bloc
	;

type
	:
	  IDENT ('<' IDENT '>')?
	| '&' type
	| 'i32'
	| 'bool'
	| 'Vec'
	;

argument
	:
	IDENT ':' type
	;

bloc
	:
	'{' (instruction)* (expr)? '}'
	;

instruction
	:
	  ';'
	| expr ';'
	| 'let' ('mut')? IDENT '=' instruction_left_1
	| 'while' expr bloc
	| 'return' (expr)?
	| if_expr
	;

instruction_left_1
	:
	  expr ';'
	//| IDENT '{' (IDENT ':' expr (',' IDENT ':' expr)*)? '}'
	;

if_expr
	:
	'if' expr bloc ('else' (bloc | if_expr))?
	;

expr
	:
	(
		  CSTE_ENT
		| 'true'
		| 'false'
		| IDENT (expr_left_1)?
		| unaire expr
		| 'vec' '!' '[' (expr (',' expr)*)? ']'
		| 'print' '!' '(' expr ')'
		| bloc
		| '(' expr ')'
	)
	(
		  binaire expr
		| '.' expr_left_2
		| '[' expr ']'
	)*
	;

expr_left_1
	:
	'(' (expr (',' expr)*)? ')'
	;

expr_left_2
	:
	  IDENT
	| 'len' '(' ')'
	;

binaire
	:
	'+' | '-' | '*' | '/' | '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '='
	;

unaire
	:
	'-' | '!' | '*' | '&'
	;

fragment NUMBER : ('0'..'9') ;

CSTE_ENT : ('-')? NUMBER+ ;
IDENT : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;
WS : (' ' | '\t' | '\f' | '\r' | '\n')+ { $channel = HIDDEN; } ;