package O_principleViolation;

public class CalculateNet {
    public static void main(String[] args) {
        Cart cart = new Cart(2000.0);

        Discount discountService = new Discount();

        double finalAmount = discountService.applyDiscount(cart, "FLAT");

        System.out.println("Final amount to pay = " + finalAmount);
    }
}
