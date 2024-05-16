module com.example.repetit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repetit to javafx.fxml;
    exports com.example.repetit;

    opens com.example.repetit.controllers to javafx.fxml;
    exports com.example.repetit.controllers;
}