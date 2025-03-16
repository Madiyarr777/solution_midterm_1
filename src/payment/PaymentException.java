public class PaymentException extends Exception {
    private String code;

    public PaymentException(String message, String code) {
        super(message + " [VL-" + code + "]");
        this.code = "VL-ERR-" + code;
    }
}