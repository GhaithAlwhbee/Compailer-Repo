lexer grammar dartLexer;

AT:'@';
C: ',';
CB: ']';
CBC: '}';
CO: ':';
CP: ')';
DOT: '.';
EE: '==';
EG: '=>' | '>=';
EQ: '=';
GT: '>';
LT: '<';
LTE: '<=' | '=<';
LTLT: '<<';
MINUS: '-';
MM: '--';
NE: '!=';
NOT: '!';
OB: '[';
OBC: '{';
OP: '(';
P: '|';
PC: '%';
PE: '%=';
PL: '+';
ASTERISK: '*';
PLE: '+=';
PLPL: '++';
PO: '#';
POE: '|=';
PP: '||';
QU: '?';
QUQU: '??';
SC: ';';
SL: '/';
ABSTRACT_:'abstract';
AS_:'as';
ASSERT_:'assert';
ASYNC_:'async';
AWAIT_:'await';
BOOLEAN:'bool';
BREAK_:'break';
CASE_:'case';
CATCH_:'catch';
CHAR:  'char';
CLASS_:'class';
CONST_:'const';
CONTINUE_:'continue';
DEFAULT_:'default';
DO_:'do';
DOUBLE: 'double';
DYNAMIC_:'dynamic';
ELSE_:'else';
ENUM_:'enum';
EXTENDS_:'extends';
FALSE_:'false';
FINAL_:'final';
FLOAT: 'float';
FOR_:'for';
FUNCTION_:'Function';
IF_:'if';
IMPLEMENTS_:'implements';
IMPORT_:'import';
INT:  'int';
LONG: 'long';
INTERFACE_:'interface';
IS_:'is';
LATE_:'late';
NEW_:'new';
NULL_:'null';
ON_:'on';
PUBLIC_ : 'public';
PACKAGE_ : 'package';
PROTECTED_ : 'protected';
PRIVATE_ : 'private';
REQUIRED_:'required';
RETURN_:'return';
STATIC_:'static';
STRING_:'String';
SWITCH_:'switch';
SYNC_:'sync';
SUPER_ : 'super';
THIS_:'this';
THROW_:'throw';
TRUE_:'true';
TRY_:'try';
VAR_:'var';
VOID_:'void';
WHILE_:'while';

///////////////////////////// flutter

Scaffold_WIDGET : 'Scaffold';
APPBAR_HEAD : 'appBar';
BODY_HEAD : 'body';
CHILD_HEAD : 'child';
APPBAR_WIDGET : 'AppBar';
TITLE : 'title';
TEXT_WIDGET : 'Text';
CONTAINER_WIDGET : 'Container';

NUMBER : DIGIT+ ( '.' DIGIT+ )? EXPONENT? | '.' DIGIT+ EXPONENT? ;

//CHAR_LITERAL:  '\'' ~[\\r\\n\\'] '\'';
//
//SingleLineString : StringDQ | StringSQ | 'r\'' ~('\'' | '\n' | '\r')* '\'' | 'r"' ~('"' | '\n' | '\r')* '"' ;
//MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;
WHITESPACE : ( '\t' | ' ' | NEWLINE )+  -> skip;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;

fragment EXPONENT : ( '+' | '-' )? DIGIT+ ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$'  ; // { CheckNotOpenBrace() }?
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$'  ; // { CheckNotOpenBrace() }?
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment BUILT_IN_IDENTIFIER : 'abstract' | 'dynamic' | 'Function' | 'implements' | 'import' | 'interface' | 'late' | 'required' | 'static'  ;
fragment OTHER_IDENTIFIER : 'async' | 'sync' | 'await'  ;
fragment IDENTIFIER_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR IDENTIFIER_PART_NO_DOLLAR* ;
fragment IDENTIFIER_START_NO_DOLLAR : LETTER | '_' ;
fragment IDENTIFIER_PART_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR | DIGIT ;
fragment IDENTIFIER_START : IDENTIFIER_START_NO_DOLLAR | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT : '0' .. '9' ;
fragment EscapeSequence
    : '\\' 'u005c'? [btnfr"'\\]
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;


