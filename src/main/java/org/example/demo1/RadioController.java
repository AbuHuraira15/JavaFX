package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {
    @FXML
    private Label label;
    @FXML
    private RadioButton button1,button2,button3;
    public void RadioButtonM(ActionEvent event){
        if(button1.isSelected()){
            label.setText("Button 1");
        }else if(button2.isSelected()){
            label.setText("Button 2");
        }else if(button3.isSelected()){
            label.setText("Button 3");
        }
    }
}
