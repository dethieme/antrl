import me.tomassetti.examples.MarkupParser.PizzaOrderingLexer;
import me.tomassetti.examples.MarkupParser.PizzaOrderingParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String exampleInput = "PLACE_ORDER_FOR('Denise Thieme') " +
                "ADD_PIZZA(MEDIUM, MARGHERITA, TOPPINGS(EXTRA_CHEESE, MUSHROOMS)) " +
                "ADD_PIZZA(LARGE, PEPERONI, TOPPINGS(OLIVES)) " +
                "ADD_PIZZA(SMALL, TUNA);";

        PizzaOrderingLexer lexer = new PizzaOrderingLexer(CharStreams.fromString(exampleInput));
        PizzaOrderingParser parser = new PizzaOrderingParser(new CommonTokenStream(lexer));

        // Parse the input
        PizzaOrderingParser.Order_commandsContext tree = parser.order_commands();

        System.out.println(tree.toStringTree(parser));
    }
}
