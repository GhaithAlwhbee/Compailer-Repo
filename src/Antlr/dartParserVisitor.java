// Generated from C:/compailer/first_try/src/Antlr\dartParser.g4 by ANTLR 4.10.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(dartParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(dartParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(dartParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(dartParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(dartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationClassBody(dartParser.VariableDeclarationClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationClassBody(dartParser.MethodDeclarationClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationClassBody(dartParser.ClassDeclarationClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(dartParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(dartParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(dartParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(dartParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(dartParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(dartParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBlock}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(dartParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementIF}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIF(dartParser.StatementIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementFOR}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFOR(dartParser.StatementFORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementWHILE}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWHILE(dartParser.StatementWHILEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDoWhile}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDoWhile(dartParser.StatementDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementVariableDeclaration}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(dartParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(dartParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPlusExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPlusExpression(dartParser.ExpressionPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueExpression(dartParser.ContinueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPostfix}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPostfix(dartParser.ExpressionPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OPExpressionCP}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOPExpressionCP(dartParser.OPExpressionCPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(dartParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMultiplyExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultiplyExpression(dartParser.ExpressionMultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLiteral}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLiteral(dartParser.ExpressionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExpression(dartParser.BreakExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionCompareExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCompareExpression(dartParser.ExpressionCompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionIDENTIFIER}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIDENTIFIER(dartParser.ExpressionIDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(dartParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralNull}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNull(dartParser.LiteralNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralBoolean}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBoolean(dartParser.LiteralBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralNumeric}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNumeric(dartParser.LiteralNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralString}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(dartParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(dartParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(dartParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(dartParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(dartParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(dartParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(dartParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(dartParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongType(dartParser.LongTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(dartParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(dartParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(dartParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(dartParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(dartParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(dartParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(dartParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(dartParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
}