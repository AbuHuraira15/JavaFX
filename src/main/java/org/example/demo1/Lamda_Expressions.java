package org.example.demo1;

// Import necessary JavaFX classes
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lamda_Expressions extends Application {
    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Create a button labeled "Click"
        Button b = new Button("Click");

        // Create a button labeled "Exit"
        Button a = new Button("Exit");

        // Add event handler to Exit button using lambda expression
        // When clicked, it will terminate the application
        a.setOnAction(e -> {
            System.exit(0);
        });

        // Add event handler to Click button using traditional anonymous class
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Override method");
                System.out.println("override method");
            }
        });

        // Create VBox layout container
        VBox root = new VBox();

        // Add both buttons to the VBox
        root.getChildren().addAll(a, b);

        // Create a scene with VBox as root and dimensions 500x500
        Scene scene = new Scene(root, 500, 500);

        // Set the window title
        stage.setTitle("Practice");

        // Set the scene to the stage (This line was missing in original code)
        stage.setScene(scene);

        // Display the window
        stage.show();
    }
}