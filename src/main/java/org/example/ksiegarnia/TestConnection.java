package org.example.ksiegarnia;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestConnection {
    public static void main(String[] args) {
        // Otwórz sesję z Hibernate
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Rozpocznij transakcję
        Transaction transaction = session.beginTransaction();

        try {
            // Testowe zapytanie SQL
            String sql = "SELECT imie from klienci WHERE imie='Jan'";
            String result = (String) session.createNativeQuery(sql).getSingleResult();
            System.out.println("Połączenie z bazą danych działa, wynik zapytania: " + result);

            // Zakończ transakcję
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Zamknij sesję
            session.close();
        }

        // Zamknij SessionFactory
        HibernateUtil.shutdown();
    }
}

