package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ActividadCultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_tipoActividad")
    private TipoActividadCultura tipoActividadCultura;

    @OneToMany(mappedBy = "actividad")
    private List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas;

    public ActividadCultura() {
    }

    public ActividadCultura(String nombre, String descripcion, TipoActividadCultura tipoActividadCultura, List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoActividadCultura = tipoActividadCultura;
        this.actividadesEstudiantesCulturas = actividadesEstudiantesCulturas;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoActividadCultura getTipoActividadCultura() {
        return tipoActividadCultura;
    }

    public void setTipoActividadCultura(TipoActividadCultura tipoActividadCultura) {
        this.tipoActividadCultura = tipoActividadCultura;
    }

    public List<ActividadesEstudiantesCultura> getActividadesEstudiantesCulturas() {
        return actividadesEstudiantesCulturas;
    }

    public void setActividadesEstudiantesCulturas(List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas) {
        this.actividadesEstudiantesCulturas = actividadesEstudiantesCulturas;
    }

    @Override
    public String toString() {
        return "ActividadCultura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoActividadCultura=" + tipoActividadCultura +
                ", actividadesEstudiantesCulturas=" + actividadesEstudiantesCulturas +
                '}';
    }
}
