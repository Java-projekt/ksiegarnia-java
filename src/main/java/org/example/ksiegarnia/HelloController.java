package org.example.ksiegarnia;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private Label welcomeText;
    @FXML
    private Label lbZaloguj;
    @FXML
    private Button btnZaloguj;
    @FXML
    private TextField tfHaslo;
    @FXML
    private TextField tfLogin;
    @FXML
    private Label lbLogin;
    @FXML
    private Label lbHaslo;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}