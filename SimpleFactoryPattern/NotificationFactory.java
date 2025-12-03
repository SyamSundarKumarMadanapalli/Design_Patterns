package SimpleFactoryPattern;
public class NotificationFactory {

    // simple string-based factory; could also use enum
    public static Notification createNotification(String channel) {
        if (channel == null) {
            throw new IllegalArgumentException("Channel must not be null");
        }

        switch (channel.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            default:
                throw new IllegalArgumentException("Unknown notification channel: " + channel);
        }
    }
}
