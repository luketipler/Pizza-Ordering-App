
package pizzaapplication;

public enum Crust {
    
    THIN("Thin", 1.08),
    DEEP("Deep", 1.10),
    STUFFED("Stuffed", 2.14);
    
    private final String name;
    private final double cost;

    private Crust(String name, double cost) {
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
