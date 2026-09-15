import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginForm extends Application {

    @Override
    public void start(Stage stage) {

        TextField username = new TextField();
        username.setPromptText("Username");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        Button loginButton = new Button("Login");

        Label resultLabel = new Label();

        loginButton.setOnAction(event -> {

            String user = username.getText();
            String pass = password.getText();

            if (user.equals("admin") && pass.equals("1234")) {
                resultLabel.setText("Login successful");
            } else {
                resultLabel.setText("Invalid username or password");
            }
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                username,
                password,
                loginButton,
                resultLabel
        );

        Scene scene = new Scene(root, 400, 250);

        stage.setScene(scene);
        stage.setTitle("Login Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}