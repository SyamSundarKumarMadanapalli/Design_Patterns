package O_principle;

public class FlatDiscount implements Discount {

    private final double percentage;

    public FlatDiscount(double percent) {
        this.percentage = percent;
    }

    @Override
    public void apply(Cart cart) {
        double discount = cart.getAmount() * (percentage/100);
        cart.setTotalAmount(Math.max(cart.getAmount()-discount, 0));
    }
}
