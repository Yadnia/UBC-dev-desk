package org.Yaed.entity;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.N;

import java.util.List;

@Entity
public class CategoriaActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_actividad")
    private String nombre_actividad;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<ActividadPsicologia> actividades;

    public CategoriaActividad() {
    }

    public CategoriaActividad(String nombre_actividad, String descripcion, List<ActividadPsicologia> actividades) {
        this.nombre_actividad = nombre_actividad;
        this.descripcion = descripcion;
        this.actividades = actividades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ActividadPsicologia> getActividades() {
        return actividades;
    }

    public void setActividades(List<ActividadPsicologia> actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "CategoriaActividad{" +
                "id=" + id +
                ", nombre_actividad='" + nombre_actividad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", actividades=" + actividades +
                '}';
    }
}
