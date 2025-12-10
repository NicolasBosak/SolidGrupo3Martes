package openClosed.after;

public class PushNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push: " + message);
    }
}
