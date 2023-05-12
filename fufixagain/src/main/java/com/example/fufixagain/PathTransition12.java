package com.example.fufixagain;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class PathTransition12 extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/flag.jpg"));
        ImageView view = new ImageView(image);
        pane.getChildren().add(view);

        Line line = new Line(100, 200, 300, 200);

        PathTransition pathTransition = new PathTransition(Duration.millis(10000), line, view);
        pathTransition.setCycleCount(3);
        pathTransition.play();


        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();
    }
}
