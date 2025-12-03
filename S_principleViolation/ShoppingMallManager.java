package S_principleViolation;

public class ShoppingMallManager {

    public void manageShops() {
        System.out.println("Managing shops in the mall");
    }
    
    public void manageParking() {
        System.out.println("Managing mall parking");
    }
    
    public void manageEvents() {
        System.out.println("Managing mall events");
    }

    public static void main(String[] args) {
        ShoppingMallManager sm = new ShoppingMallManager();
        sm.manageEvents();
        sm.manageParking();
        sm.manageShops();
    }
}
