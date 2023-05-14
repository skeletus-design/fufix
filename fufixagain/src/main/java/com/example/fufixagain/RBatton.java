package com.example.fufixagain;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RBatton extends Application {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Circle circle;
    private Text text;
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        radioButton1 = new RadioButton("Yes");
        radioButton2 = new RadioButton("No");
        text = new Text();
        pane.getChildren().addAll(radioButton1, radioButton2, text);
        radioButton1.setOnAction(new rListener());
        radioButton2.setOnAction(new rListener());
        radioButton1.setLayoutX(20);
        radioButton1.setLayoutY(20);
        radioButton2.setLayoutX(20);
        radioButton2.setLayoutY(40);
        text.setX(20);
        text.setY(80);


        circle = new Circle(50);
        circle.setFill(Color.BLUE);
        circle.setCenterX(200);
        circle.setCenterY(200);
        pane.getChildren().add(circle);


        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    class rListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            ToggleGroup group = new ToggleGroup();
            radioButton1.setToggleGroup(group);
            radioButton2.setToggleGroup(group);

            if (radioButton1.isSelected())circle.setFill(Color.GREEN);
            if (radioButton2.isSelected())circle.setFill(Color.RED);
            if (circle.getFill() == Color.GREEN)text.setText("Yes");
            else text.setText("No");
        }
    }
}
