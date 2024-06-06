module org.example.ksiegarnia {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ksiegarnia to javafx.fxml;
    exports org.example.ksiegarnia;
}