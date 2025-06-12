package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoActividadDeporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy ="tipo" )
    private List<ActividadDeporte> actividadDeportes;

    public TipoActividadDeporte() {
    }

    public TipoActividadDeporte(String nombre, List<ActividadDeporte> actividadDeportes) {
        this.nombre = nombre;
        this.actividadDeportes = actividadDeportes;
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

    public List<ActividadDeporte> getActividadDeportes() {
        return actividadDeportes;
    }

    public void setActividadDeportes(List<ActividadDeporte> actividadDeportes) {
        this.actividadDeportes = actividadDeportes;
    }

    @Override
    public String toString() {
        return "TipoActividadDeporte{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", actividadDeportes=" + actividadDeportes +
                '}';
    }
}
