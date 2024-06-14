package org.example.ksiegarnia;

import javax.persistence.*;

@Entity
@Table(name = "klienci")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_klienta")
    private int id;

    @Column(name = "imie", nullable = false, length = 100)
    private String imie;

    @Column(name = "nazwisko", nullable = false, length = 100)
    private String nazwisko;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "numer_tel", nullable = false, length = 15)
    private String numerTel;

    @Column(name = "login", nullable = false, length = 50)
    private String login;

    @Column(name = "haslo", nullable = false, length = 50)
    private String haslo;

    // Gettery i settery
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumerTel() {
        return numerTel;
    }

    public void setNumerTel(String numerTel) {
        this.numerTel = numerTel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
