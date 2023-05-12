package com.example.fufixagain;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class setOnMouseDragged extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text("Life is beautifull");
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setX(mouseEvent.getX());
                text.setY(mouseEvent.getY());
            }
        });


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
