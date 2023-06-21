package lsp;

/*
 * Main class demonstrates
 * the use of the Credentials, BasicCredentials, and AdvancedCredentials classes:
 */

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        Credentials credentials = new Credentials("sukumarsatyen", "password");
        BasicCredentials basicCreds = new BasicCredentials("sukumarsatyen_basic", "password_basic", "What is your favorite color?", "Blue");
        AdvancedCredentials advancedCreds = new AdvancedCredentials("sukumarsatyen_advanced", "password_advanced", "sukumarsatyen@aol.com");

        // Print out the credentials
        System.out.println("Credentials provided:");
        System.out.println("Username: " + credentials.getUsername());
        System.out.println("Password: " + credentials.getPassword());

        // Print out the basic credentials
        System.out.println("\nBasic Credentials provided:");
        System.out.println("Username: " + basicCreds.getUsername());
        System.out.println("Password: " + basicCreds.getPassword());
        System.out.println("Secret Question: " + basicCreds.getSecretQuestion());
        System.out.println("Secret Answer: " + basicCreds.getSecretAnswer());

        // Print out the advanced credentials
        System.out.println("\nAdvanced Credentials provided:");
        System.out.println("Username: " + advancedCreds.getUsername());
        System.out.println("Password: " + advancedCreds.getPassword());
        System.out.println("Email: " + advancedCreds.getEmail());
        System.out.println("\n");
        System.out.println("*** *** *** *** ***");
        System.out.println("Summary report of Login process: ");
        loginService.login(basicCreds);
        loginService.login(advancedCreds);
    }
}

/*
The Liskov Substitution Principle states that
objects of a superclass should be able to be replaced with objects of its subclasses
without causing any unexpected behavior in the program.
To demonstrate this principle,
we create a superclass named Credentials with two attributes: username and password.
Then, we then create two subclasses, BasicCredentials and AdvancedCredentials,
which inherit from Credentials and add additional attributes.
*/



