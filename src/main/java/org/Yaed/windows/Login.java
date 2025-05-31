package org.Yaed.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login() {
        setTitle("Inicio de sesión");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel principal con fondo
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(10, 20, 60)); // azul oscuro
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));

        // Título
        JLabel title = new JLabel("Identifíquese");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Serif", Font.BOLD, 28));
        title.setForeground(new Color(90, 150, 255));
        mainPanel.add(title);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        // Campo Usuario
        JPanel userPanel = new JPanel(new BorderLayout());
        userPanel.setBackground(new Color(10, 20, 60));
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setForeground(Color.WHITE);
        JTextField userField = new JTextField();
        userField.setBackground(new Color(20, 30, 70));
        userField.setForeground(Color.WHITE);
        userField.setCaretColor(Color.WHITE);
        userField.setBorder(BorderFactory.createLineBorder(new Color(100, 130, 255), 1, true));
        userPanel.add(userLabel, BorderLayout.WEST);
        userPanel.add(userField, BorderLayout.CENTER);
        mainPanel.add(userPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Campo Contraseña
        JPanel passPanel = new JPanel(new BorderLayout());
        passPanel.setBackground(new Color(10, 20, 60));
        JLabel passLabel = new JLabel("Contraseña");
        passLabel.setForeground(Color.WHITE);
        passLabel.setSize(200,20);
        JPasswordField passField = new JPasswordField();
        passField.setBackground(new Color(20, 30, 70));
        passField.setForeground(Color.WHITE);
        passField.setCaretColor(Color.WHITE);
        passField.setBorder(BorderFactory.createLineBorder(new Color(100, 130, 255), 1, true));
        passField.setSize(200,20);
        passPanel.add(passLabel, BorderLayout.WEST);
        passPanel.add(passField, BorderLayout.CENTER);
        mainPanel.add(passPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 30)));


        JLabel forgotLabel = new JLabel("¿Olvidaste tu contraseña?");
        forgotLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        forgotLabel.setForeground(new Color(170, 190, 255));
        mainPanel.add(forgotLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        JButton loginButton = new JButton("Iniciar");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(90, 150, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        mainPanel.add(loginButton);

        // Acción al presionar "Iniciar"
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                 new BecasInicio().setVisible(true);
                 dispose();
            }
        });

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
