package singleresponsability.after;

public class NotificationService {

    public void sendMessage(String target, String type) {

        switch (type.toLowerCase()) {
            case "email":
                sendEmail(target);
                break;
            case "sms":
                sendSms(target);
                break;
            default:
                System.out.println("Unsupported notification type: " + type);
        }
    }

    private void sendEmail(String email) {
        System.out.println("Sending welcome email to " + email);
    }

    private void sendSms(String phoneNumber) {
        System.out.println("Sending SMS to " + phoneNumber);
    }
}


