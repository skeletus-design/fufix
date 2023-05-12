package com.example.fufixagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Color51 extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABC");
        Color color = new Color(1.0, 0, 0, 1.0);
        text.setFill(color);
        text.setX(200);
        text.setY(200);
        //RGB - red, green, blue, opaque(непрозрачность)
        // 200, 0, 0
        //0.0 till 1.0

        pane.getChildren().add(text);


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
