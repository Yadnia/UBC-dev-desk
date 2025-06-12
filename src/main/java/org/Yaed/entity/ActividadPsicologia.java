package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class ActividadPsicologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private CategoriaActividad categoria;

    public ActividadPsicologia() {
    }

    public ActividadPsicologia(String nombre, String descripcion, CategoriaActividad categoria) {
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

    public CategoriaActividad getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaActividad categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ActividadPsicologia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
