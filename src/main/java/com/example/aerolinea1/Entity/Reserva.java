package com.example.aerolinea1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, unique = true)

    private int id;

    @Column(name = "NOMBRE")

    private String nombre;

    private String apellido;
    @Column(name = "DSPASAPORTE")
    private String pasaporte;
    @Column(name = "DSSILLA")
    private int sillaAsignada;
    @Column(name = "DSDIRECTO")
private boolean directo;
    @Column(name = "DSESCALAS")
private boolean escalas;


    public Reserva() {
    }

    public Reserva(int id, String nombre, String apellido, String pasaporte, int sillaAsignada, boolean directo, boolean escalas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.sillaAsignada = sillaAsignada;
        this.directo = directo;
        this.escalas = escalas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public int getSillaAsignada() {
        return sillaAsignada;
    }

    public void setSillaAsignada(int sillaAsignada) {
        this.sillaAsignada = sillaAsignada;
    }

    public boolean isDirecto() {
        return directo;
    }

    public void setDirecto(boolean directo) {
        this.directo = directo;
    }

    public boolean isEscalas() {
        return escalas;
    }

    public void setEscalas(boolean escalas) {
        this.escalas = escalas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pasaporte='" + pasaporte + '\'' +
                ", sillaAsignada=" + sillaAsignada +
                ", directo=" + directo +
                ", escalas=" + escalas +
                '}';
    }
}
