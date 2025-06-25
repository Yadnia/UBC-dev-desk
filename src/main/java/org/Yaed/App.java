package org.Yaed;

import org.Yaed.controller.BecasController;
import org.Yaed.controller.CarrerasController;
import org.Yaed.controller.EstudiantesController;
import org.Yaed.controller.UserController;
import org.Yaed.entity.*;
import org.Yaed.windows.Inicio;
import java.util.Random;
import java.util.Arrays;
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
        Random rand = new Random();

        List<String> nombres = Arrays.asList("Ana", "María", "Juana", "Lucía", "Carla", "Fernanda", "Isabel", "Paola", "Sofía", "Camila",
                "Valeria", "Diana", "Marta", "Elena", "Gabriela", "Sara", "Andrea", "Claudia", "Natalia", "Patricia");
        List<String> apellidos = Arrays.asList("Ramírez", "López", "González", "Martínez", "Rodríguez", "Pérez", "García", "Sánchez", "Castillo", "Cruz");

        List<Etnia> etnias = EstudiantesController.getEtnias();
        List<Carrera> carreras = CarrerasController.getCarreras();
        List<Sede> sedes = CarrerasController.getSedes();
        List<EstadoEstudiante> estados = EstudiantesController.getEstadoEstudiantes();
        List<TipoEstudiante> tipoEstudiantes = EstudiantesController.getTipoEstudiantes();

        for (int i = 0; i < 80; i++) {
            Estudiante estudiante = new Estudiante();

            String carnet = String.format("%02d-%07d-0300", rand.nextInt(100), rand.nextInt(10000000));
            String nombre = nombres.get(i % nombres.size()) + (i / nombres.size() > 0 ? (" " + (i / nombres.size())) : "");
            String apellido = apellidos.get(rand.nextInt(apellidos.size()));
            String telefono = "82" + String.format("%06d", rand.nextInt(1000000));
           List<Beca> becas = BecasController.getBecas();
            estudiante.setCarnet(carnet);
            estudiante.setNombre(nombre);
            estudiante.setApellido(apellido);
            estudiante.setTelefono(telefono);
            estudiante.setFotoURL(null);
            estudiante.setSexo('F');
            estudiante.setEtnia(etnias.getFirst());
            estudiante.setCarrera(carreras.getLast());
            estudiante.setSede(sedes.getFirst());
            estudiante.setEstado(estados.get(1)); // Estado 1
            estudiante.setTipoEstudiante(tipoEstudiantes.get(0)); // Tipo 1
            estudiante.setBecaid(becas.get(1));

            EstudiantesController.saveEstudiante(estudiante);
        }     


    }
}
