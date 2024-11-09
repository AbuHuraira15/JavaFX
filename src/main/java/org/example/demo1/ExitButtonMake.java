package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ExitButtonMake {
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    Stage stage;

    public void logOut(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("LogOut");
        alert.setHeaderText("Are you about to logout!!!");
        alert.setContentText("Do you want to save before exiting:");
        if(alert.showAndWait().get()== ButtonType.OK){
             // Get the current stage from the scenePane
            stage = (Stage) scenePane.getScene().getWindow();

            // Close the current stage
             stage.close();

             System.out.println("You successfully logged out!!!");
         }
    }
}