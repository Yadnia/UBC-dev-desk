package org.Yaed.windows.cuartosM;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HabitacionM10 extends JFrame {
    public HabitacionM10() {
        setTitle("Casa Mediana 10");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        // Colores similares a otras ventanas
        Color bgColor = new Color(245, 245, 245);
        Color accentColor = new Color(0, 102, 204);
        Color tableHeaderColor = new Color(220, 220, 220);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(bgColor);
        mainPanel.setLayout(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel titleLabel = new JLabel("Casa Mediana 10 (Masculino)");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        titleLabel.setForeground(accentColor);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitleLabel = new JLabel("Cuarto 10");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitleLabel.setForeground(Color.DARK_GRAY);
        subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel selectorPanel = new JPanel();
        selectorPanel.setBackground(bgColor);
        selectorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JLabel mesLabel = new JLabel("Seleccionar periodo:");
        mesLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JComboBox<String> mesCombo = new JComboBox<>(new String[]{
                "I Semestre", "II Semestre"
        });
        JLabel anioLabel = new JLabel("Año:");
        anioLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JComboBox<String> anioCombo = new JComboBox<>(new String[]{
                "2023", "2024", "2025"
        });
        selectorPanel.add(mesLabel);
        selectorPanel.add(mesCombo);
        selectorPanel.add(anioLabel);
        selectorPanel.add(anioCombo);

        // Tabla bonita con 5 columnas
        String[] columnas = {"Nombre", "Apellido", "Edad", "Etnia", "Semestre"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(model);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tabla.setRowHeight(28);
        tabla.setSelectionBackground(new Color(204, 229, 255));
        tabla.setSelectionForeground(Color.BLACK);

        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tabla.getTableHeader().setBackground(tableHeaderColor);
        tabla.getTableHeader().setForeground(accentColor);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBorder(BorderFactory.createLineBorder(accentColor, 1));

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.setBackground(bgColor);
        topPanel.add(titleLabel);
        topPanel.add(subtitleLabel);

        JPanel centerPanel = new JPanel(new BorderLayout(0, 15));
        centerPanel.setBackground(bgColor);
        centerPanel.add(selectorPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        mainPanel.removeAll();
        mainPanel.setLayout(new BorderLayout(0, 15));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        setContentPane(mainPanel);
    }
}

