package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class ActividadesEstudiantesCultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private ActividadCultura actividad;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    public ActividadesEstudiantesCultura() {
    }

    public ActividadesEstudiantesCultura(String fecha, ActividadCultura actividad, Estudiante estudiante) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ActividadCultura getActividad() {
        return actividad;
    }

    public void setActividad(ActividadCultura actividad) {
        this.actividad = actividad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "ActividadesEstudiantesCultura{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", actividad=" + actividad +
                ", estudiante=" + estudiante +
                '}';
    }

}
