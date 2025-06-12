package org.Yaed.entity;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;

@Entity
public class GruposCulturaEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private GrupoCultura grupoCultura;

    public GruposCulturaEstudiantes() {
    }

    public GruposCulturaEstudiantes(Estudiante estudiante, GrupoCultura grupoCultura) {
        this.estudiante = estudiante;
        this.grupoCultura = grupoCultura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public GrupoCultura getGrupoCultura() {
        return grupoCultura;
    }

    public void setGrupoCultura(GrupoCultura grupoCultura) {
        this.grupoCultura = grupoCultura;
    }

    @Override
    public String toString() {
        return "GruposCulturaEstudiantes{" +
                "id=" + id +
                ", estudiante=" + estudiante +
                ", grupoCultura=" + grupoCultura +
                '}';
    }
}
