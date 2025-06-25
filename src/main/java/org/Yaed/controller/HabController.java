package org.Yaed.controller;

import org.Yaed.entity.Estudiante;
import org.Yaed.entity.Habitacion;
import org.Yaed.entity.HabitacionesEstudiantes;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;
import org.Yaed.windows.Habitaciones;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HabController {

    public static void saveAsignacion(HabitacionesEstudiantes habitacionEstudiante) {
        IGenericService<HabitacionesEstudiantes> habsService = new GenericServiceImpl<>(HabitacionesEstudiantes.class, HibernateUtil.getSessionFactory());
        habsService.save(habitacionEstudiante);
    }
    public static void deleteAsignacion(HabitacionesEstudiantes habitacionEstudiante) {
        IGenericService<HabitacionesEstudiantes> habsService = new GenericServiceImpl<>(HabitacionesEstudiantes.class, HibernateUtil.getSessionFactory());
        habsService.delete(habitacionEstudiante);
    }
    public static void updateAsignacion(HabitacionesEstudiantes habitacionEstudiante) {
        IGenericService<HabitacionesEstudiantes> habsService = new GenericServiceImpl<>(HabitacionesEstudiantes.class, HibernateUtil.getSessionFactory());
        habsService.update(habitacionEstudiante);
    }
    public static List<Habitacion> getHabitaciones() {
        List<Habitacion> habs = new ArrayList<Habitacion>();
        IGenericService<Habitacion> habService = new GenericServiceImpl<>(Habitacion.class, HibernateUtil.getSessionFactory());
        habs = habService.getAll();
        return habs;
    }
    public static List<HabitacionesEstudiantes> getHabitacionesEstudiantes() {
        List<HabitacionesEstudiantes> habsEstudiantes = new ArrayList<HabitacionesEstudiantes>();
        IGenericService<HabitacionesEstudiantes> habsService = new GenericServiceImpl<>(HabitacionesEstudiantes.class, HibernateUtil.getSessionFactory());
        habsEstudiantes = habsService.getAll();
        return habsEstudiantes;
    }
    public static void AsignarMujeres() {
        List<Estudiante> grupo1 = new ArrayList<>();
        List<Estudiante> grupo2 = new ArrayList<>();
        List<Estudiante> grupo3 = new ArrayList<>();
        List<Estudiante> grupo4 = new ArrayList<>();
        List<Estudiante> grupo5 = new ArrayList<>();
        List<Estudiante> grupo6 = new ArrayList<>();
        List<Estudiante> grupo7 = new ArrayList<>();
        List<Estudiante> grupo8 = new ArrayList<>();
        List<Estudiante> listaTotalEstudiantes = EstudiantesController.getEstudiantes();

        Habitaciones.dividirEstudiantesFBeca2(listaTotalEstudiantes, grupo1, grupo2, grupo3, grupo4, grupo5, grupo6, grupo7, grupo8);

        //casa 1
        for (Estudiante e : grupo1) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(0);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo2) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(1);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo3) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(2);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
        }
        for (Estudiante e : grupo4) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(3);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, LocalDate.now());
                    HabController.saveAsignacion(habEstudiante);
                }
        }
        for (Estudiante e : grupo5) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(4);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
        }
        for (Estudiante e : grupo6) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(5);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
        }
        for (Estudiante e : grupo7) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(5);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
        }
        for (Estudiante e : grupo8) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(6);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
        }
    }
    public static void AsignarHombres1() {
        List<Estudiante> grupo1 = new ArrayList<>();
        List<Estudiante> grupo2 = new ArrayList<>();
        List<Estudiante> listaTotalEstudiantes = EstudiantesController.getEstudiantes();

        Habitaciones.dividirEstudiantesM1Beca2(listaTotalEstudiantes, grupo1, grupo2);

        //casa 1
        for (Estudiante e : grupo1) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(0);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo2) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(1);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
    }
    public static void AsignarHombres2() {
        List<Estudiante> grupo1 = new ArrayList<>();
        List<Estudiante> grupo2 = new ArrayList<>();
        List<Estudiante> grupo3 = new ArrayList<>();
        List<Estudiante> grupo4 = new ArrayList<>();
        List<Estudiante> grupo5 = new ArrayList<>();
        List<Estudiante> grupo6 = new ArrayList<>();
        List<Estudiante> listaTotalEstudiantes = EstudiantesController.getEstudiantes();

        Habitaciones.dividirEstudiantesM2Beca2(listaTotalEstudiantes, grupo1, grupo2, grupo3, grupo4, grupo5, grupo6);

        Habitaciones.dividirEstudiantesM2Beca2(listaTotalEstudiantes, grupo1, grupo2, grupo3, grupo4, grupo5, grupo6);

        //casa 1
        for (Estudiante e : grupo1) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(0);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo2) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(1);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo3) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(2);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo3) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(3);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo4) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(4);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo5) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(5);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
        for (Estudiante e : grupo6) {
            JLabel label = new JLabel(e.getNombre() + " " + e.getApellido());
            List <Habitacion> habs = HabController.getHabitaciones();
            Habitacion cuarto = habs.get(6);
            for(Estudiante estudiante : listaTotalEstudiantes)
                if (estudiante.getCarnet().equals(e.getCarnet())) {
                    LocalDate fechaAsignacion = LocalDate.now().plusDays(1);
                    HabitacionesEstudiantes habEstudiante = new HabitacionesEstudiantes(estudiante, cuarto, fechaAsignacion);
                    HabController.saveAsignacion(habEstudiante);
                }
            label.setForeground(Color.WHITE);
        }
    }

}
