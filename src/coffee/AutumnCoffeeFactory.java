public class AutumnCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new BasicCoffee("Pumpkin Spice", 4.2);
    }
}