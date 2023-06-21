package lsp;

import java.util.concurrent.atomic.AtomicReference;

public class LoginService {

    // By following the Liskov Substitution Principle,
    // we can treat objects of the subclasses, BasicCredentials and AdvancedCredentials,
    // as if they were objects of the superclass, Credentials.
    // This means that an object of the subclass can be passed to a method
    // that expects an object of the superclass, without causing any unexpected behavior.

    public void login(Credentials credentials) {
        // This method takes an object of type Credentials
        // and uses the username and password attributes to complete login process

        // Since BasicCredentials extends Credentials,
        // we can pass basicCreds to the login method
        // logIn(basicCreds);
        // refer to Main class

        // This works because BasicCredentials is a subclass of Credentials,
        // which means it inherits the username and password attributes from Credentials.
        // When basicCreds is passed to logIn, the method uses the username and password attributes to complete login process,
        // and the additional secretQuestion and secretAnswer attributes are ignored.

        // This demonstrates the Liskov Substitution Principle,
        // because we are able to use an object of the subclass BasicCredentials
        // as if it were an object of the superclass Credentials,
        // without causing any unexpected behavior.

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
