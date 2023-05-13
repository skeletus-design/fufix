package com.example.fufixagain;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FadeTransition13 extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/flag.jpg"));
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000), imageView);
        fadeTransition.setFromValue(0.0);
        fadeTransition.setToValue(1.0);
        fadeTransition.setAutoReverse(false);
        fadeTransition.play();

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
