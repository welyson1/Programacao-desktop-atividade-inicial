module com {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.controller to javafx.fxml;
    exports com.view;
}
