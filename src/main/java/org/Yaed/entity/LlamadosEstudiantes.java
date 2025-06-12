package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class LlamadosEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="Num registro")
    private int id;

    @ManyToOne
    @JoinColumn (name = "id llamado")
    private LlamadoAtencion llamado;

    @ManyToOne
    @JoinColumn(name = "id estudiante")
    private Estudiante estudiante;

    public LlamadosEstudiantes() {
    }

    public LlamadosEstudiantes(LlamadoAtencion llamado, Estudiante estudiante) {
        this.llamado = llamado;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LlamadoAtencion getLlamado() {
        return llamado;
    }

    public void setLlamado(LlamadoAtencion llamado) {
        this.llamado = llamado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "LlamadosEstudiantes{" +
                "id=" + id +
                ", llamado=" + llamado +
                ", estudiante=" + estudiante +
                '}';
    }
}
