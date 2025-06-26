package org.Yaed.controller;

import org.Yaed.entity.*;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class PastController {
    public static void saveAsignacion(PastHabs habitacionEstudiante) {
        IGenericService<PastHabs> habsService = new GenericServiceImpl<>(PastHabs.class, HibernateUtil.getSessionFactory());
        habsService.save(habitacionEstudiante);
    }
    public static void deleteAsignacion(PastHabs habitacionEstudiante) {
        IGenericService<PastHabs> habsService = new GenericServiceImpl<>(PastHabs.class, HibernateUtil.getSessionFactory());
        habsService.delete(habitacionEstudiante);
    }
    public static void updateAsignacion(PastHabs habitacionEstudiante) {
        IGenericService<PastHabs> habsService = new GenericServiceImpl<>(PastHabs.class, HibernateUtil.getSessionFactory());
        habsService.update(habitacionEstudiante);
    }
    public static List<Habitacion> getHabitaciones() {
        List<Habitacion> habs = new ArrayList<Habitacion>();
        IGenericService<Habitacion> habService = new GenericServiceImpl<>(Habitacion.class, HibernateUtil.getSessionFactory());
        habs = habService.getAll();
        return habs;
    }
    public static List<PastHabs> getPastHabs() {
        List<PastHabs> habsEstudiantes = new ArrayList<PastHabs>();
        IGenericService<PastHabs> habsService = new GenericServiceImpl<>(PastHabs.class, HibernateUtil.getSessionFactory());
        habsEstudiantes = habsService.getAll();
        return habsEstudiantes;
    }
    public static void saveAct(PastActs actividad) {
        IGenericService<PastActs> service = new GenericServiceImpl<>(PastActs.class, HibernateUtil.getSessionFactory());
        service.save(actividad);
    }

    public static void updateAct(PastActs actividad) {
        IGenericService<PastActs> service = new GenericServiceImpl<>(PastActs.class, HibernateUtil.getSessionFactory());
        service.update(actividad);
    }

    public static void deleteAct(PastActs actividad) {
        IGenericService<PastActs> service = new GenericServiceImpl<>(PastActs.class, HibernateUtil.getSessionFactory());
        service.delete(actividad);
    }
    public static List<PastActs> getPastActs() {
        IGenericService<PastActs> service = new GenericServiceImpl<>(PastActs.class, HibernateUtil.getSessionFactory());
        return service.getAll();
    }

    public static void respaldarHabitaciones (){
        List<HabitacionesEstudiantes> habsEstudiantes = new ArrayList<HabitacionesEstudiantes>();
        for (HabitacionesEstudiantes habsEstudiante : HabController.getHabitacionesEstudiantes()) {
            PastHabs pastHabs = new PastHabs(habsEstudiante.getEstudiante(), habsEstudiante.getHabitacion(), habsEstudiante.getAnio(), habsEstudiante.getFecha());
            PastController.saveAsignacion(pastHabs);
        }
    }
    public static void respaldarActividades() {
        List<ActividadesEstudiantesInternado> actividadesEstudiantes = ActController.getActividades();
        for (ActividadesEstudiantesInternado actividadEstudiante : actividadesEstudiantes) {
            PastActs pastActs = new PastActs(actividadEstudiante.getEstudiante(), actividadEstudiante.getActividad());
            PastController.saveAct(pastActs);
        }
    }

}
