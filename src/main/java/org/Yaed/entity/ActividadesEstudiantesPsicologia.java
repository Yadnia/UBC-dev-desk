package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class ActividadesEstudiantesPsicologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "actividad_id")
    private ActividadPsicologia actividad;

    @ManyToOne
    @JoinColumn(name = "id_studiante")
    private Estudiante estudiante;

    @Column(name = "Descripcion")
    private String descripcion;

    public ActividadesEstudiantesPsicologia(ActividadPsicologia actividad, Estudiante estudiante, String descripcion) {
        this.actividad = actividad;
        this.estudiante = estudiante;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ActividadPsicologia getActividad() {
        return actividad;
    }

    public void setActividad(ActividadPsicologia actividad) {
        this.actividad = actividad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ActividadesEstudiantesPsicologia() {
    }

    @Override
    public String toString() {
        return "ActividadesEstudiantesPsicologia{" +
                "id=" + id +
                ", actividad=" + actividad +
                ", estudiante=" + estudiante +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
