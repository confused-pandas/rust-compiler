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
	(expr | variable) ';'
	| loop
	;

loop
	:
	loop_while
	;

loop_while
	:
	'while ' expr
	block
	;

block
	:
	'{'
	(statement)*
	'}'
	;

variable
	:
	'let' ('mut')? IDENT '=' expr
	;

atom
	:
	  '(' expr ')'
	| number
	//| IDENT
	;
	
unary 
  :
  ('-' | '!' | '*' | '&')* atom
  ;
  
binary_mul
  :
  unary (('*' | '/') unary)*
  ;
  
binary_add
  :
  binary_mul (('+' | '-') binary_mul)*
  ;
  
relational_operator
  :
  binary_add (('==' | '!=' | '<' | '<=' | '>' | '>=') binary_add)*
  ;

logical_and
  :
  relational_operator ('&&' relational_operator)*
  ;

logical_or
  :
  logical_and ('||' logical_and)*
  ;
  
expr
	:
	  logical_or
	| IDENT ('=' expr)?
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
	;

number
	:
	  INTEGER
	| FLOAT
	;

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