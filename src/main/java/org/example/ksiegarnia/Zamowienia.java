package org.example.ksiegarnia;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "zamowienia")
public class Zamowienia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_zamowienia")
    private int id_zamowienia;

    @ManyToOne
    @JoinColumn(name = "ID_klienta", nullable = false)
    private Klient klient;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "ID_adresu", nullable = false)
    private Adres adres;

    // Gettery i settery
    public int getId_zamowienia() {
        return id_zamowienia;
    }

    public void setId_zamowienia(int id_zamowienia) {
        this.id_zamowienia = id_zamowienia;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}

