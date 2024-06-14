module org.example.ksiegarnia {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.naming;
    requires java.persistence;

    opens org.example.ksiegarnia to javafx.fxml;
    exports org.example.ksiegarnia;
}