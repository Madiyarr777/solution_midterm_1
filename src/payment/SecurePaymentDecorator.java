public class SecurePaymentDecorator implements PaymentProcessor {
    private final PaymentProcessor processor;

    public SecurePaymentDecorator(PaymentProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void process(double amount) throws PaymentException {
        System.out.println("[Payment] Encrypting transaction data...");
        processor.process(amount);
    }
}