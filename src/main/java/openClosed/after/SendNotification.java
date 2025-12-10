package openClosed.after;

public class SendNotification {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        FaxNotification faxNotification = new FaxNotification();
        PushNotification pushNotification = new PushNotification();
        SMSNotification smsNotification = new SMSNotification();

        emailNotification.sendNotification("Sending Email");
        faxNotification.sendNotification("Sending Fax");
        pushNotification.sendNotification("Sending Push Notification");
        smsNotification.sendNotification("Sending SMS");
    }
}
