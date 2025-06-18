package org.Yaed.controller;

import org.Yaed.entity.EstadoEstudiante;
import org.Yaed.entity.Estudiante;
import org.Yaed.entity.Etnia;
import org.Yaed.entity.TipoEstudiante;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EstudiantesController {

    //Entidad del estudiante

    public static void saveEstudiante(Estudiante estudiante) {
        IGenericService<Estudiante> estudianteService = new GenericServiceImpl<>(Estudiante.class, HibernateUtil.getSessionFactory());
        estudianteService.save(estudiante);
    }
    public static void updateEstudiante(Estudiante estudiante) {
        IGenericService<Estudiante> estudianteService = new GenericServiceImpl<>(Estudiante.class, HibernateUtil.getSessionFactory());
        estudianteService.update(estudiante);
    }
    public static void deleteEstudiante(Estudiante estudiante) {
        IGenericService<Estudiante> estudianteService = new GenericServiceImpl<>(Estudiante.class, HibernateUtil.getSessionFactory());
        estudianteService.delete(estudiante);
    }
    public static List<Estudiante> getEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        IGenericService<Estudiante> estudianteService = new GenericServiceImpl<>(Estudiante.class, HibernateUtil.getSessionFactory());
        estudiantes = estudianteService.getAll();
        return estudiantes;
    }

    //campos unicos de estudiante
    //estado del estudiante

    public static void saveEstadoEstudiante(EstadoEstudiante estadoEstudiante) {
        IGenericService<EstadoEstudiante> estadoEsService = new GenericServiceImpl<>(EstadoEstudiante.class, HibernateUtil.getSessionFactory());
        estadoEsService.save(estadoEstudiante);
    }
    public static void updateEstadoEstudiante(EstadoEstudiante estudiante) {
        IGenericService<EstadoEstudiante> estadoEsService = new GenericServiceImpl<>(EstadoEstudiante.class, HibernateUtil.getSessionFactory());
        estadoEsService.update(estudiante);
    }
    public static void deleteEstadoEstudiante(EstadoEstudiante estudiante) {
        IGenericService<EstadoEstudiante> estadoEsService = new GenericServiceImpl<>(EstadoEstudiante.class, HibernateUtil.getSessionFactory());
        estadoEsService.delete(estudiante);
    }

    public static List<EstadoEstudiante> getEstadoEstudiantes() {
        List<EstadoEstudiante> estadosEstudiantes = new ArrayList<EstadoEstudiante>();
        IGenericService<EstadoEstudiante> estadoEsService = new GenericServiceImpl<>(EstadoEstudiante.class, HibernateUtil.getSessionFactory());
        estadosEstudiantes = estadoEsService.getAll();
        return estadosEstudiantes;
    }
    //tipo de estudiante

    public static void saveTipoEstudiante(TipoEstudiante tipoEstudiante) {
        IGenericService<TipoEstudiante> tipoEsService = new GenericServiceImpl<>(TipoEstudiante.class, HibernateUtil.getSessionFactory());
        tipoEsService.save(tipoEstudiante);
    }
    public static void updateTipoEstudiante(TipoEstudiante estudiante) {
        IGenericService<TipoEstudiante> tipoEsService = new GenericServiceImpl<>(TipoEstudiante.class, HibernateUtil.getSessionFactory());
        tipoEsService.update(estudiante);
    }
    public static void deleteTipoEstudiante(TipoEstudiante estudiante) {
        IGenericService<TipoEstudiante> tipoEsService = new GenericServiceImpl<>(TipoEstudiante.class, HibernateUtil.getSessionFactory());
        tipoEsService.delete(estudiante);
    }
    public static List<TipoEstudiante> getTipoEstudiantes() {
        List<TipoEstudiante> tiposEstudiantes = new ArrayList<TipoEstudiante>();
        IGenericService<TipoEstudiante> tipoEsService = new GenericServiceImpl<>(TipoEstudiante.class, HibernateUtil.getSessionFactory());
        tiposEstudiantes = tipoEsService.getAll();
        return tiposEstudiantes;
    }

    //ETNIAS
    public static void saveEtnia(Etnia etnia) {
        IGenericService<Etnia> etniaService = new GenericServiceImpl<>(Etnia.class, HibernateUtil.getSessionFactory());
        etniaService.save(etnia);
    }
    public static void updateEtnia(Etnia etnia) {
        IGenericService<Etnia> etniaService = new GenericServiceImpl<>(Etnia.class, HibernateUtil.getSessionFactory());
        etniaService.update(etnia);
    }
    public static void deleteEtnia(Etnia etnia) {
        IGenericService<Etnia> etniaService = new GenericServiceImpl<>(Etnia.class, HibernateUtil.getSessionFactory());
        etniaService.delete(etnia);
    }
    public static List<Etnia> getEtnias() {
        List<Etnia> etnias = new ArrayList<>();
        IGenericService<Etnia> etniaService = new GenericServiceImpl<>(Etnia.class, HibernateUtil.getSessionFactory());
        etnias = etniaService.getAll();
        return etnias;
    }



}
