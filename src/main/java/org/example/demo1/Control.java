package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Control {
    @FXML
    private Circle circle=new Circle();
    private double x,y;
    public void up(){
        System.out.println("up");
        circle.setCenterY(y-=3);
    }
    public void down(){
        System.out.println("Down");
        circle.setCenterY(y+=3);

    }
    public void right(){
        System.out.println("Right");
        circle.setCenterX(x+=3);

    }
    public void left(){
        System.out.println("Left");
        circle.setCenterX(x-=3);

    }

}
