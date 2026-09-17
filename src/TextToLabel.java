```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Main class
public class TextToLabel extends Application {

    // Create the window
    public void start(Stage stage) {

        // Create text box
        TextField textBox = new TextField();

        // Create button
        Button button = new Button("Move Text");

        // Create label
        Label label = new Label();

        // When button is clicked
        button.setOnAction(e -> {

            // Get text from text box
            String text = textBox.getText();

            // Put text into label
            label.setText(text);

            // Clear text box
            textBox.clear();
        });

        // Create vertical layout
        VBox root = new VBox(10);

        // Add controls
        root.getChildren().addAll(textBox, button, label);

        // Create scene
        Scene scene = new Scene(root, 400, 250);

        // Set window title
        stage.setTitle("Text to Label");

        // Put scene in window
        stage.setScene(scene);

        // Show window
        stage.show();
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }
}
```
