package openClosed.after;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }

}
