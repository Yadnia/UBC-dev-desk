package org.Yaed.windows;

import org.Yaed.controller.UserController;
import org.Yaed.entity.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class AdminInicio extends JFrame {
    public AdminInicio() {
        setTitle("SCeBE - Panel Opciones");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Colores
        Color leftColor = new Color(10, 20, 60);   // Azul oscuro
        Color rightColor = new Color(40, 51, 106); // Azul medio
        Color textColor = Color.WHITE;
        Font fuenteBoton = new Font("Outfit", Font.BOLD, 15);

        // Panel izquierdo (solo botón Opciones)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(leftColor);
        leftPanel.setPreferredSize(new Dimension(180, getHeight()));
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JButton opcionesButton = new JButton("Opciones");
        opcionesButton.setForeground(textColor);
        opcionesButton.setBackground(leftColor);
        opcionesButton.setFont(fuenteBoton);
        opcionesButton.setBorderPainted(false);
        opcionesButton.setFocusPainted(false);
        opcionesButton.setContentAreaFilled(true);

        Color normalBg = opcionesButton.getBackground();
        Color hoverBg = leftColor.darker();

        opcionesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcionesButton.setBackground(hoverBg);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcionesButton.setBackground(normalBg);
            }
        });

        opcionesButton.addActionListener(e -> {
            System.out.println("Botón Opciones clickeado");
            // Aquí puedes agregar la lógica que quieras para Opciones
        });

        opcionesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(opcionesButton);

        // Botón Becas
        JButton becasButton = new JButton("Becas");
        becasButton.setForeground(textColor);
        becasButton.setBackground(leftColor);
        becasButton.setFont(fuenteBoton);
        becasButton.setBorderPainted(false);
        becasButton.setFocusPainted(false);
        becasButton.setContentAreaFilled(true);
        becasButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        becasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                becasButton.setBackground(hoverBg);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                becasButton.setBackground(normalBg);
            }
        });
        becasButton.addActionListener(e -> {
            new BecasAdmin().setVisible(true);
        });
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(becasButton);

        // Botón Deportes
        JButton deportesButton = new JButton("Deportes");
        deportesButton.setForeground(textColor);
        deportesButton.setBackground(leftColor);
        deportesButton.setFont(fuenteBoton);
        deportesButton.setBorderPainted(false);
        deportesButton.setFocusPainted(false);
        deportesButton.setContentAreaFilled(true);
        deportesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        deportesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deportesButton.setBackground(hoverBg);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deportesButton.setBackground(normalBg);
            }
        });
        deportesButton.addActionListener(e -> {
            System.out.println("Botón Deportes clickeado");
            new DeportesAdmin().setVisible(true);
        });
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(deportesButton);

        // Botón Cultura
        JButton culturaButton = new JButton("Cultura");
        culturaButton.setForeground(textColor);
        culturaButton.setBackground(leftColor);
        culturaButton.setFont(fuenteBoton);
        culturaButton.setBorderPainted(false);
        culturaButton.setFocusPainted(false);
        culturaButton.setContentAreaFilled(true);
        culturaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        culturaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                culturaButton.setBackground(hoverBg);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                culturaButton.setBackground(normalBg);
            }
        });
        culturaButton.addActionListener(e -> {
            System.out.println("Botón Cultura clickeado");
           new CulturaAdmin().setVisible(true);
        });
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(culturaButton);

        // Panel derecho con tabla de usuarios
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(rightColor);
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Usuarios");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Outfit", Font.BOLD, 22));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanel.add(titulo, BorderLayout.NORTH);

        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"Nombre", "Apellido", "Tipo", "Usuario"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        addRows(modelo);

        JTable tablaUsuarios = new JTable(modelo);
        tablaUsuarios.setFillsViewportHeight(true);
        tablaUsuarios.setSelectionBackground(new Color(90, 150, 255));
        tablaUsuarios.setSelectionForeground(Color.WHITE);
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaUsuarios.getTableHeader().setBackground(leftColor);
        tablaUsuarios.getTableHeader().setForeground(textColor);
        tablaUsuarios.getTableHeader().setFont(new Font("Outfit", Font.BOLD, 14));
        tablaUsuarios.setFont(new Font("Outfit", Font.PLAIN, 14));
        tablaUsuarios.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private static void addRows(DefaultTableModel model){
        model.setRowCount(0); // Limpiar filas existentes
        List<Usuario> usuarios = UserController.getUsers();
        for (Usuario user : usuarios) {
         String nombre = user.getNombres();
         String tipo = user.getTipoUsuario().getNombre();
         String apellido = user.getApellidos();
         model.addRow(new Object[] {nombre, apellido, tipo, user.getUsuario()});
        }
    }

}