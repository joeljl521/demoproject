package joel.demoproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button logInButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Button discoverMoreButton;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onLogInButtonClick() {
        System.out.println("Log In button clicked");
    }

    @FXML
    protected void onSignUpButtonClick() {
        System.out.println("Sign Up button clicked");
    }

    @FXML
    protected void onDiscoverMoreButtonClick() {
        System.out.println("Discover More button clicked");
    }
}
