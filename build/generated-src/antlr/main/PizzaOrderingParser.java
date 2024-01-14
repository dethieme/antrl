// Generated from PizzaOrdering.g4 by ANTLR 4.9.3
package dethieme.MarkupParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PizzaOrderingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, EXTRA_CHEESE=7, MUSHROOMS=8, 
		OLIVES=9, SMALL=10, MEDIUM=11, LARGE=12, MARGHERITA=13, PEPERONI=14, TUNA=15, 
		CHARACTER=16, WHITESPACE=17, STRING=18, SEMICOLON=19;
	public static final int
		RULE_orders = 0, RULE_order = 1, RULE_place_order = 2, RULE_add_pizza = 3, 
		RULE_toppings = 4, RULE_topping = 5, RULE_size = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"orders", "order", "place_order", "add_pizza", "toppings", "topping", 
			"size", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PLACE_ORDER_FOR'", "'('", "')'", "'ADD_PIZZA'", "','", "'TOPPINGS'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EXTRA_CHEESE", "MUSHROOMS", 
			"OLIVES", "SMALL", "MEDIUM", "LARGE", "MARGHERITA", "PEPERONI", "TUNA", 
			"CHARACTER", "WHITESPACE", "STRING", "SEMICOLON"
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
	public String getGrammarFileName() { return "PizzaOrdering.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PizzaOrderingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OrdersContext extends ParserRuleContext {
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public OrdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orders; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitOrders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdersContext orders() throws RecognitionException {
		OrdersContext _localctx = new OrdersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_orders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				order();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class OrderContext extends ParserRuleContext {
		public Place_orderContext place_order() {
			return getRuleContext(Place_orderContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PizzaOrderingParser.SEMICOLON, 0); }
		public List<Add_pizzaContext> add_pizza() {
			return getRuleContexts(Add_pizzaContext.class);
		}
		public Add_pizzaContext add_pizza(int i) {
			return getRuleContext(Add_pizzaContext.class,i);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			place_order();
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				add_pizza();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(27);
			match(SEMICOLON);
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

	public static class Place_orderContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PizzaOrderingParser.STRING, 0); }
		public Place_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitPlace_order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Place_orderContext place_order() throws RecognitionException {
		Place_orderContext _localctx = new Place_orderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_place_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(T__1);
			setState(31);
			match(STRING);
			setState(32);
			match(T__2);
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

	public static class Add_pizzaContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ToppingsContext toppings() {
			return getRuleContext(ToppingsContext.class,0);
		}
		public Add_pizzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_pizza; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitAdd_pizza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_pizzaContext add_pizza() throws RecognitionException {
		Add_pizzaContext _localctx = new Add_pizzaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_add_pizza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__3);
			setState(35);
			match(T__1);
			setState(36);
			size();
			setState(37);
			match(T__4);
			setState(38);
			type();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(39);
				match(T__4);
				setState(40);
				toppings();
				}
			}

			setState(43);
			match(T__2);
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

	public static class ToppingsContext extends ParserRuleContext {
		public List<ToppingContext> topping() {
			return getRuleContexts(ToppingContext.class);
		}
		public ToppingContext topping(int i) {
			return getRuleContext(ToppingContext.class,i);
		}
		public ToppingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toppings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitToppings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToppingsContext toppings() throws RecognitionException {
		ToppingsContext _localctx = new ToppingsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toppings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__5);
			setState(46);
			match(T__1);
			setState(47);
			topping();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(48);
				match(T__4);
				setState(49);
				topping();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__2);
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

	public static class ToppingContext extends ParserRuleContext {
		public TerminalNode EXTRA_CHEESE() { return getToken(PizzaOrderingParser.EXTRA_CHEESE, 0); }
		public TerminalNode MUSHROOMS() { return getToken(PizzaOrderingParser.MUSHROOMS, 0); }
		public TerminalNode OLIVES() { return getToken(PizzaOrderingParser.OLIVES, 0); }
		public ToppingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topping; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitTopping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToppingContext topping() throws RecognitionException {
		ToppingContext _localctx = new ToppingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXTRA_CHEESE) | (1L << MUSHROOMS) | (1L << OLIVES))) != 0)) ) {
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SMALL() { return getToken(PizzaOrderingParser.SMALL, 0); }
		public TerminalNode MEDIUM() { return getToken(PizzaOrderingParser.MEDIUM, 0); }
		public TerminalNode LARGE() { return getToken(PizzaOrderingParser.LARGE, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALL) | (1L << MEDIUM) | (1L << LARGE))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode MARGHERITA() { return getToken(PizzaOrderingParser.MARGHERITA, 0); }
		public TerminalNode PEPERONI() { return getToken(PizzaOrderingParser.PEPERONI, 0); }
		public TerminalNode TUNA() { return getToken(PizzaOrderingParser.TUNA, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaOrderingVisitor ) return ((PizzaOrderingVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MARGHERITA) | (1L << PEPERONI) | (1L << TUNA))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\65"+
		"\n\6\f\6\16\68\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b"+
		"\n\f\16\20\2\5\3\2\t\13\3\2\f\16\3\2\17\21\2=\2\23\3\2\2\2\4\27\3\2\2"+
		"\2\6\37\3\2\2\2\b$\3\2\2\2\n/\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20?\3\2\2"+
		"\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2"+
		"\2\26\3\3\2\2\2\27\31\5\6\4\2\30\32\5\b\5\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\25\2\2\36\5\3\2\2"+
		"\2\37 \7\3\2\2 !\7\4\2\2!\"\7\24\2\2\"#\7\5\2\2#\7\3\2\2\2$%\7\6\2\2%"+
		"&\7\4\2\2&\'\5\16\b\2\'(\7\7\2\2(+\5\20\t\2)*\7\7\2\2*,\5\n\6\2+)\3\2"+
		"\2\2+,\3\2\2\2,-\3\2\2\2-.\7\5\2\2.\t\3\2\2\2/\60\7\b\2\2\60\61\7\4\2"+
		"\2\61\66\5\f\7\2\62\63\7\7\2\2\63\65\5\f\7\2\64\62\3\2\2\2\658\3\2\2\2"+
		"\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\5\2\2:\13\3\2"+
		"\2\2;<\t\2\2\2<\r\3\2\2\2=>\t\3\2\2>\17\3\2\2\2?@\t\4\2\2@\21\3\2\2\2"+
		"\6\25\33+\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}