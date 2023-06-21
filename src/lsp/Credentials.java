package lsp;

/*
In this example, the superclass Credentials has two attributes, username and password, with corresponding getters and setters.

Two subclasses, BasicCredentials and AdvancedCredentials, are created.

BasicCredentials adds additional attributes, secretQuestion and secretAnswer,

while AdvancedCredentials adds an email attribute.

Each subclass constructor calls the superclass constructor using the super keyword,

passing in the username and password arguments.

The subclasses then set their additional attributes using their own constructors.

Since all subclasses inherit the same username and password attributes from the superclass,

they can be used interchangeably without causing any unexpected behavior.

This demonstrates the Liskov Substitution Principle.
*/

// Define the superclass
class Credentials {
    String username;
    String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for username and password
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

