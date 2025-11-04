package org.Yaed.windows;

import com.sun.jna.platform.win32.Netapi32Util;
import org.Yaed.controller.UserController;
import org.Yaed.entity.Usuario;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PerfilVentana extends JFrame {
    public PerfilVentana() {
        setTitle("Perfil");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel superior con título y avatar
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(60, 90, 170));
        topPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 20, 30));

        JLabel avatar = new JLabel();
        avatar.setPreferredSize(new Dimension(90, 90));
        avatar.setOpaque(true);
        avatar.setBackground(new Color(220, 230, 250));
        avatar.setBorder(BorderFactory.createLineBorder(new Color(100, 149, 237), 3, true));
        avatar.setHorizontalAlignment(SwingConstants.CENTER);
        avatar.setText("\uD83D\uDC64"); // Emoji de usuario
        avatar.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 48));
        topPanel.add(avatar, BorderLayout.WEST);

        JLabel titulo = new JLabel("Perfil de Usuario", SwingConstants.LEFT);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 32));
        titulo.setForeground(Color.WHITE);
        titulo.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));
        topPanel.add(titulo, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);

        // Panel central con datos
        JPanel datosPanel = new JPanel();
        datosPanel.setLayout(new GridBagLayout());
        datosPanel.setBackground(new Color(245, 247, 255));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(30, 60, 30, 60));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(16, 16, 16, 16);
        gbc.anchor = GridBagConstraints.WEST;

        List<Usuario> usuarios = UserController.getUsers();
        for (Usuario user : usuarios){
            if (user.getTipoUsuario().getId()==2){
                String nombreCompleto = user.getNombres() + " " + user.getApellidos();
                String correo = user.getCorreo();
                String edad = String.valueOf(user.getEdad());
                String usuario = user.getUsuario();
                String telefono = user.getCelular() != null ? user.getCelular() : "No disponible";
                String [][] datos = {
                    {"Nombre", nombreCompleto},
                    {"Correo", correo},
                    {"Edad", edad},
                    {"Usuario", usuario},
                    {"Teléfono", telefono},
                    {"Dirección", "No disponible"} // Dirección no disponible en este ejemplo

                };
                for (int i = 0; i < datos.length; i++) {
                    gbc.gridx = 0;
                    gbc.gridy = i;
                    JLabel labelCampo = new JLabel(datos[i][0] + ":");
                    labelCampo.setFont(new Font("Segoe UI", Font.BOLD, 18));
                    labelCampo.setForeground(new Color(60, 90, 170));
                    datosPanel.add(labelCampo, gbc);

                    gbc.gridx = 1;
                    JLabel labelValor = new JLabel(datos[i][1]);
                    labelValor.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                    labelValor.setForeground(new Color(40, 40, 40));
                    datosPanel.add(labelValor, gbc);
                }
            }
        }
        add(datosPanel, BorderLayout.CENTER);

        // Botón "Olvidé mi contraseña"
        JButton btnOlvide = new JButton("Olvidé mi contraseña");
        btnOlvide.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnOlvide.setBackground(new Color(100, 149, 237));
        btnOlvide.setForeground(Color.WHITE);
        btnOlvide.setFocusPainted(false);
        btnOlvide.setBorder(BorderFactory.createEmptyBorder(15, 40, 15, 40));
        btnOlvide.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnOlvide.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnOlvide.addActionListener(e -> {
           new Login().setVisible(true);
           dispose();
        });

        JPanel botonPanel = new JPanel();
        botonPanel.setBackground(new Color(245, 247, 255));
        botonPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 30, 0));
        botonPanel.add(btnOlvide);

        add(botonPanel, BorderLayout.SOUTH);
    }
}
