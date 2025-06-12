package org.Yaed.entity;

import jakarta.persistence.*;

import java.awt.geom.Area;
import java.util.List;

@Entity
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "sede")
    private List<Areas> areas;

    @OneToMany(mappedBy = "sede")
    private List<Estudiante> estudiantes;

    @OneToMany(mappedBy = "sede")
    private List<Carrera> carreras;

    public Sede() {
    }

    public Sede(String nombre, List<Areas> areas, List<Estudiante> estudiantes, List<Carrera> carreras) {
        this.nombre = nombre;
        this.areas = areas;
        this.estudiantes = estudiantes;
        this.carreras = carreras;
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

    public List<Areas> getAreas() {
        return areas;
    }

    public void setAreas(List<Areas> areas) {
        this.areas = areas;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", areas=" + areas +
                ", estudiantes=" + estudiantes +
                ", carreras=" + carreras +
                '}';
    }
}
