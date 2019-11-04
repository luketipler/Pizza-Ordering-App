
package pizzaapplication;


public class TestingPizza {
    
    public static void main(String[] args) {
        
        System.out.println("===== PIZZA CLASS TESTING =====\n");
        System.out.println("First Pizza is created with the following data:\n\n" +
                "Size.MEDIUM,\n" + "Crust.THIN,\n" + "Sauce.PESTO,\n" + 
                "Topping.EXTRA_CHEESE,\n" + "Topping.CHILLI.\n\n\n" + "===== PIZZA DISPLAY =====\n");
        
        Pizza pizza = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
    
        System.out.println(pizza.pizzaInformation());
        
        System.out.println("\n\n===== THE FOLLOWING IS CHANGED USING SET METHODS =====\n\n" +
                "Size.MEDIUM,\n" + "Crust.STUFFED,\n" + "Topping.OLIVES,\n" + "Topping.ONION.\n\n\n" + "===== PIZZA DISPLAY =====\n");
        
        pizza.setSize(Size.MEDIUM);
        pizza.setCrust(Crust.STUFFED);
        pizza.setTopping1(Topping.OLIVES);
        pizza.setTopping2(Topping.ONION);
        
        System.out.println(pizza.pizzaInformation());
        
        System.out.println("\n\n\n===== ORDER CLASS TESTING =====\n");
        
        System.out.println("\n===== Empty order created =====");
        
        Order or = new Order();
        
        System.out.println("PIZZA 1 CREATION AND ADD TO ORDER:\n\n" +
                "Size.MEDIUM,\n" + "Crust.THIN,\n" + "Sauce.PESTO,\n" + 
                "Topping.EXTRA_CHEESE,\n" + "Topping.CHILLI.\n\n\n" + "===== PIZZA DISPLAY =====\n");
        
    }
    
}
