package com.example.fufixagain;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Property15 extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        IntegerProperty a = new SimpleIntegerProperty();
        a.setValue(100);

        IntegerProperty b = new SimpleIntegerProperty();
        b.setValue(200);

        System.out.println(a);
        System.out.println(b);

        a.bindBidirectional(b);
        a.setValue(300);
        System.out.println(a);
        System.out.println(b);
    }
}
