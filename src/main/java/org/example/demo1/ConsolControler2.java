package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConsolControler2 {
    @FXML
    private Label nameLabel;

    public void displayText(String name) {
        nameLabel.setText("Hello: " + name);
    }
}