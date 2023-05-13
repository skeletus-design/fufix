package com.example.fufixagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Property16 extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.setCenterX(200);
        circle.setCenterY(200);
        pane.getChildren().add(circle);

        circle.centerXProperty().bind(pane.heightProperty().divide(2));
        circle.centerYProperty().bind(pane.widthProperty().divide(2));

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
