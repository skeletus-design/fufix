package com.example.fufixagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

//Pain, StackPain, HBox, Vbox, FlowPain, GridPain, BorderPain

public class BorderPain extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Circle circle = new Circle(50);
        circle.setFill(Color.BLUE);
        Text text = new Text("ABC");
        text.setStyle("-fx-fill : red; -fx-font-weight : bold; -fx-font-size : 22");

        Rectangle rectangle = new Rectangle(100,100,100,100);

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle );
        stackPane.getChildren().add(text);

        borderPane.setCenter(stackPane);

        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
