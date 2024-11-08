package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SeenControl {
    private Parent root;
    private Stage stage;
    private Scene scene;
    public void SwitchToSee1(ActionEvent e) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Seen1.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToSee2(ActionEvent e) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Seen2.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
