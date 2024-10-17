module com.alesandro.ejercicio15o {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio15o to javafx.fxml;
    exports com.alesandro.ejercicio15o;
}