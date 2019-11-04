
package pizzaapplication;

public enum Sauce {
    
    PESTO("Pesto Sauce", 0.50),
    TOMATO("Tomato Sauce", 0);
    
    
    private final String name;
    private final double cost;

    private Sauce(String name, double cost) {
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
