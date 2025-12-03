package O_principle;

public class CalculateBill {
    public static void main(String[] args) {
        Cart cart = new Cart(2000.0); 

        Discount flat = new FlatDiscount(20);         
        Discount percent = new SummerSale(100);

        flat.apply(cart);
        percent.apply(cart);

        System.out.println("Final amount to pay = " + cart.getAmount());
    }
}


