package O_principleViolation;

public class Cart {
     private double amount;

    public Cart(double totalAmount){
        this.amount=totalAmount;
    }

    public double getAmount(){
        return amount;
    }

    public void setTotalAmount(double totalAmount) {
        this.amount = totalAmount;
    }

}
