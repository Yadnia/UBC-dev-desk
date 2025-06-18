package org.Yaed.windows;

import javax.swing.*;
import java.awt.*;

public class Habitaciones extends JFrame {
    public Habitaciones() {
        setTitle("SCeBE - Habitaciones");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Colores y fuentes
        Color leftColor = new Color(10, 20, 60);
        Color rightColor = new Color(40, 51, 106);
        Color textColor = Color.WHITE;
        Font fuente = new Font("Outfit", Font.BOLD, 15);
        Font fuente1 = new Font("Outfit", Font.BOLD, 14);

        // Panel izquierdo (solo botón UBC)
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

        // Panel inferior (contenido) - aquí van los cuadros
        JPanel panelDown = new JPanel();
        panelDown.setBackground(rightColor);
        panelDown.setLayout(null); // Usamos layout absoluto para tamaños personalizados
        rightPanel.add(panelDown, BorderLayout.CENTER);

        // 2 cuadros muy grandes
        for (int i = 0; i < 2; i++) {
            JPanel panelGrande = new JPanel();
            panelGrande.setBackground(new Color(30, 60, 120));
            panelGrande.setBounds(40 + i * 420, 30, 380, 180);
            panelGrande.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            JLabel label = new JLabel("Habitación Grande " + (i + 1));
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Outfit", Font.BOLD, 18));
            panelGrande.add(label);
            panelDown.add(panelGrande);
        }

        // 10 cuadros medianos
        for (int i = 0; i < 10; i++) {
            JPanel panelMediano = new JPanel();
            panelMediano.setBackground(new Color(50, 90, 160));
            int x = 40 + (i % 5) * 180;
            int y = 230 + (i / 5) * 110;
            panelMediano.setBounds(x, y, 160, 90);
            panelMediano.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            JLabel label = new JLabel("Mediana " + (i + 1));
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Outfit", Font.BOLD, 13));
            panelMediano.add(label);
            panelDown.add(panelMediano);
        }

        // 8 cuadros pequeños
        for (int i = 0; i < 8; i++) {
            JPanel panelPequeno = new JPanel();
            panelPequeno.setBackground(new Color(80, 120, 180));
            int x = 40 + (i % 8) * 110;
            int y = 350;
            panelPequeno.setBounds(x, y + (i / 8) * 60, 90, 50);
            panelPequeno.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            JLabel label = new JLabel("Pequeña " + (i + 1));
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Outfit", Font.PLAIN, 11));
            panelPequeno.add(label);
            panelDown.add(panelPequeno);
        }

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
