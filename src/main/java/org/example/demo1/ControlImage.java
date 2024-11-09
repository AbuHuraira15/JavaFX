package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class ControlImage {
    @FXML
    private ImageView MyImage;
    @FXML
    private Button buttonImage;

    private Image myIm, my;
    private boolean m = true;

    @FXML
    public void initialize() {
        try {
            myIm = new Image(getClass().getResource("/spiderman.png").toExternalForm());
            my = new Image(getClass().getResource("/imageSetForIcon.png").toExternalForm());

            // Set initial image
            MyImage.setImage(myIm);  // Set an initial image
        } catch (Exception e) {
            System.err.println("Error loading images: " + e.getMessage());
        }
    }

    @FXML
    public void displayImage(ActionEvent event) {
        if (m) {
            MyImage.setImage(my);
        } else {
            MyImage.setImage(myIm);
        }
        m = !m;  // Toggle the boolean value

        // Optionally update button text
        buttonImage.setText(m ? "Show Spider-Man" : "Show Other Image");
    }
}