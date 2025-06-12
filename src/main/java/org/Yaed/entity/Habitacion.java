package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Habitacion {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "tipo-id")
    private TipoHabitacion tipo;

    @ManyToOne
    @JoinColumn (name = "casa-id")
    private Casa casa;

    @OneToMany (mappedBy = "habitacion")
    private List<HabitacionesEstudiantes> habitaciones;

    public Habitacion() {
    }

    public Habitacion(String nombre, TipoHabitacion tipo, Casa casa, List<HabitacionesEstudiantes> habitaciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.casa = casa;
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", casa=" + casa +
                ", habitaciones=" + habitaciones +
                '}';
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

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public List<HabitacionesEstudiantes> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<HabitacionesEstudiantes> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
