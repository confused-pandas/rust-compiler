grammar mini_rust;

options {
  language = Java;
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

assign
	:
	IDENT '=' expr
	;

variable
	:
	'let' ('mut')? IDENT '=' expr
	;

atom
	:
	  '(' expr ')'
	| number
	| IDENT
	;

expr
	:
	  atom
	| assign
	;

type
	:
	'u32'
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
	('-')? ('0'..'9')* '.' ('0'..'9') // 0.2568, .5
	;

WS
	:
	(' ' | '\t' | '\r' | '\n' | '\f') { $channel = HIDDEN; }
	;