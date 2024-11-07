package org.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Video_2 extends Application {
    @Override
    public void start(Stage Primarystage) throws Exception {
        Group root=new Group();//2nd lear
        Scene scene=new Scene(root,1000,800, Color.LIGHTBLUE);//3rd lear
        Stage stage=new Stage();//another lear show

        //add text
        Text text=new Text();
        text.setText("Write text in page");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Verdana",25));
        text.setFill(Color.BLACK);
        //add with group root
        root.getChildren().add(text);

        //for Single line
        Line line = new Line();
        line.setStartX(100);
        line.setStartY(200);
        line.setEndX(400);
        line.setEndY(200);
        line.setStrokeWidth(3);//line how wide
        line.setStroke(Color.RED);
        line.setOpacity(.4);//visibility
        line.setRotate(120);//how many degree rotated
        //line add in group root
        root.getChildren().add(line);

        //for Rectangle set
        Rectangle rectangle=new Rectangle();
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setHeight(200);
        rectangle.setWidth(200);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(1.5);//rectangle border set
        rectangle.setStroke(Color.GRAY);//border color set
        root.getChildren().add(rectangle);//add in root rectangle

        //for triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                200.0, 100.0,
                100.0, 300.0,
                300.0, 300.0
        );

// Basic properties
        triangle.setFill(Color.BLUE);              // Fill color
        triangle.setStroke(Color.BLACK);           // Border color
        triangle.setStrokeWidth(2);               // Border width
        triangle.setOpacity(0.8);                 // Transparency
        triangle.setRotate(45);                   // Rotation angle

// Transformation
        triangle.setTranslateX(50);               // Move right
        triangle.setTranslateY(50);               // Move down
        triangle.setScaleX(1.5);                  // Scale horizontally
        triangle.setScaleY(1.5);                  // Scale vertically

// Style using CSS
        triangle.setStyle(
                "-fx-fill: blue;" +
                        "-fx-stroke: black;" +
                        "-fx-stroke-width: 2;"
        );

        // Set the fill color of the triangle
        triangle.setFill(Color.YELLOW);

        // Add the triangle to the root group
        root.getChildren().add(triangle);

        Circle circle=new Circle();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.RED);
        root.getChildren().add(circle);

        Image image = new Image(getClass().getResource("/imageSetForIcon.png").toExternalForm());
        ImageView imageView=new ImageView(image);
        imageView.setX(50);
        imageView.setY(50);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
