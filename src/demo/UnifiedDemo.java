public class UnifiedDemo {
    public static void main(String[] args) {
        try {

            SmartModule smartWatch = new SmartWatchAdapter("VL-SMART-001");
            smartWatch.enable();
            SmartModule ecoDevice = new EcoModeDecorator(smartWatch, 20.5);
            ecoDevice.enable();
            ecoDevice.disable();

            System.out.println("Device ID: " + ecoDevice.id());


            CoffeeFactory espressoFactory = new VLEspressoFactory();
            Coffee coffee = new VLCaramelDecorator(espressoFactory.createCoffee());
            coffee = new LoyaltyDecorator(coffee, 15);

            System.out.println("[Main order]");
            System.out.println("Drink: " + coffee.getDescription());
            System.out.println("Cost: $" + coffee.getCost());


            CoffeeFactory autumnFactory = new AutumnCoffeeFactory();
            Coffee seasonalCoffee = autumnFactory.createCoffee();
            seasonalCoffee = new LoyaltyDecorator(seasonalCoffee, 10);

            System.out.println("[Seasonal offer]");
            System.out.println("Drink: " + seasonalCoffee.getDescription());
            System.out.println("Cost: $" + seasonalCoffee.getCost());


            PaymentProcessor processor = new SecurePaymentDecorator(
                    new CreditCardProcessor("VL12345678901234")
            );
            processor.process(coffee.getCost() + seasonalCoffee.getCost());


            smartWatch.disable();

        } catch (PaymentException e) {
            System.out.println("Payment error: " + e.getMessage());
        }
    }
}