
package pizzaapplication;

import java.util.*;
        
public class Order {
    
    private ArrayList<Pizza> pizzas;
    
    public Order(){
        
        this.pizzas = new ArrayList<Pizza>();
        
    }
    public void addPizza (Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
            
            Pizza newPizza = new Pizza( size, crust, sauce, topping1, topping2);
                           
        pizzas.add(newPizza);
}

    public String orderInformation(){
        
        String orderInformation = "";
        
        for (Pizza pizza:pizzas) {
            orderInformation = orderInformation + "\n\n" + pizza.pizzaInformation();
            
          
        }
        return orderInformation;
    }


    public int pizzaCount(){
        return pizzas.size();
    }

    
    public Pizza getPizza(int location){
        Pizza pizza = pizzas.get(location);
        return pizza;
        
    }

    
    public void deletePizza(int location){
        Pizza pizza = getPizza(location);
        pizzas.remove(pizza);
        
    }
    
    
    public void changePizza(int location, Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
        
        Pizza pizza = getPizza(location);
        pizza.setSize(size);
        pizza.setCrust(crust);
        pizza.setSauce(sauce);
        pizza.setTopping1(topping1);
        pizza.setTopping2(topping2);
        
 
    }
    
    public double orderTotal(){
        
        double orderTotal = 0;
        
        for (Pizza pizza:pizzas) {
            orderTotal = orderTotal + pizza.overallCost();
            
          
        }
        return orderTotal;         
        
    }
}


