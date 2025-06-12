package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class HabitacionesEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num-registro")
    private int numRegistro;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;

    public HabitacionesEstudiantes() {
    }

    public HabitacionesEstudiantes(Estudiante estudiante, Habitacion habitacion) {
        this.estudiante = estudiante;
        this.habitacion = habitacion;
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

    @Override
    public String toString() {
        return "HabitacionesEstudiantes{" +
                "numRegistro=" + numRegistro +
                ", estudiante=" + estudiante +
                ", habitacion=" + habitacion +
                '}';
    }
}
