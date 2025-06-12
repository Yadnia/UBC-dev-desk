package org.Yaed.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tipos_Becas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipo")
    private List<Beca> becas;

    public Tipos_Becas() {
    }

    public Tipos_Becas(String nombre, List<Beca> becas) {
        this.nombre = nombre;
        this.becas = becas;
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

    public List<Beca> getBecas() {
        return becas;
    }

    public void setBecas(List<Beca> becas) {
        this.becas = becas;
    }

    @Override
    public String toString() {
        return "Tipos_Becas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", becas=" + becas +
                '}';
    }
}
