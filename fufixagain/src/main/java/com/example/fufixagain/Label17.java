package com.example.fufixagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Label17 extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        HBox pane = new HBox();
        Image image = new Image(new FileInputStream("src/flag.jpg"));
        ImageView imageView = new ImageView(image);
        Label l1 = new Label("Russian flag",imageView);
        l1.setContentDisplay(ContentDisplay.BOTTOM);
        pane.getChildren().add(l1);//Странно, но у меня все добавилось без Image...P.S. я уже понял почему

        Circle circle = new Circle(50);
        Label l2 = new Label("Circle", circle);
        pane.getChildren().add(l2);
        l2.setContentDisplay(ContentDisplay.LEFT);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
