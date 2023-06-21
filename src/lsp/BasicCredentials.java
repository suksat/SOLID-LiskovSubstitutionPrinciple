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
