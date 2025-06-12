package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class BecaMontoModalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_modalidad")
    private Modalidad modalidad;

    public BecaMontoModalidad() {
    }

    public BecaMontoModalidad(String nombre, String descripcion, Modalidad modalidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "BecaMontoModalidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", modalidad=" + modalidad +
                '}';
    }
}
