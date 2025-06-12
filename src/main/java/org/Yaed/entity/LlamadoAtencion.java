package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LlamadoAtencion {
    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "URL")
    private String url;

    @Column (name = "asunto")
    private String asunto;

    @ManyToOne
    @JoinColumn(name = "tipo-id")
    private TipoLlamadoAtencion tipoLlamadoAtencion;

    @OneToMany(mappedBy = "llamado")
    private List<LlamadosEstudiantes> LlamadosEstudiantes;

    public LlamadoAtencion() {
    }

    public LlamadoAtencion(String nombre, String url, String asunto, TipoLlamadoAtencion tipoLlamadoAtencion, List<org.Yaed.entity.LlamadosEstudiantes> llamadosEstudiantes) {
        this.nombre = nombre;
        this.url = url;
        this.asunto = asunto;
        this.tipoLlamadoAtencion = tipoLlamadoAtencion;
        LlamadosEstudiantes = llamadosEstudiantes;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public TipoLlamadoAtencion getTipoLlamadoAtencion() {
        return tipoLlamadoAtencion;
    }

    public void setTipoLlamadoAtencion(TipoLlamadoAtencion tipoLlamadoAtencion) {
        this.tipoLlamadoAtencion = tipoLlamadoAtencion;
    }

    public List<org.Yaed.entity.LlamadosEstudiantes> getLlamadosEstudiantes() {
        return LlamadosEstudiantes;
    }

    public void setLlamadosEstudiantes(List<org.Yaed.entity.LlamadosEstudiantes> llamadosEstudiantes) {
        LlamadosEstudiantes = llamadosEstudiantes;
    }

    @Override
    public String toString() {
        return "LlamadoAtencion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", asunto='" + asunto + '\'' +
                ", tipoLlamadoAtencion=" + tipoLlamadoAtencion +
                ", LlamadosEstudiantes=" + LlamadosEstudiantes +
                '}';
    }

}
