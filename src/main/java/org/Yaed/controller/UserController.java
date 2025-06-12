package org.Yaed.controller;

import org.Yaed.entity.TipoUsuario;
import org.Yaed.entity.Usuario;
import org.Yaed.services.GenericServiceImpl;
import org.Yaed.services.IGenericService;
import org.Yaed.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    public static void saveUser(Usuario user) {
        IGenericService<Usuario>  usuarioservice = new GenericServiceImpl<>(Usuario.class, HibernateUtil.getSessionFactory());
        usuarioservice.save(user);
    }
    public static void deleteUser(Usuario user) {
        IGenericService<Usuario>  usuarioservice = new GenericServiceImpl<>(Usuario.class, HibernateUtil.getSessionFactory());
        usuarioservice.delete(user);
    }
    public static void updateUser(Usuario user) {
        IGenericService<Usuario> usuarioservice = new GenericServiceImpl<>(Usuario.class, HibernateUtil.getSessionFactory());
        usuarioservice.update(user);
    }
    public static List<Usuario> getUsers() {
        List<Usuario> usuarios = new ArrayList<>();
        IGenericService<Usuario> usuarioservice = new GenericServiceImpl<>(Usuario.class, HibernateUtil.getSessionFactory());
        usuarios = usuarioservice.getAll();
        return usuarios;
    }

    public static void saveTipoUsuario(TipoUsuario tipoUsuario) {
        IGenericService<TipoUsuario> Tipousuarioservice = new GenericServiceImpl<>(TipoUsuario.class, HibernateUtil.getSessionFactory());
        Tipousuarioservice.save(tipoUsuario);
    }
    public static void  deleteTipoUsuario(TipoUsuario tipoUsuario) {
        IGenericService<TipoUsuario> tipoUsuarioService = new GenericServiceImpl<>(TipoUsuario.class, HibernateUtil.getSessionFactory());
        tipoUsuarioService.delete(tipoUsuario);
    }
    public static void updateTipoUsuario(TipoUsuario tipoUsuario) {
        IGenericService<TipoUsuario> Tipousuarioservice = new GenericServiceImpl<>(TipoUsuario.class, HibernateUtil.getSessionFactory());
        Tipousuarioservice.update(tipoUsuario);
    }
    public static List<TipoUsuario> getTipoUsuarios() {
        List<TipoUsuario> tipoUsuarios = new ArrayList<>();
        IGenericService<TipoUsuario> Tipousuarioservice = new GenericServiceImpl<>(TipoUsuario.class, HibernateUtil.getSessionFactory());
        tipoUsuarios = Tipousuarioservice.getAll();
        return tipoUsuarios;
    }
    public static TipoUsuario getTipoUsuarioById(int id) {
        IGenericService<TipoUsuario> tipoUsuarioService = new GenericServiceImpl<>(TipoUsuario.class, HibernateUtil.getSessionFactory());
        return tipoUsuarioService.getById(id);
    }

}
