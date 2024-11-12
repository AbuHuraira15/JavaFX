package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerNodeMake {
    @FXML
    private Label DatePicLabel;
    @FXML
    private DatePicker makedate;
    public void getDate(ActionEvent event){
        LocalDate myDate= makedate.getValue();
        System.out.println(myDate.toString());
       // DatePicLabel.setText(myDate.toString());
        //if you want to custom date
        String myStyle=myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        DatePicLabel.setText(myStyle);
    }
}
