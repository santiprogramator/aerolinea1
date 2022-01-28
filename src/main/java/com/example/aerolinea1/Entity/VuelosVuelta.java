package com.example.aerolinea1.Entity;

import javax.persistence.*;
@Entity
@Table(name = "vueltas")
public class VuelosVuelta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "DSFECHAIDAS")
    private String Ida;
    @Column(name = "DSFECHAVUELTA")
    private String fechaVuelta;

    public VuelosVuelta(int id, String ida, String fechaVuelta) {
        this.id = id;
        Ida = ida;
        this.fechaVuelta = fechaVuelta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIda() {
        return Ida;
    }

    public void setIda(String ida) {
        Ida = ida;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    @Override
    public String toString() {
        return "VuelosVuelta{" +
                "id=" + id +
                ", Ida='" + Ida + '\'' +
                ", fechaVuelta='" + fechaVuelta + '\'' +
                '}';
    }
}
