package lsp;

// Define the second subclass
class AdvancedCredentials extends Credentials {
    // Additional attributes for AdvancedCredentials
    String email;

    public AdvancedCredentials(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    // Getter and setter for email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
