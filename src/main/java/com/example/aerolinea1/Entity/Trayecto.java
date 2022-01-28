package com.example.aerolinea1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
@Entity
    @Table(name = "trayectos")
    public class Trayecto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
    @Id
        @Column(name = "ID")
        private Integer codigo;
        @Column(name = "DSORIGEN")
        private String origen;
        @Column(name = "DSDESTINO")
        private String destino;
        @Column(name = "REQUIEREVISA")
        private Boolean requiereVisa;

    public Trayecto() {
    }

    public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getOrigen() {
            return origen;
        }

        public void setOrigen(String origen) {
            this.origen = origen;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public Boolean getRequiereVisa() {
            return requiereVisa;
        }

        public void setRequiereVisa(Boolean requiereVisa) {
            this.requiereVisa = requiereVisa;
        }}
