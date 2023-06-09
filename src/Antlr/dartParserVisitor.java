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
	 * Visit a parse tree produced by the {@code ConstructorDeclarationClassBody}
	 * labeled alternative in {@link dartParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationClassBody(dartParser.ConstructorDeclarationClassBodyContext ctx);
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
	 * Visit a parse tree produced by {@link dartParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(dartParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(dartParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(dartParser.LocalVariableDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link dartParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(dartParser.MethodDeclarationContext ctx);
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
	 * Visit a parse tree produced by the {@code StatementWidget}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWidget(dartParser.StatementWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(dartParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionConstructorCall}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstructorCall(dartParser.ExpressionConstructorCallContext ctx);
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
	 * Visit a parse tree produced by the {@code ExpressionWidget}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWidget(dartParser.ExpressionWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLiteral}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLiteral(dartParser.ExpressionLiteralContext ctx);
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
	 * Visit a parse tree produced by the {@code LiteralChar}
	 * labeled alternative in {@link dartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralChar(dartParser.LiteralCharContext ctx);
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
	 * Visit a parse tree produced by {@link dartParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(dartParser.CharLiteralContext ctx);
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
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(dartParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(dartParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WidgetType}
	 * labeled alternative in {@link dartParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetType(dartParser.WidgetTypeContext ctx);
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
	 * Visit a parse tree produced by {@link dartParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(dartParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APPBAR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPPBAR_Widget(dartParser.APPBAR_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBUTTON_Widget(dartParser.BUTTON_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CENTER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCENTER_Widget(dartParser.CENTER_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONTAINER_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONTAINER_Widget(dartParser.CONTAINER_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COLUMN_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOLUMN_Widget(dartParser.COLUMN_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELEVATEDBUTTON_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELEVATEDBUTTON_Widget(dartParser.ELEVATEDBUTTON_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMAGE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMAGE_Widget(dartParser.IMAGE_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISTVIEW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISTVIEW_Widget(dartParser.LISTVIEW_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MATERIALAPP_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMATERIALAPP_Widget(dartParser.MATERIALAPP_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MATERIALPAGEROUTE_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMATERIALPAGEROUTE_Widget(dartParser.MATERIALPAGEROUTE_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAVIGATOR_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAVIGATOR_Widget(dartParser.NAVIGATOR_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROW_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROW_Widget(dartParser.ROW_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCAFFOLD_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCAFFOLD_Widget(dartParser.SCAFFOLD_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TEXT_Widget}
	 * labeled alternative in {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTEXT_Widget(dartParser.TEXT_WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(dartParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APPBAR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPPBAR_PROPERTY(dartParser.APPBAR_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BODY_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBODY_PROPERTY(dartParser.BODY_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BUILDER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBUILDER_PROPERTY(dartParser.BUILDER_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHILD_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHILD_PROPERTY(dartParser.CHILD_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHILDREN_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHILDREN_PROPERTY(dartParser.CHILDREN_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COLOR_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOLOR_PROPERTY(dartParser.COLOR_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLOATINGACTIONBUTTON_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLOATINGACTIONBUTTON_PROPERTY(dartParser.FLOATINGACTIONBUTTON_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HOME_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHOME_PROPERTY(dartParser.HOME_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMAGE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMAGE_PROPERTY(dartParser.IMAGE_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ONPRESSED_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitONPRESSED_PROPERTY(dartParser.ONPRESSED_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PADDING_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPADDING_PROPERTY(dartParser.PADDING_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TEXT_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTEXT_PROPERTY(dartParser.TEXT_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TITLE_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTITLE_PROPERTY(dartParser.TITLE_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TITLE_PROPERTY_MATERIALAPP}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTITLE_PROPERTY_MATERIALAPP(dartParser.TITLE_PROPERTY_MATERIALAPPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER_PROPERTY}
	 * labeled alternative in {@link dartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER_PROPERTY(dartParser.IDENTIFIER_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child_widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild_widgets(dartParser.Child_widgetsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnOwnStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnOwnStatement(dartParser.ReturnOwnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnMultiStatement}
	 * labeled alternative in {@link dartParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMultiStatement(dartParser.ReturnMultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorFunction(dartParser.NavigatorFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialPageRoute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRoute(dartParser.MaterialPageRouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(dartParser.ContextContext ctx);
}