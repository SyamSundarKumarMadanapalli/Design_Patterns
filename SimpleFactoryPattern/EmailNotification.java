package SimpleFactoryPattern;

public class EmailNotification implements Notification {

    @Override
    public void send(String to, String message) {
        System.out.println("Sending EMAIL to " + to + " : " + message);
        // real code: use JavaMail
    }
}