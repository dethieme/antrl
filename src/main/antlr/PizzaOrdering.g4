grammar PizzaOrdering;

order_commands : order+ ;

order          : place_order add_pizza* SEMICOLON ;

place_order    : 'PLACE_ORDER_FOR' '(' STRING ')' ;

add_pizza      : 'ADD_PIZZA' '(' size ',' type (',' toppings)? ')' ;

toppings       : 'TOPPINGS' '(' topping (',' topping)* ')' ;

topping        : 'EXTRA_CHEESE' | 'MUSHROOMS' | 'OLIVES' ;

size           : 'SMALL' | 'MEDIUM' | 'LARGE' ;
type           : 'MARGHERITA' | 'PEPERONI' | 'TUNA' ;

CHARACTER      : [a-zA-Z] ;
WHITESPACE     : [ \t\r\n]+ -> skip ;
STRING         : '\'' (CHARACTER | ' ')+ '\'' ;
SEMICOLON      : ';' ;
