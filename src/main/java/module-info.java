module com.example.basic_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basic_calculator to javafx.fxml;
    exports com.example.basic_calculator;
}