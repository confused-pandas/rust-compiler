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
	OR;
	AND;
	CSTE_ENT;
	DOT;
	INDEX;
	FUNCTION_CALL;
	PARAMS;
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
	| (expr)? (';' instruction_bloc)? -> expr? instruction_bloc?
	;

instruction
	:
	  ';' ->
	| 'let' ('mut')? expr ((op='=' -> $op) expr (obj_def)?)? ';' -> ^($op expr (expr obj_def?)?)?
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
	  IDF -> IDF
	| 'len' '(' ')' -> 'len'
	;

expr_ou
	:
	(e1=expr_et -> $e1) ('||' e2=expr_et -> ^(OR $e2 $expr_ou))*
	;

expr_et
	:
	(e1=expr_comp -> $e1) ('&&' e2=expr_comp -> ^(AND $e2 $expr_et))*
	;

expr_comp 
	:
	 (e1 = expr_plus -> $e1)
	(op='<' e2 = expr_plus -> ^($op $e2 $expr_comp)
	|op='<=' e2 = expr_plus -> ^($op $e2 $expr_comp)
	|op= '>' e2 = expr_plus -> ^($op $e2 $expr_comp)
	|op='>=' e2 = expr_plus -> ^($op $e2 $expr_comp)
	|op='==' e2 = expr_plus  -> ^($op $e2 $expr_comp)
	|op='!=' e2 = expr_plus  -> ^($op $e2 $expr_comp)
	)*
	;
	
expr_plus 
	:
	(e1=expr_mult -> $e1)
	('+' e2=expr_mult -> ^('+' $e2 $expr_plus)
	| '-' e2=expr_mult -> ^('-' $e2 $expr_plus)
	)*
	;
	
expr_mult
	:
	(e1=expr_unaire -> $e1)
	(op='*' e2=expr_unaire -> ^($op $e2 $expr_mult) 
	| op = '/' e2=expr_unaire -> ^($op $e2 $expr_mult)
	)*
	;

expr_unaire
	:
	  (op='-' | op='!' | op='*' | op='&') expr_unaire -> ^($op ^(expr_unaire))
	| expr_atom
	;


expr_atom
	:
	atom
	(
		 '[' expr ']'// -> ^(INDEX ^(expr))
	)*
	(
		'.' dot_factorisation
	)*
	;

atom
	:
	  CSTE_ENT
	| CSTE_STR
	| 'true'
	| 'false'
	|
	  { 
	 	boolean isFunctionCall = false;
	 	boolean hasParams = false;
	  }
	  IDF ('(' (expr (',' expr)* { hasParams = true; })?')' { isFunctionCall = true; })?
	  -> {isFunctionCall && hasParams}? -> ^(FUNCTION_CALL IDF ^(PARAMS expr*))
	  -> {isFunctionCall}? ^(FUNCTION_CALL IDF)
	  -> IDF
	| '(' expr ')' -> expr
	| ('Vec'|'vec') '!' '[' (expr (',' expr)*)? ']'
	| 'print' '!' '(' expr ')' -> ^(PRINT expr)
	;

IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;
CSTE_STR : '"' .* '"' ;
COMMENTS : '/*' .* '*/' { $channel = HIDDEN ; } ;
WS : (' ' | '\r' | '\n') { $channel = HIDDEN ; } ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';