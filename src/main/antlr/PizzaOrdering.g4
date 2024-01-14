grammar PizzaOrdering;

orders         : order+ ;

order          : place_order add_pizza+ SEMICOLON ;

place_order    : 'PLACE_ORDER_FOR' '(' STRING ')' ;

add_pizza      : 'ADD_PIZZA' '(' size ',' type (',' toppings)? ')' ;

toppings       : 'TOPPINGS' '(' topping (',' topping)* ')' ;

topping        : EXTRA_CHEESE | MUSHROOMS | OLIVES ;
size           : SMALL | MEDIUM | LARGE ;
type           : MARGHERITA | PEPERONI | TUNA ;

EXTRA_CHEESE   : 'extra_cheese' | 'Extra_Cheese' | 'EXTRA_CHEESE' ;
MUSHROOMS      : 'mushrooms' | 'Mushrooms' | 'MUSHROOMS' ;
OLIVES         : 'olives' | 'Olives' | 'OLIVES' ;

SMALL          : 'small' | 'Small' | 'SMALL' ;
MEDIUM         : 'medium' | 'Medium' | 'MEDIUM' ;
LARGE          : 'large' | 'Large' | 'LARGE' ;

MARGHERITA     : 'margherita' | 'Margherita' | 'MARGHERITA' ;
PEPERONI       : 'peperoni' | 'Peperoni' | 'PEPERONI' ;
TUNA           : 'tuna' | 'Tuna' | 'TUNA' ;

CHARACTER      : [a-zA-ZäöüÄÖÜé-] ;
WHITESPACE     : [ \t\r\n]+ -> skip ;
STRING         : '\'' (CHARACTER | ' ' )+ '\'' ;
SEMICOLON      : ';' ;