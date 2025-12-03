package O_principleViolation;

public class Discount {

    public double applyDiscount(Cart cart, String discountType) {
        double amount = cart.getAmount();

        if ("FLAT".equals(discountType)) {
            amount = amount - 500;
        } else if ("PERCENT".equals(discountType)) {
            amount = amount - (amount * 0.10);
        } else {
            // NO_DISCOUNT 
        }

        if (amount < 0) {
            amount = 0;
        }
        cart.setTotalAmount(amount);
        return amount;
    }
}
