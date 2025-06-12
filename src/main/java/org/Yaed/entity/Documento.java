package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String Nombre;

    @OneToMany(mappedBy = "documento")
    private List<DocumentosEstudiantes> documentosEstudiantes;

    public Documento() {
    }

    public Documento(String nombre, List<DocumentosEstudiantes> documentosEstudiantes) {
        Nombre = nombre;
        this.documentosEstudiantes = documentosEstudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<DocumentosEstudiantes> getDocumentosEstudiantes() {
        return documentosEstudiantes;
    }

    public void setDocumentosEstudiantes(List<DocumentosEstudiantes> documentosEstudiantes) {
        this.documentosEstudiantes = documentosEstudiantes;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", documentosEstudiantes=" + documentosEstudiantes +
                '}';
    }

}
