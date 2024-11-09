package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CheckBoxController {
    @FXML
    private Label label;
    @FXML
    private CheckBox checkbox;
    @FXML
    private ImageView image;
    private Image my,myIm;
    @FXML
    public void initialize() {
        try {
            myIm = new Image(getClass().getResource("/spiderman.png").toExternalForm());
            my = new Image(getClass().getResource("/imageSetForIcon.png").toExternalForm());

            // Set initial image
            image.setImage(myIm);  // Set an initial image
        } catch (Exception e) {
            System.err.println("Error loading images: " + e.getMessage());
        }
    }
    //Image img2=new Image(getClass().getResource("spiderman.png").toExternalForm());

    public void change(ActionEvent event){
        if(checkbox.isSelected()){
            label.setText("Download");
            image.setImage(my);
        }else {
            image.setImage(myIm);
            label.setText("Spider Man");
        }

    }
}
