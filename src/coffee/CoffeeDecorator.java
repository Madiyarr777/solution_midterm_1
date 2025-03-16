public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
}

class VLCaramelDecorator extends CoffeeDecorator {
    public VLCaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Caramel (VL)";
    }
}