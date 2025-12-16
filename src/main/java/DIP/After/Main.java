package DIP.After;

public class Main {
    public static void main(String[] args) {
        // Escenario 1: Pago con Tarjeta de Crédito
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        processor1.makePayment(150.0);

        // Escenario 2: Pago con PayPal (Sin modificar PaymentProcessor)
        PaymentMethod paypal = new PaypalPayment();
        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        processor2.makePayment(75.50);

        // Escenario 3: Pago con Criptomonedas
        PaymentProcessor processor3 = new PaymentProcessor(new CryptoPayment());
        processor3.makePayment(0.05); // Valor simbólico
    }
}