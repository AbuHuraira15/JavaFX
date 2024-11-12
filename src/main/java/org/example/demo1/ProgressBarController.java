package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;

public class ProgressBarController {
    @FXML
    private Button barChanger;
    @FXML
    private Label label;
    @FXML
    private ProgressBar bar;
    @FXML
    public void initialize(){
        bar.setStyle("-fx-accent: #00FF00");
    }

    BigDecimal value=new BigDecimal(String.format("%.2f",0.0));
    public void getChange(){
       if(value.doubleValue()<1){
           value=new BigDecimal(String.format("%.2f",value.doubleValue()+.1));
           bar.setProgress(value.doubleValue());
           label.setText(Integer.toString((int)Math.round(value.doubleValue() * 100))+"%");
       }
    }

}
