package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Modalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "modalidad")
    private List<Beca> becas;
    @OneToMany(mappedBy = "modalidad")
    private List<Carrera> carreras;
    @OneToMany(mappedBy = "modalidad")
    private List<BecaMontoModalidad> montos;

    public Modalidad() {
    }

    public Modalidad(String nombre, String descripcion, List<Beca> becas, List<Carrera> carreras, List<BecaMontoModalidad> montos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.becas = becas;
        this.carreras = carreras;
        this.montos = montos;
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

    public List<Beca> getBecas() {
        return becas;
    }

    public void setBecas(List<Beca> becas) {
        this.becas = becas;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<BecaMontoModalidad> getMontos() {
        return montos;
    }

    public void setMontos(List<BecaMontoModalidad> montos) {
        this.montos = montos;
    }

    @Override
    public String toString() {
        return "Modalidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", becas=" + becas +
                ", carreras=" + carreras +
                ", montos=" + montos +
                '}';
    }
}
