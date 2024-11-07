package org.example.demo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Video_1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Group root=new Group();//second lear
        Scene scene=new Scene(root, Color.BROWN);//3rd lear
        stage.setScene(scene);//all set main lear
        stage.setWidth(400);
        stage.setHeight(500);
        stage.setX(100);
        stage.setY(100);

        stage.setTitle("Demo Frame");
        Image icon = new Image(getClass().getResource("/imageSetForIcon.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setResizable(false);//resize frame user either true or false
        stage.setFullScreen(true);//frame make full screen
        stage.setFullScreenExitHint("key name select for full screen off for Q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));


        stage.show();//show frame
    }
}
