# PizzaOrdering grammar

A small project for creating a PizzaOrdering grammar with ANTLR.
The grammar definition can be found in [./antlr/PizzaOrdering.g4](src/main/antlr/PizzaOrdering.g4)

The build.gradle was created based on Gabriele Tomasseti's great [The ANTL Mega Tutorial](https://tomassetti.me/antlr-mega-tutorial/)

This is the second part of the DSL exercise.
For part one see [github.com/dethieme/dsl](https://github.com/dethieme/dsl).

## PizzaOrdering Cheatsheet

| Command                                                     | Description                                                                                                                                                                                                                                                                                                            |
|:------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| 
| PLACE_ORDER_FOR(customerName: String)                       | This command is used to initiate a pizza order.<br/>The customer's name may only contain characters matching this rule [a-zA-ZäöüÄÖÜé-] and whitespaces and must be written within single quotes.                                                                                                                      | 
| ADD_PIZZA(*size*: Size, *type*: Type, *toppings*?: TOPPING) | This command must be placed after PLACE_ORDER_FOR() to be valid and can be chained.<br/>An order must at least contain 1 ADD_PIZZA().<br/>The parameter *toppings* is optional.<br/>Valid sizes are SMALL, MEDIUM, and LARGE (case-insensitive).<br/>Valid types are MARGHERITA, PEPERONI and TUNA (case-insensitive). | 
| TOPPING(*topping1*: Topping, *topping2*?: Topping, ...)     | This command must be placed within ADD_PIZZA() to be valid. May contain 1 - n additional toppings.<br/>Valid toppings are EXTRA_CHEESE, MUSHROOMS and OLIVES (case-insensitive).                                                                                                                                       |

Note: A PizzaOrder must be concluded with a semicolon to be valid. Multiple orders can be placed at once.

### Example

PLACE_ORDER_FOR('Denise Thieme')<br/>
&nbsp;&nbsp;&nbsp;&nbsp;ADD_PIZZA(MEDIUM, MARGHERITA, TOPPINGS(EXTRA_CHEESE, MUSHROOMS))<br/>
&nbsp;&nbsp;&nbsp;&nbsp;ADD_PIZZA(LARGE, PEPERONI, TOPPINGS(OLIVES))<br/>
&nbsp;&nbsp;&nbsp;&nbsp;ADD_PIZZA(SMALL, TUNA);