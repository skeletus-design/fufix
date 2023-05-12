package com.example.fufixagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

//Pain, StackPain, HBox, Vbox, FlowPain, GridPain, BorderPain

public class GridPain8 extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Circle circle = new Circle(50);
        circle.setFill(Color.BLUE);
        Text text = new Text("ABC");
        text.setStyle("-fx-fill : red; -fx-font-weight : bold; -fx-font-size : 22");

        Rectangle rectangle = new Rectangle(100,100,100,100);

        GridPane pane = new GridPane();
        pane.add(circle, 0,0);
        pane.add(text, 1,0);
        pane.add(rectangle,0,1);


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
