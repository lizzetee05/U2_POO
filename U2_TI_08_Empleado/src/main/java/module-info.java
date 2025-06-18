module com.example.empleado {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.empleado to javafx.fxml;
    exports com.example.empleado;
}