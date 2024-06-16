module org.example.ksiegarnia {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;


    opens org.example.ksiegarnia to javafx.fxml;
    exports org.example.ksiegarnia;
}