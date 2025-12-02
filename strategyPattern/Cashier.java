package strategyPattern;

public class Cashier {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService();
       
        service.setPaymentStrategy(new CardPayment());
        service.checkout(500);

        service.setPaymentStrategy(new UpiPayment());
        service.checkout(1000);
    }
}
