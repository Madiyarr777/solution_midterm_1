public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void process(double amount) throws PaymentException {
        if (cardNumber.length() != 16 || !cardNumber.contains("VL")) {
            throw new PaymentException("Invalid VL card", "CC401");
        }
        System.out.println("VL Payment: $" + amount + " processed via CC");
    }
}