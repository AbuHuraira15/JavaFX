package org.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MController implements Initializable {
    @FXML
    private MediaView mediaView;

    private MediaPlayer mediaPlayer;
    private File file;
    private Media media;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("D:\\AOOP\\demo1\\src\\main\\resources\\org\\example\\demo1\\Game of throns.mp4");
        mediaPlayer = new MediaPlayer(new javafx.scene.media.Media(file.toURI().toString()));
        mediaView.setMediaPlayer(mediaPlayer);

    }
    public void method1(){
        mediaPlayer.play();
    }
    public void method2(){
        mediaPlayer.pause();
    }
    public void method3(){

        if(mediaPlayer.getStatus()!=MediaPlayer.Status.READY){
            mediaPlayer.seek(Duration.seconds(0.0));//reset
        }
    }
}