module com.example.fufixagain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fufixagain to javafx.fxml;
    exports com.example.fufixagain;
}