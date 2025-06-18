package org.Yaed.windows;

import javax.swing.*;
import java.awt.*;

public class Habitaciones extends JFrame {
    public Habitaciones() {
        setTitle("SCeBE - Habitaciones");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Colores y fuentes
        Color leftColor = new Color(10, 20, 60);
        Color rightColor = new Color(40, 51, 106);
        Color textColor = Color.WHITE;
        Font fuente = new Font("Outfit", Font.BOLD, 15);

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

        // Panel inferior (contenido)
        JPanel panelDown = new JPanel();
        panelDown.setBackground(rightColor);
        panelDown.setLayout(null);
        rightPanel.add(panelDown, BorderLayout.CENTER);

        // Cuadros grandes
        for (int i = 0; i < 2; i++) {
            JPanel panelGrande = new JPanel();
            panelGrande.setBackground(new Color(30, 60, 120));
            panelGrande.setBounds(50 + i * 500, 30, 420, 150);
            panelGrande.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            JLabel label = new JLabel("Habitación Grande " + (i + 1));
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Outfit", Font.BOLD, 18));
            panelGrande.add(label);
            panelDown.add(panelGrande);
        }

        // Cuadros medianos
        for (int i = 0; i < 10; i++) {
            JPanel panelMediano = new JPanel();
            panelMediano.setBackground(new Color(50, 90, 160));
            int x = 40 + (i % 5) * 200;
            int y = 200 + (i / 5) * 110;
            panelMediano.setBounds(x, y, 180, 90);
            panelMediano.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            JLabel label = new JLabel("Mediana " + (i + 1));
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Outfit", Font.BOLD, 13));
            panelMediano.add(label);
            panelDown.add(panelMediano);
        }

        // Cuadros pequeños: todos en una sola fila de 8
        int cantidad = 8;
        int anchoPequeno = 100;
        int altoPequeno = 220;
        int espacioX = 20;
        int inicioX = 30;
        int inicioY = 460; // una sola fila

        for (int i = 0; i < cantidad; i++) {
            JPanel panelPequeno = new JPanel();
            panelPequeno.setBackground(new Color(80, 120, 180));
            panelPequeno.setLayout(new GridLayout(12, 1, 0, 2)); // 12 filas

            int x = inicioX + i * (anchoPequeno + espacioX);
            int y = inicioY;
            panelPequeno.setBounds(x, y, anchoPequeno, altoPequeno);
            panelPequeno.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

            // Agregar 12 labels
            for (int j = 0; j < 12; j++) {
                JLabel label = new JLabel("Est " + (j + 1), SwingConstants.CENTER);
                label.setFont(new Font("Outfit", Font.PLAIN, 11));
                label.setForeground(Color.WHITE);
                panelPequeno.add(label);
            }

            panelDown.add(panelPequeno);
        }
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
