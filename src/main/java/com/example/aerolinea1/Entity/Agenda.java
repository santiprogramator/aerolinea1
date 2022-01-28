package com.example.aerolinea1.Entity;


import javax.persistence.*;

@Entity
@Table(name = "agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "DSFECHAIDA")
    private String fechaIda;

    public Agenda(int id, String fechaIda) {
        this.id = id;
        this.fechaIda = fechaIda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", fechaIda='" + fechaIda + '\'' +
                '}';
    }
}
//hacer metodo para vuelo de ida(solo recibe el parametro de fecha ida)y hacer el de ida y vuelta que recibe dos parametros ida y vuelta
