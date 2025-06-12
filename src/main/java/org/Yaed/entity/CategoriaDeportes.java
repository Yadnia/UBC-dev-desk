package org.Yaed.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class CategoriaDeportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<GrupoDeporte> grupoDeportes;

    public CategoriaDeportes() {
    }

    public CategoriaDeportes(String nombre, List<GrupoDeporte> grupoDeportes) {
        this.nombre = nombre;
        this.grupoDeportes = grupoDeportes;
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

    public List<GrupoDeporte> getGrupoDeportes() {
        return grupoDeportes;
    }

    public void setGrupoDeportes(List<GrupoDeporte> grupoDeportes) {
        this.grupoDeportes = grupoDeportes;
    }

    @Override
    public String toString() {
        return "CategoriaDeportes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", grupoDeportes=" + grupoDeportes +
                '}';
    }
}
