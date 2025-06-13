package org.Yaed.windows;

import javax.swing.*;
import java.awt.*;

public class BecasInicio extends JFrame {
    public BecasInicio() {
        setTitle("SCeBE - Panel principal");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Colores
        Color leftColor = new Color(10, 20, 60);   // Azul oscuro
        Color rightColor = new Color(40, 51, 106);  // Rojo vino
        Color textColor = Color.WHITE;
        Font fuente = new Font("Outfit", Font.BOLD, 15);
        Font fuente1 = new Font("Outfit", Font.BOLD, 14);

        // Panel izquierdo
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(leftColor);
        leftPanel.setPreferredSize(new Dimension(180, getHeight()));
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JButton leftButton = new JButton("UBC");
        leftButton.setForeground(textColor);
        leftButton.setBackground(leftColor);
        leftButton.setFont(fuente);
        leftButton.setBorderPainted(false);
        leftButton.setFocusPainted(false);
        leftButton.setContentAreaFilled(true);

        Color normalBg = leftButton.getBackground();
        Color hoverBg = leftColor.darker();

        leftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftButton.setBackground(hoverBg);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leftButton.setBackground(normalBg);
            }
        });

        leftButton.addActionListener(e -> {});
        leftButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(leftButton);

        JButton listadoBttn = new JButton("Listado Estudiantes");
        listadoBttn.setForeground(textColor);
        listadoBttn.setBackground(leftColor);
        listadoBttn.setFont(fuente1);
        listadoBttn.setBorderPainted(false);
        listadoBttn.setFocusPainted(false);
        listadoBttn.setContentAreaFilled(true);

        Color normalBg1 = listadoBttn.getBackground();
        Color hoverBg1 = leftColor.darker();

        listadoBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listadoBttn.setBackground(hoverBg1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listadoBttn.setBackground(normalBg1);
            }
        });

        listadoBttn.addActionListener(e -> {
            new ListadoEstudiantes();
            dispose();
        });

        listadoBttn.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(listadoBttn);

        String[] botones = {
                "Organización de Habitaciones",
                "Actividades",
                "Generar",
                "Opciones",
                "Ayuda"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setForeground(textColor);
            boton.setBackground(leftColor);
            boton.setFont(fuente1);
            boton.setBorderPainted(false);
            boton.setFocusPainted(false);
            boton.setContentAreaFilled(true);

            Color normalBg2 = boton.getBackground();
            Color hoverBg2 = leftColor.darker();

            boton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    boton.setBackground(hoverBg2);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    boton.setBackground(normalBg2);
                }
            });

            boton.addActionListener(e -> {
                System.out.println("Clic en: " + texto);
            });

            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            leftPanel.add(Box.createVerticalStrut(20));
            leftPanel.add(boton);
        }

        // Panel derecho
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(rightColor);
        rightPanel.setLayout(new BorderLayout());

        // Panel superior (búsqueda)
        JPanel panelUp = new JPanel();
        panelUp.setBackground(rightColor);
        panelUp.setPreferredSize(new Dimension(0, 70));
        panelUp.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        rightPanel.add(panelUp, BorderLayout.NORTH);

        JTextField searchField = new JTextField(25);
        searchField.setPreferredSize(new Dimension(250, 35));
        searchField.setFont(new Font("SansSerif", Font.PLAIN, 15));
        searchField.setForeground(Color.WHITE);
        Color bgColor = new Color(14, 34, 71);
        searchField.setBackground(bgColor);
        searchField.setCaretColor(Color.WHITE);
        searchField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(bgColor, 1, true),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));

        JButton searchButton = new JButton("🔍");
        searchButton.setPreferredSize(new Dimension(50, 35));
        searchButton.setBackground(new Color(60, 80, 140));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        searchButton.setFocusPainted(false);
        searchButton.setBorderPainted(false);

        panelUp.add(searchField);
        panelUp.add(searchButton);

        // Panel inferior (contenido)
        JPanel panelDown = new JPanel();
        panelDown.setBackground(rightColor);
        panelDown.setLayout(new GridLayout(1, 3, 30, 0));
        panelDown.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        rightPanel.add(panelDown, BorderLayout.CENTER);

        String[] ests = {
                "Estudiante1",
                "Estudiante2",
                "Estudiante3",
                "Estudiante4",
                "Estudiante5",
        };

        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.setBackground(leftColor);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelDown.add(panel1);

        JLabel labelLimpieza = new JLabel("Limpieza");
        labelLimpieza.setForeground(Color.WHITE);
        labelLimpieza.setFont(new Font("Outfit", Font.BOLD, 18));
        labelLimpieza.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.add(labelLimpieza);

        for (String est : ests) {
            JLabel label = new JLabel(est);
            label.setFont(new Font("Outfit", Font.PLAIN, 13));
            label.setForeground(Color.WHITE);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel1.add(Box.createVerticalStrut(10));
            panel1.add(label);
        }

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.setBackground(leftColor);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelDown.add(panel2);

        JLabel actvlabel = new JLabel("Actividades colaborativas");
        actvlabel.setForeground(Color.WHITE);
        actvlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        actvlabel.setFont(new Font("Outfit", Font.BOLD, 16));
        panel2.add(actvlabel);

        for (String est : ests) {
            JLabel label = new JLabel(est);
            label.setFont(new Font("Outfit", Font.PLAIN, 13));
            label.setForeground(Color.WHITE);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel2.add(Box.createVerticalStrut(10));
            panel2.add(label);
        }

        // Panel 3
        JPanel panel3 = new JPanel();
        panel3.setBackground(leftColor);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelDown.add(panel3);

        JLabel KitSuplabel = new JLabel("Apoyo en cocina");
        KitSuplabel.setForeground(Color.WHITE);
        KitSuplabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        KitSuplabel.setFont(new Font("Outfit", Font.BOLD, 16));
        panel3.add(KitSuplabel);

        for (String est : ests) {
            JLabel label = new JLabel(est);
            label.setFont(new Font("Outfit", Font.PLAIN, 13));
            label.setForeground(Color.WHITE);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel3.add(Box.createVerticalStrut(10));
            panel3.add(label);
        }

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
