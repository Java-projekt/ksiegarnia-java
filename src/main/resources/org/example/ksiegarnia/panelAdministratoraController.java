/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.example.ksiegarnia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author chmur
 */
public class panelAdministratoraController implements Initializable {


    @FXML
    private Label lblPanelUzytkownika;
    @FXML
    private TableColumn<?, ?> tabColumnTytul;
    @FXML
    private TableColumn<?, ?> tabColumnAutor;
    @FXML
    private TableColumn<?, ?> tabColumnCena;
    @FXML
    private Label lbTytul;
    @FXML
    private Label lblAutor;
    @FXML
    private Label lblCena;
    @FXML
    private Label lbllosc;
    @FXML
    private Label lblDodajKsiazke;
    @FXML
    private TextField tfTytul;
    @FXML
    private TextField tfAutor;
    @FXML
    private TextField tfCena;
    @FXML
    private TextField tfIlosc;
    @FXML
    private Button btnDodajKsiazke;
    @FXML
    private Label lblWyszukaj;
    @FXML
    private TextField tfSzukaj;
    @FXML
    private Button btnSzukaj;
    @FXML
    private Button btnWyloguj;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void onBtnDodajClick(ActionEvent event) {
    }

    @FXML
    private void onBtnSzukajClick(ActionEvent event) {
    }

    @FXML
    private void onBtnWylogujClick(ActionEvent event) {
    }

}
