package org.example.demo1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

public class listView implements Initializable {
    @FXML
    private ListView<String> list;
    @FXML
    private Label label;
    String [] food={"Banana","Pizza","ramen"};

    String myFood;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list.getItems().addAll(food);
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

                myFood = list.getSelectionModel().getSelectedItem();

                label.setText(myFood);

            }
        });
    }
}
