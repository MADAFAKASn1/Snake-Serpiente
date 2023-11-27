module com.example.snakefxmarcos {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.snakefxmarcos to javafx.fxml;
    exports com.example.snakefxmarcos;
}