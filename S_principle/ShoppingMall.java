package S_principle;

public class ShoppingMall {
    public static void main(String args[]){
        ParkingManager pm = new ParkingManager();
        ShopsManager sm = new ShopsManager();
        EventsManager em = new EventsManager();

        pm.manageParking();
        sm.manageShops();
        em.manageEvents();
    }
}
