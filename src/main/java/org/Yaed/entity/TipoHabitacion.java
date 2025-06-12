package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoHabitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "capacidad")
    private int capacidad;

    @OneToMany(mappedBy = "tipo")
    private List<Habitacion> habitaciones;

    public TipoHabitacion() {
    }

    public TipoHabitacion(String nombre, int capacidad, List<Habitacion> habitaciones) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.habitaciones = habitaciones;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", habitaciones=" + habitaciones +
                '}';
    }
}
