package org.Yaed;

import org.Yaed.controller.BecasController;
import org.Yaed.controller.CarrerasController;
import org.Yaed.controller.EstudiantesController;
import org.Yaed.controller.UserController;
import org.Yaed.entity.*;
import org.Yaed.windows.Inicio;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       new Inicio();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios= UserController.getUsers();
        if (usuarios.isEmpty()) {
            TipoUsuario tipoUsuario = UserController.getTipoUsuarios().getFirst();
            Usuario usuario = new Usuario("hola12@", "admin", "x", "1231", 20, "12345678", tipoUsuario);
            UserController.saveUser(usuario);
        }

//        for (int i=0; i < 5; i++){
//            Estudiante estudiante = new Estudiante();
//            estudiante.setCarnet("1283" +i);
//            estudiante.setNombre("Marylin" +i);
//            estudiante.setApellido("Rodriguez" +i);
//            estudiante.setTelefono("32"+i);
//            estudiante.setFotoURL(null);
//            estudiante.setSexo('M');
//            List<Etnia> etnias = EstudiantesController.getEtnias();
//            estudiante.setEtnia(etnias.getFirst());
//            List<Carrera> carreras = CarrerasController.getCarreras();
//            estudiante.setCarrera(carreras.getLast());
//            List<Sede> sedes = CarrerasController.getSedes();
//            estudiante.setSede(sedes.getFirst());
//            List<EstadoEstudiante> estados = EstudiantesController.getEstadoEstudiantes();
//            estudiante.setEstado(estados.getFirst());
//            List<TipoEstudiante> tipoEstudiantes = EstudiantesController.getTipoEstudiantes();
//            estudiante.setTipoEstudiante(tipoEstudiantes.get(2));
//            estudiante.setBecaid(null);
//            EstudiantesController.saveEstudiante(estudiante);
//        }

    }
}
