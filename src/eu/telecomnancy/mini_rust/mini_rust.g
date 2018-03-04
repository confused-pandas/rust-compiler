grammar mini_rust;

options {
	language = Java;
	k = 1;
	output = AST;
}

tokens{
	FICHIER;
	DECL;
	DECL_FUNC;
	DECL_STRUCT;
	TYPE;
	ARGUMENT;
	BLOC;
	INSTRUCTION;
	OBJ_DEF;
	IF;
	CSTE_ENT;
	CSTE_STR;
	WHILE;
	PRINT;
	RETURN;
	VEC;
	ADD;
	SUB;
	MULT;
	DIV;
	LOW;
	LOW_E;
	EQ;
	UPP;
	UPP_E;
	DIFF;
	ATOM;
	}
	
	
	
	
fichier
	:
	(decl)* -> ^(FICHIER decl*)
	;

decl
	:
	  decl_func -> ^(DECL decl_func)
	| decl_struct -> ^(DECL decl_struct)
	;

decl_func
	:
	'fn' IDF '(' (argument (',' argument)*)? ')' ('->' type)? bloc -> ^(DECL_FUNC IDF (argument (argument)*)? (type)? bloc)
	;

decl_struct
	:
	'struct' IDF '{' (IDF ':' type (',' IDF ':' type)*)? '}' -> ^(DECL_STRUCT IDF (IDF type (IDF type)*)?)
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
	  ';' 
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
	'if' expr bloc ('else' (bloc | if_expr))? -> ^(IF expr bloc? if_expr?) 
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
	expr_plus (
		'<' expr_plus -> ^('<' expr_plus expr_plus)
		| '<=' expr_plus -> ^('<=' expr_plus expr_plus)
		| '>' expr_plus -> ^('>' expr_plus expr_plus)
		| '>=' expr_plus -> ^('>=' expr_plus expr_plus)
		| '==' expr_plus -> ^('==' expr_plus expr_plus)
		| '!=' expr_plus -> ^('!=' expr_plus expr_plus)
		)* 
	;


expr_plus
	:
	 expr_mult (
			'+' expr_mult -> ^('+' expr_mult expr_mult)
			| '-' expr_mult  -> ^('-' expr_mult expr_mult)
			)* 
	;

expr_mult
	:
	expr_unaire (
		'*' expr_unaire -> ^('*' expr_unaire expr_unaire)
		| '/' expr_unaire -> ^('/' expr_unaire expr_unaire)
		)* 
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
		| IDF ('(' (expr (',' expr)*)?')')? -> ^(IDF (expr expr*)?)
		| '(' expr ')'
		| ('Vec'|'vec') '!' '[' (expr (',' expr)*)? ']'-> ^(VEC (expr expr*)?)
		| 'print' '!' '(' expr ')' -> ^(PRINT expr)
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