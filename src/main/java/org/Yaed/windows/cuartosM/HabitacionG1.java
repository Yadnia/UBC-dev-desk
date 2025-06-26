package org.Yaed.windows.cuartosM;

import org.Yaed.controller.HabController;
import org.Yaed.entity.Habitacion;
import org.Yaed.entity.HabitacionesEstudiantes;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class HabitacionG1 extends JFrame {
    public HabitacionG1() {
        setTitle("Casa Grande 1");
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

        // Título
        JLabel titleLabel = new JLabel("Casa Grande 1 (Masculino)");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        titleLabel.setForeground(accentColor);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Subtítulo
        JLabel subtitleLabel = new JLabel("Cuarto 1");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitleLabel.setForeground(Color.DARK_GRAY);
        subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Selector de mes y año (reemplaza el botón buscar por un combo de año)
        JPanel selectorPanel = new JPanel();
        selectorPanel.setBackground(bgColor);
        selectorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JLabel mesLabel = new JLabel("Seleccionar periodo:");
        mesLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        JLabel anioLabel = new JLabel("Año:");
        anioLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JComboBox<String> anioCombo = new JComboBox<>(new String[]{
                "2023", "2024", "2025"
        });
        selectorPanel.add(mesLabel);
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

        // Encabezado bonito
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tabla.getTableHeader().setBackground(tableHeaderColor);
        tabla.getTableHeader().setForeground(accentColor);

        // Centrar columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBorder(BorderFactory.createLineBorder(accentColor, 1));

        // Layout
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(subtitleLabel, BorderLayout.BEFORE_FIRST_LINE);
        mainPanel.add(selectorPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Ajuste de layout para que todo quede bien distribuido
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.setBackground(bgColor);
        topPanel.add(titleLabel);
        topPanel.add(subtitleLabel);

        anioCombo.addActionListener(e -> {
            String anioSeleccionado = (String) anioCombo.getSelectedItem();
            if (anioSeleccionado != null) {
                switch (anioSeleccionado) {
                    case "2023":
                        addRows23(model);
                        break;
                    case "2024":
                        addRows24(model);
                        break;
                    case "2025":
                        addRows25(model);
                        break;
                }
            }
        });

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
    public static void addRows25(DefaultTableModel model) {
        model.setRowCount(0);
        java.util.List<HabitacionesEstudiantes> habsEst = HabController.getHabitacionesEstudiantes();
        for (HabitacionesEstudiantes habEst : habsEst) {
            // Verificamos año y semestre
            if ("2025".equals(habEst.getAnio()) && "I Semestre".equals(habEst.getFecha())) {
                Habitacion hab1 = habEst.getHabitacion();
                int idHab = hab1.getId(); // Obtenemos el ID de la habitación

                // Verificamos si el ID de la habitación es 1, 2 o 3
                if (idHab == 25) {
                    model.addRow(new Object[]{
                            habEst.getEstudiante().getNombre(),
                            habEst.getEstudiante().getApellido(),
                            habEst.getEstudiante().getEdad(),
                            habEst.getEstudiante().getEtnia().getNombre(),
                            habEst.getFecha(),
                    });
                }
            }
        }
    }
    public static void addRows24(DefaultTableModel model) {
        model.setRowCount(0);
        java.util.List<HabitacionesEstudiantes> habsEst = HabController.getHabitacionesEstudiantes();
        for (HabitacionesEstudiantes habEst : habsEst) {
            // Verificamos año y semestre
            if ("2024".equals(habEst.getAnio()) && "I Semestre".equals(habEst.getFecha())) {
                Habitacion hab1 = habEst.getHabitacion();
                int idHab = hab1.getId(); // Obtenemos el ID de la habitación
                // Verificamos si el ID de la habitación es 1, 2 o 3
                if (idHab == 25) {
                    model.addRow(new Object[]{
                            habEst.getEstudiante().getNombre(),
                            habEst.getEstudiante().getApellido(),
                            habEst.getEstudiante().getEdad(),
                            habEst.getEstudiante().getEtnia().getNombre(),
                            habEst.getFecha(),
                    });
                }
            }
        }
    }
    public static void addRows23(DefaultTableModel model) {
        model.setRowCount(0);
        List<HabitacionesEstudiantes> habsEst = HabController.getHabitacionesEstudiantes();
        for (HabitacionesEstudiantes habEst : habsEst) {
            // Verificamos año y semestre
            if ("2024".equals(habEst.getAnio()) && "I Semestre".equals(habEst.getFecha())) {
                Habitacion hab1 = habEst.getHabitacion();
                int idHab = hab1.getId(); // Obtenemos el ID de la habitación
                // Verificamos si el ID de la habitación es 1, 2 o 3
                if (idHab == 25) {
                    model.addRow(new Object[]{
                            habEst.getEstudiante().getNombre(),
                            habEst.getEstudiante().getApellido(),
                            habEst.getEstudiante().getEdad(),
                            habEst.getEstudiante().getEtnia().getNombre(),
                            habEst.getFecha(),
                    });
                }
            }
        }
    }

}
