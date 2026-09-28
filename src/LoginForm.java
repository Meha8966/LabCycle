// Import required JavaFX classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Main class extending Application
public class LoginForm extends Application {

    // start() method is the entry point of a JavaFX application
    @Override
    public void start(Stage stage) {

        // Create a text field to enter the username
        TextField username = new TextField();
        username.setPromptText("Username");

        // Create a password field to enter the password
        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        // Create a Login button
        Button loginButton = new Button("Login");

        // Create a label to display the login result
        Label resultLabel = new Label();

        // Set an action when the Login button is clicked
        loginButton.setOnAction(event -> {

            // Get the username entered by the user
            String user = username.getText();

            // Get the password entered by the user
            String pass = password.getText();

            // Check whether the username and password are correct
            if (user.equals("admin") && pass.equals("1234")) {

                // Display success message if credentials are correct
                resultLabel.setText("Login successful");

            } else {

                // Display error message if credentials are incorrect
                resultLabel.setText("Invalid username or password");
            }
        });

        // Create a VBox layout with 10 pixels of spacing
        VBox root = new VBox(10);

        // Add all controls to the VBox
        root.getChildren().addAll(
                username,
                password,
                loginButton,
                resultLabel
        );

        // Create a scene with width 400 and height 250
        Scene scene = new Scene(root, 400, 250);

        // Set the scene on the stage
        stage.setScene(scene);

        // Set the title of the window
        stage.setTitle("Login Form");

        // Display the window
        stage.show();
    }

    // Main method: launches the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
