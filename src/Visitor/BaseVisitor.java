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
import SemanticAnalysis.Symbol;
import SemanticAnalysis.SymbolTable;

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


//        localVariableDeclaration variableDeclaration = new localVariableDeclaration();
//
//        variableDeclaration.setPrimitive((primitiveType)visit(ctx.localVariableDeclaration().primitiveType()));
//        variableDeclaration.setVariableDeclaratorsObject(visitVariableDeclarators(ctx.localVariableDeclaration().variableDeclarators()));
//
//        return variableDeclaration;
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

        //variableDeclaration.setVariableDeclaratorsObject(visitVariableDeclarators(ctx.variableDeclarators()));

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
//            if (varCtx.expression() != null) {
//                String exprType = (String) visit(varCtx.expression());
//                if (!variableDeclaration.getPrimitive().getType().equals(exprType)) {
//                    System.err.println("Error in Line "+ varCtx.IDENTIFIER().getSymbol().getLine() +" : type mismatch in variable declaration");
//                }
//            }
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

//        if(ctx.expression() != null)
//        {
//            declarator.setExpression((Expression) visit(ctx.expression()));
//        }
        return declarator;
    }

    //////             Start method

    @Override
    public MethodDeclaration visitMethodDeclaration(dartParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();
        if(ctx.primitiveType() != null)
            methodDeclaration.setPrim((primitiveType) visit(ctx.primitiveType()));
        else
        {
//            Row row = new Row();
//            row.setType("type");
//            row.setValue("void");
//            symbolTable.getRows().add(row);
        }

        if(symbolTable.lookup(ctx.IDENTIFIER().getText())!=null)
        {
            System.err.println("Error in Line "+ ctx.IDENTIFIER().getSymbol().getLine() +" : method " + ctx.IDENTIFIER().getText() + " has already been declared");
        }
        else
        {
            symbolTable.insert(ctx.IDENTIFIER().getText(),
                               methodDeclaration.getPrim()!= null? methodDeclaration.getPrim().getType():"void",
                          "function");
            methodDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
        }

        symbolTable.enterScope();
        methodDeclaration.setFormalParameters(visitFormalParameters(ctx.formalParameters()));
        for(int i =0;i<ctx.block().statement().size();i++)
        {
            methodDeclaration.getStatement().add((Statement) visit(ctx.block().statement(i)));
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


    //////             End Statement

    //////             Start Expression

    @Override
    public Expression visitExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx) {
        IdentifierExpression identifierExpression = new IdentifierExpression();

        if(symbolTable.lookup(ctx.IDENTIFIER().getText()) != null)
        {
            identifierExpression.setValue(ctx.IDENTIFIER().getText());
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

    //////             End primitiveType
}
