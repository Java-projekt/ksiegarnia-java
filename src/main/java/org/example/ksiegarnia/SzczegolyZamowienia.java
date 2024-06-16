package org.example.ksiegarnia;

import javax.persistence.*;

@Entity
@Table(name = "szczegoly_zamowienia")
public class SzczegolyZamowienia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_szczegolu")
    private int id_szczegolu;

    @ManyToOne
    @JoinColumn(name = "ID_zamowienia", nullable = false)
    private Zamowienia zamowienie;

    @ManyToOne
    @JoinColumn(name = "ID_ksiazki", nullable = false)
    private Ksiazka ksiazka;

    // Gettery i settery
    public int getId_szczegolu() {
        return id_szczegolu;
    }

    public void setId_szczegolu(int id_szczegolu) {
        this.id_szczegolu = id_szczegolu;
    }

    public Zamowienia getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienia zamowienie) {
        this.zamowienie = zamowienie;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }
}
