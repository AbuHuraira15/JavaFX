package org.example.demo1;  // Defines the package name for organizing classes

// Import necessary JavaFX classes
import javafx.application.Application;  // Base class for JavaFX applications
import javafx.event.ActionEvent;        // Class for handling button click events
import javafx.event.EventHandler;       // Interface for handling events
import javafx.scene.Scene;              // Container for all content in a window
import javafx.scene.control.Button;     // Button UI component
import javafx.scene.layout.StackPane;   // Layout container that stacks elements
import javafx.stage.Stage;              // Top-level JavaFX container (window)

// Main class that extends Application class to create JavaFX application
public class ABC extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("Click!");  // Creates a new button with text "Click!"

        // Sets up event handler for button click
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello");  // Prints "Hello" when button is clicked
            }
        });

        StackPane root = new StackPane();     // Creates a StackPane layout container
        root.getChildren().add(b);           // Adds the button to the StackPane

        Scene scene = new Scene(root,300,500);  // Creates a scene container with StackPane, width=300, height=500

        stage.setScene(scene);    // Sets the scene to the stage (window)
        stage.show();             // Displays the window
    }

    // Main method - entry point of the application
    public static void main(String[] args) {
        launch(args);    // Launches the JavaFX application
    }
}