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
     | constructorDeclaration SC                            #ConstructorDeclarationClassBody
   //  | STATIC_? block
     | classOrInterfaceModifier* methodDeclaration          #MethodDeclarationClassBody
     | classOrInterfaceModifier* classDeclaration           #ClassDeclarationClassBody
     ;

constructorDeclaration
    : IDENTIFIER formalParameters block
    ;

//constructorBody
//    : OBC blockStatement* CBC
//    ;


constructorCall
    : IDENTIFIER OP properties CP
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


/*

functionSignature
    : returnType? name=formalParameterList
    ;



*/


// method decleration

methodDeclaration
    : (primitiveType | VOID_ | WIDGET) IDENTIFIER formalParameters  block
    ;

//functionBody
//    : '=>' expression ';'
//    | block
//    ;

formalParameters
    : OP formalParameter? (C formalParameter)* CP
    ;

formalParameter
    : primitiveType IDENTIFIER
    | OBC (REQUIRED_ THIS_ DOT IDENTIFIER)+ CBC
    ;

//   statment decleration

statement
    : block                                                 #StatementBlock
    | IF_ parExpression statement (ELSE_ statement)?        #StatementIF
    | FOR_ OP forControl CP statement                       #StatementFOR
    | WHILE_ parExpression statement                        #StatementWHILE
    | DO_ statement WHILE_ parExpression SC                 #StatementDoWhile
    | localVariableDeclaration  SC                          #StatementVariableDeclaration
    | widget                                                #StatementWidget
    | expression SC                                         #StatementExpression
    ;


//   expression decleration

expression
    :  OP expression CP                                     #OPExpressionCP
    |  expression ASTERISK expression                       #ExpressionMultiplyExpression
    |  expression PL expression                             #ExpressionPlusExpression
    |  expression op=(LTE | EG | GT | LT | EE) expression   #ExpressionCompareExpression
    |  expression postfix=(PLPL | MM)                       #ExpressionPostfix
    |  RETURN_ expression?                                  #ReturnExpression
    |  THROW_ expression SC                                 #ThrowExpression
    |  BREAK_  SC                                           #BreakExpression
    |  CONTINUE_ SC                                         #ContinueExpression
    |  literal                                              #ExpressionLiteral
    |  IDENTIFIER (EQ expression)?  (OP CP)?                #ExpressionIDENTIFIER
    |  widget                                               #ExpressionWidget
    |  constructorCall                                      #ExpressionConstructorCall
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
    | VOID_             #VoidType
    | WIDGET            #WidgetType
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


app : widget
    ;

widget      : APPBAR            OP ( properties ) CP               #APPBAR_Widget
            | BUTTON            OP ( properties ) CP               #BUTTON_Widget
            | CENTER            OP ( properties ) CP               #CENTER_Widget
            | CONTAINER         OP ( properties ) CP               #CONTAINER_Widget
            | COLUMN            OP ( properties ) CP               #COLUMN_Widget
            | ELEVATEDBUTTON    OP ( properties ) CP               #ELEVATEDBUTTON_Widget
            | IMAGE             OP ( properties ) CP               #IMAGE_Widget
            | LISTVIEW          OP ( properties ) CP               #LISTVIEW_Widget
            | MATERIALAPP       OP ( properties ) CP               #MATERIALAPP_Widget
            | MATERIALPAGEROUTE OP ( properties ) CP               #MATERIALPAGEROUTE_Widget
            | NAVIGATOR         DOT PUSH OP widget CP SC           #NAVIGATOR_Widget //DOT PUSH OP widget CP SC
            | ROW               OP ( properties ) CP               #ROW_Widget
            | SCAFFOLD          OP ( properties ) CP               #SCAFFOLD_Widget
            | TEXT              OP ( properties ) CP               #TEXT_Widget
            ;

properties : property (C property)* C?
//           | property C properties
           ;

property : APPBAR_PROPERTY widget                               #APPBAR_PROPERTY
         | BODY_PROPERTY widget                                 #BODY_PROPERTY
         | BUILDER_PROPERTY anonymousFunction                   #BUILDER_PROPERTY
         | CHILD_PROPERTY widget                                #CHILD_PROPERTY
         | CHILDREN_PROPERTY OB child_widgets CB                #CHILDREN_PROPERTY
         | COLOR_PROPERTY COLOR                                 #COLOR_PROPERTY
         | FLOATINGACTIONBUTTON_PROPERTY widget                 #FLOATINGACTIONBUTTON_PROPERTY
         | HOME_PROPERTY widget                                 #HOME_PROPERTY //////////////////////////
         | IMAGE_PROPERTY STRING_LITERAL                        #IMAGE_PROPERTY
         | ONPRESSED_PROPERTY anonymousFunction                 #ONPRESSED_PROPERTY
         | PADDING_PROPERTY NUMBER                              #PADDING_PROPERTY
         | TEXT_PROPERTY STRING_LITERAL                         #TEXT_PROPERTY
         | TITLE_PROPERTY widget                                #TITLE_PROPERTY
         | TITLE_PROPERTY_MATERIALAPP STRING_LITERAL            #TITLE_PROPERTY_MATERIALAPP  ///////////////////
         | IDENTIFIER CO expression                             #IDENTIFIER_PROPERTY         ///////////////////
         ;


child_widgets :  widget (C widget)* C?
              ;


anonymousFunction
    :  formalParameters  ARROW expression SC                   #ReturnOwnStatement
    |  formalParameters  block                                 #ReturnMultiStatement
    ;

navigatorFunction : PUSH OP widget CP SC
    //: PUSH OP CONTEXT C widget CP SC
    ;

materialPageRoute
    : MATERIALPAGE_ROUTE OP BUILDER CO anonymousFunction
    ;

context
    : IDENTIFIER
    ;



///////////      EXAMPLE  2   //////////////
/*

Page2()

class person{

Widget build() {
    return Scaffold(
      appBar: AppBar(title: Text(text: "Page 1")),
      body: Center(
        child: ElevatedButton(
          child: Text(text: "Go to Page 2"),
          onPressed: () {
            Navigator.push(
                          context,
                          MaterialPageRoute(builder: (context) => Page2()),
                        );
          },
        ),
      ),
    );
  }
}

*/


///////////      EXAMPLE  1   //////////////
/*

ListView(
  children: [
    Container(color: #FF0000, padding: 10) {
      Text(text: "Hello, world!")
      RaisedButton(color: #00FF00, text: "Click me!", onPressed: () => void)
    }
    Container(color: #0000FF, padding: 20) {
      Text(text: "Welcome to my app!")
    }
  ]
)

*/


