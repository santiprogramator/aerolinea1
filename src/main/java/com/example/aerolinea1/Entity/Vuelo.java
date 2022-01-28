package com.example.aerolinea1.Entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int cantidadPasajeros;
    private double duracionVuelo;
    public static final double SILLASAVION =25;
    private String horaPartida;
    private int cantidadMillas;

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public static double getSILLASAVION() {
        return SILLASAVION;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public int getCantidadMillas() {
        return cantidadMillas;
    }

    public void setCantidadMillas(int cantidadMillas) {
        this.cantidadMillas = cantidadMillas;
    }

    public Vuelo() {
    }



}
