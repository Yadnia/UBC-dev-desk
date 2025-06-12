package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class GruposDeportesEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "grupo_id")
    private GrupoDeporte grupoDeporte;

    public GruposDeportesEstudiantes() {
    }

    public GruposDeportesEstudiantes(Estudiante estudiante, GrupoDeporte grupoDeporte) {
        this.estudiante = estudiante;
        this.grupoDeporte = grupoDeporte;
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

    public GrupoDeporte getGrupoDeporte() {
        return grupoDeporte;
    }

    public void setGrupoDeporte(GrupoDeporte grupoDeporte) {
        this.grupoDeporte = grupoDeporte;
    }

    @Override
    public String toString() {
        return "GruposDeportesEstudiantes{" +
                "id=" + id +
                ", estudiante=" + estudiante +
                ", grupoDeporte=" + grupoDeporte +
                '}';
    }
}
