
package pizzaapplication;

public enum Topping {
    
    NONE("No Topping", 0),
    OLIVES("Olives Topping", 0.08),
    EXTRA_CHEESE("Extra Cheese Topping", 0.02),
    CHILLI("Chilli Topping", 0.06),
    PEPPERONI("Pepperoni Topping", 0.10),
    MUSHROOM("Mushroom Topping", 0.03),
    ROCKET("Rocket Topping", 0.05),
    JALEPENOS("Jalepenos Topping", 0.20),
    ONION("Onion Topping", 0.07),
    ANCHOVY("Anchovy Topping", 0.09);
    
    private final String name;
    private final double cost;

    private Topping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return this.name;
    }
    public double getCost() {
        return this.cost;
    }
    
}
