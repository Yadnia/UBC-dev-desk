package org.Yaed.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoEstudiante;


    //cultura, psico, dep, etc
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipoEstudiante")
    private List<Estudiante> estudiantes;

    public TipoEstudiante() {
    }

    public TipoEstudiante(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoEstudiante() {
        return idTipoEstudiante;
    }

    public void setIdTipoEstudiante(int idTipoEstudiante) {
        this.idTipoEstudiante = idTipoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoEstudiante{" +
                "idTipoEstudiante=" + idTipoEstudiante +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
