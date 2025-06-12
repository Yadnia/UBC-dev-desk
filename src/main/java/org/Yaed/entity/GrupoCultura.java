package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class GrupoCultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriasCultura categoria;

    public GrupoCultura() {
    }

    public GrupoCultura(String nombre, String descripcion, CategoriasCultura categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
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

    public CategoriasCultura getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriasCultura categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "GrupoCultura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
