grammar PersonaScript;

/* Lexer rules */

OPEN_BRACE : '{';
CLOSE_BRACE : '}';
EQUALS : '=';
COMMA : ',';
QUOTE : '"';

DESCRIPTION : 'Description';
SETTING : 'Setting';
RESPONSE : 'Response';
NAME : 'name';
TYPE : 'type';
MBTI : 'mbti';
ROLE : 'role';
BACKGROUND : 'background';
CATEGORY : 'category';
LENGTH : 'length';
PROMPT : 'prompt';

STRING_LITERAL : QUOTE ~["]* QUOTE ;

NUMBER_LITERAL : [0-9]+;

WS : [ \t\r\n]+ -> skip;
/* Parser rules */

program : description setting response;
description : DESCRIPTION OPEN_BRACE descriptionProperty* CLOSE_BRACE;
descriptionProperty : nameProperty | typeProperty | mbtiProperty | roleProperty | backgroundProperty;
nameProperty : NAME EQUALS STRING_LITERAL;
typeProperty : TYPE EQUALS STRING_LITERAL;
mbtiProperty : MBTI EQUALS STRING_LITERAL;
roleProperty : ROLE EQUALS STRING_LITERAL;
backgroundProperty : BACKGROUND EQUALS STRING_LITERAL;
setting : SETTING OPEN_BRACE settingProperty* CLOSE_BRACE;
settingProperty : typeProperty | categoryProperty | backgroundProperty;
categoryProperty : CATEGORY EQUALS STRING_LITERAL;
response : RESPONSE OPEN_BRACE responseProperty* CLOSE_BRACE;
responseProperty : lengthProperty | promptProperty;
lengthProperty : LENGTH EQUALS NUMBER_LITERAL;
promptProperty : PROMPT EQUALS STRING_LITERAL;