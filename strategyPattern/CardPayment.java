package strategyPattern;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Credit/Debit Card");
    }
}
