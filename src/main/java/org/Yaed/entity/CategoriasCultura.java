package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CategoriasCultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<GrupoCultura> grupos;

    public CategoriasCultura() {
    }

    public CategoriasCultura(String nombre, List<GrupoCultura> grupos) {
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<GrupoCultura> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoCultura> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "CategoriasCultura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", grupos=" + grupos +
                '}';
    }

}
