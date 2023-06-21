package lsp;

import java.util.concurrent.atomic.AtomicReference;

public class LoginService {
    public void login(Credentials credentials) {
        // Code for login
        String enteredUsername = credentials.getUsername();
        String enteredPassword = credentials.getPassword();

        AtomicReference<String> credType = new AtomicReference<>("");
        if (credentials instanceof BasicCredentials) {
            credType.set("BasicCredentials");
        } else if (credentials instanceof AdvancedCredentials) {
            credType.set("AdvancedCredentials");
        } else {
            credType.set("Credentials");
        }

        // Check if the username and password are valid
        if (isValidUser(enteredUsername) && isValidPassword(enteredPassword)) {
            System.out.println("Logged in successfully with " + credType + " credentials!");
        } else {
            System.out.println("Invalid " + credType + " credentials!");
        }
    }

    // Helper method to check if the username is valid
    private boolean isValidUser(String username) {
        // Code to check if the username is valid
        return username != null && username.length() >= 5 && username.matches("[a-zA-Z0-9]+");
    }

    // Helper method to check if the password is valid
    private boolean isValidPassword(String password) {
        // Code to check if the password is valid
        return password != null && password.length() >= 8 && !password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()) && password.matches(".*\\d.*");
    }
}
