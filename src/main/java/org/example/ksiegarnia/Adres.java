package org.example.ksiegarnia;

import javax.persistence.*;

@Entity
@Table(name = "adresy")
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_adresu")
    private int id_adresu;

    @Column(name = "miejscowosc", nullable = false, length = 100)
    private String miejscowosc;

    @Column(name = "kod_pocztowy", nullable = false, length = 10)
    private String kod_pocztowy;

    @Column(name = "numer_budynku", nullable = false, length = 10)
    private String numer_budynku;

    // Gettery i settery
    public int getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(int id_adresu) {
        this.id_adresu = id_adresu;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getNumer_budynku() {
        return numer_budynku;
    }

    public void setNumer_budynku(String numer_budynku) {
        this.numer_budynku = numer_budynku;
    }
}

