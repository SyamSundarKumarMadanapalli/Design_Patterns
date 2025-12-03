package SimpleFactoryPattern;

public class SmsNotification implements Notification {

    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + " : " + message);
        // real code: call SMS gateway API
    }
}
