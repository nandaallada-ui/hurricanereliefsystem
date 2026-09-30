module com.gpprelief {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.gpprelief to javafx.fxml;
    exports com.gpprelief;

    opens model to javafx.fxml;
    exports model;
}

