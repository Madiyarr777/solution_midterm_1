public class LoyaltyDecorator implements Coffee {
    private final Coffee coffee;
    private final int discount;

    public LoyaltyDecorator(Coffee coffee, int discount) {
        this.coffee = coffee;
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return coffee.getCost() * (1 - discount / 100.0);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " (Loyalty discount: " + discount + "%)";
    }
}