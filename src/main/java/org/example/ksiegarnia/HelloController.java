package org.example.ksiegarnia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

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
    private Label lbError;

    @FXML
    protected void onWelcomeButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String login = tfLogin.getText();
        String haslo = tfHaslo.getText();


        if (checkLogin(login, haslo)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("admin.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                System.out.println("Nie można załadować panelu!");
            }
        }
        else {
            lbError.setText("Nieprawidłowy login lub hasło!");
        }
    }

    private boolean checkLogin(String login, String haslo) {
        // Otwórz sesję z Hibernate
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Rozpocznij transakcję
        Transaction transaction = session.beginTransaction();

        // Zapytanie SQL z parametrami loginu i hasła
        try {
            String sql = "SELECT COUNT(*) FROM klienci WHERE login = :login AND haslo = :haslo";
            Long count = (Long) session.createNativeQuery(sql)
                    .setParameter("login", login)
                    .setParameter("haslo", haslo)
                    .getSingleResult();

            // Zakończ transakcję
            transaction.commit();

            // Jeśli wynik jest większy niż 0, to login i hasło są poprawne
            return count > 0;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            // Zamknij sesję
            session.close();
        }
    }
}