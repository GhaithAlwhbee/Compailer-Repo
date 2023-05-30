parser grammar dartParser;

options { tokenVocab=dartLexer;}
//re format
// sort
//  import-> calss / var / fun -> stateless -> statement -> expression -> type -> flutter widget


compilationUnit
    : packageDeclaration? (importDeclaration | SC)* (classOrInterfaceModifier* classDeclaration | SC)*
 //   | moduleDeclaration EOF
    ;

packageDeclaration
    : PACKAGE_ qualifiedName SC
    ;

importDeclaration
    : IMPORT_ STATIC_? qualifiedName (DOT ASTERISK)? SC
    ;

classOrInterfaceModifier
    : PUBLIC_
    | PROTECTED_
    | PRIVATE_
    | STATIC_
    | ABSTRACT_
    | FINAL_
    ;

// class decleration


classDeclaration
    : CLASS_ IDENTIFIER
//      (EXTENDS_ typeType)?
//      (IMPLEMENTS_ typeList)?
      OBC classBodyDeclaration* CBC
    ;


classBodyDeclaration
     : localVariableDeclaration SC                          #VariableDeclarationClassBody
   //  | STATIC_? block
     | classOrInterfaceModifier* methodDeclaration          #MethodDeclarationClassBody
     | classOrInterfaceModifier* classDeclaration           #ClassDeclarationClassBody
     ;

// variable decleration

localVariableDeclaration
    :  primitiveType variableDeclarators
    ;

variableDeclarators
    : variableDeclarator (C variableDeclarator)*
    ;

variableDeclarator
    : IDENTIFIER (EQ expression)?
    ;

program
    : statement*
//    : localVariableDeclaration*
    ;



// method decleration

methodDeclaration
    : (primitiveType | VOID_) IDENTIFIER formalParameters  block
    ;

methodBody
    : block
    | SC
    ;

formalParameters
    : OP formalParameter (C formalParameter)* CP
    ;

formalParameter
    : primitiveType IDENTIFIER
    ;

//   statment decleration

statement
    : block                                                 #StatementBlock
    | IF_ parExpression statement (ELSE_ statement)?        #StatementIF
    | FOR_ OP forControl CP statement                       #StatementFOR
    | WHILE_ parExpression statement                        #StatementWHILE
    | DO_ statement WHILE_ parExpression SC                 #StatementDoWhile
    | localVariableDeclaration  SC                          #StatementVariableDeclaration
    | expression SC                                         #StatementExpression
    ;


//   expression decleration

expression
    :  OP expression CP                                     #OPExpressionCP
    |  expression ASTERISK expression                       #ExpressionMultiplyExpression
    |  expression PL expression                             #ExpressionPlusExpression
    |  expression op=(LTE | EG | GT | LT | EE) expression   #ExpressionCompareExpression
    |  expression postfix=(PLPL | MM)                       #ExpressionPostfix
    |  RETURN_ expression? SC                               #ReturnExpression
    |  THROW_ expression SC                                 #ThrowExpression
    |  BREAK_  SC                                           #BreakExpression
    |  CONTINUE_ SC                                         #ContinueExpression
    |  literal                                              #ExpressionLiteral
    |  IDENTIFIER (EQ expression)?                          #ExpressionIDENTIFIER
    ;

expressionList
    : expression (C expression)*
    ;

literal
    : nullLiteral         #LiteralNull
//    integerLiteral
//    | floatLiteral
//    | CHAR_LITERAL
    | booleanLiteral      #LiteralBoolean
    | numericLiteral      #LiteralNumeric
    | charLiteral         #LiteralChar
    | stringLiteral       #LiteralString
    ;

nullLiteral
        : NULL_
        ;
booleanLiteral
        : TRUE_ | FALSE_
        ;
numericLiteral
        : NUMBER
        ;
charLiteral
        : CHAR_LITERAL
        ;
stringLiteral
        : STRING_LITERAL
        ;
//        : SingleLineString
//        | MultiLineString+
//        ;

//   type decleration



primitiveType
    : BOOLEAN           #BoolType
    | CHAR              #CharType
    | INT               #IntType
    | LONG              #LongType
    | FLOAT             #FloatType
    | DOUBLE            #DoubleType
    | STRING_           #StringType
    ;

//classOrInterfaceType
//    : (IDENTIFIER typeArguments? DOT)* IDENTIFIER typeArguments?
//    ;


// STATEMENTS / BLOCKS

block
    : OBC statement* CBC
    ;

parExpression
    : OP expression CP
    ;

forControl
    :  forInit? SC expression? SC forUpdate=expression?
    ;


forInit
    : localVariableDeclaration
  //  | expressionList
    ;


elementValue
    : expression
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : OBC (elementValue (C elementValue)*)? (C)? CBC
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

//////////////////////////////// flutter

scaffold : Scaffold_WIDGET OP
            (APPBAR_HEAD CO appBar C)?
            (BODY_HEAD CO widget C)?
            CP SC
         ;

widget
    :   text
    |   container

;

appBar: APPBAR_WIDGET OP
        TITLE CO CONST_? text
        CP
        ;

text : TEXT_WIDGET OP IDENTIFIER CP

;

container
    : CONTAINER_WIDGET OP
      CHILD_HEAD CO CONST_? widget C
      CP
;

