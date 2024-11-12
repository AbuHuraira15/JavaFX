package org.example.demo1;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class animationsMake implements Initializable {

    @FXML
    private ImageView butterFly;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       /* TranslateTransition transition = new TranslateTransition(Duration.seconds(2), butterFly);
        transition.setFromX(0);
        transition.setToX(200);  // Distance to move right
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.setAutoReverse(true);  // Make it move back and forth
        transition.play();
        */
        /*RotateTransition rotateTransition=new RotateTransition();
        rotateTransition.setNode(butterFly);
        rotateTransition.setDuration(Duration.millis(500));
        rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setByAngle(360);
        rotateTransition.setAxis(Rotate.X_AXIS);
        rotateTransition.play();

        FadeTransition fadeTransition=new FadeTransition();
        fadeTransition.setNode(butterFly);
        fadeTransition.setDuration(Duration.millis(500));
        fadeTransition.setCycleCount(TranslateTransition.INDEFINITE);
        fadeTransition.setInterpolator(Interpolator.LINEAR);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();*/
        ScaleTransition scale=new ScaleTransition();
        scale.setNode(butterFly);
        scale.setDuration(Duration.millis(500));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(2.0);
        scale.setAutoReverse(true);
        scale.play();
    }
}
