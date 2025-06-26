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
    }
}
