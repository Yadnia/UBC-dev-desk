package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class DocumentosEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "documento_id")
    private Documento documento;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    public DocumentosEstudiantes() {
    }

    public DocumentosEstudiantes(Documento documento, Estudiante estudiante) {
        this.documento = documento;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "DocumentosEstudiantes{" +
                "id=" + id +
                ", documento=" + documento +
                ", estudiante=" + estudiante +
                '}';
    }
}
