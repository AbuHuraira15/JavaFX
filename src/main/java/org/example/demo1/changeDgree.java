package org.example.demo1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class changeDgree {
    @FXML
    private Label label;
    @FXML
    private Slider slider;
    int temp;
    @FXML
    public  void initialize(){
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                temp=(int)slider.getValue();
                label.setText(String.valueOf(temp));
            }
        });
    }
}
