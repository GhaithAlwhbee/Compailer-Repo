// Generated from C:/compailer/first_try/src/Antlr\dartParser.g4 by ANTLR 4.10.1
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT=1, C=2, CB=3, CBC=4, CO=5, CP=6, DOT=7, EE=8, EG=9, EQ=10, GT=11, LT=12, 
		LTE=13, LTLT=14, MINUS=15, MM=16, NE=17, NOT=18, OB=19, OBC=20, OP=21, 
		P=22, PC=23, PE=24, PL=25, ASTERISK=26, PLE=27, PLPL=28, PO=29, POE=30, 
		PP=31, QU=32, QUQU=33, SC=34, SL=35, ABSTRACT_=36, AS_=37, ASSERT_=38, 
		ASYNC_=39, AWAIT_=40, BOOLEAN=41, BREAK_=42, CASE_=43, CATCH_=44, CHAR=45, 
		CLASS_=46, CONST_=47, CONTINUE_=48, DEFAULT_=49, DO_=50, DOUBLE=51, DYNAMIC_=52, 
		ELSE_=53, ENUM_=54, EXTENDS_=55, FALSE_=56, FINAL_=57, FLOAT=58, FOR_=59, 
		FUNCTION_=60, IF_=61, IMPLEMENTS_=62, IMPORT_=63, INT=64, LONG=65, INTERFACE_=66, 
		IS_=67, LATE_=68, NEW_=69, NULL_=70, ON_=71, PUBLIC_=72, PACKAGE_=73, 
		PROTECTED_=74, PRIVATE_=75, REQUIRED_=76, RETURN_=77, STATIC_=78, SWITCH_=79, 
		SYNC_=80, SUPER_=81, THIS_=82, THROW_=83, TRUE_=84, TRY_=85, VAR_=86, 
		VOID_=87, WHILE_=88, Scaffold_WIDGET=89, APPBAR_HEAD=90, BODY_HEAD=91, 
		CHILD_HEAD=92, APPBAR_WIDGET=93, TITLE=94, TEXT_WIDGET=95, CONTAINER_WIDGET=96, 
		NUMBER=97, SingleLineString=98, MultiLineString=99, IDENTIFIER=100, WHITESPACE=101, 
		SINGLE_LINE_COMMENT=102, MULTI_LINE_COMMENT=103;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classOrInterfaceModifier = 3, RULE_classDeclaration = 4, RULE_classBodyDeclaration = 5, 
		RULE_variableDeclarators = 6, RULE_variableDeclarator = 7, RULE_program = 8, 
		RULE_localVariableDeclaration = 9, RULE_methodDeclaration = 10, RULE_methodBody = 11, 
		RULE_formalParameters = 12, RULE_formalParameter = 13, RULE_statement = 14, 
		RULE_expression = 15, RULE_expressionList = 16, RULE_literal = 17, RULE_nullLiteral = 18, 
		RULE_booleanLiteral = 19, RULE_numericLiteral = 20, RULE_stringLiteral = 21, 
		RULE_primitiveType = 22, RULE_block = 23, RULE_parExpression = 24, RULE_forControl = 25, 
		RULE_forInit = 26, RULE_elementValue = 27, RULE_elementValueArrayInitializer = 28, 
		RULE_qualifiedName = 29, RULE_scaffold = 30, RULE_widget = 31, RULE_appBar = 32, 
		RULE_text = 33, RULE_container = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "classOrInterfaceModifier", 
			"classDeclaration", "classBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"program", "localVariableDeclaration", "methodDeclaration", "methodBody", 
			"formalParameters", "formalParameter", "statement", "expression", "expressionList", 
			"literal", "nullLiteral", "booleanLiteral", "numericLiteral", "stringLiteral", 
			"primitiveType", "block", "parExpression", "forControl", "forInit", "elementValue", 
			"elementValueArrayInitializer", "qualifiedName", "scaffold", "widget", 
			"appBar", "text", "container"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "','", "']'", "'}'", "':'", "')'", "'.'", "'=='", null, 
			"'='", "'>'", "'<'", null, "'<<'", "'-'", "'--'", "'!='", "'!'", "'['", 
			"'{'", "'('", "'|'", "'%'", "'%='", "'+'", "'*'", "'+='", "'++'", "'#'", 
			"'|='", "'||'", "'?'", "'??'", "';'", "'/'", "'abstract'", "'as'", "'assert'", 
			"'async'", "'await'", "'bool'", "'break'", "'case'", "'catch'", "'char'", 
			"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
			"'dynamic'", "'else'", "'enum'", "'extends'", "'false'", "'final'", "'float'", 
			"'for'", "'Function'", "'if'", "'implements'", "'import'", "'int'", "'long'", 
			"'interface'", "'is'", "'late'", "'new'", "'null'", "'on'", "'public'", 
			"'package'", "'protected'", "'private'", "'required'", "'return'", "'static'", 
			"'switch'", "'sync'", "'super'", "'this'", "'throw'", "'true'", "'try'", 
			"'var'", "'void'", "'while'", "'Scaffold'", "'appBar'", "'body'", "'child'", 
			"'AppBar'", "'title'", "'Text'", "'Container'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "C", "CB", "CBC", "CO", "CP", "DOT", "EE", "EG", "EQ", "GT", 
			"LT", "LTE", "LTLT", "MINUS", "MM", "NE", "NOT", "OB", "OBC", "OP", "P", 
			"PC", "PE", "PL", "ASTERISK", "PLE", "PLPL", "PO", "POE", "PP", "QU", 
			"QUQU", "SC", "SL", "ABSTRACT_", "AS_", "ASSERT_", "ASYNC_", "AWAIT_", 
			"BOOLEAN", "BREAK_", "CASE_", "CATCH_", "CHAR", "CLASS_", "CONST_", "CONTINUE_", 
			"DEFAULT_", "DO_", "DOUBLE", "DYNAMIC_", "ELSE_", "ENUM_", "EXTENDS_", 
			"FALSE_", "FINAL_", "FLOAT", "FOR_", "FUNCTION_", "IF_", "IMPLEMENTS_", 
			"IMPORT_", "INT", "LONG", "INTERFACE_", "IS_", "LATE_", "NEW_", "NULL_", 
			"ON_", "PUBLIC_", "PACKAGE_", "PROTECTED_", "PRIVATE_", "REQUIRED_", 
			"RETURN_", "STATIC_", "SWITCH_", "SYNC_", "SUPER_", "THIS_", "THROW_", 
			"TRUE_", "TRY_", "VAR_", "VOID_", "WHILE_", "Scaffold_WIDGET", "APPBAR_HEAD", 
			"BODY_HEAD", "CHILD_HEAD", "APPBAR_WIDGET", "TITLE", "TEXT_WIDGET", "CONTAINER_WIDGET", 
			"NUMBER", "SingleLineString", "MultiLineString", "IDENTIFIER", "WHITESPACE", 
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "dartParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(dartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(dartParser.SC, i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE_) {
				{
				setState(70);
				packageDeclaration();
				}
			}

			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(75);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IMPORT_:
						{
						setState(73);
						importDeclaration();
						}
						break;
					case SC:
						{
						setState(74);
						match(SC);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (SC - 34)) | (1L << (ABSTRACT_ - 34)) | (1L << (CLASS_ - 34)) | (1L << (FINAL_ - 34)) | (1L << (PUBLIC_ - 34)) | (1L << (PROTECTED_ - 34)) | (1L << (PRIVATE_ - 34)) | (1L << (STATIC_ - 34)))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT_:
				case CLASS_:
				case FINAL_:
				case PUBLIC_:
				case PROTECTED_:
				case PRIVATE_:
				case STATIC_:
					{
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ABSTRACT_ - 36)) | (1L << (FINAL_ - 36)) | (1L << (PUBLIC_ - 36)) | (1L << (PROTECTED_ - 36)) | (1L << (PRIVATE_ - 36)) | (1L << (STATIC_ - 36)))) != 0)) {
						{
						{
						setState(80);
						classOrInterfaceModifier();
						}
						}
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(86);
					classDeclaration();
					}
					break;
				case SC:
					{
					setState(87);
					match(SC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE_() { return getToken(dartParser.PACKAGE_, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PACKAGE_);
			setState(94);
			qualifiedName();
			setState(95);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT_() { return getToken(dartParser.IMPORT_, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public TerminalNode STATIC_() { return getToken(dartParser.STATIC_, 0); }
		public TerminalNode DOT() { return getToken(dartParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(dartParser.ASTERISK, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IMPORT_);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_) {
				{
				setState(98);
				match(STATIC_);
				}
			}

			setState(101);
			qualifiedName();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(102);
				match(DOT);
				setState(103);
				match(ASTERISK);
				}
			}

			setState(106);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC_() { return getToken(dartParser.PUBLIC_, 0); }
		public TerminalNode PROTECTED_() { return getToken(dartParser.PROTECTED_, 0); }
		public TerminalNode PRIVATE_() { return getToken(dartParser.PRIVATE_, 0); }
		public TerminalNode STATIC_() { return getToken(dartParser.STATIC_, 0); }
		public TerminalNode ABSTRACT_() { return getToken(dartParser.ABSTRACT_, 0); }
		public TerminalNode FINAL_() { return getToken(dartParser.FINAL_, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ABSTRACT_ - 36)) | (1L << (FINAL_ - 36)) | (1L << (PUBLIC_ - 36)) | (1L << (PROTECTED_ - 36)) | (1L << (PRIVATE_ - 36)) | (1L << (STATIC_ - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(dartParser.CLASS_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CLASS_);
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(OBC);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ABSTRACT_ - 36)) | (1L << (BOOLEAN - 36)) | (1L << (CHAR - 36)) | (1L << (CLASS_ - 36)) | (1L << (DOUBLE - 36)) | (1L << (FINAL_ - 36)) | (1L << (FLOAT - 36)) | (1L << (INT - 36)) | (1L << (LONG - 36)) | (1L << (PUBLIC_ - 36)) | (1L << (PROTECTED_ - 36)) | (1L << (PRIVATE_ - 36)) | (1L << (STATIC_ - 36)) | (1L << (VOID_ - 36)))) != 0)) {
				{
				{
				setState(113);
				classBodyDeclaration();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	 
		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationClassBodyContext extends ClassBodyDeclarationContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public VariableDeclarationClassBodyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVariableDeclarationClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVariableDeclarationClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVariableDeclarationClassBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodDeclarationClassBodyContext extends ClassBodyDeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public MethodDeclarationClassBodyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMethodDeclarationClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMethodDeclarationClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMethodDeclarationClassBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDeclarationClassBodyContext extends ClassBodyDeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassDeclarationClassBodyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterClassDeclarationClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitClassDeclarationClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitClassDeclarationClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationClassBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				localVariableDeclaration();
				setState(122);
				match(SC);
				}
				break;
			case 2:
				_localctx = new MethodDeclarationClassBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ABSTRACT_ - 36)) | (1L << (FINAL_ - 36)) | (1L << (PUBLIC_ - 36)) | (1L << (PROTECTED_ - 36)) | (1L << (PRIVATE_ - 36)) | (1L << (STATIC_ - 36)))) != 0)) {
					{
					{
					setState(124);
					classOrInterfaceModifier();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				methodDeclaration();
				}
				break;
			case 3:
				_localctx = new ClassDeclarationClassBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ABSTRACT_ - 36)) | (1L << (FINAL_ - 36)) | (1L << (PUBLIC_ - 36)) | (1L << (PROTECTED_ - 36)) | (1L << (PRIVATE_ - 36)) | (1L << (STATIC_ - 36)))) != 0)) {
					{
					{
					setState(131);
					classOrInterfaceModifier();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			variableDeclarator();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(141);
				match(C);
				setState(142);
				variableDeclarator();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(dartParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFIER);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(149);
				match(EQ);
				setState(150);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBC) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO_) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR_) | (1L << IF_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (WHILE_ - 64)))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			primitiveType();
			setState(160);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID_() { return getToken(dartParser.VOID_, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
				{
				setState(162);
				primitiveType();
				}
				break;
			case VOID_:
				{
				setState(163);
				match(VOID_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			match(IDENTIFIER);
			setState(167);
			formalParameters();
			setState(168);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodBody);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				block();
				}
				break;
			case SC:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OP);
			setState(175);
			formalParameter();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(176);
				match(C);
				setState(177);
				formalParameter();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			primitiveType();
			setState(186);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementIFContext extends StatementContext {
		public TerminalNode IF_() { return getToken(dartParser.IF_, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_() { return getToken(dartParser.ELSE_, 0); }
		public StatementIFContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementIF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementFORContext extends StatementContext {
		public TerminalNode FOR_() { return getToken(dartParser.FOR_, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementFORContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementFOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementFOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementFOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementVariableDeclarationContext extends StatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWHILEContext extends StatementContext {
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementWHILEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementWHILE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementWHILE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementWHILE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDoWhileContext extends StatementContext {
		public TerminalNode DO_() { return getToken(dartParser.DO_, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE_() { return getToken(dartParser.WHILE_, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public StatementDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBC:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				block();
				}
				break;
			case IF_:
				_localctx = new StatementIFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(IF_);
				setState(190);
				parExpression();
				setState(191);
				statement();
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(192);
					match(ELSE_);
					setState(193);
					statement();
					}
					break;
				}
				}
				break;
			case FOR_:
				_localctx = new StatementFORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(FOR_);
				setState(197);
				match(OP);
				setState(198);
				forControl();
				setState(199);
				match(CP);
				setState(200);
				statement();
				}
				break;
			case WHILE_:
				_localctx = new StatementWHILEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(WHILE_);
				setState(203);
				parExpression();
				setState(204);
				statement();
				}
				break;
			case DO_:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(DO_);
				setState(207);
				statement();
				setState(208);
				match(WHILE_);
				setState(209);
				parExpression();
				setState(210);
				match(SC);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				localVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpressionContext extends ExpressionContext {
		public TerminalNode RETURN_() { return getToken(dartParser.RETURN_, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionPlusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PL() { return getToken(dartParser.PL, 0); }
		public ExpressionPlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueExpressionContext extends ExpressionContext {
		public TerminalNode CONTINUE_() { return getToken(dartParser.CONTINUE_, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public ContinueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterContinueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitContinueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitContinueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionPostfixContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLPL() { return getToken(dartParser.PLPL, 0); }
		public TerminalNode MM() { return getToken(dartParser.MM, 0); }
		public ExpressionPostfixContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OPExpressionCPContext extends ExpressionContext {
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public OPExpressionCPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterOPExpressionCP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitOPExpressionCP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitOPExpressionCP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowExpressionContext extends ExpressionContext {
		public TerminalNode THROW_() { return getToken(dartParser.THROW_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public ThrowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(dartParser.ASTERISK, 0); }
		public ExpressionMultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakExpressionContext extends ExpressionContext {
		public TerminalNode BREAK_() { return getToken(dartParser.BREAK_, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public BreakExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionCompareExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTE() { return getToken(dartParser.LTE, 0); }
		public TerminalNode EG() { return getToken(dartParser.EG, 0); }
		public TerminalNode GT() { return getToken(dartParser.GT, 0); }
		public TerminalNode LT() { return getToken(dartParser.LT, 0); }
		public TerminalNode EE() { return getToken(dartParser.EE, 0); }
		public ExpressionCompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionIDENTIFIERContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public ExpressionIDENTIFIERContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				_localctx = new OPExpressionCPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				match(OP);
				setState(217);
				expression(0);
				setState(218);
				match(CP);
				}
				break;
			case RETURN_:
				{
				_localctx = new ReturnExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(RETURN_);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << FALSE_))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NULL_ - 70)) | (1L << (RETURN_ - 70)) | (1L << (THROW_ - 70)) | (1L << (TRUE_ - 70)) | (1L << (NUMBER - 70)) | (1L << (SingleLineString - 70)) | (1L << (MultiLineString - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(221);
					expression(0);
					}
				}

				setState(224);
				match(SC);
				}
				break;
			case THROW_:
				{
				_localctx = new ThrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(THROW_);
				setState(226);
				expression(0);
				setState(227);
				match(SC);
				}
				break;
			case BREAK_:
				{
				_localctx = new BreakExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(BREAK_);
				setState(230);
				match(SC);
				}
				break;
			case CONTINUE_:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(CONTINUE_);
				setState(232);
				match(SC);
				}
				break;
			case FALSE_:
			case NULL_:
			case TRUE_:
			case NUMBER:
			case SingleLineString:
			case MultiLineString:
				{
				_localctx = new ExpressionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ExpressionIDENTIFIERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(238);
						match(ASTERISK);
						setState(239);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionPlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(241);
						match(PL);
						setState(242);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionCompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(244);
						((ExpressionCompareExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EE) | (1L << EG) | (1L << GT) | (1L << LT) | (1L << LTE))) != 0)) ) {
							((ExpressionCompareExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionPostfixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(247);
						((ExpressionPostfixContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MM || _la==PLPL) ) {
							((ExpressionPostfixContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expression(0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C) {
				{
				{
				setState(254);
				match(C);
				setState(255);
				expression(0);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralNumericContext extends LiteralContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralNumericContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLiteralNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLiteralNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLiteralNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralStringContext extends LiteralContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralNullContext extends LiteralContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public LiteralNullContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLiteralNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLiteralNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLiteralNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBooleanContext extends LiteralContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralBooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLiteralBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLiteralBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_:
				_localctx = new LiteralNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				nullLiteral();
				}
				break;
			case FALSE_:
			case TRUE_:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				booleanLiteral();
				}
				break;
			case NUMBER:
				_localctx = new LiteralNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				numericLiteral();
				}
				break;
			case SingleLineString:
			case MultiLineString:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL_() { return getToken(dartParser.NULL_, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(NULL_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE_() { return getToken(dartParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(dartParser.FALSE_, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==FALSE_ || _la==TRUE_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(dartParser.NUMBER, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(dartParser.SingleLineString, 0); }
		public List<TerminalNode> MultiLineString() { return getTokens(dartParser.MultiLineString); }
		public TerminalNode MultiLineString(int i) {
			return getToken(dartParser.MultiLineString, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stringLiteral);
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(SingleLineString);
				}
				break;
			case MultiLineString:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(274);
						match(MultiLineString);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends PrimitiveTypeContext {
		public TerminalNode BOOLEAN() { return getToken(dartParser.BOOLEAN, 0); }
		public BoolTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongTypeContext extends PrimitiveTypeContext {
		public TerminalNode LONG() { return getToken(dartParser.LONG, 0); }
		public LongTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterLongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitLongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitLongType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends PrimitiveTypeContext {
		public TerminalNode DOUBLE() { return getToken(dartParser.DOUBLE, 0); }
		public DoubleTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends PrimitiveTypeContext {
		public TerminalNode CHAR() { return getToken(dartParser.CHAR, 0); }
		public CharTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends PrimitiveTypeContext {
		public TerminalNode INT() { return getToken(dartParser.INT, 0); }
		public IntTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeContext extends PrimitiveTypeContext {
		public TerminalNode FLOAT() { return getToken(dartParser.FLOAT, 0); }
		public FloatTypeContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primitiveType);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(INT);
				}
				break;
			case LONG:
				_localctx = new LongTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(LONG);
				}
				break;
			case FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(OBC);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBC) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DO_) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR_) | (1L << IF_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (LONG - 64)) | (1L << (WHILE_ - 64)))) != 0)) {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(OP);
			setState(299);
			expression(0);
			setState(300);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionContext forUpdate;
		public List<TerminalNode> SC() { return getTokens(dartParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(dartParser.SC, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (BOOLEAN - 41)) | (1L << (CHAR - 41)) | (1L << (DOUBLE - 41)) | (1L << (FLOAT - 41)) | (1L << (INT - 41)) | (1L << (LONG - 41)))) != 0)) {
				{
				setState(302);
				forInit();
				}
			}

			setState(305);
			match(SC);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << FALSE_))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NULL_ - 70)) | (1L << (RETURN_ - 70)) | (1L << (THROW_ - 70)) | (1L << (TRUE_ - 70)) | (1L << (NUMBER - 70)) | (1L << (SingleLineString - 70)) | (1L << (MultiLineString - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(306);
				expression(0);
				}
			}

			setState(309);
			match(SC);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << FALSE_))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NULL_ - 70)) | (1L << (RETURN_ - 70)) | (1L << (THROW_ - 70)) | (1L << (TRUE_ - 70)) | (1L << (NUMBER - 70)) | (1L << (SingleLineString - 70)) | (1L << (MultiLineString - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(310);
				((ForControlContext)_localctx).forUpdate = expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elementValue);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
			case BREAK_:
			case CONTINUE_:
			case FALSE_:
			case NULL_:
			case RETURN_:
			case THROW_:
			case TRUE_:
			case NUMBER:
			case SingleLineString:
			case MultiLineString:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expression(0);
				}
				break;
			case OBC:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode OBC() { return getToken(dartParser.OBC, 0); }
		public TerminalNode CBC() { return getToken(dartParser.CBC, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(OBC);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBC) | (1L << OP) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << FALSE_))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NULL_ - 70)) | (1L << (RETURN_ - 70)) | (1L << (THROW_ - 70)) | (1L << (TRUE_ - 70)) | (1L << (NUMBER - 70)) | (1L << (SingleLineString - 70)) | (1L << (MultiLineString - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(320);
				elementValue();
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(C);
						setState(322);
						elementValue();
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(330);
				match(C);
				}
			}

			setState(333);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(dartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(dartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(dartParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					match(DOT);
					setState(337);
					match(IDENTIFIER);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode Scaffold_WIDGET() { return getToken(dartParser.Scaffold_WIDGET, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode SC() { return getToken(dartParser.SC, 0); }
		public TerminalNode APPBAR_HEAD() { return getToken(dartParser.APPBAR_HEAD, 0); }
		public List<TerminalNode> CO() { return getTokens(dartParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(dartParser.CO, i);
		}
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public List<TerminalNode> C() { return getTokens(dartParser.C); }
		public TerminalNode C(int i) {
			return getToken(dartParser.C, i);
		}
		public TerminalNode BODY_HEAD() { return getToken(dartParser.BODY_HEAD, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Scaffold_WIDGET);
			setState(344);
			match(OP);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPBAR_HEAD) {
				{
				setState(345);
				match(APPBAR_HEAD);
				setState(346);
				match(CO);
				setState(347);
				appBar();
				setState(348);
				match(C);
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY_HEAD) {
				{
				setState(352);
				match(BODY_HEAD);
				setState(353);
				match(CO);
				setState(354);
				widget();
				setState(355);
				match(C);
				}
			}

			setState(359);
			match(CP);
			setState(360);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_widget);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_WIDGET:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				text();
				}
				break;
			case CONTAINER_WIDGET:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				container();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode APPBAR_WIDGET() { return getToken(dartParser.APPBAR_WIDGET, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode TITLE() { return getToken(dartParser.TITLE, 0); }
		public TerminalNode CO() { return getToken(dartParser.CO, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode CONST_() { return getToken(dartParser.CONST_, 0); }
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_appBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(APPBAR_WIDGET);
			setState(367);
			match(OP);
			setState(368);
			match(TITLE);
			setState(369);
			match(CO);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_) {
				{
				setState(370);
				match(CONST_);
				}
			}

			setState(373);
			text();
			setState(374);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT_WIDGET() { return getToken(dartParser.TEXT_WIDGET, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dartParser.IDENTIFIER, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(TEXT_WIDGET);
			setState(377);
			match(OP);
			setState(378);
			match(IDENTIFIER);
			setState(379);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER_WIDGET() { return getToken(dartParser.CONTAINER_WIDGET, 0); }
		public TerminalNode OP() { return getToken(dartParser.OP, 0); }
		public TerminalNode CHILD_HEAD() { return getToken(dartParser.CHILD_HEAD, 0); }
		public TerminalNode CO() { return getToken(dartParser.CO, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode C() { return getToken(dartParser.C, 0); }
		public TerminalNode CP() { return getToken(dartParser.CP, 0); }
		public TerminalNode CONST_() { return getToken(dartParser.CONST_, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dartParserListener ) ((dartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dartParserVisitor ) return ((dartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(CONTAINER_WIDGET);
			setState(382);
			match(OP);
			setState(383);
			match(CHILD_HEAD);
			setState(384);
			match(CO);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_) {
				{
				setState(385);
				match(CONST_);
				}
			}

			setState(388);
			widget();
			setState(389);
			match(C);
			setState(390);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u0189\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000L\b\u0000"+
		"\n\u0000\f\u0000O\t\u0000\u0001\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000"+
		"U\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000Y\b\u0000\n\u0000\f\u0000"+
		"\\\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002i\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004s\b\u0004"+
		"\n\u0004\f\u0004v\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0085\b\u0005\n\u0005\f\u0005"+
		"\u0088\t\u0005\u0001\u0005\u0003\u0005\u008b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006\f\u0006\u0093\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0098\b\u0007\u0001\b"+
		"\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n\u00a5\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00ad\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00b3\b\f\n\f\f\f\u00b6\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c3\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00df\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00ec\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00f9\b\u000f\n\u000f\f\u000f\u00fc\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0101\b\u0010\n\u0010\f\u0010\u0104\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u010a\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u0114\b\u0015\u000b\u0015\f\u0015"+
		"\u0115\u0003\u0015\u0118\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0120\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0124\b\u0017\n\u0017\f\u0017\u0127\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0003\u0019\u0130\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0134\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0138\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u013e\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0144\b\u001c\n\u001c\f\u001c"+
		"\u0147\t\u001c\u0003\u001c\u0149\b\u001c\u0001\u001c\u0003\u001c\u014c"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0153\b\u001d\n\u001d\f\u001d\u0156\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u015f\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0166\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u016d\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0174\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0183\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0000\u0001\u001e#\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BD\u0000\u0004\u0005\u0000$$99HHJKNN\u0002\u0000\b\t\u000b\r"+
		"\u0002\u0000\u0010\u0010\u001c\u001c\u0002\u000088TT\u01a2\u0000G\u0001"+
		"\u0000\u0000\u0000\u0002]\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000"+
		"\u0000\u0006l\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\n\u008a"+
		"\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000\u000e\u0094\u0001"+
		"\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u009f\u0001"+
		"\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00ac\u0001"+
		"\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u00b9\u0001"+
		"\u0000\u0000\u0000\u001c\u00d5\u0001\u0000\u0000\u0000\u001e\u00eb\u0001"+
		"\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u0109\u0001\u0000"+
		"\u0000\u0000$\u010b\u0001\u0000\u0000\u0000&\u010d\u0001\u0000\u0000\u0000"+
		"(\u010f\u0001\u0000\u0000\u0000*\u0117\u0001\u0000\u0000\u0000,\u011f"+
		"\u0001\u0000\u0000\u0000.\u0121\u0001\u0000\u0000\u00000\u012a\u0001\u0000"+
		"\u0000\u00002\u012f\u0001\u0000\u0000\u00004\u0139\u0001\u0000\u0000\u0000"+
		"6\u013d\u0001\u0000\u0000\u00008\u013f\u0001\u0000\u0000\u0000:\u014f"+
		"\u0001\u0000\u0000\u0000<\u0157\u0001\u0000\u0000\u0000>\u016c\u0001\u0000"+
		"\u0000\u0000@\u016e\u0001\u0000\u0000\u0000B\u0178\u0001\u0000\u0000\u0000"+
		"D\u017d\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HM\u0001\u0000\u0000\u0000IL\u0003"+
		"\u0004\u0002\u0000JL\u0005\"\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NZ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PR\u0003\u0006\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0003\b\u0004\u0000WY\u0005"+
		"\"\u0000\u0000XS\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0001\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005"+
		"I\u0000\u0000^_\u0003:\u001d\u0000_`\u0005\"\u0000\u0000`\u0003\u0001"+
		"\u0000\u0000\u0000ac\u0005?\u0000\u0000bd\u0005N\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0003"+
		":\u001d\u0000fg\u0005\u0007\u0000\u0000gi\u0005\u001a\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005\"\u0000\u0000k\u0005\u0001\u0000\u0000\u0000lm\u0007\u0000\u0000"+
		"\u0000m\u0007\u0001\u0000\u0000\u0000no\u0005.\u0000\u0000op\u0005d\u0000"+
		"\u0000pt\u0005\u0014\u0000\u0000qs\u0003\n\u0005\u0000rq\u0001\u0000\u0000"+
		"\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0004\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0003\u0012\t\u0000z{"+
		"\u0005\"\u0000\u0000{\u008b\u0001\u0000\u0000\u0000|~\u0003\u0006\u0003"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u008b"+
		"\u0003\u0014\n\u0000\u0083\u0085\u0003\u0006\u0003\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0003"+
		"\b\u0004\u0000\u008ay\u0001\u0000\u0000\u0000\u008a\u007f\u0001\u0000"+
		"\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000"+
		"\u0000\u0000\u008c\u0091\u0003\u000e\u0007\u0000\u008d\u008e\u0005\u0002"+
		"\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0005d\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u0096\u0098\u0003\u001e\u000f\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u000f\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u001c\u000e\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u0011\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003,\u0016\u0000\u00a0\u00a1\u0003\f\u0006\u0000\u00a1\u0013"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003,\u0016\u0000\u00a3\u00a5\u0005"+
		"W\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005d\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0003.\u0017\u0000"+
		"\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003.\u0017\u0000\u00ab"+
		"\u00ad\u0005\"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0015\u0000\u0000\u00af\u00b4\u0003\u001a\r\u0000\u00b0\u00b1\u0005"+
		"\u0002\u0000\u0000\u00b1\u00b3\u0003\u001a\r\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0006"+
		"\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003,\u0016"+
		"\u0000\u00ba\u00bb\u0005d\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000"+
		"\u00bc\u00d6\u0003.\u0017\u0000\u00bd\u00be\u0005=\u0000\u0000\u00be\u00bf"+
		"\u00030\u0018\u0000\u00bf\u00c2\u0003\u001c\u000e\u0000\u00c0\u00c1\u0005"+
		"5\u0000\u0000\u00c1\u00c3\u0003\u001c\u000e\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005;\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000"+
		"\u0000\u00c6\u00c7\u00032\u0019\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000"+
		"\u00c8\u00c9\u0003\u001c\u000e\u0000\u00c9\u00d6\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005X\u0000\u0000\u00cb\u00cc\u00030\u0018\u0000\u00cc\u00cd"+
		"\u0003\u001c\u000e\u0000\u00cd\u00d6\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u00052\u0000\u0000\u00cf\u00d0\u0003\u001c\u000e\u0000\u00d0\u00d1\u0005"+
		"X\u0000\u0000\u00d1\u00d2\u00030\u0018\u0000\u00d2\u00d3\u0005\"\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003\u0012\t\u0000"+
		"\u00d5\u00bc\u0001\u0000\u0000\u0000\u00d5\u00bd\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c4\u0001\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u000f\uffff\uffff"+
		"\u0000\u00d8\u00d9\u0005\u0015\u0000\u0000\u00d9\u00da\u0003\u001e\u000f"+
		"\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db\u00ec\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0005M\u0000\u0000\u00dd\u00df\u0003\u001e\u000f\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00ec\u0005\"\u0000\u0000\u00e1"+
		"\u00e2\u0005S\u0000\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000\u00e3\u00e4"+
		"\u0005\"\u0000\u0000\u00e4\u00ec\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"*\u0000\u0000\u00e6\u00ec\u0005\"\u0000\u0000\u00e7\u00e8\u00050\u0000"+
		"\u0000\u00e8\u00ec\u0005\"\u0000\u0000\u00e9\u00ec\u0003\"\u0011\u0000"+
		"\u00ea\u00ec\u0005d\u0000\u0000\u00eb\u00d7\u0001\u0000\u0000\u0000\u00eb"+
		"\u00dc\u0001\u0000\u0000\u0000\u00eb\u00e1\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00fa\u0001\u0000\u0000\u0000\u00ed\u00ee\n\n\u0000\u0000\u00ee\u00ef"+
		"\u0005\u001a\u0000\u0000\u00ef\u00f9\u0003\u001e\u000f\u000b\u00f0\u00f1"+
		"\n\t\u0000\u0000\u00f1\u00f2\u0005\u0019\u0000\u0000\u00f2\u00f9\u0003"+
		"\u001e\u000f\n\u00f3\u00f4\n\b\u0000\u0000\u00f4\u00f5\u0007\u0001\u0000"+
		"\u0000\u00f5\u00f9\u0003\u001e\u000f\t\u00f6\u00f7\n\u0007\u0000\u0000"+
		"\u00f7\u00f9\u0007\u0002\u0000\u0000\u00f8\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u0102\u0003\u001e\u000f\u0000\u00fe\u00ff\u0005\u0002\u0000\u0000"+
		"\u00ff\u0101\u0003\u001e\u000f\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u010a\u0003$\u0012\u0000\u0106\u010a"+
		"\u0003&\u0013\u0000\u0107\u010a\u0003(\u0014\u0000\u0108\u010a\u0003*"+
		"\u0015\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u010c\u0005F\u0000\u0000"+
		"\u010c%\u0001\u0000\u0000\u0000\u010d\u010e\u0007\u0003\u0000\u0000\u010e"+
		"\'\u0001\u0000\u0000\u0000\u010f\u0110\u0005a\u0000\u0000\u0110)\u0001"+
		"\u0000\u0000\u0000\u0111\u0118\u0005b\u0000\u0000\u0112\u0114\u0005c\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000"+
		"\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0118+\u0001\u0000\u0000\u0000"+
		"\u0119\u0120\u0005)\u0000\u0000\u011a\u0120\u0005-\u0000\u0000\u011b\u0120"+
		"\u0005@\u0000\u0000\u011c\u0120\u0005A\u0000\u0000\u011d\u0120\u0005:"+
		"\u0000\u0000\u011e\u0120\u00053\u0000\u0000\u011f\u0119\u0001\u0000\u0000"+
		"\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000\u0000"+
		"\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120-\u0001\u0000\u0000\u0000"+
		"\u0121\u0125\u0005\u0014\u0000\u0000\u0122\u0124\u0003\u001c\u000e\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\u0004\u0000\u0000\u0129/\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u0015\u0000\u0000\u012b\u012c\u0003\u001e\u000f\u0000\u012c"+
		"\u012d\u0005\u0006\u0000\u0000\u012d1\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u00034\u001a\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0005"+
		"\"\u0000\u0000\u0132\u0134\u0003\u001e\u000f\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0005\"\u0000\u0000\u0136\u0138\u0003\u001e\u000f"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u01383\u0001\u0000\u0000\u0000\u0139\u013a\u0003\u0012\t\u0000"+
		"\u013a5\u0001\u0000\u0000\u0000\u013b\u013e\u0003\u001e\u000f\u0000\u013c"+
		"\u013e\u00038\u001c\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013e7\u0001\u0000\u0000\u0000\u013f\u0148\u0005"+
		"\u0014\u0000\u0000\u0140\u0145\u00036\u001b\u0000\u0141\u0142\u0005\u0002"+
		"\u0000\u0000\u0142\u0144\u00036\u001b\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0140\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0005\u0002\u0000\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0005\u0004\u0000\u0000\u014e9\u0001\u0000\u0000\u0000"+
		"\u014f\u0154\u0005d\u0000\u0000\u0150\u0151\u0005\u0007\u0000\u0000\u0151"+
		"\u0153\u0005d\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155;\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005Y\u0000\u0000\u0158\u015e\u0005\u0015"+
		"\u0000\u0000\u0159\u015a\u0005Z\u0000\u0000\u015a\u015b\u0005\u0005\u0000"+
		"\u0000\u015b\u015c\u0003@ \u0000\u015c\u015d\u0005\u0002\u0000\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u0159\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0165\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0005[\u0000\u0000\u0161\u0162\u0005\u0005\u0000\u0000\u0162\u0163"+
		"\u0003>\u001f\u0000\u0163\u0164\u0005\u0002\u0000\u0000\u0164\u0166\u0001"+
		"\u0000\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0005"+
		"\u0006\u0000\u0000\u0168\u0169\u0005\"\u0000\u0000\u0169=\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0003B!\u0000\u016b\u016d\u0003D\"\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"?\u0001\u0000\u0000\u0000\u016e\u016f\u0005]\u0000\u0000\u016f\u0170\u0005"+
		"\u0015\u0000\u0000\u0170\u0171\u0005^\u0000\u0000\u0171\u0173\u0005\u0005"+
		"\u0000\u0000\u0172\u0174\u0005/\u0000\u0000\u0173\u0172\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0003B!\u0000\u0176\u0177\u0005\u0006\u0000\u0000\u0177"+
		"A\u0001\u0000\u0000\u0000\u0178\u0179\u0005_\u0000\u0000\u0179\u017a\u0005"+
		"\u0015\u0000\u0000\u017a\u017b\u0005d\u0000\u0000\u017b\u017c\u0005\u0006"+
		"\u0000\u0000\u017cC\u0001\u0000\u0000\u0000\u017d\u017e\u0005`\u0000\u0000"+
		"\u017e\u017f\u0005\u0015\u0000\u0000\u017f\u0180\u0005\\\u0000\u0000\u0180"+
		"\u0182\u0005\u0005\u0000\u0000\u0181\u0183\u0005/\u0000\u0000\u0182\u0181"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0003>\u001f\u0000\u0185\u0186\u0005"+
		"\u0002\u0000\u0000\u0186\u0187\u0005\u0006\u0000\u0000\u0187E\u0001\u0000"+
		"\u0000\u0000+GKMSXZcht\u007f\u0086\u008a\u0091\u0097\u009c\u00a4\u00ac"+
		"\u00b4\u00c2\u00d5\u00de\u00eb\u00f8\u00fa\u0102\u0109\u0115\u0117\u011f"+
		"\u0125\u012f\u0133\u0137\u013d\u0145\u0148\u014b\u0154\u015e\u0165\u016c"+
		"\u0173\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}