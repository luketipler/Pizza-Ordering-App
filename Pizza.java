
package pizzaapplication;

import java.text.DecimalFormat;

public class Pizza {
    
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1;
    private Topping topping2;
   
    //CONSTRUCTOR FOR PIZZA OPTIONS 

    public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2) {

                this.size = size;
                this.crust = crust;
                this.sauce = sauce;
                this.topping1 = topping1;
                this.topping2 = topping2;
                
    }
   
    public static DecimalFormat df = new DecimalFormat("0.00");
           
                   
    public double overallCost() {
       double base = this.crust.getCost() + this.size.getCost();
       
       double overallCost = base + this.topping1.getCost() *5 + this.topping2.getCost()*4 +this.sauce.getCost();
       
       return overallCost;
    }         
    
    
    public String pizzaInformation() {
        
        String info = "TOTAL COST: £" + df.format(overallCost()) + "\n" + this.size.getName() + 
                ": £" +df.format(this.size.getCost()) + "\n" + this.crust.getName() + ": £" + df.format(this.crust.getCost()) +
                "\n" + "BASE COST: £" +df.format(this.size.getCost() + this.crust.getCost()) + "\n" + this.topping1.getName() + 
                ": 5* £" +df.format(this.topping1.getCost()) +" = " + df.format(5*this.topping1.getCost()) +"\n" + this.topping2.getName()
                + ": 4* £" +df.format(this.topping2.getCost()) +" = " + df.format(4*this.topping2.getCost()) + 
                "\n" + this.sauce.getName() + ": £" + df.format(this.sauce.getCost()) ;
        
        return info;
    }
    
    
    
    
    public void setSize(Size size) {
        this.size = size;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setTopping1(Topping topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(Topping topping2) {
        this.topping2 = topping2;
    }

    public Size getSize() {
        return size;
    }

    public Crust getCrust() {
        return crust;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public Topping getTopping2() {
        return topping2;
    }

    
    
}
