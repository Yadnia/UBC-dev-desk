package org.Yaed.entity;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.List;

@Entity
public class EstadoEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "estado")
    private List<Estudiante> estudiantes ;

    public EstadoEstudiante() {
    }

    public EstadoEstudiante(String nombre) {
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
        return "EstadoEstudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
