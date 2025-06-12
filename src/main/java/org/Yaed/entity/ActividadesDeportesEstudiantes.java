package org.Yaed.entity;
import jakarta.persistence.*;

@Entity
public class ActividadesDeportesEstudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private ActividadDeporte actividad;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    public ActividadesDeportesEstudiantes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ActividadDeporte getActividad() {
        return actividad;
    }

    public void setActividad(ActividadDeporte actividad) {
        this.actividad = actividad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ActividadesDeportesEstudiantes(String fecha, ActividadDeporte actividad, Estudiante estudiante) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "ActividadesDeportesEstudiantes{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", actividad=" + actividad +
                ", estudiante=" + estudiante +
                '}';
    }
}
