public class BasicCoffee implements Coffee {
    private final String type;
    private final double cost;

    public BasicCoffee(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return type;
    }
}