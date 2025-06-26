package org.Yaed.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "estudiantes")
public class Estudiante {
    @Id
    private String carnet;
    @Column(name = "cedula")
    private String cedula;
    @Column (name = "nombres")
    private String nombre;
    @Column (name = "apellidos")
    private String apellido;
    @Column (name = "celular")
    private String telefono;
    @Column(name = "edad")
    private Integer edad;

    @ManyToOne
    @JoinColumn (name = "etnia-id")
    private Etnia etnia;

    @ManyToOne
    @JoinColumn (name = "carrera-id")
    private Carrera carrera;

    @Column (name = "foto")
    private String fotoURL;

    @ManyToOne
    @JoinColumn (name = "sede-id")
    private Sede sede;

    @Column (name = "sexo")
    private char sexo;

    @ManyToOne
    @JoinColumn (name = "estado-id")
    private EstadoEstudiante estado;

    @ManyToOne
    @JoinColumn (name = "tipo-id")
    private TipoEstudiante tipoEstudiante;

    @ManyToOne
    @JoinColumn (name = "beca-id")
    private Beca becaid;

    @OneToMany(mappedBy = "estudiante")
    private List<HabitacionesEstudiantes> habitaciones;

    @OneToMany(mappedBy = "estudiante")
    private List<LlamadosEstudiantes> llamadosEstudiantes;

    @OneToMany(mappedBy = "estudiante")
    private List<ActividadesEstudiantesPsicologia> actividadesEstudiantePsicologias;

    @OneToMany(mappedBy = "estudiante")
    private List<GruposCulturaEstudiantes> gruposCulturaEstudiantes;


    @OneToMany(mappedBy = "estudiante")
    private List<GruposDeportesEstudiantes> gruposDeportesEstudiantes;

    @OneToMany(mappedBy = "estudiante")
    private List<DocumentosEstudiantes> documentosEstudiantes;

    @OneToMany(mappedBy = "estudiante")
    private List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas;

    @OneToMany(mappedBy = "estudiante")
    private List<ActividadesDeportesEstudiantes> actividadesDeportesEstudiantes;

    public Estudiante() {
    }

    public Estudiante(String carnet, String cedula, String nombre, String apellido, String telefono, Integer edad,Etnia etnia, Carrera carrera, String fotoURL, Sede sede, char sexo, EstadoEstudiante estado, TipoEstudiante tipoEstudiante, Beca becaid, List<HabitacionesEstudiantes> habitaciones, List<LlamadosEstudiantes> llamadosEstudiantes, List<ActividadesEstudiantesPsicologia> actividadesEstudiantePsicologias, List<GruposCulturaEstudiantes> gruposCulturaEstudiantes, List<GruposDeportesEstudiantes> gruposDeportesEstudiantes, List<DocumentosEstudiantes> documentosEstudiantes, List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas, List<ActividadesDeportesEstudiantes> actividadesDeportesEstudiantesCulturas) {
        this.carnet = carnet;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.etnia = etnia;
        this.carrera = carrera;
        this.fotoURL = fotoURL;
        this.sede = sede;
        this.sexo = sexo;
        this.estado = estado;
        this.tipoEstudiante = tipoEstudiante;
        this.becaid = becaid;
        this.habitaciones = habitaciones;
        this.llamadosEstudiantes = llamadosEstudiantes;
        this.actividadesEstudiantePsicologias = actividadesEstudiantePsicologias;
        this.gruposCulturaEstudiantes = gruposCulturaEstudiantes;
        this.gruposDeportesEstudiantes = gruposDeportesEstudiantes;
        this.documentosEstudiantes = documentosEstudiantes;
        this.actividadesEstudiantesCulturas = actividadesEstudiantesCulturas;
        this.actividadesDeportesEstudiantes = actividadesDeportesEstudiantesCulturas;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public EstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(EstadoEstudiante estado) {
        this.estado = estado;
    }

    public TipoEstudiante getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(TipoEstudiante tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    public Beca getBecaid() {
        return becaid;
    }

    public void setBecaid(Beca becaid) {
        this.becaid = becaid;
    }

    public List<HabitacionesEstudiantes> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<HabitacionesEstudiantes> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<LlamadosEstudiantes> getLlamadosEstudiantes() {
        return llamadosEstudiantes;
    }

    public void setLlamadosEstudiantes(List<LlamadosEstudiantes> llamadosEstudiantes) {
        this.llamadosEstudiantes = llamadosEstudiantes;
    }

    public List<ActividadesEstudiantesPsicologia> getActividadesEstudiantePsicologias() {
        return actividadesEstudiantePsicologias;
    }

    public void setActividadesEstudiantePsicologias(List<ActividadesEstudiantesPsicologia> actividadesEstudiantePsicologias) {
        this.actividadesEstudiantePsicologias = actividadesEstudiantePsicologias;
    }

    public List<GruposCulturaEstudiantes> getGruposCulturaEstudiantes() {
        return gruposCulturaEstudiantes;
    }

    public void setGruposCulturaEstudiantes(List<GruposCulturaEstudiantes> gruposCulturaEstudiantes) {
        this.gruposCulturaEstudiantes = gruposCulturaEstudiantes;
    }

    public List<GruposDeportesEstudiantes> getGruposDeportesEstudiantes() {
        return gruposDeportesEstudiantes;
    }

    public void setGruposDeportesEstudiantes(List<GruposDeportesEstudiantes> gruposDeportesEstudiantes) {
        this.gruposDeportesEstudiantes = gruposDeportesEstudiantes;
    }

    public List<DocumentosEstudiantes> getDocumentosEstudiantes() {
        return documentosEstudiantes;
    }

    public void setDocumentosEstudiantes(List<DocumentosEstudiantes> documentosEstudiantes) {
        this.documentosEstudiantes = documentosEstudiantes;
    }

    public List<ActividadesEstudiantesCultura> getActividadesEstudiantesCulturas() {
        return actividadesEstudiantesCulturas;
    }

    public void setActividadesEstudiantesCulturas(List<ActividadesEstudiantesCultura> actividadesEstudiantesCulturas) {
        this.actividadesEstudiantesCulturas = actividadesEstudiantesCulturas;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet='" + carnet + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", etnia=" + etnia +
                ", carrera=" + carrera +
                ", fotoURL='" + fotoURL + '\'' +
                ", sede=" + sede +
                ", sexo=" + sexo +
                ", estado=" + estado +
                ", tipoEstudiante=" + tipoEstudiante +
                ", becaid=" + becaid +
                ", habitaciones=" + habitaciones +
                ", llamadosEstudiantes=" + llamadosEstudiantes +
                ", actividadesEstudiantePsicologias=" + actividadesEstudiantePsicologias +
                ", gruposCulturaEstudiantes=" + gruposCulturaEstudiantes +
                ", gruposDeportesEstudiantes=" + gruposDeportesEstudiantes +
                ", documentosEstudiantes=" + documentosEstudiantes +
                ", actividadesEstudiantesCulturas=" + actividadesEstudiantesCulturas +
                ", actividadesEstudiantesDeportes" + actividadesDeportesEstudiantes +
                '}';
    }
}