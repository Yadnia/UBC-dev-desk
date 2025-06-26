package org.Yaed.entity;

import jakarta.persistence.*;

@Entity (name = "PastActs")
public class PastActs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "estudiante_carnet", referencedColumnName = "carnet")
    private Estudiante estudiante;

    @ManyToOne(optional = false)
    @JoinColumn(name = "actividad_id", referencedColumnName = "id")
    private ActividadInternado actividad;

    // Constructor vacío
    public PastActs() {}

    public PastActs(Estudiante estudiante, ActividadInternado actividad) {
        this.estudiante = estudiante;
        this.actividad = actividad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ActividadInternado getActividad() {
        return actividad;
    }

    public void setActividad(ActividadInternado actividad) {
        this.actividad = actividad;
    }
}
