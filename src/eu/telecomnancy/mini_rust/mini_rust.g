grammar mini_rust;

options {
  language = Java;
  k = 1;
}

@header {
  package eu.telecomnancy.mini_rust;
}

@lexer::header {
  package eu.telecomnancy.mini_rust;
}

program
	:
	(statement)* EOF
	;

statement
	:
	(expr | variable | return) SEMICOL
	| function
	| loop
	| struct
	| enum
	;

function
  :
  FN IDENT LEFTPARENTH arguments RIGHTPARENTH ('->' type)? block
  ;
  
function_call
  :
  (NOT)? LEFTPARENTH params RIGHTPARENTH
  ;
  
params
  :
  (param (COMMA param)*)?
  | (expr (COMMA expr)*)?
  ;
  
param
 :
   atom
 ;

loop
	:
	loop_while
	;

loop_while
	:
	WHILE expr block
	;
	
struct
  :
    STRUCT IDENT LEFTBRACE (IDENT COLON type (COMMA IDENT COLON type)*)? RIGHTBRACE 
  | SEMICOL 
  | LEFTPARENTH (IDENT COLON type (COMMA IDENT COLON type)*)? RIGHTPARENTH SEMICOL
  ;
  
enum
  :
  ENUM IDENT LEFTBRACE (IDENT COLON type (COMMA IDENT COLON type)*)? RIGHTBRACE
  ;

block
	:
	LEFTBRACE
	(statement)*
	RIGHTBRACE
	;

arguments
  :
  (argument (COMMA argument)*)?
  ;
  
argument
  :
  IDENT COLON type
  ;
  
assign
	:
	EQUAL expr
	;

variable
	:
	LET mutability IDENT ((COLON type)? EQUAL expr)?
	;
	
mutability
  :
  MUT | CONST | /* nothing */
  ;
	
return
  :
  RETURN expr
  ;

atom
	:
	  LEFTPARENTH expr RIGHTPARENTH
	| number
	;
	
unary 
  :
  ('-' | NOT | '*' | '&')* atom
  ;
  
binary_mul
  :
  unary ((MULT | DIV) unary)*
  ;
  
binary_add
  :
  binary_mul ((PLUS | MINUS) binary_mul)*
  ;
  
relational_operator
  :
  binary_add (('==' | '!=' | '<' | '<=' | '>' | '>=') binary_add)*
  ;

logical_and
  :
  relational_operator (AND relational_operator)*
  ;

logical_or
  :
  logical_and (OR logical_and)*
  ;
  
expr
	:
	  logical_or
	| IDENT ( assign | function_call )?
	;

type
	:
	'i8'
	| 'i16'
	| 'i32'
	| 'i64'
	| 'u8'
	| 'u16'
	| 'u32'
	| 'u64'
	| 'f32'
	| 'f64'
	| 'bool'
	;

number
	:
	  INTEGER
	| FLOAT
	;
	

CONST : 'const';
ENUM : 'enum';
FN : 'fn';
LET : 'let';	
MUT : 'mut';
RETURN : 'return';
STRUCT : 'struct';
WHILE : 'while';

AND : '&&';
EQUAL : '=';
OR : '||';
NOT : '!';


DIV : '/';
MINUS : '-';
MULT : '*';
PLUS : '+';

COMMA : ',';
COLON : ':';
LEFTBRACE : '{';
LEFTPARENTH : '(';
RIGHTBRACE : '}';
RIGHTPARENTH : ')';
SEMICOL : ';';

	

IDENT
	:
	('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*
	;

INTEGER
	:
	('-')? ('0'..'9')+
	;

FLOAT
	:
	('-')? ('0'..'9')* '.' ('0'..'9')
	;

WS
	:
	(' ' | '\t' | '\r' | '\n' | '\f') { $channel = HIDDEN; }
	;