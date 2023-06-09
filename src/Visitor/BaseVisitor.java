    package Visitor;

    import AST.*;
    import AST.ErorrHandlingPackage.SemanticCheck;
    import AST.Expressions.*;
    import AST.Literals.*;
    import AST.MethodPackage.FormalParameter;
    import AST.MethodPackage.FormalParameters;
    import AST.MethodPackage.MethodDeclaration;
    import AST.Statements.*;
    import AST.Types.*;
    import AST.clases.*;
    import Antlr.dartParser;
    import Antlr.dartParserBaseVisitor;
    import Flutter.FlutterFunction.AnonymousFunction;
    import Flutter.FlutterFunction.RMS_AnonymousFunction;
    import Flutter.FlutterFunction.ROS_AnonymousFunction;
    import Flutter.Widgets.*;
    import Flutter.properties.*;
    import SemanticAnalysis.Symbol;
    import SemanticAnalysis.SymbolTable;

    import java.util.ArrayList;
    import java.util.List;

    public class BaseVisitor extends dartParserBaseVisitor {

        SymbolTable symbolTable = new SymbolTable();


        @Override
        public Program visitProgram(dartParser.ProgramContext ctx) {
            Program program = new Program();

            for(int i =0 ; i< ctx.statement().size();i++)
            {
                if(ctx.statement(i)!= null)
                {
                    program.getStatement().add((Statement) visit(ctx.statement(i)));
                }
            }

    //        for(int i =0 ; i< ctx.localVariableDeclaration().size();i++)
    //        {
    //            if(ctx.localVariableDeclaration(i)!= null)
    //            {
    //                program.getLocalVariableDeclarationList().add(visitLocalVariableDeclaration(ctx.localVariableDeclaration(i)));
    //            }
    //        }
            return program;
        }


        @Override
        public CompilationUnit visitCompilationUnit(dartParser.CompilationUnitContext ctx) {
            CompilationUnit compilationUnit = new CompilationUnit();

            for(int i =0 ; i< ctx.classDeclaration().size();i++)
            {
                if(ctx.classDeclaration(i)!= null)
                {
                    compilationUnit.getClassDeclaration().add(visitClassDeclaration(ctx.classDeclaration(i)));
                }
            }
            //this.symbolTable.print();

    //        SemanticCheck semanticCheck = new SemanticCheck();
    //        semanticCheck.setSymbolTable(symbolTable);
    //        semanticCheck.check();

            return compilationUnit;
        }

        @Override
        public ClassDeclaration visitClassDeclaration(dartParser.ClassDeclarationContext ctx) {
            ClassDeclaration classDeclaration = new ClassDeclaration();

            if (symbolTable.lookup(ctx.IDENTIFIER().getText()) != null)
            {
                // class has already been declared in the current scope
                // report an error
                System.err.println("Error in Line "+ ctx.IDENTIFIER().getSymbol().getLine() +" : the identifier " + ctx.IDENTIFIER().getText() + " has already been declared");
            }
            else
            {
                symbolTable.insert(ctx.IDENTIFIER().getText(),ctx.IDENTIFIER().getText(),"class");
                classDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
                symbolTable.enterScope();

                for(int i =0 ; i< ctx.classBodyDeclaration().size();i++)
                {
                    if(ctx.classBodyDeclaration(i)!= null)
                    {
                        classDeclaration.getClassBodyArrayList().add((ClassBody)visit(ctx.classBodyDeclaration(i)));
                    }
                }
                symbolTable.exitScope();
            }

            return classDeclaration;
        }

        @Override
        public ClassBody visitVariableDeclarationClassBody(dartParser.VariableDeclarationClassBodyContext ctx) {
            VariableClassBody variableClassBody = new VariableClassBody();

            variableClassBody.setLocalVar(visitLocalVariableDeclaration(ctx.localVariableDeclaration()));

            return variableClassBody;
        }

        @Override
        public ClassBody visitConstructorDeclarationClassBody(dartParser.ConstructorDeclarationClassBodyContext ctx) {
            ConstructorClassBody constructorClassBody = new ConstructorClassBody();
            constructorClassBody.setIdentifier(ctx.constructorDeclaration().IDENTIFIER().getText());
            constructorClassBody.setFormalParameters(visitFormalParameters(ctx.constructorDeclaration().formalParameters()));
            for(int i=0;i<ctx.constructorDeclaration().block().statement().size();i++)
            {
                constructorClassBody.getStatement().add((Statement) visit(ctx.constructorDeclaration().block().statement(i)));
            }
            return constructorClassBody;
        }

        @Override
        public ClassBody visitMethodDeclarationClassBody(dartParser.MethodDeclarationClassBodyContext ctx) {
            MethodClassBody methodClassBody = new MethodClassBody();

            methodClassBody.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));

            return methodClassBody;
        }

        @Override
        public localVariableDeclaration visitLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx) {
            localVariableDeclaration variableDeclaration = new localVariableDeclaration();

            variableDeclaration.setPrimitive((primitiveType) visit(ctx.primitiveType()));

            for (dartParser.VariableDeclaratorContext varCtx: ctx.variableDeclarators().variableDeclarator()
                 ) {
                if (symbolTable.lookup(varCtx.IDENTIFIER().getText()) != null) {
                    // variable has already been declared in the current scope
                    // report an error
                    System.err.println("Error in Line "+ varCtx.IDENTIFIER().getSymbol().getLine() +" : variable " + varCtx.IDENTIFIER().getText() + " has already been declared");
                } else {
                    // variable has not been declared in the current scope
                    // add it to the symbol tableSystem.err.println("Error in Line "+ varCtx.IDENTIFIER().getSymbol().getLine() +" : variable " + varCtx.IDENTIFIER().getText() + " has already been declared");
                    symbolTable.insert(varCtx.IDENTIFIER().getText(),variableDeclaration.getPrimitive().getType(),"variable");
                }
            }

            variableDeclaration.setVariableDeclaratorsObject(visitVariableDeclarators(ctx.variableDeclarators()));

                return variableDeclaration;
        }

        @Override
        public variableDeclarators visitVariableDeclarators(dartParser.VariableDeclaratorsContext ctx) {
            variableDeclarators declarators = new variableDeclarators();
            for(int i=0;i<ctx.variableDeclarator().size();i++)
            {
             declarators.getVariableDeclaratorList().add(visitVariableDeclarator(ctx.variableDeclarator(i)));
            }
            return declarators;
        }

        @Override
        public variableDeclarator visitVariableDeclarator(dartParser.VariableDeclaratorContext ctx) {
            variableDeclarator declarator = new variableDeclarator();
            declarator.setIdentifier(ctx.IDENTIFIER().getText());

            if (ctx.expression() != null) {
                Expression expr = (Expression) visit(ctx.expression());
                String exprType = expr.getType();
                    // get the type of the variable from the symbol table
                    String varType = symbolTable.lookup(declarator.getIdentifier()).getType();
                    //System.out.printf("\n exprType: "+ exprType+", varType: "+ varType);
                    if (!exprType.equals(varType)) {
                        // report a type mismatch error
                        System.err.println("Error in Line: "+ctx.IDENTIFIER().getSymbol().getLine()+" type mismatch in variable declaration");
                    }

                declarator.setExpression(expr);
            }
            return declarator;
        }

        //////             Start method

        @Override
        public MethodDeclaration visitMethodDeclaration(dartParser.MethodDeclarationContext ctx) {
            MethodDeclaration methodDeclaration = new MethodDeclaration();
            methodDeclaration.setPrim((primitiveType) visit(ctx.primitiveType()));

            if(symbolTable.lookup(ctx.IDENTIFIER().getText())!=null)
            {
                System.err.println("Error in Line "+ ctx.IDENTIFIER().getSymbol().getLine() +" : method " + ctx.IDENTIFIER().getText() + " has already been declared");
            }
            else
            {
                symbolTable.insert(ctx.IDENTIFIER().getText(),
                         methodDeclaration.getPrim().getType(),
                        "function");
                methodDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
            }

            symbolTable.enterScope();
            methodDeclaration.setFormalParameters(visitFormalParameters(ctx.formalParameters()));
            for(int i =0;i<ctx.block().statement().size();i++)
            {
                methodDeclaration.getStatement().add((Statement) visit(ctx.block().statement(i)));
            }
            ArrayList<Return> returnStatements = new ArrayList<>();
            for (Statement st :methodDeclaration.getStatement()) {
                if(st instanceof ExpressionStatement)
                {
                    if(((ExpressionStatement) st).getExpression() instanceof Return)
                        returnStatements.add((Return)((ExpressionStatement) st).getExpression());
                }
            }
            String returnType = methodDeclaration.getPrim().getType();
            if (returnType.equals("void"))
            {
                for (Return returnStatement : returnStatements) {
                    if (returnStatement.getExpression() != null) {
                        // Report an error if a return statement returns a value
                        System.err.println("Error: Method " + ctx.IDENTIFIER().getText() + " is declared to return void but has a return statement that returns a value");
                    }
                }
            }
            else
            {
                // Check if there are any return statements
                if (returnStatements.isEmpty()) {
                    // Report an error if there are no return statements
                    System.err.println("Error: Method " + ctx.IDENTIFIER().getText() + " is missing a return statement");
                } else {
                    // Check the type of the returned expression for each return statement
                    for (Return returnStatement : returnStatements) {
                        // Get the type of the returned expression
                        String expressionType = returnStatement.getType();

                        // Compare the expression type with the return type of the method
                        if (expressionType == null ||!expressionType.equals(returnType)) {
                            // Report an error if the types do not match
                            System.err.println("Error: Method " + ctx.IDENTIFIER().getText() + " returns an expression of type " + expressionType + " but is declared to return " + returnType);
                        }
                    }
                }

            }
            symbolTable.exitScope();

            return methodDeclaration;
        }

        @Override
        public FormalParameters visitFormalParameters(dartParser.FormalParametersContext ctx) {
            FormalParameters formalParameters = new FormalParameters();

            for(int i =0 ; i< ctx.formalParameter().size();i++)
            {
                formalParameters.getFormalParameterArrayList().add(visitFormalParameter(ctx.formalParameter(i)));
            }

            return formalParameters;
        }

        @Override
        public FormalParameter visitFormalParameter(dartParser.FormalParameterContext ctx) {
            FormalParameter formalParameter = new FormalParameter();

            formalParameter.setP((primitiveType) visit(ctx.primitiveType()));

            if(symbolTable.lookup(ctx.IDENTIFIER().getText())!=null)
            {
                System.err.println("Error in Line "+ ctx.IDENTIFIER().getSymbol().getLine() +" : variable " + ctx.IDENTIFIER().getText() + " has already been declared");

            }
            else
            {
                symbolTable.insert(ctx.IDENTIFIER().getText(),formalParameter.getP().getType(),"variable");
                formalParameter.setIdentifier(ctx.IDENTIFIER().getText());
            }

            return formalParameter;
        }

        //////             End method



        //////             Start Statement

        @Override
        public Statement visitStatementBlock(dartParser.StatementBlockContext ctx) {
            BlockStatement blockStatement = new BlockStatement();
            symbolTable.enterScope();
            for(int i =0;i<ctx.block().statement().size();i++)
            {
                blockStatement.getStatement().add((Statement) visit(ctx.block().statement(i)));
            }
            symbolTable.exitScope();

            return blockStatement;
        }

        @Override
        public Statement visitStatementIF(dartParser.StatementIFContext ctx) {
            IFStatement ifStatement = new IFStatement();

            ifStatement.setParExpression((Expression) visit(ctx.parExpression().expression()));
            ifStatement.setStatement1((Statement) visit(ctx.statement(0)));
            if(ctx.statement(1) != null)
                ifStatement.setStatement2((Statement) visit(ctx.statement(1)));

            return ifStatement;
        }

        @Override
        public Statement visitStatementFOR(dartParser.StatementFORContext ctx) {
            FORStatement forStatement = new FORStatement();
            forStatement.setLocalVariable(visitLocalVariableDeclaration(ctx.forControl().forInit().localVariableDeclaration()));
            forStatement.setEx1((Expression) visit(ctx.forControl().expression(0)));
            forStatement.setEx2((Expression) visit(ctx.forControl().expression(1)));
            forStatement.setStatement((Statement) visit(ctx.statement()));
            return forStatement;
        }

        @Override
        public Statement visitStatementVariableDeclaration(dartParser.StatementVariableDeclarationContext ctx) {
            VariableDeclarationStatement variableDeclarationStatement = new VariableDeclarationStatement();
            variableDeclarationStatement.setLocalVariable(visitLocalVariableDeclaration(ctx.localVariableDeclaration()));
            return variableDeclarationStatement;
        }

        @Override
        public Statement visitStatementExpression(dartParser.StatementExpressionContext ctx) {
            ExpressionStatement expressionStatement = new ExpressionStatement();

            expressionStatement.setExpression((Expression) visit(ctx.expression()));

            return expressionStatement ;
        }

        @Override
        public Statement visitStatementWidget(dartParser.StatementWidgetContext ctx) {
            WidgetStatement widgetStatement = new WidgetStatement();
            widgetStatement.setWidget((Widget) visit(ctx.widget()));

            return widgetStatement;
        }


        //////             End Statement

        //////             Start Expression

        @Override
        public Expression visitExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx) {
            IdentifierExpression identifierExpression = new IdentifierExpression();

            Symbol symbol = symbolTable.lookup(ctx.IDENTIFIER().getText());
            if(symbol != null)
            {
                identifierExpression.setValue(ctx.IDENTIFIER().getText());
                identifierExpression.setType(symbol.getType());
            }
            else
                System.err.println("Error in Line: "+ctx.IDENTIFIER().getSymbol().getLine()+": "+ctx.IDENTIFIER().getText()+" is not declared");


            if (ctx.expression() != null) {
                Expression expr = (Expression) visit(ctx.expression());
                String exprType = expr.getType();
                // get the type of the variable from the symbol table
                String varType = symbolTable.lookup(identifierExpression.getValue()).getType();
                if (!exprType.equals(varType)) {
                    // report a type mismatch error
                    System.err.println("Error in Line: "+ctx.IDENTIFIER().getSymbol().getLine()+" type mismatch in variable declaration");
                }

                identifierExpression.setExpression(expr);
            }

            return identifierExpression;
        }

        @Override
        public Expression visitOPExpressionCP(dartParser.OPExpressionCPContext ctx) {
            betweenBrackets bet = new betweenBrackets();
            bet.setEx1((Expression) visit(ctx.expression()));
            return bet;
        }

        @Override
        public Expression visitExpressionPlusExpression(dartParser.ExpressionPlusExpressionContext ctx) {
            Plus plus = new Plus();

            plus.setEx1((Expression) visit(ctx.expression(0)));
            plus.setEx2((Expression) visit(ctx.expression(1)));

            return plus;
        }

        @Override
        public Expression visitExpressionMultiplyExpression(dartParser.ExpressionMultiplyExpressionContext ctx) {
            Multiply multi = new Multiply();

            multi.setEx1((Expression) visit(ctx.expression(0)));
            multi.setEx2((Expression) visit(ctx.expression(1)));

            return multi;
        }

        @Override
        public Expression visitExpressionCompareExpression(dartParser.ExpressionCompareExpressionContext ctx) {
            Compare compare = new Compare();
            compare.setCompareElement(ctx.op.getText());
            compare.setEx1((Expression) visit(ctx.expression(0)));
            compare.setEx2((Expression) visit(ctx.expression(1)));
            return compare;
        }

        @Override
        public Expression visitExpressionPostfix(dartParser.ExpressionPostfixContext ctx) {
            Postfix postfix = new Postfix();
            postfix.setPostfixSymbol(ctx.postfix.getText());

            postfix.setEx1((Expression) visit(ctx.expression()));
            return postfix;
        }

        @Override
        public Expression visitReturnExpression(dartParser.ReturnExpressionContext ctx) {
            Return returnObject = new Return();

            if(ctx.expression()!=null)
            {
                Expression ex = (Expression) visit(ctx.expression());
                returnObject.setExpression(ex);
                returnObject.setType(ex.getType());
            }

            return returnObject;
        }

        //  Start Literal
        @Override
        public Expression visitExpressionLiteral(dartParser.ExpressionLiteralContext ctx) {
            LiteralExpression literalExpression = new LiteralExpression();

            Literal literal = (Literal) visit(ctx.literal());
            String type = null;
            if (literal instanceof BooleanLiteral) {
                type = "bool";
            } else if (literal instanceof NumericLiteral) {
                type = "int"; // or "double" depending on the value of the numeric literal
            } else if (literal instanceof StringLiteral) {
                type = "String";
            }
            else if (literal instanceof CharLiteral) {
                type = "char";
            }else if (literal instanceof NullLiteral) {
                type = "null";
            }

            literalExpression.setType(type);
            literalExpression.setLiteral(literal);

            //literalExpression.setLiteral((Literal) visit(ctx.literal()));

            return literalExpression;
        }

        @Override
        public Literal visitLiteralBoolean(dartParser.LiteralBooleanContext ctx) {
            BooleanLiteral booleanLiteral = new BooleanLiteral();
            booleanLiteral.setValue(ctx.booleanLiteral().getText());


            return booleanLiteral;
        }

        @Override
        public Literal visitLiteralNumeric(dartParser.LiteralNumericContext ctx) {
            NumericLiteral numericLiteral = new NumericLiteral();
            numericLiteral.setValue(ctx.numericLiteral().getText());


            return numericLiteral;
        }

        @Override
        public Literal visitLiteralString(dartParser.LiteralStringContext ctx) {
            StringLiteral stringLiteral = new StringLiteral();
            stringLiteral.setValue(ctx.stringLiteral().getText());

            return stringLiteral;
        }

        @Override
        public Literal visitLiteralChar(dartParser.LiteralCharContext ctx) {
            CharLiteral charLiteral = new CharLiteral();
            charLiteral.setValue(ctx.charLiteral().getText());

            return charLiteral;
        }

        @Override
        public Literal visitLiteralNull(dartParser.LiteralNullContext ctx) {
            NullLiteral nullLiteral = new NullLiteral();
            nullLiteral.setValue(ctx.nullLiteral().getText());

            return nullLiteral;
        }

        @Override
        public Expression visitExpressionWidget(dartParser.ExpressionWidgetContext ctx) {
            WidgetExpression widgetExpression = new WidgetExpression();

            widgetExpression.setWidgetStatement((Widget) visit(ctx.widget()));

            return widgetExpression;
        }

        @Override
        public Expression visitExpressionConstructorCall(dartParser.ExpressionConstructorCallContext ctx) {
            ConstructorCallExpression constructorCallExpression = new ConstructorCallExpression();
            constructorCallExpression.setIdentifier(ctx.constructorCall().IDENTIFIER().getText());
            for(int i=0;i<ctx.constructorCall().properties().property().size();i++)
            {
                constructorCallExpression.getProperties().add((Property) visit(ctx.constructorCall().properties().property(i)));
            }
            return constructorCallExpression;
        }

        //  End Literal


        //////             End Expression


        //////             Start primitiveType
        @Override
        public primitiveType visitIntType(dartParser.IntTypeContext ctx) {
            INT intObject = new INT();
            intObject.setType(ctx.INT().getText());

            return intObject;
        }

        @Override
        public primitiveType visitBoolType(dartParser.BoolTypeContext ctx) {
            BOOLEAN boolObject = new BOOLEAN();
            boolObject.setType(ctx.BOOLEAN().getText());

            return boolObject;
        }
        @Override
        public primitiveType visitCharType(dartParser.CharTypeContext ctx) {
            CHAR charObject = new CHAR();
            charObject.setType(ctx.CHAR().getText());

            return charObject;
        }

        @Override
        public primitiveType visitStringType(dartParser.StringTypeContext ctx) {
            STRING stringObject = new STRING();
            stringObject.setType(ctx.STRING_().getText());

            return stringObject;
        }

        @Override
        public primitiveType visitVoidType(dartParser.VoidTypeContext ctx) {
            VOID voidObject = new VOID();
            voidObject.setType(ctx.VOID_().getText());

            return voidObject;
        }

        @Override
        public primitiveType visitWidgetType(dartParser.WidgetTypeContext ctx) {
            WIDGET widget = new WIDGET();
            widget.setType(ctx.WIDGET().getText());
            return widget;
        }


        //////             End primitiveType

        ////////////////////////////////////////////////   Start Flutter ////////////////////////////////


        //////             Start Widgets

        @Override
        public Widget visitAPPBAR_Widget(dartParser.APPBAR_WidgetContext ctx) {
            APPBAR_Widget appbar_widget = new APPBAR_Widget();

            for(int i=0;i<ctx.properties().property().size();i++)
            {
                appbar_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return appbar_widget;
        }

        @Override
        public Object visitBUTTON_Widget(dartParser.BUTTON_WidgetContext ctx) {
            return super.visitBUTTON_Widget(ctx);
        }

        @Override
        public Widget visitCENTER_Widget(dartParser.CENTER_WidgetContext ctx) {

            CENTER_Widget center_widget = new CENTER_Widget();

            for(int i=0;i<ctx.properties().property().size();i++)
            {
                center_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return center_widget;
        }

        @Override
        public Object visitCONTAINER_Widget(dartParser.CONTAINER_WidgetContext ctx) {
            return super.visitCONTAINER_Widget(ctx);
        }

        @Override
        public Object visitCOLUMN_Widget(dartParser.COLUMN_WidgetContext ctx) {
            return super.visitCOLUMN_Widget(ctx);
        }

        @Override
        public Widget visitELEVATEDBUTTON_Widget(dartParser.ELEVATEDBUTTON_WidgetContext ctx) {
            ELEVATEDBUTTON_Widget elevatedbutton_widget = new ELEVATEDBUTTON_Widget();

            for(int i=0;i<ctx.properties().property().size();i++)
            {
                elevatedbutton_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return elevatedbutton_widget;
        }

        @Override
        public Object visitIMAGE_Widget(dartParser.IMAGE_WidgetContext ctx) {
            return super.visitIMAGE_Widget(ctx);
        }

        @Override
        public Object visitLISTVIEW_Widget(dartParser.LISTVIEW_WidgetContext ctx) {
            return super.visitLISTVIEW_Widget(ctx);
        }

        @Override
        public Object visitMATERIALAPP_Widget(dartParser.MATERIALAPP_WidgetContext ctx) {
            return super.visitMATERIALAPP_Widget(ctx);
        }

        @Override
        public Widget visitMATERIALPAGEROUTE_Widget(dartParser.MATERIALPAGEROUTE_WidgetContext ctx) {
            MATERIALPAGEROUTE_Widget materialpageroute_widget = new MATERIALPAGEROUTE_Widget();
            for(int i=0;i<ctx.properties().property().size();i++)
            {
                materialpageroute_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return materialpageroute_widget;
        }

        @Override
        public Widget visitNAVIGATOR_Widget(dartParser.NAVIGATOR_WidgetContext ctx) {
            NAVIGATOR_Widget navigator_widget = new NAVIGATOR_Widget();
            navigator_widget.setWidget((Widget) visit(ctx.widget()));
            return navigator_widget;
        }

        @Override
        public Object visitROW_Widget(dartParser.ROW_WidgetContext ctx) {
            return super.visitROW_Widget(ctx);
        }

        @Override
        public Widget visitSCAFFOLD_Widget(dartParser.SCAFFOLD_WidgetContext ctx) {
            SCAFFOLD_Widget scaffold_widget = new SCAFFOLD_Widget();
            for(int i=0;i<ctx.properties().property().size();i++)
            {
                scaffold_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return scaffold_widget;
        }

        @Override
        public Widget visitTEXT_Widget(dartParser.TEXT_WidgetContext ctx) {

            TEXT_Widget text_widget = new TEXT_Widget();
            for(int i=0;i<ctx.properties().property().size();i++)
            {
                text_widget.getProperties().add((Property) visit(ctx.properties().property(i)));
            }
            return text_widget;
        }


        //////             End Widgets


        //////             Start property


        @Override
        public Property visitAPPBAR_PROPERTY(dartParser.APPBAR_PROPERTYContext ctx) {
            APPBAR_PROPERTY appbar_property = new APPBAR_PROPERTY();

            appbar_property.setPropertyName(ctx.APPBAR_PROPERTY().getText());
            appbar_property.setPropertyValue((Widget) visit(ctx.widget()));

//            if(ctx.widget().widget_name().getText().equals("AppBar")) {
//                appbar_property.setWidget((WidgetStatement) visit(ctx.widget()));
//            }
//            else {
//                System.err.printf("Error in Line " + ctx.APPBAR_PROPERTY().getSymbol().getLine() + " widget must be AppBar");
//            }

            return appbar_property;
        }

        @Override
        public Property visitBODY_PROPERTY(dartParser.BODY_PROPERTYContext ctx) {
            BODY_PROPERTY body_property = new BODY_PROPERTY();

            body_property.setPropertyName(ctx.BODY_PROPERTY().getText());
            body_property.setPropertyValue((Widget) visit(ctx.widget()));
            return body_property;
        }

        @Override
        public Property visitBUILDER_PROPERTY(dartParser.BUILDER_PROPERTYContext ctx) {
            BUILDER_PROPERTY builder_property = new BUILDER_PROPERTY();
            builder_property.setPropertyName(ctx.BUILDER_PROPERTY().getText());
            builder_property.setPropertyValue((AnonymousFunction)visit(ctx.anonymousFunction()));
            return builder_property;
        }

        @Override
        public Property visitCHILD_PROPERTY(dartParser.CHILD_PROPERTYContext ctx) {
            CHILD_PROPERTY child_property = new CHILD_PROPERTY();

            child_property.setPropertyName(ctx.CHILD_PROPERTY().getText());
            child_property.setPropertyValue((Widget) visit(ctx.widget()));

            return child_property;
        }

        @Override
        public Property visitCHILDREN_PROPERTY(dartParser.CHILDREN_PROPERTYContext ctx) {
            CHILDREN_PROPERTY children_property = new CHILDREN_PROPERTY();

            children_property.setPropertyName(ctx.CHILDREN_PROPERTY().getText());
            for(int i =0;i<ctx.child_widgets().widget().size();i++)
            {
                children_property.getPropertyValue().add((Widget) visit(ctx.child_widgets().widget().get(i)));
            }

            return children_property;
        }

        @Override
        public Property visitCOLOR_PROPERTY(dartParser.COLOR_PROPERTYContext ctx) {
            COLOR_PROPERTY color_property = new COLOR_PROPERTY();
            color_property.setPropertyName(ctx.COLOR_PROPERTY().getText());
            color_property.setPropertyValue(ctx.COLOR().getText());
            return color_property;
        }

        @Override
        public Property visitFLOATINGACTIONBUTTON_PROPERTY(dartParser.FLOATINGACTIONBUTTON_PROPERTYContext ctx) {
            FLOATINGACTIONBUTTON_PROPERTY floatingactionbutton_property = new FLOATINGACTIONBUTTON_PROPERTY();

            floatingactionbutton_property.setPropertyName(ctx.FLOATINGACTIONBUTTON_PROPERTY().getText());
            floatingactionbutton_property.setWidget((WidgetStatement) visit(ctx.widget()));
            return floatingactionbutton_property;
        }

        @Override
        public Property visitIDENTIFIER_PROPERTY(dartParser.IDENTIFIER_PROPERTYContext ctx) {
            IDENTIFIER_PROPERTY identifier_property = new IDENTIFIER_PROPERTY();
            identifier_property.setPropertyName(ctx.IDENTIFIER().getText());
            identifier_property.setExpression((Expression) visit(ctx.expression()));
            return identifier_property;
        }

        @Override
        public Property visitIMAGE_PROPERTY(dartParser.IMAGE_PROPERTYContext ctx) {
            IMAGE_PROPERTY image_property = new IMAGE_PROPERTY();

            image_property.setPropertyName(ctx.IMAGE_PROPERTY().getText());
            image_property.setPropertyValue(ctx.STRING_LITERAL().getText());

            return image_property;
        }

        @Override
        public Property visitONPRESSED_PROPERTY(dartParser.ONPRESSED_PROPERTYContext ctx) {
            ONPRESSED_PROPERTY onpressed_property = new ONPRESSED_PROPERTY();

            onpressed_property.setPropertyName(ctx.ONPRESSED_PROPERTY().getText());
            onpressed_property.setPropertyValue((AnonymousFunction)visit(ctx.anonymousFunction()));

            return onpressed_property;
        }

        @Override
        public Property visitPADDING_PROPERTY(dartParser.PADDING_PROPERTYContext ctx) {
            PADDING_PROPERTY padding_property = new PADDING_PROPERTY();

            padding_property.setPropertyName(ctx.PADDING_PROPERTY().getText());
            padding_property.setPropertyValue(ctx.NUMBER().getText());

            return padding_property;
        }

        @Override
        public Property visitTEXT_PROPERTY(dartParser.TEXT_PROPERTYContext ctx) {
            TEXT_PROPERTY text_property = new TEXT_PROPERTY();

            text_property.setPropertyName(ctx.TEXT_PROPERTY().getText());
            text_property.setPropertyValue(ctx.STRING_LITERAL().getText());

            return text_property;
        }

        @Override
        public Property visitTITLE_PROPERTY(dartParser.TITLE_PROPERTYContext ctx) {
            TITLE_PROPERTY title_property = new TITLE_PROPERTY();
            title_property.setPropertyName(ctx.TITLE_PROPERTY().getText());

            title_property.setPropertyValue((Widget)visit(ctx.widget()));

//            if(ctx.widget().widget_name().getText().equals("Text")) {
//                title_property.setWidget((WidgetStatement) visit(ctx.widget()));
//            }
//            else {
//                System.err.printf("Error in Line " + ctx.TITLE_PROPERTY().getSymbol().getLine() + " widget must be Text");
//            }

            return title_property;
        }

        //////////////////////////////  End property



        //////////////////////////////  start anonymousFunction

        @Override
        public AnonymousFunction visitReturnOwnStatement(dartParser.ReturnOwnStatementContext ctx) {
            ROS_AnonymousFunction ros_anonymousFunction = new ROS_AnonymousFunction();
            ros_anonymousFunction.setExpression((Expression) visit(ctx.expression()));
            return ros_anonymousFunction;
        }

        @Override
        public AnonymousFunction visitReturnMultiStatement(dartParser.ReturnMultiStatementContext ctx) {
            RMS_AnonymousFunction rms_anonymousFunction = new RMS_AnonymousFunction();
            for(int i =0;i<ctx.block().statement().size();i++)
            {
                rms_anonymousFunction.getStatements().add((Statement) visit(ctx.block().statement(i)));
            }
            return rms_anonymousFunction;
        }
        //////////////////////////////  End anonymousFunction

    }


