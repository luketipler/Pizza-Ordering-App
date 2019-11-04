
package pizzaapplication;

public enum Size {
    
    SMALL("Small Size", 9.45),
    MEDIUM("Medium Size", 11.87),
    LARGE("Large Size", 15.90);
    
    private final String name;
    private final double cost;

    private Size(String name, double cost) {
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
