package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class Etnia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    public Etnia() {
    }

    public Etnia(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Etnia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
