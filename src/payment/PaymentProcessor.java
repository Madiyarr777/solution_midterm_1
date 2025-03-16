public interface PaymentProcessor {
    void process(double amount) throws PaymentException;
}

