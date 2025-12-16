package DIP.After;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        this.paymentMethod.processPayment(amount);
    }
}
