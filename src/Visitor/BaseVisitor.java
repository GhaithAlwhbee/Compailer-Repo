package Visitor;

import AST.*;
import AST.Expressions.*;
import AST.Literals.*;
import AST.Statements.*;
import AST.Types.BOOLEAN;
import AST.Types.INT;
import AST.Types.primitiveType;
import AST.clases.ClassBody;
import AST.clases.ClassDeclaration;
import AST.clases.CompilationUnit;
import Antlr.dartParser;
import Antlr.dartParserBaseVisitor;

public class BaseVisitor extends dartParserBaseVisitor {

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
        return compilationUnit;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(dartParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setIdentifier(ctx.IDENTIFIER().getText());
        for(int i =0 ; i< ctx.classBodyDeclaration().size();i++)
        {
            if(ctx.classBodyDeclaration(i)!= null)
            {
                classDeclaration.getClassBodyArrayList().add((ClassBody)visit(ctx.classBodyDeclaration(i)));
            }
        }
        return classDeclaration;
    }

    @Override
    public ClassBody visitVariableDeclarationClassBody(dartParser.VariableDeclarationClassBodyContext ctx) {
        localVariableDeclaration variableDeclaration = new localVariableDeclaration();

        variableDeclaration.setPrimitive((primitiveType)visit(ctx.localVariableDeclaration().primitiveType()));
        variableDeclaration.setVariableDeclaratorsObject(visitVariableDeclarators(ctx.localVariableDeclaration().variableDeclarators()));

        return variableDeclaration;
    }

    @Override
    public localVariableDeclaration visitLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx) {
        localVariableDeclaration variableDeclaration = new localVariableDeclaration();

        variableDeclaration.setPrimitive((primitiveType) visit(ctx.primitiveType()));

        variableDeclaration.setVariableDeclaratorsObject((variableDeclarators) visit(ctx.variableDeclarators()));


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
        if(ctx.expression() != null)
        {
            declarator.setExpression((Expression) visit(ctx.expression()));
        }
        return declarator;
    }

    //////             Start Statement

    @Override
    public Statement visitStatementBlock(dartParser.StatementBlockContext ctx) {
        BlockStatement blockStatement = new BlockStatement();

        for(int i =0;i<ctx.block().statement().size();i++)
        {
            blockStatement.getStatement().add((Statement) visit(ctx.block().statement(i)));
        }

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

    //////             End Statement

    //////             Start Expression

    @Override
    public Expression visitExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx) {
        IdentifierExpression identifierExpression = new IdentifierExpression();

        identifierExpression.setValue(ctx.IDENTIFIER().getText());

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

        literalExpression.setLiteral((Literal) visit(ctx.literal()));

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
    public Literal visitLiteralNull(dartParser.LiteralNullContext ctx) {
        NullLiteral nullLiteral = new NullLiteral();
        nullLiteral.setValue(ctx.nullLiteral().getText());
        return nullLiteral;
    }


                    //  End Literal


    //////             End Expression


    @Override
    public primitiveType visitIntType(dartParser.IntTypeContext ctx) {
        INT intObject = new INT();
        intObject.setInt_type(ctx.INT().getText());
        return intObject;
    }

    @Override
    public primitiveType visitBoolType(dartParser.BoolTypeContext ctx) {
        BOOLEAN boolObject = new BOOLEAN();
        boolObject.setBool(ctx.BOOLEAN().getText());
        return boolObject;
    }

//    @Override
//    public primitiveType visitDoubleType(dartParser.DoubleTypeContext ctx) {
//        return super.visitDoubleType(ctx);
//    }
}
