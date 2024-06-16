package org.example.ksiegarnia;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ksiazki")
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ksiazki")
    private int id_ksiazki;

    @Column(name = "tytul", nullable = false, length = 255)
    private String tytul;

    @Column(name = "autor", nullable = false, length = 255)
    private String autor;

    @Column(name = "wydawnictwo", nullable = false, length = 255)
    private String wydawnictwo;

    @Column(name = "cena", nullable = false, precision = 10, scale = 2)
    private BigDecimal cena;

    // Gettery i settery
    public int getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(int id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}
