package com.example.fufixagain;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ScrollBar24 extends Application {
    Text text = new Text();
    @Override
    public void start(Stage stage) {
        BorderPane borderPain = new BorderPane();
        ScrollBar scrollBarV = new ScrollBar();
        scrollBarV.setOrientation(Orientation.VERTICAL);
        ScrollBar scrollBarH = new ScrollBar();
        Pane pane = new Pane();
        text.setText("RF");
        text.setX(20);
        text.setY(20);
        pane.getChildren().add(text);

        borderPain.setCenter(pane);
        borderPain.setBottom(scrollBarH);
        borderPain.setRight(scrollBarV);

        text.xProperty().bind(scrollBarH.valueProperty());
        text.yProperty().bind(scrollBarV.valueProperty());

        Scene scene = new Scene(borderPain, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
