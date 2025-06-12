package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoLlamadoAtencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipoLlamadoAtencion")
    private List<LlamadoAtencion> llamadoAtencion;

    public TipoLlamadoAtencion() {
    }

    public TipoLlamadoAtencion(String nombre, List<LlamadoAtencion> llamadoAtencion) {
        this.nombre = nombre;
        this.llamadoAtencion = llamadoAtencion;
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

    public List<LlamadoAtencion> getLlamadoAtencion() {
        return llamadoAtencion;
    }

    public void setLlamadoAtencion(List<LlamadoAtencion> llamadoAtencion) {
        this.llamadoAtencion = llamadoAtencion;
    }

    @Override
    public String toString() {
        return "TipoLlamadoAtencion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", llamadoAtencion=" + llamadoAtencion +
                '}';
    }
}
