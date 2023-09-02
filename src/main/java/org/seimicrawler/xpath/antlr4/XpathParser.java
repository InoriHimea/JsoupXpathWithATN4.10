package org.seimicrawler.xpath.antlr4;// Generated from Xpath.g4 by ANTLR 4.10.1


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NodeType=5, Number=6, AxisName=7, PATHSEP=8, 
		ABRPATH=9, LPAR=10, RPAR=11, LBRAC=12, RBRAC=13, MINUS=14, PLUS=15, DOT=16, 
		MUL=17, DIVISION=18, MODULO=19, DOTDOT=20, AT=21, COMMA=22, PIPE=23, LESS=24, 
		MORE_=25, LE=26, GE=27, EQUALITY=28, INEQUALITY=29, START_WITH=30, END_WITH=31, 
		CONTAIN_WITH=32, REGEXP_WITH=33, REGEXP_NOT_WITH=34, COLON=35, CC=36, 
		APOS=37, QUOT=38, Literal=39, Whitespace=40, NCName=41;
	public static final int
		RULE_main = 0, RULE_locationPath = 1, RULE_absoluteLocationPathNoroot = 2, 
		RULE_relativeLocationPath = 3, RULE_step = 4, RULE_axisSpecifier = 5, 
		RULE_nodeTest = 6, RULE_predicate = 7, RULE_abbreviatedStep = 8, RULE_expr = 9, 
		RULE_primaryExpr = 10, RULE_functionCall = 11, RULE_unionExprNoRoot = 12, 
		RULE_pathExprNoRoot = 13, RULE_filterExpr = 14, RULE_orExpr = 15, RULE_andExpr = 16, 
		RULE_equalityExpr = 17, RULE_relationalExpr = 18, RULE_additiveExpr = 19, 
		RULE_multiplicativeExpr = 20, RULE_unaryExprNoRoot = 21, RULE_qName = 22, 
		RULE_functionName = 23, RULE_variableReference = 24, RULE_nameTest = 25, 
		RULE_nCName = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "locationPath", "absoluteLocationPathNoroot", "relativeLocationPath", 
			"step", "axisSpecifier", "nodeTest", "predicate", "abbreviatedStep", 
			"expr", "primaryExpr", "functionCall", "unionExprNoRoot", "pathExprNoRoot", 
			"filterExpr", "orExpr", "andExpr", "equalityExpr", "relationalExpr", 
			"additiveExpr", "multiplicativeExpr", "unaryExprNoRoot", "qName", "functionName", 
			"variableReference", "nameTest", "nCName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'processing-instruction'", "'or'", "'and'", "'$'", null, null, 
			null, "'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", 
			"'*'", "'`div`'", "'`mod`'", "'..'", "'@'", "','", "'|'", "'<'", "'>'", 
			"'<='", "'>='", "'='", "'!='", "'^='", "'$='", "'*='", "'~='", "'!~'", 
			"':'", "'::'", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NodeType", "Number", "AxisName", "PATHSEP", 
			"ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", 
			"MUL", "DIVISION", "MODULO", "DOTDOT", "AT", "COMMA", "PIPE", "LESS", 
			"MORE_", "LE", "GE", "EQUALITY", "INEQUALITY", "START_WITH", "END_WITH", 
			"CONTAIN_WITH", "REGEXP_WITH", "REGEXP_NOT_WITH", "COLON", "CC", "APOS", 
			"QUOT", "Literal", "Whitespace", "NCName"
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
	public String getGrammarFileName() { return "Xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XpathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitMain(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			expr();
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

	public static class LocationPathContext extends ParserRuleContext {
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public AbsoluteLocationPathNorootContext absoluteLocationPathNoroot() {
			return getRuleContext(AbsoluteLocationPathNorootContext.class,0);
		}
		public LocationPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterLocationPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitLocationPath(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitLocationPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationPathContext locationPath() throws RecognitionException {
		LocationPathContext _localctx = new LocationPathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_locationPath);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NodeType:
			case AxisName:
			case DOT:
			case MUL:
			case DOTDOT:
			case AT:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				relativeLocationPath();
				}
				break;
			case PATHSEP:
			case ABRPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				absoluteLocationPathNoroot();
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

	public static class AbsoluteLocationPathNorootContext extends ParserRuleContext {
		public Token op;
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(XpathParser.PATHSEP, 0); }
		public TerminalNode ABRPATH() { return getToken(XpathParser.ABRPATH, 0); }
		public AbsoluteLocationPathNorootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteLocationPathNoroot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterAbsoluteLocationPathNoroot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitAbsoluteLocationPathNoroot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitAbsoluteLocationPathNoroot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteLocationPathNorootContext absoluteLocationPathNoroot() throws RecognitionException {
		AbsoluteLocationPathNorootContext _localctx = new AbsoluteLocationPathNorootContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_absoluteLocationPathNoroot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((AbsoluteLocationPathNorootContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PATHSEP || _la==ABRPATH) ) {
				((AbsoluteLocationPathNorootContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			relativeLocationPath();
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

	public static class RelativeLocationPathContext extends ParserRuleContext {
		public Token op;
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(XpathParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(XpathParser.PATHSEP, i);
		}
		public List<TerminalNode> ABRPATH() { return getTokens(XpathParser.ABRPATH); }
		public TerminalNode ABRPATH(int i) {
			return getToken(XpathParser.ABRPATH, i);
		}
		public RelativeLocationPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeLocationPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterRelativeLocationPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitRelativeLocationPath(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitRelativeLocationPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeLocationPathContext relativeLocationPath() throws RecognitionException {
		RelativeLocationPathContext _localctx = new RelativeLocationPathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relativeLocationPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			step();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATHSEP || _la==ABRPATH) {
				{
				{
				setState(64);
				((RelativeLocationPathContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PATHSEP || _la==ABRPATH) ) {
					((RelativeLocationPathContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				step();
				}
				}
				setState(70);
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

	public static class StepContext extends ParserRuleContext {
		public AxisSpecifierContext axisSpecifier() {
			return getRuleContext(AxisSpecifierContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public AbbreviatedStepContext abbreviatedStep() {
			return getRuleContext(AbbreviatedStepContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitStep(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NodeType:
			case AxisName:
			case MUL:
			case AT:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				axisSpecifier();
				setState(72);
				nodeTest();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAC) {
					{
					{
					setState(73);
					predicate();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOT:
			case DOTDOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				abbreviatedStep();
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

	public static class AxisSpecifierContext extends ParserRuleContext {
		public TerminalNode AxisName() { return getToken(XpathParser.AxisName, 0); }
		public TerminalNode CC() { return getToken(XpathParser.CC, 0); }
		public TerminalNode AT() { return getToken(XpathParser.AT, 0); }
		public AxisSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterAxisSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitAxisSpecifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitAxisSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisSpecifierContext axisSpecifier() throws RecognitionException {
		AxisSpecifierContext _localctx = new AxisSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_axisSpecifier);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(AxisName);
				setState(83);
				match(CC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(84);
					match(AT);
					}
				}

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

	public static class NodeTestContext extends ParserRuleContext {
		public NameTestContext nameTest() {
			return getRuleContext(NameTestContext.class,0);
		}
		public TerminalNode NodeType() { return getToken(XpathParser.NodeType, 0); }
		public TerminalNode LPAR() { return getToken(XpathParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XpathParser.RPAR, 0); }
		public TerminalNode Literal() { return getToken(XpathParser.Literal, 0); }
		public NodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterNodeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitNodeTest(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeTestContext nodeTest() throws RecognitionException {
		NodeTestContext _localctx = new NodeTestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodeTest);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AxisName:
			case MUL:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				nameTest();
				}
				break;
			case NodeType:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(NodeType);
				setState(91);
				match(LPAR);
				setState(92);
				match(RPAR);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__0);
				setState(94);
				match(LPAR);
				setState(95);
				match(Literal);
				setState(96);
				match(RPAR);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(XpathParser.LBRAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAC() { return getToken(XpathParser.RBRAC, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitPredicate(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LBRAC);
			setState(100);
			expr();
			setState(101);
			match(RBRAC);
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

	public static class AbbreviatedStepContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(XpathParser.DOT, 0); }
		public TerminalNode DOTDOT() { return getToken(XpathParser.DOTDOT, 0); }
		public AbbreviatedStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviatedStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterAbbreviatedStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitAbbreviatedStep(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitAbbreviatedStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbreviatedStepContext abbreviatedStep() throws RecognitionException {
		AbbreviatedStepContext _localctx = new AbbreviatedStepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abbreviatedStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==DOTDOT) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			orExpr();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XpathParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(XpathParser.RPAR, 0); }
		public TerminalNode Literal() { return getToken(XpathParser.Literal, 0); }
		public TerminalNode Number() { return getToken(XpathParser.Number, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitPrimaryExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryExpr);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				variableReference();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(LPAR);
				setState(109);
				expr();
				setState(110);
				match(RPAR);
				}
				break;
			case Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(Literal);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(Number);
				}
				break;
			case AxisName:
			case NCName:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XpathParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XpathParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XpathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XpathParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitFunctionCall(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			functionName();
			setState(118);
			match(LPAR);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NodeType) | (1L << Number) | (1L << AxisName) | (1L << PATHSEP) | (1L << ABRPATH) | (1L << LPAR) | (1L << MINUS) | (1L << DOT) | (1L << MUL) | (1L << DOTDOT) | (1L << AT) | (1L << Literal) | (1L << NCName))) != 0)) {
				{
				setState(119);
				expr();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					expr();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			match(RPAR);
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

	public static class UnionExprNoRootContext extends ParserRuleContext {
		public Token op;
		public PathExprNoRootContext pathExprNoRoot() {
			return getRuleContext(PathExprNoRootContext.class,0);
		}
		public UnionExprNoRootContext unionExprNoRoot() {
			return getRuleContext(UnionExprNoRootContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(XpathParser.PIPE, 0); }
		public TerminalNode PATHSEP() { return getToken(XpathParser.PATHSEP, 0); }
		public UnionExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterUnionExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitUnionExprNoRoot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitUnionExprNoRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionExprNoRootContext unionExprNoRoot() throws RecognitionException {
		UnionExprNoRootContext _localctx = new UnionExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unionExprNoRoot);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				pathExprNoRoot();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(132);
					((UnionExprNoRootContext)_localctx).op = match(PIPE);
					setState(133);
					unionExprNoRoot();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(PATHSEP);
				setState(137);
				match(PIPE);
				setState(138);
				unionExprNoRoot();
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

	public static class PathExprNoRootContext extends ParserRuleContext {
		public Token op;
		public LocationPathContext locationPath() {
			return getRuleContext(LocationPathContext.class,0);
		}
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public RelativeLocationPathContext relativeLocationPath() {
			return getRuleContext(RelativeLocationPathContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(XpathParser.PATHSEP, 0); }
		public TerminalNode ABRPATH() { return getToken(XpathParser.ABRPATH, 0); }
		public PathExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterPathExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitPathExprNoRoot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitPathExprNoRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExprNoRootContext pathExprNoRoot() throws RecognitionException {
		PathExprNoRootContext _localctx = new PathExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pathExprNoRoot);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				locationPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				filterExpr();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PATHSEP || _la==ABRPATH) {
					{
					setState(143);
					((PathExprNoRootContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PATHSEP || _la==ABRPATH) ) {
						((PathExprNoRootContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(144);
					relativeLocationPath();
					}
				}

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

	public static class FilterExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitFilterExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		FilterExprContext _localctx = new FilterExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filterExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			primaryExpr();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAC) {
				{
				{
				setState(150);
				predicate();
				}
				}
				setState(155);
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

	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitOrExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			andExpr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(157);
				match(T__1);
				setState(158);
				andExpr();
				}
				}
				setState(163);
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

	public static class AndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitAndExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			equalityExpr();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(165);
				match(T__2);
				setState(166);
				equalityExpr();
				}
				}
				setState(171);
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

	public static class EqualityExprContext extends ParserRuleContext {
		public Token op;
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public List<TerminalNode> EQUALITY() { return getTokens(XpathParser.EQUALITY); }
		public TerminalNode EQUALITY(int i) {
			return getToken(XpathParser.EQUALITY, i);
		}
		public List<TerminalNode> INEQUALITY() { return getTokens(XpathParser.INEQUALITY); }
		public TerminalNode INEQUALITY(int i) {
			return getToken(XpathParser.INEQUALITY, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitEqualityExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			relationalExpr();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY || _la==INEQUALITY) {
				{
				{
				setState(173);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUALITY || _la==INEQUALITY) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				relationalExpr();
				}
				}
				setState(179);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public Token op;
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(XpathParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(XpathParser.LESS, i);
		}
		public List<TerminalNode> MORE_() { return getTokens(XpathParser.MORE_); }
		public TerminalNode MORE_(int i) {
			return getToken(XpathParser.MORE_, i);
		}
		public List<TerminalNode> GE() { return getTokens(XpathParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(XpathParser.GE, i);
		}
		public List<TerminalNode> START_WITH() { return getTokens(XpathParser.START_WITH); }
		public TerminalNode START_WITH(int i) {
			return getToken(XpathParser.START_WITH, i);
		}
		public List<TerminalNode> END_WITH() { return getTokens(XpathParser.END_WITH); }
		public TerminalNode END_WITH(int i) {
			return getToken(XpathParser.END_WITH, i);
		}
		public List<TerminalNode> CONTAIN_WITH() { return getTokens(XpathParser.CONTAIN_WITH); }
		public TerminalNode CONTAIN_WITH(int i) {
			return getToken(XpathParser.CONTAIN_WITH, i);
		}
		public List<TerminalNode> REGEXP_WITH() { return getTokens(XpathParser.REGEXP_WITH); }
		public TerminalNode REGEXP_WITH(int i) {
			return getToken(XpathParser.REGEXP_WITH, i);
		}
		public List<TerminalNode> REGEXP_NOT_WITH() { return getTokens(XpathParser.REGEXP_NOT_WITH); }
		public TerminalNode REGEXP_NOT_WITH(int i) {
			return getToken(XpathParser.REGEXP_NOT_WITH, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitRelationalExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			additiveExpr();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << MORE_) | (1L << GE) | (1L << START_WITH) | (1L << END_WITH) | (1L << CONTAIN_WITH) | (1L << REGEXP_WITH) | (1L << REGEXP_NOT_WITH))) != 0)) {
				{
				{
				setState(181);
				((RelationalExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << MORE_) | (1L << GE) | (1L << START_WITH) | (1L << END_WITH) | (1L << CONTAIN_WITH) | (1L << REGEXP_WITH) | (1L << REGEXP_NOT_WITH))) != 0)) ) {
					((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				additiveExpr();
				}
				}
				setState(187);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public Token op;
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(XpathParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(XpathParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(XpathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XpathParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitAdditiveExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			multiplicativeExpr();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(189);
				((AdditiveExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				multiplicativeExpr();
				}
				}
				setState(195);
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

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public Token op;
		public UnaryExprNoRootContext unaryExprNoRoot() {
			return getRuleContext(UnaryExprNoRootContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(XpathParser.MUL, 0); }
		public TerminalNode DIVISION() { return getToken(XpathParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(XpathParser.MODULO, 0); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitMultiplicativeExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			unaryExprNoRoot();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIVISION) | (1L << MODULO))) != 0)) {
				{
				setState(197);
				((MultiplicativeExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
					((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				multiplicativeExpr();
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

	public static class UnaryExprNoRootContext extends ParserRuleContext {
		public Token sign;
		public UnionExprNoRootContext unionExprNoRoot() {
			return getRuleContext(UnionExprNoRootContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XpathParser.MINUS, 0); }
		public UnaryExprNoRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExprNoRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterUnaryExprNoRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitUnaryExprNoRoot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitUnaryExprNoRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprNoRootContext unaryExprNoRoot() throws RecognitionException {
		UnaryExprNoRootContext _localctx = new UnaryExprNoRootContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExprNoRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(201);
				((UnaryExprNoRootContext)_localctx).sign = match(MINUS);
				}
			}

			setState(204);
			unionExprNoRoot();
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

	public static class QNameContext extends ParserRuleContext {
		public List<NCNameContext> nCName() {
			return getRuleContexts(NCNameContext.class);
		}
		public NCNameContext nCName(int i) {
			return getRuleContext(NCNameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(XpathParser.COLON, 0); }
		public QNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterQName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitQName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitQName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QNameContext qName() throws RecognitionException {
		QNameContext _localctx = new QNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			nCName();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(207);
				match(COLON);
				setState(208);
				nCName();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitFunctionName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			qName();
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__3);
			setState(214);
			qName();
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

	public static class NameTestContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(XpathParser.MUL, 0); }
		public NCNameContext nCName() {
			return getRuleContext(NCNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(XpathParser.COLON, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public NameTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterNameTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitNameTest(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitNameTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTestContext nameTest() throws RecognitionException {
		NameTestContext _localctx = new NameTestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nameTest);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				nCName();
				setState(218);
				match(COLON);
				setState(219);
				match(MUL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				qName();
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

	public static class NCNameContext extends ParserRuleContext {
		public TerminalNode NCName() { return getToken(XpathParser.NCName, 0); }
		public TerminalNode AxisName() { return getToken(XpathParser.AxisName, 0); }
		public NCNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).enterNCName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpathListener) ((XpathListener)listener).exitNCName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpathVisitor) return ((XpathVisitor<? extends T>)visitor).visitNCName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NCNameContext nCName() throws RecognitionException {
		NCNameContext _localctx = new NCNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nCName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==AxisName || _la==NCName) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001)\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003"+
		"\n\u0003\f\u0003F\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005\u0003\u0005X\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nt\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b{\b"+
		"\u000b\n\u000b\f\u000b~\t\u000b\u0003\u000b\u0080\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0087\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u008c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0092"+
		"\b\r\u0003\r\u0094\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u0098\b\u000e"+
		"\n\u000e\f\u000e\u009b\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00a0\b\u000f\n\u000f\f\u000f\u00a3\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a8\b\u0010\n\u0010\f\u0010\u00ab\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b0\b\u0011\n\u0011\f\u0011"+
		"\u00b3\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b8\b"+
		"\u0012\n\u0012\f\u0012\u00bb\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00c0\b\u0013\n\u0013\f\u0013\u00c3\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00c8\b\u0014\u0001\u0015\u0003\u0015\u00cb"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00d2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00df\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0007\u0001\u0000\b\t\u0002"+
		"\u0000\u0010\u0010\u0014\u0014\u0001\u0000\u001c\u001d\u0003\u0000\u0018"+
		"\u0019\u001b\u001b\u001e\"\u0001\u0000\u000e\u000f\u0001\u0000\u0011\u0013"+
		"\u0002\u0000\u0007\u0007))\u00e4\u00006\u0001\u0000\u0000\u0000\u0002"+
		":\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006?\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000"+
		"\fa\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010g\u0001"+
		"\u0000\u0000\u0000\u0012i\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000"+
		"\u0000\u0016u\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000"+
		"\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u0095\u0001\u0000\u0000\u0000"+
		"\u001e\u009c\u0001\u0000\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000\""+
		"\u00ac\u0001\u0000\u0000\u0000$\u00b4\u0001\u0000\u0000\u0000&\u00bc\u0001"+
		"\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000*\u00ca\u0001\u0000\u0000"+
		"\u0000,\u00ce\u0001\u0000\u0000\u0000.\u00d3\u0001\u0000\u0000\u00000"+
		"\u00d5\u0001\u0000\u0000\u00002\u00de\u0001\u0000\u0000\u00004\u00e0\u0001"+
		"\u0000\u0000\u000067\u0003\u0012\t\u00007\u0001\u0001\u0000\u0000\u0000"+
		"8;\u0003\u0006\u0003\u00009;\u0003\u0004\u0002\u0000:8\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0007"+
		"\u0000\u0000\u0000=>\u0003\u0006\u0003\u0000>\u0005\u0001\u0000\u0000"+
		"\u0000?D\u0003\b\u0004\u0000@A\u0007\u0000\u0000\u0000AC\u0003\b\u0004"+
		"\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000GH\u0003\n\u0005\u0000HL\u0003\f\u0006\u0000"+
		"IK\u0003\u000e\u0007\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MQ\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0003\u0010\b\u0000PG\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0007\u0000\u0000SX\u0005$\u0000\u0000TV\u0005\u0015\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000"+
		"WR\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000Yb\u00032\u0019\u0000Z[\u0005\u0005\u0000\u0000[\\\u0005\n"+
		"\u0000\u0000\\b\u0005\u000b\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0005"+
		"\n\u0000\u0000_`\u0005\'\u0000\u0000`b\u0005\u000b\u0000\u0000aY\u0001"+
		"\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000"+
		"b\r\u0001\u0000\u0000\u0000cd\u0005\f\u0000\u0000de\u0003\u0012\t\u0000"+
		"ef\u0005\r\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0007\u0001\u0000"+
		"\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0003\u001e\u000f\u0000j\u0013"+
		"\u0001\u0000\u0000\u0000kt\u00030\u0018\u0000lm\u0005\n\u0000\u0000mn"+
		"\u0003\u0012\t\u0000no\u0005\u000b\u0000\u0000ot\u0001\u0000\u0000\u0000"+
		"pt\u0005\'\u0000\u0000qt\u0005\u0006\u0000\u0000rt\u0003\u0016\u000b\u0000"+
		"sk\u0001\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0015\u0001"+
		"\u0000\u0000\u0000uv\u0003.\u0017\u0000v\u007f\u0005\n\u0000\u0000w|\u0003"+
		"\u0012\t\u0000xy\u0005\u0016\u0000\u0000y{\u0003\u0012\t\u0000zx\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007fw\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000b\u0000"+
		"\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0086\u0003\u001a\r\u0000"+
		"\u0084\u0085\u0005\u0017\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u008c\u0001\u0000\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089\u008a"+
		"\u0005\u0017\u0000\u0000\u008a\u008c\u0003\u0018\f\u0000\u008b\u0083\u0001"+
		"\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u0019\u0001"+
		"\u0000\u0000\u0000\u008d\u0094\u0003\u0002\u0001\u0000\u008e\u0091\u0003"+
		"\u001c\u000e\u0000\u008f\u0090\u0007\u0000\u0000\u0000\u0090\u0092\u0003"+
		"\u0006\u0003\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094\u001b\u0001"+
		"\u0000\u0000\u0000\u0095\u0099\u0003\u0014\n\u0000\u0096\u0098\u0003\u000e"+
		"\u0007\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u001d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u00a1\u0003 \u0010\u0000\u009d\u009e\u0005\u0002\u0000"+
		"\u0000\u009e\u00a0\u0003 \u0010\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001f\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a9\u0003\"\u0011\u0000\u00a5"+
		"\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a8\u0003\"\u0011\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa!\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b1\u0003"+
		"$\u0012\u0000\u00ad\u00ae\u0007\u0002\u0000\u0000\u00ae\u00b0\u0003$\u0012"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b9\u0003&\u0013\u0000\u00b5\u00b6\u0007\u0003\u0000\u0000\u00b6"+
		"\u00b8\u0003&\u0013\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba%\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00c1\u0003(\u0014\u0000\u00bd\u00be\u0007\u0004"+
		"\u0000\u0000\u00be\u00c0\u0003(\u0014\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\'\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003*\u0015\u0000\u00c5"+
		"\u00c6\u0007\u0005\u0000\u0000\u00c6\u00c8\u0003(\u0014\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8)\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0005\u000e\u0000\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd+\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d1\u00034\u001a\u0000\u00cf\u00d0\u0005#\u0000\u0000"+
		"\u00d0\u00d2\u00034\u001a\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2-\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0003,\u0016\u0000\u00d4/\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0004"+
		"\u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000\u00d71\u0001\u0000\u0000\u0000"+
		"\u00d8\u00df\u0005\u0011\u0000\u0000\u00d9\u00da\u00034\u001a\u0000\u00da"+
		"\u00db\u0005#\u0000\u0000\u00db\u00dc\u0005\u0011\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0003,\u0016\u0000\u00de\u00d8\u0001"+
		"\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df3\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0006"+
		"\u0000\u0000\u00e15\u0001\u0000\u0000\u0000\u0018:DLPUWas|\u007f\u0086"+
		"\u008b\u0091\u0093\u0099\u00a1\u00a9\u00b1\u00b9\u00c1\u00c7\u00ca\u00d1"+
		"\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}