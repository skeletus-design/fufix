package com.example.fufixagain;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

//Pain, StackPain, HBox, Vbox, FlowPain, GridPain, BorderPain

public class lesson7 extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(20);

        Text text = new Text("ABC");
        text.setX(200);
        text.setY(200);
        // text.setFill(Color.BROWN);
        // Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        // text.setFont(font);
        text.setStyle("-fx-fill : red; -fx-font-weight : bold; -fx-font-size : 22");

        Rectangle rectangle = new Rectangle(100,100,100,100);

        FlowPane pane = new FlowPane();
        pane.setOrientation(Orientation.VERTICAL);
        pane.getChildren().add(circle);
        pane.getChildren().add(text);
        pane.getChildren().add(rectangle);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
