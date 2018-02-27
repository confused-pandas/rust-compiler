grammar mini_rust;

options {
	language = Java;
	k = 1;
	output = AST;
}

fichier :	
	(decl)*
	;
	
decl 	:	
	decl_func
	| decl_struct
	;

decl_struct 
	:	
	'struct' IDF '{' (IDF ':' type (',' IDF ':' type)*)? '}'
	;
	
decl_func 
	:	
	'fn' IDF '(' (argument(',' argument)*)? ')' ('->' type)? bloc
	;

type 	
	:
	IDF
	| 'Vec' '<'type'>'
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
	instruction (instru_bloc|(expr)?)
	
	;
	
instruction 
	: ';'
	| expr ';'
	| 'let' ('mut')? expr '=' expr ';'
	| 'while' while_expr bloc
	| 'return' (expr)? ';'
	| if_expr
	;

while_expr
	:
	((CSTE_ENT| 'true' | 'false')
	| IDF
	| unaire expr
	| '(' expr ')')
	|logical_or
	(logical_or expr 
	| '.' dot_expr 
	| (expr)?)*
	;
	

if_expr 
	:
	'if' expr bloc ('else' (bloc|if_expr)) ?
	;
	
expr 
	:
	((CSTE_ENT | 'true' | 'false' ) 
	| IDF (idf_expr)?
	| unaire expr 
	| 'Vec!' '['(expr (',' expr)*)? ']' 
	| 'print!' (expr)? 
	| bloc 
	| '(' expr ')') 
	|logical_or
	
	(logical_or expr 
	| '.' dot_expr 
	| (expr)?)*
	;
	
idf_expr 
	:
	'(' (expr (',' expr)* )? ')'
	|'{' (expr (',' expr)*)? '}' 
	
	;

dot_expr 
	:
	'len' '(' ')'
	| IDF
	;
	
logical_or
	:
	logical_and ('||' logical_and)*
	;

logical_and
	:
	logical_operator ( '&&' logical_operator)*
	;

logical_operator
	:
	binar_add (('=='|'<'|'<='|'>'|'>=') binar_add)*
	;
	
binar_add
	:
	binar_mult (('+'|'-') binar_mult)*
	;
	
binar_mult
	:
	(unaire|atom) (('*'|'/') (unaire|atom))*
	;
	

unaire 
	:
	('-' | '!' | '*' | '&')atom
	;

atom 
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