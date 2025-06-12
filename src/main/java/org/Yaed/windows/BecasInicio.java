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
        Color rightColor = new Color(90, 20, 40);  // Rojo vino
        Color textColor = Color.WHITE;
        Font font = new Font("SansSerif", Font.PLAIN, 14);

        // Panel izquierdo - tamaño fijo
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(leftColor);
        leftPanel.setPreferredSize(new Dimension(180, getHeight()));
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JLabel leftLabel = new JLabel("Panel Izquierdo");
        leftLabel.setForeground(textColor);
        leftLabel.setFont(font);
        leftLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(leftLabel);

        // Panel derecho - ocupa el resto del espacio
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(rightColor);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JLabel rightLabel = new JLabel("Panel Derecho (Espacio restante)");
        rightLabel.setForeground(textColor);
        rightLabel.setFont(font);
        rightLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(rightLabel);

        // Agregar al frame
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);  // El centro ocupa todo el resto del espacio

        setVisible(true);
    }
}
