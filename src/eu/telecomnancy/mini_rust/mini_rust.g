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
	ELSE;
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
	MOINS_UNITAIRE;
	OBJ;
	M;
	VEC_MACRO;
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
	'struct' idf=IDF '{' (i+=IDF ':' t+=type (',' i+=IDF ':' t+=type)*)? '}' -> ^(DECL_STRUCT $idf ^(M $i $t)*)
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
	  ('let' mut=('mut')? e1=expr -> ($mut)? $e1) (('=' e2=expr (obj_def)?)? ';' -> ^('=' $instruction $e2 (obj_def)?))
	| 'while' expr bloc -> ^(WHILE expr bloc)
	| 'return' (expr)? ';' -> ^(RETURN expr?)
	| if_expr
	;

obj_def
	:
	'{' (i+=IDF ':' o+=obj_expr (',' i+=IDF ':' o+=obj_expr)*)? '}' -> ^(OBJ ^(M $i $o)*)
	;

obj_expr
	:
	expr (obj_def)?
	;
	
if_expr
	:
	'if' expr bloc (else_expr)? -> ^(IF expr bloc (else_expr)?)
	;

else_expr
	:
	'else' (bloc -> ^(ELSE bloc) | if_expr -> ^(ELSE if_expr))
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
	(e1=expr_et -> $e1) ('||' e2=expr_et -> ^(OR $expr_ou $e2))*
	;

expr_et
	:
	(e1=expr_comp -> $e1) ('&&' e2=expr_comp -> ^(AND $expr_et $e2))*
	;

expr_comp 
	:
	 (e1 = expr_plus -> $e1)
	(op='<' e2 = expr_plus -> ^($op $expr_comp $e2)
	|op='<=' e2 = expr_plus -> ^($op $expr_comp $e2)
	|op= '>' e2 = expr_plus -> ^($op $expr_comp $e2)
	|op='>=' e2 = expr_plus -> ^($op $expr_comp $e2)
	|op='==' e2 = expr_plus  -> ^($op $expr_comp $e2)
	|op='!=' e2 = expr_plus  -> ^($op $expr_comp $e2)
	)*
	;
	
expr_plus 
	:
	(e1=expr_mult -> $e1)
	('+' e2=expr_mult -> ^('+' $expr_plus $e2)
	| '-' e2=expr_mult -> ^('-' $expr_plus $e2)
	)*
	;
	
expr_mult
	:
	(e1=expr_unaire -> $e1)
	(op='*' e2=expr_unaire -> ^($op $expr_mult $e2) 
	| op = '/' e2=expr_unaire -> ^($op $expr_mult $e2)
	)*
	;

expr_unaire
	:
	  (op='-') expr_unaire -> ^(MOINS_UNITAIRE ^(expr_unaire))
	| (op='!' | op='*' | op='&') expr_unaire -> ^($op ^(expr_unaire))
	| (a=atom -> $a) ('[' expr ']' -> ^(INDEX $expr_unaire expr))* ('.' dot_factorisation -> ^('.' $expr_unaire dot_factorisation))*
	;

atom
	:
	  CSTE_ENT
	| CSTE_STR
	| 'true'
	| 'false'
	|
	  { boolean isFunctionCall = false; }
	  IDF ('(' (params)? ')' { isFunctionCall = true; })?
	  -> {isFunctionCall}? ^(FUNCTION_CALL IDF params?)
	  -> IDF
	| '(' expr ')' -> expr
	| 'vec' '!' '[' (e+=expr (',' e+=expr)*)? ']' -> ^(VEC_MACRO ($e)*)
	| 'print' '!' '(' expr ')' -> ^(PRINT expr)
	;

params
	:
	(expr (',' expr)*) -> ^(PARAMS expr+)
	;

IDF : (LOWERCASE | UPPERCASE | '_') (LOWERCASE | UPPERCASE | DIGIT | '_')* ;
CSTE_ENT : DIGIT+ ;
CSTE_STR : '"' .* '"' ;
COMMENTS : '/*' .* '*/' { $channel = HIDDEN ; } ;
WS : (' ' | '\r' | '\n') { $channel = HIDDEN ; } ;

fragment LOWERCASE : 'a'..'z';
fragment UPPERCASE : 'A'..'Z';
fragment DIGIT : '0'..'9';