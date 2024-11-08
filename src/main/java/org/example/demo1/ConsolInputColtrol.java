package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class ConsolInputColtrol {
    @FXML
    private TextArea nameTextArea;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTextConsole(ActionEvent event) throws IOException {
        // Get the user's input from the nameTextArea
        String userInput = nameTextArea.getText();
        setName(userInput);

        // Load the next FXML file and pass the name to the next controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InputTextShow.fxml"));
        Parent root = loader.load();
        ConsolControler2 consolController2 = loader.getController();
        consolController2.displayText(getName());

        // Switch to the next scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void seen(ActionEvent event) {
        // Add any additional logic for the "seen" action
    }
}