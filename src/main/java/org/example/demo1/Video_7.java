package org.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Video_7 extends Application {
    public void start(Stage stage){
        try {
            FXMLLoader loader=new FXMLLoader(Video_7.class.getResource("ExitButton.fxml"));
            Scene scene=new Scene(loader.load());
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(event->{
                event.consume();
                logOut(stage);
            });
        }catch (Exception e){
           e.printStackTrace();
        }
    }
    public void logOut(Stage stage) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("LogOut");
        alert.setHeaderText("Are you about to logout!!!");
        alert.setContentText("Do you want to save before exiting:");
        if(alert.showAndWait().get()== ButtonType.OK){
            // Get the current stage from the scenePane

            // Close the current stage
            stage.close();

            System.out.println("You successfully logged out!!!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
