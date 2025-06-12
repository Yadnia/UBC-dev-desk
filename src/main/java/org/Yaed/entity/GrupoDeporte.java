package org.Yaed.entity;

import jakarta.persistence.*;
import org.checkerframework.checker.signature.qual.CanonicalNameOrEmpty;

import java.util.List;

@Entity
public class GrupoDeporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaDeportes categoria;

    @OneToMany(mappedBy = "grupoDeporte" )
    private List<GruposDeportesEstudiantes> gruposDeportes;

    public GrupoDeporte() {
    }

    public GrupoDeporte(String nombre, CategoriaDeportes categoria, List<GruposDeportesEstudiantes> gruposDeportes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.gruposDeportes = gruposDeportes;
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

    public CategoriaDeportes getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeportes categoria) {
        this.categoria = categoria;
    }

    public List<GruposDeportesEstudiantes> getGruposDeportes() {
        return gruposDeportes;
    }

    public void setGruposDeportes(List<GruposDeportesEstudiantes> gruposDeportes) {
        this.gruposDeportes = gruposDeportes;
    }

    @Override
    public String toString() {
        return "GrupoDeporte{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", gruposDeportes=" + gruposDeportes +
                '}';
    }
}
