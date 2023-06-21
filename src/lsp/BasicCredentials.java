package lsp;

// Define the first subclass
class BasicCredentials extends Credentials {
    // Additional attributes for BasicCredentials
    String secretQuestion;
    String secretAnswer;

    public BasicCredentials(String username, String password, String secretQuestion, String secretAnswer) {
        super(username, password);
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
    }

    // super is used within the BasicCredentials constructor, to call the constructor of the superclass from the subclass.
    // This allows the subclass to inherit all the properties of the superclass, including any attributes or methods.

    // BasicCredentials extends Credentials, which means it inherits the username and password attributes from Credentials.
    // The BasicCredentials constructor takes those same parameters, along with the additional attributes secretQuestion and secretAnswer.

    // The line super(username, password); calls the constructor of the Credentials superclass and passes in the username and password arguments.
    // This initializes the username and password attributes of the BasicCredentials object using the values passed in as arguments to the constructor.

    // By calling the superclass constructor using super,
    // we ensure that the username and password attributes are properly initialized for the BasicCredentials object,
    // since they are inherited from the Credentials superclass.

    // After the super call, the constructor then sets the additional attributes secretQuestion and secretAnswer using the values passed in as arguments to the constructor.
    // So, the super call in this code initializes the properties of the superclass Credentials for the BasicCredentials object,
    // and the remaining code in the constructor initializes the additional properties of BasicCredentials.

    // Getters and setters for secretQuestion and secretAnswer
    public String getSecretQuestion() {
        return this.secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return this.secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }
}
