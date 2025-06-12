package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoActividadCultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipoActividadCultura")
    private List<ActividadCultura> actividadCulturas;

    public TipoActividadCultura() {
    }

    public TipoActividadCultura(String nombre, List<ActividadCultura> actividadCulturas) {
        this.nombre = nombre;
        this.actividadCulturas = actividadCulturas;
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

    public List<ActividadCultura> getActividadCulturas() {
        return actividadCulturas;
    }

    public void setActividadCulturas(List<ActividadCultura> actividadCulturas) {
        this.actividadCulturas = actividadCulturas;
    }

    @Override
    public String toString() {
        return "TipoActividadCultura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", actividadCulturas=" + actividadCulturas +
                '}';
    }
}
