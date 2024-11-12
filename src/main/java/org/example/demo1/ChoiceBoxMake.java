package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ChoiceBoxMake {
    @FXML
    private Label label;
    @FXML
    private ChoiceBox<String>choice;
    private String []food={"fish","Pizza","potato"};
    @FXML
    public void initialize(){
        choice.getItems().addAll(food);
        choice.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event){
        String getfood=choice.getValue();
        label.setText(getfood);
    }
}
