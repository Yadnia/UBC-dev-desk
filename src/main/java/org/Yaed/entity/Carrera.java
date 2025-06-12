package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "sede")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "modalidad")
    private Modalidad modalidad;

    public Carrera() {
    }

    public Carrera(String nombre, Sede sede, Modalidad modalidad) {
        this.nombre = nombre;
        this.sede = sede;
        this.modalidad = modalidad;
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

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sede=" + sede +
                ", modalidad=" + modalidad +
                '}';
    }
}
