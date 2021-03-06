package com.example.aerolinea1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


    @Entity
    @Table(name = "pasajero")
    public class Pasajero {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "ID")
        private int id;

        @Column(name = "DSNOMBRE", length = 50)
        private String nombre;

        @Column(name = "DSDOCUMENTO")
        private String documento;
        @Column(name = "DSAPELLIDO")
        private String apellido;
        @Column(name = "DSTELEFONO")
        private int telefono;
        @Column(name = "DSEMAIL")
        private String email;
        @Column(name = "DSEDAD")
        private int edad;
        @Column(name = "DSCIUDAD")
        private String ciudad;


        public Pasajero() {
        }

        public Pasajero(int id, String nombre, String documento, String apellido, int telefono, String email) {
            this.id = id;
            this.nombre = nombre;
            this.documento = documento;
            this.apellido = apellido;
            this.telefono = telefono;
            this.email = email;
            this.edad = edad;

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

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }



        @Override
        public String toString() {
            return "Pasajeros{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", documento='" + documento + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", telefono=" + telefono +
                    ", email='" + email + '\'' +
                    ", edad=" + edad +
                    ", ciudad='" + ciudad + '\'' +

                    '}';
        }
    }

