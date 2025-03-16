public interface CoffeeFactory {
    Coffee createCoffee();
}


class VLEspressoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new BasicCoffee("VL Espresso", 2.5);
    }
}

