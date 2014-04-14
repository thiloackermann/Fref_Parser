// Grammar-Befehl:
// antlr4 fref.g4 -no-listener -visitor -package org.dhbw.stuttgart.tinf12ita.compilerbau

grammar fref;

// Lexer
LINEBREAK: '!';

FUNCTION: 'function';

IFLEXER: 'if';
IFCLOSE: 'fi';
IFTHEN: 'then:';
ELSELEXER: 'else:';
DOLEXER: 'do';
DOCLOSE: 'od';
WHILELEXER: 'while';
FUNCDEF: '#';

// Variablentypen
//VARIABLETYPE: [A-Z]([a-z]|[A-Z])*;
VARIABLETYPE: 'Number'
		     |'String';

// Variablenname
VARIABLE: ([a-z]([a-z]|[A-Z]|[0-9])* | 'Ans' | 'This' | 'Return');

// Functionname
FUNCTNAME: [A-Z]([a-z]|[A-Z]|[0-9])*;

// Werte von "Number"
NUMBER: '-'? [0-9]+ | [0-9]*'.'[0-9]+;

//Whitespace
WHITE: [\r\n\t ]+ -> skip;

// String
STRING: '"' ('.'|'*'|'-'|'_'|'/'|[a-z]|[A-Z]|[0-9])* '"';

// Durchführbare mathematische Operationen
OA: '+';
OS: '-';
			//OC: OM | OD;
OM: '*';
OD: '/';
OK: '~';

EXPRBRACKOPEN: '<<';
EXPRBRACKCLOSE: '>>';
BRACKOPEN: '(';
BRACKCLOSE: ')';
EQ: '==';  
EQUALS: '=';
PARAKOMMA: ',';

LT: '<';
GT: '>';

//PARSER:

start: code+;

code: ((emptyExpression | ifelseclause | ifclause | dowhileclause | fnctn | dclrtndfntn | dclrtn | dfntn | fnctcall) LINEBREAK)+;

dclrtn: type=VARIABLETYPE name=VARIABLE #Declaration
          ;
dclrtndfntn:  type=VARIABLETYPE name=VARIABLE EQUALS expression #DeclarationDefinition
          ;

dfntn:  name=VARIABLE EQUALS expression #Definition
        ;
		
compareKeyword: kw=(EQ | LT | GT);

condition:
           left=expression operator=EQ right=expression #EQCond
          | left=expression operator=LT right=expression #LTCond
		  | left=expression operator=GT right=expression #GTCond;
		  
ifelseclause: IFLEXER 
	   EXPRBRACKOPEN 
	   cond=condition 
	   EXPRBRACKCLOSE 
	   IFTHEN 
	   ifcode=code
	   ELSELEXER 
	   elsecode=code
	   IFCLOSE;

ifclause: IFLEXER EXPRBRACKOPEN 
       cond=condition
       EXPRBRACKCLOSE
	   IFTHEN
	   ifcode=code
	   IFCLOSE;


dowhileclause: DOLEXER 
	   docode=code
       WHILELEXER
	   EXPRBRACKOPEN
	   cond=condition
	   EXPRBRACKCLOSE
       DOCLOSE;
	   
fnctnPrm: type=VARIABLETYPE name=VARIABLE #FunctionParameter;
	   
fnctn: FUNCDEF //#
	   functionname = FUNCTNAME
       EXPRBRACKOPEN
	   (fnctnPrm (PARAKOMMA fnctnPrm)*)?
	   EXPRBRACKCLOSE
	   EXPRBRACKOPEN
	   ret = VARIABLETYPE
	   EXPRBRACKCLOSE
	   code
       FUNCDEF;
	   
fnctcall: functionname = FUNCTNAME
		  EXPRBRACKOPEN
		  (fnctnPrm (PARAKOMMA fnctnPrm)*)?
		  EXPRBRACKCLOSE;
		  
emptyExpression:  #ExpressionWithoutStatement;

expression: BRACKOPEN inBrackets=expression BRACKCLOSE #Brackets
		  | number=NUMBER #Number
          | variable=VARIABLE #Variable
          | func = fnctcall #FuncCall
          | left=expression (operator=OM | operator=OD) right=expression #MultDivision
          | left=expression operator=OS right=expression #Subtraction
          | left=expression operator=OA right=expression #Addition
          | left=expression operator=OK right=expression #Konkat
		  | empex = emptyExpression #empty
          ;

		 
		  
	  
	   

		  
		  