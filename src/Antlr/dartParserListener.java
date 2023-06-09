// Generated from C:/compailer/first_try/src/Antlr\dartParser.g4 by ANTLR 4.10.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(dartParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(dartParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(dartParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(dartParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(dartParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(dartParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(dartParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(dartParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(dartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(dartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationClassBody(dartParser.VariableDeclarationClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationClassBody(dartParser.VariableDeclarationClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationClassBody(dartParser.ConstructorDeclarationClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationClassBody(dartParser.ConstructorDeclarationClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationClassBody(dartParser.MethodDeclarationClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationClassBody(dartParser.MethodDeclarationClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationClassBody(dartParser.ClassDeclarationClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationClassBody(dartParser.ClassDeclarationClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(dartParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(dartParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(dartParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(dartParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(dartParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(dartParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(dartParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(dartParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(dartParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(dartParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(dartParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(dartParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(dartParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(dartParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(dartParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(dartParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIF}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIF(dartParser.StatementIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIF}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIF(dartParser.StatementIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementFOR}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFOR(dartParser.StatementFORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementFOR}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFOR(dartParser.StatementFORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementWHILE}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWHILE(dartParser.StatementWHILEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementWHILE}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWHILE(dartParser.StatementWHILEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDoWhile(dartParser.StatementDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDoWhile(dartParser.StatementDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclaration(dartParser.StatementVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclaration(dartParser.StatementVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementWidget}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWidget(dartParser.StatementWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementWidget}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWidget(dartParser.StatementWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(dartParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(dartParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionConstructorCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstructorCall(dartParser.ExpressionConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionConstructorCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstructorCall(dartParser.ExpressionConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionPostfix}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPostfix(dartParser.ExpressionPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPostfix}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPostfix(dartParser.ExpressionPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OPExpressionCP}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOPExpressionCP(dartParser.OPExpressionCPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OPExpressionCP}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOPExpressionCP(dartParser.OPExpressionCPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(dartParser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(dartParser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMultiplyExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiplyExpression(dartParser.ExpressionMultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMultiplyExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiplyExpression(dartParser.ExpressionMultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBreakExpression(dartParser.BreakExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBreakExpression(dartParser.BreakExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionCompareExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCompareExpression(dartParser.ExpressionCompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionCompareExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCompareExpression(dartParser.ExpressionCompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionIDENTIFIER}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionIDENTIFIER}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(dartParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(dartParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionPlusExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlusExpression(dartParser.ExpressionPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPlusExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlusExpression(dartParser.ExpressionPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContinueExpression(dartParser.ContinueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContinueExpression(dartParser.ContinueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionWidget}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWidget(dartParser.ExpressionWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionWidget}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWidget(dartParser.ExpressionWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLiteral}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLiteral(dartParser.ExpressionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLiteral}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLiteral(dartParser.ExpressionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(dartParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(dartParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralNull}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNull(dartParser.LiteralNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralNull}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNull(dartParser.LiteralNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralBoolean}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBoolean(dartParser.LiteralBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralBoolean}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBoolean(dartParser.LiteralBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralNumeric}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNumeric(dartParser.LiteralNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralNumeric}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNumeric(dartParser.LiteralNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralChar}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralChar(dartParser.LiteralCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralChar}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralChar(dartParser.LiteralCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralString}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(dartParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralString}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(dartParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(dartParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(dartParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(dartParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(dartParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(dartParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(dartParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(dartParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(dartParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(dartParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(dartParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(dartParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(dartParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(dartParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(dartParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(dartParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(dartParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterLongType(dartParser.LongTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitLongType(dartParser.LongTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(dartParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(dartParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(dartParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(dartParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(dartParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(dartParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(dartParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(dartParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WidgetType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterWidgetType(dartParser.WidgetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WidgetType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitWidgetType(dartParser.WidgetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(dartParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(dartParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(dartParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(dartParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(dartParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(dartParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(dartParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(dartParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(dartParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(dartParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(dartParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(dartParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(dartParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(dartParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPBAR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterAPPBAR_Widget(dartParser.APPBAR_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPBAR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitAPPBAR_Widget(dartParser.APPBAR_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterBUTTON_Widget(dartParser.BUTTON_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitBUTTON_Widget(dartParser.BUTTON_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CENTER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCENTER_Widget(dartParser.CENTER_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CENTER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCENTER_Widget(dartParser.CENTER_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONTAINER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCONTAINER_Widget(dartParser.CONTAINER_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONTAINER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCONTAINER_Widget(dartParser.CONTAINER_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COLUMN_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCOLUMN_Widget(dartParser.COLUMN_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COLUMN_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCOLUMN_Widget(dartParser.COLUMN_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ELEVATEDBUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterELEVATEDBUTTON_Widget(dartParser.ELEVATEDBUTTON_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ELEVATEDBUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitELEVATEDBUTTON_Widget(dartParser.ELEVATEDBUTTON_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMAGE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterIMAGE_Widget(dartParser.IMAGE_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMAGE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitIMAGE_Widget(dartParser.IMAGE_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISTVIEW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterLISTVIEW_Widget(dartParser.LISTVIEW_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISTVIEW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitLISTVIEW_Widget(dartParser.LISTVIEW_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MATERIALAPP_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterMATERIALAPP_Widget(dartParser.MATERIALAPP_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MATERIALAPP_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitMATERIALAPP_Widget(dartParser.MATERIALAPP_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MATERIALPAGEROUTE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterMATERIALPAGEROUTE_Widget(dartParser.MATERIALPAGEROUTE_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MATERIALPAGEROUTE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitMATERIALPAGEROUTE_Widget(dartParser.MATERIALPAGEROUTE_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAVIGATOR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterNAVIGATOR_Widget(dartParser.NAVIGATOR_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAVIGATOR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitNAVIGATOR_Widget(dartParser.NAVIGATOR_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterROW_Widget(dartParser.ROW_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitROW_Widget(dartParser.ROW_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCAFFOLD_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterSCAFFOLD_Widget(dartParser.SCAFFOLD_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCAFFOLD_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitSCAFFOLD_Widget(dartParser.SCAFFOLD_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TEXT_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTEXT_Widget(dartParser.TEXT_WidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TEXT_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTEXT_Widget(dartParser.TEXT_WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(dartParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(dartParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPBAR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterAPPBAR_PROPERTY(dartParser.APPBAR_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPBAR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitAPPBAR_PROPERTY(dartParser.APPBAR_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BODY_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterBODY_PROPERTY(dartParser.BODY_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BODY_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitBODY_PROPERTY(dartParser.BODY_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BUILDER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterBUILDER_PROPERTY(dartParser.BUILDER_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BUILDER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitBUILDER_PROPERTY(dartParser.BUILDER_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHILD_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterCHILD_PROPERTY(dartParser.CHILD_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHILD_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitCHILD_PROPERTY(dartParser.CHILD_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHILDREN_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterCHILDREN_PROPERTY(dartParser.CHILDREN_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHILDREN_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitCHILDREN_PROPERTY(dartParser.CHILDREN_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COLOR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterCOLOR_PROPERTY(dartParser.COLOR_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COLOR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitCOLOR_PROPERTY(dartParser.COLOR_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOATINGACTIONBUTTON_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterFLOATINGACTIONBUTTON_PROPERTY(dartParser.FLOATINGACTIONBUTTON_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOATINGACTIONBUTTON_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitFLOATINGACTIONBUTTON_PROPERTY(dartParser.FLOATINGACTIONBUTTON_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HOME_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterHOME_PROPERTY(dartParser.HOME_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HOME_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitHOME_PROPERTY(dartParser.HOME_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMAGE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterIMAGE_PROPERTY(dartParser.IMAGE_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMAGE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitIMAGE_PROPERTY(dartParser.IMAGE_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ONPRESSED_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterONPRESSED_PROPERTY(dartParser.ONPRESSED_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ONPRESSED_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitONPRESSED_PROPERTY(dartParser.ONPRESSED_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PADDING_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterPADDING_PROPERTY(dartParser.PADDING_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PADDING_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitPADDING_PROPERTY(dartParser.PADDING_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TEXT_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterTEXT_PROPERTY(dartParser.TEXT_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TEXT_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitTEXT_PROPERTY(dartParser.TEXT_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TITLE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterTITLE_PROPERTY(dartParser.TITLE_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TITLE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitTITLE_PROPERTY(dartParser.TITLE_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TITLE_PROPERTY_MATERIALAPP}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterTITLE_PROPERTY_MATERIALAPP(dartParser.TITLE_PROPERTY_MATERIALAPPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TITLE_PROPERTY_MATERIALAPP}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitTITLE_PROPERTY_MATERIALAPP(dartParser.TITLE_PROPERTY_MATERIALAPPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIER_PROPERTY(dartParser.IDENTIFIER_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIER_PROPERTY(dartParser.IDENTIFIER_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#child_widgets}.
	 * @param ctx the parse tree
	 */
	void enterChild_widgets(dartParser.Child_widgetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#child_widgets}.
	 * @param ctx the parse tree
	 */
	void exitChild_widgets(dartParser.Child_widgetsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnOwnStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnOwnStatement(dartParser.ReturnOwnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnOwnStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnOwnStatement(dartParser.ReturnOwnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnMultiStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnMultiStatement(dartParser.ReturnMultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnMultiStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnMultiStatement(dartParser.ReturnMultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorFunction}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorFunction(dartParser.NavigatorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorFunction}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorFunction(dartParser.NavigatorFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(dartParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(dartParser.ContextContext ctx);
}