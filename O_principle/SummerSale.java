package O_principle;

public class SummerSale implements Discount {
    private final double amount;

    public SummerSale(double amount) {
        this.amount = amount;
    }

    @Override
    public void apply(Cart cart) {
        double newTotal = cart.getAmount() - amount;
        cart.setTotalAmount(Math.max(newTotal, 0));
    }
}
