// Generated from PizzaOrdering.g4 by ANTLR 4.9.3
package me.tomassetti.examples.MarkupParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PizzaOrderingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PizzaOrderingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#order_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_commands(PizzaOrderingParser.Order_commandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(PizzaOrderingParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#place_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace_order(PizzaOrderingParser.Place_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#add_pizza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_pizza(PizzaOrderingParser.Add_pizzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#toppings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToppings(PizzaOrderingParser.ToppingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#topping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopping(PizzaOrderingParser.ToppingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(PizzaOrderingParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaOrderingParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PizzaOrderingParser.TypeContext ctx);
}