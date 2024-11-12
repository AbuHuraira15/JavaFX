package org.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class menuBar implements Initializable {
    @FXML
    private TreeView listView;
    public void scletedIteamNow(){
        TreeItem<String>item= (TreeItem<String>) listView.getSelectionModel().getSelectedItem();
        if(item!=null){
            System.out.println(item.getValue());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView view;
        try {
            //make icon
            Image image=new Image(new FileInputStream("D:\\AOOP\\demo1\\src\\main\\resources\\org\\example\\demo1\\down.png"));
              view=new ImageView(image);
              view.setFitHeight(10);
              view.setFitWidth(10);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        TreeItem<String>root=new TreeItem<>("Files",view);//set icon

        TreeItem<String>rootA=new TreeItem<>("Drive:A");
        TreeItem<String>rootB=new TreeItem<>("Drive:B");

        TreeItem<String>root1=new TreeItem<>("Pic");
        TreeItem<String>root2=new TreeItem<>("Video");
        TreeItem<String>root3=new TreeItem<>("Music");

        TreeItem<String>roota1=new TreeItem<>("Pic1");
        TreeItem<String>roota2=new TreeItem<>("Video1");
        TreeItem<String>roota3=new TreeItem<>("Music1");

        rootB.getChildren().addAll(root1,root2,root3);
        rootA.getChildren().addAll(roota1,roota2,roota3);
        root.getChildren().addAll(rootA,rootB);
        //listView.setShowRoot(false);//can't show icon
        listView.setRoot(root);

    }
}
