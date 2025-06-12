package org.Yaed.controller;

import org.Yaed.entity.Beca;
import org.Yaed.entity.Modalidad;
import org.Yaed.entity.Tipos_Becas;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class BecasController {

    //CRUD DE BECAS
    public static void saveBeca (Beca beca) {
        IGenericService<Beca> becaService = new GenericServiceImpl<>(Beca.class, HibernateUtil.getSessionFactory());
        becaService.save(beca);
    }
    public static void deleteBeca (Beca beca) {
        IGenericService<Beca> becaService = new GenericServiceImpl<>(Beca.class, HibernateUtil.getSessionFactory());
        becaService.delete(beca);
    }
    public static void updateBeca (Beca beca) {
        IGenericService<Beca>  becaService = new GenericServiceImpl<>(Beca.class, HibernateUtil.getSessionFactory());
        becaService.update(beca);
    }
    public static List<Beca> getBecas() {
        List<Beca> becas = new ArrayList<>();
        IGenericService<Beca> becaService = new GenericServiceImpl<>(Beca.class, HibernateUtil.getSessionFactory());
        becas = becaService.getAll();
        return becas;
    }

    //CRUD TIPOS DE BECAS porque es llave foranea de BECAS
    public static void saveTipoBEca(Tipos_Becas tipoBeca){
        IGenericService<Tipos_Becas> TBService = new GenericServiceImpl<>(Tipos_Becas.class, HibernateUtil.getSessionFactory());
        TBService.save(tipoBeca);
    }
    public static void deleteTipoBEca(Tipos_Becas tipoBeca){
        IGenericService<Tipos_Becas> TBservice = new GenericServiceImpl<>(Tipos_Becas.class, HibernateUtil.getSessionFactory());
        TBservice.delete(tipoBeca);
    }
    public static void updateTipoBEca(Tipos_Becas tipoBeca){
        IGenericService<Tipos_Becas> TBservice = new GenericServiceImpl<>(Tipos_Becas.class, HibernateUtil.getSessionFactory());
        TBservice.update(tipoBeca);
    }

    public static List<Tipos_Becas> getTiposBecas() {
        List<Tipos_Becas> tiposBecas = new ArrayList<>();
        IGenericService<Tipos_Becas> TBservice = new GenericServiceImpl<>(Tipos_Becas.class, HibernateUtil.getSessionFactory());
        tiposBecas = TBservice.getAll();
        return tiposBecas;
    }


}
