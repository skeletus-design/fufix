package com.example.fufixagain;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.EventListener;

public class CheckBox18 extends Application {
    private Circle circle;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Pane pane = new Pane();

        checkBox1 = new CheckBox("Yes");
        checkBox2 = new CheckBox("No");
        pane.getChildren().addAll(checkBox1, checkBox2);
        checkBox1.setOnAction(new ItemListener());
        checkBox2.setOnAction(new ItemListener());


        checkBox1.setLayoutX(20);
        checkBox1.setLayoutY(20);
        checkBox2.setLayoutX(20);
        checkBox2.setLayoutY(40);

        circle = new Circle(50);
        circle.setFill(Color.BLUE);
        circle.setCenterX(200);
        circle.setCenterY(200);
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    class ItemListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (checkBox1.isSelected())circle.setFill(Color.GREEN);
            else circle.setFill(Color.BLUE);

            if (checkBox2.isSelected())circle.setFill(Color.RED);

            if (checkBox1.isSelected() && checkBox2.isSelected())circle.setFill(Color.WHITE);
        }
    }
}
