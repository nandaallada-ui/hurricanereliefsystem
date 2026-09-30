module com.gpprelief {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gpprelief to javafx.fxml;
    exports com.gpprelief;
}
