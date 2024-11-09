package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class NumberN {
    @FXML
    private Label label1, label2;
    @FXML
    private Button button;
    @FXML
    private TextField textField;

    private int age;



    @FXML
    public void submit(ActionEvent event) {

        try {
            age = Integer.parseInt(textField.getText());

            if(age >= 18) {
                label1.setText("You are now signed up!");
            }
            else {
                label1.setText("You must be 18+");
            }
        }
        catch (NumberFormatException e){
            label1.setText("enter only numbers plz");
        }
        catch (Exception e) {
            label1.setText("error");
        }
    }
}