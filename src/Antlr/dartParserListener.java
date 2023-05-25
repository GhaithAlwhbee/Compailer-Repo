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
	 * Enter a parse tree produced by {@link dartParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(dartParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(dartParser.MethodBodyContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(dartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(dartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(dartParser.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(dartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(dartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
}