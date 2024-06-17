/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.example.ksiegarnia;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.query.Query;


/**
 * FXML Controller class
 *
 * @author chmur
 */
public class panelAdministratoraController implements Initializable {


    @FXML
    private Label lblPanelUzytkownika;
    @FXML
    private TableView<Ksiazka> tableView;
    @FXML
    private TableColumn<?, ?> tabColumnId_ksiazki;
    @FXML
    private TableColumn<?, ?> tabColumnTytul;
    @FXML
    private TableColumn<?, ?> tabColumnAutor;
    @FXML
    private TableColumn<?, ?> tabColumnWydawnictwo;
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
        // Inicjalizacja kolumn TableView
        tabColumnId_ksiazki.setCellValueFactory(new PropertyValueFactory<>("ID_ksiazki"));
        tabColumnTytul.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        tabColumnAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        tabColumnWydawnictwo.setCellValueFactory(new PropertyValueFactory<>("wydawnictwo"));
        tabColumnCena.setCellValueFactory(new PropertyValueFactory<>("cena"));

        // Pobranie danych z bazy i ustawienie w TableView
        ObservableList<Ksiazka> data = getKsiazkiData();
        tableView.setItems(data);
    }

    private ObservableList<Ksiazka> getKsiazkiData() {
        ObservableList<Ksiazka> data = FXCollections.observableArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            Query<Ksiazka> query = session.createQuery("from Ksiazka", Ksiazka.class);
            data.addAll(query.list());
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }

        return data;
    }

    @FXML
    private void onBtnDodajClick(ActionEvent event) {
    }

    @FXML
    private void onBtnSzukajClick(ActionEvent event) {
    }

    @FXML
    private void onBtnWylogujClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Nie można załadować panelu!");
        }
    }
}
