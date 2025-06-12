package org.Yaed.entity;

import jakarta.persistence.*;

@Entity
public class Beca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipos_Becas tipo;

    @ManyToOne
    @JoinColumn(name = "id_modalidad")
    private Modalidad modalidad;


    @ManyToOne
    @JoinColumn(name = "id_monto")
    private BecaMontoModalidad monto;

    public Beca() {
    }

    public Beca(String nombre, String descripcion, Tipos_Becas tipo, Modalidad modalidad, BecaMontoModalidad monto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modalidad = modalidad;
        this.monto = monto;
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

    public Tipos_Becas getTipo() {
        return tipo;
    }

    public void setTipo(Tipos_Becas tipo) {
        this.tipo = tipo;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public BecaMontoModalidad getMonto() {
        return monto;
    }

    public void setMonto(BecaMontoModalidad monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Beca{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +

                ", tipo=" + tipo +
                ", modalidad=" + modalidad +
                ", monto=" + monto +
                '}';
    }
}
