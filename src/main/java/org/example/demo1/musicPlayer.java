package org.example.demo1;

import com.sun.glass.ui.Timer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class musicPlayer implements Initializable {

    @FXML
    private Button prevuseButton,resetButton,play,puseButton,nextbutton;
    @FXML
    private Label musicLabel;
    @FXML
    private Slider slider;
    @FXML
    private Pane first;
    @FXML
    private ComboBox<String>speed;
    @FXML
    private ProgressBar progressBar;

    private File []file;
    private File directory;
    private ArrayList<File>songs;
    private int songNumber;
    private  int []Speeds={25,40,50,75,100,125,150,200};
    private Timer timer;
    private boolean running;

    private Media mediaM;
    private MediaPlayer mediaPlayer;

    public  void nextMethod(){

    }
    public  void puseMethod(){

    }
    public  void playMethod(){

    }
    public  void resetMethod(){

    }
    public  void prevuseMethod(){

    }
    public void begTimer(){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs=new ArrayList<>();
        directory=new File("E:\\Downlode\\Farzi");
        file=directory.listFiles();
        if(file!=null){
            for(File F:file){
                songs.add(F);
                System.out.println(F);
            }
        }
        mediaM=new  Media(songs.get(songNumber).toURI().toString());
        mediaPlayer=new MediaPlayer(mediaM);
        musicLabel.setText(songs.get(songNumber).getName());
    }
}
