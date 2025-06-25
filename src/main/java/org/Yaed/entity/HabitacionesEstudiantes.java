package org.Yaed.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class HabitacionesEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num-registro")
    private int numRegistro;

    @Column (name = "fecha")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;

    public HabitacionesEstudiantes() {
    }

    public HabitacionesEstudiantes(Estudiante estudiante, Habitacion habitacion, LocalDate fecha) {
        this.estudiante = estudiante;
        this.habitacion = habitacion;
        this.fecha = fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "HabitacionesEstudiantes{" +
                "numRegistro=" + numRegistro +
                ", fecha=" + fecha +
                ", estudiante=" + estudiante +
                ", habitacion=" + habitacion +
                '}';
    }
}
