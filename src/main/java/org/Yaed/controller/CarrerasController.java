package org.Yaed.controller;

import org.Yaed.entity.Areas;
import org.Yaed.entity.Carrera;
import org.Yaed.entity.Modalidad;
import org.Yaed.entity.Sede;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.Area;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class CarrerasController {

    public static void saveCarreras (Carrera carrera){
        IGenericService<Carrera> carreraService = new GenericServiceImpl<>(Carrera.class, HibernateUtil.getSessionFactory());
        carreraService.save(carrera);
    }
    public static void deleteCarreras (Carrera carrera){
        IGenericService<Carrera> carreraService = new GenericServiceImpl<>(Carrera.class, HibernateUtil.getSessionFactory());
        carreraService.delete(carrera);
    }
    public static void updateCarreras (Carrera carrera){
        IGenericService<Carrera> carreraService = new GenericServiceImpl<>(Carrera.class, HibernateUtil.getSessionFactory());
        carreraService.update(carrera);
    }
    public static List<Carrera> getCarreras(){
        List<Carrera> carreras = new ArrayList<>();
        IGenericService<Carrera> carreraService = new GenericServiceImpl<>(Carrera.class, HibernateUtil.getSessionFactory());
        carreras = carreraService.getAll();
        return carreras;
    }

    //SEDES
    public static void saveSede (Sede sede){
        IGenericService<Sede> sedeService = new GenericServiceImpl<>(Sede.class, HibernateUtil.getSessionFactory());
        sedeService.save(sede);
    }
    public static void deleteSede (Sede sede){
        IGenericService<Sede>  sedeService = new GenericServiceImpl<>(Sede.class, HibernateUtil.getSessionFactory());
        sedeService.delete(sede);
    }
    public static void updateSede (Sede sede){
        IGenericService<Sede> sedeService = new GenericServiceImpl<>(Sede.class, HibernateUtil.getSessionFactory());
        sedeService.update(sede);
    }
    public static List<Sede> getSedes (){
        List<Sede> sedes = new ArrayList<>();
        IGenericService<Sede> sedeService = new GenericServiceImpl<>(Sede.class, HibernateUtil.getSessionFactory());
        sedes = sedeService.getAll();
        return sedes;
    }
    //CRUD DE LAS MODALIDADES
    public static void saveModalidad (Modalidad modalidad){
        IGenericService<Modalidad> modalidadService = new GenericServiceImpl<>(Modalidad.class, HibernateUtil.getSessionFactory());
        modalidadService.save(modalidad);
    }
    public static void deleteModalidad (Modalidad modalidad){
        IGenericService<Modalidad> modalidadService = new GenericServiceImpl<>(Modalidad.class, HibernateUtil.getSessionFactory());
        modalidadService.delete(modalidad);
    }
    public static void updateModalidad (Modalidad modalidad){
        IGenericService<Modalidad>  modalidadService = new GenericServiceImpl<>(Modalidad.class, HibernateUtil.getSessionFactory());
        modalidadService.update(modalidad);
    }

    public static List<Modalidad> getModalidades() {
        List<Modalidad> modalidades = new ArrayList<>();
        IGenericService<Modalidad> modalidadeService = new GenericServiceImpl<>(Modalidad.class, HibernateUtil.getSessionFactory());
        modalidades = modalidadeService.getAll();
        return modalidades;
    }
    //AREAS
    public static void saveArea(Areas area){
        IGenericService<Areas> areaService = new GenericServiceImpl<>(Areas.class, HibernateUtil.getSessionFactory());
        areaService.save(area);
    }
    public static void deleteArea(Areas area){
        IGenericService<Areas> areaService = new GenericServiceImpl<>(Areas.class, HibernateUtil.getSessionFactory());
        areaService.delete(area);
    }
    public static void updateArea(Areas area){
        IGenericService<Areas> areaService = new GenericServiceImpl<>(Areas.class, HibernateUtil.getSessionFactory());
        areaService.update(area);
    }
    public static List<Areas> getAreas(){
        List<Areas> areas = new ArrayList<>();
        IGenericService<Areas> areaService = new GenericServiceImpl<>(Areas.class, HibernateUtil.getSessionFactory());
        areas = areaService.getAll();
        return areas;
    }

}
