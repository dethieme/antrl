import dethieme.MarkupParser.PizzaOrderingLexer;
import dethieme.MarkupParser.PizzaOrderingParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String exampleInput =
                "PLACE_ORDER_FOR('Denise Thieme') " +
                "  ADD_PIZZA(MEDIUM, MARGHERITA, TOPPINGS(EXTRA_CHEESE, MUSHROOMS))" +
                "  ADD_PIZZA(LARGE, PEPERONI, TOPPINGS(OLIVES))" +
                "  ADD_PIZZA(SMALL, TUNA);" +
                "PLACE_ORDER_FOR('Björn-René Meier')" +
                "  ADD_PIZZA(large, peperoni, TOPPINGS(extra_cheese))" +
                "  ADD_PIZZA(large, peperoni, TOPPINGS(olives));";

        PizzaOrderingLexer lexer = new PizzaOrderingLexer(CharStreams.fromString(exampleInput));
        PizzaOrderingParser parser = new PizzaOrderingParser(new CommonTokenStream(lexer));

        // Parse the input
        PizzaOrderingParser.OrdersContext tree = parser.orders();

        System.out.println(tree.toStringTree(parser));
    }
}
