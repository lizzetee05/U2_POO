module com.example.vehiculo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.vehiculo to javafx.fxml;
    exports com.example.vehiculo;
    exports com.example.u2_ti_09_vehiculo;
    opens com.example.u2_ti_09_vehiculo to javafx.fxml;
}