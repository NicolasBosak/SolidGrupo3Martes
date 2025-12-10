package openClosed.after;

public class SMSNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
