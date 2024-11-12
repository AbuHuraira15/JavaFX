package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class collerPic {
    @FXML
    private Pane backGround;
    @FXML
    private ColorPicker color;
    public void changeColor(ActionEvent event){
        Color myColor=color.getValue();
        backGround.setBackground(new Background(new BackgroundFill(myColor,null,null)));
    }
}
