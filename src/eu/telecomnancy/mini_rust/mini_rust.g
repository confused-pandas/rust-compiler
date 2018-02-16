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
	'{' instru_bloc '}'
	;

instru_bloc
	:
	  instruction_sans_expr instru_bloc | (expr)? (';' (instru_bloc)?)?
	;

instruction_sans_expr
	:
	  ';'
	| 'let' ('mut')? IDF '=' instruction_let_factorisation
	| 'while' expr bloc
	| 'return' (expr)? ';'
	| if_expr
	;

instruction_let_factorisation
	:
	  expr ';'
	| IDF '{' (IDF ':' expr (',' IDF ':' expr)*)? '}' ';'
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
		  | IDF expr_idf_factorisation
		  | unaire expr
		  | 'vec' '!' '[' (expr (',' expr)?)* ']'
		  | 'print!' '(' expr ')'
		  | bloc
		  | '(' expr ')'
		  | ou_logique expr
	  )
	  (
		  ou_logique expr
		  | '.' expr_dot_factorisation
		  | '[' expr ']'
	  )*
	;

expr_idf_factorisation
	:
	  '(' (expr (',' expr)*)? ')'
	|
	;

expr_dot_factorisation
	:
	  IDF
	| 'len' '(' ')'
	;

ou_logique
	:
	et_logique ('||' et_logique)*
	;

et_logique
	:
	operateur_relationnel ('&&' operateur_relationnel)*
	;

operateur_relationnel
	:
	addition_binaire (('==' | '!=' | '<=' | '<' | '>' | '>=' ) addition_binaire)*
	;

addition_binaire''
	:
	multiplication_binaire (('+' | '-') multiplication_binaire)*
	;

multiplication_binaire
	:
	unaire (('*' | '/') unaire)*
	;

unaire
	:
	('-' | '!' | '*' | '&')* atome
	;

atome 
	:
	'(' expr ')'
	| CSTE_ENT
	| IDF
	;

IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';