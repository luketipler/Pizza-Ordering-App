
package pizzaapplication;


public class TestingOrder {
    
    public static void main(String[] args) {
        
        Order order = new Order();
        order.addPizza(Size.MEDUIUM, Crust.STUFFED, Sauce.TOMATO, Topping.JALEPENOS, Topping.OLIVES);
        order.addPizza(Size.LARGE, Crust.THIN, Sauce.PESTO, Topping.ONION, Topping.PEPPERONI);
        order.addPizza(Size.SMALL, Crust.DEEP, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.NONE);
        order.addPizza(Size.LARGE, Crust.THIN, Sauce.PESTO, Topping.CHILLI, Topping.MUSHROOM);
        order.addPizza(Size.MEDUIUM, Crust.STUFFED, Sauce.TOMATO, Topping.ANCHOVY, Topping.ROCKET);
    
        System.out.println(order.orderInformation());
        
         }
    
    
    
    
}
