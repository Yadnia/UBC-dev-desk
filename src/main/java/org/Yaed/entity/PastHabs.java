package org.Yaed.entity;

import jakarta.persistence.*;

@Entity (name = "PastHabs")
public class PastHabs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num-registro")
    private int numRegistro;

    @Column (name = "Semestre")
    private String fecha;

    @Column (name = "anio")
    private String anio;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;

    public PastHabs() {
    }

    public PastHabs(Estudiante estudiante, Habitacion habitacion,String anio, String semestre) {
        this.estudiante = estudiante;
        this.habitacion = habitacion;
        this.fecha = semestre;
        this.anio = anio;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "HabitacionesEstudiantes{" +
                "numRegistro=" + numRegistro +
                ", fecha=" + fecha +
                ", anio='" + anio + '\'' +
                ", estudiante=" + estudiante +
                ", habitacion=" + habitacion +
                '}';
    }
}
