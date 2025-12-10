package singleresponsability.after;

public class UserManager {

    private final UserValidator validator;
    private final UserRepository repository;
    private final NotificationService notificationService;

    public UserManager() {
        this.validator = new UserValidator();
        this.repository = new UserRepository();
        this.notificationService = new NotificationService();
    }

    public void addUser(String email, String password) {
        if (validator.isValidEmail(email) && validator.isValidPassword(password)) {
            repository.saveToDatabase(email, password);
            notificationService.sendMessage(email, "email");

        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}

