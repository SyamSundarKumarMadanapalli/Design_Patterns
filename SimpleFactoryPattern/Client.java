package SimpleFactoryPattern;

public class Client {
    public static void main(String[] args) {
        // Actually this comes from config / DB / user choice
        String preferredChannel = "EMAIL";

        Notification notification =
                NotificationFactory.createNotification(preferredChannel);

        notification.send("syammssg@gmail.com", "Office starts at 9:30 AM");

        // switching channel requires NO change in client logic:
        preferredChannel = "SMS";
        notification = NotificationFactory.createNotification(preferredChannel);
        notification.send("9490992352", "Let's Go and play TT");
    }
}
