package org.Yaed.windows;

import org.Yaed.controller.CarrerasController;
import org.Yaed.entity.Carrera;

import javax.swing.*;
import java.awt.*;

public class FormularioCarrera extends JFrame {

    private JTextField txtNombre;

    public FormularioCarrera() {
        setTitle("Agregar Carrera");
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrada
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Nombre de la carrera:"));
        txtNombre = new JTextField();
        add(txtNombre);

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        add(btnGuardar);
        add(btnCancelar);

        btnCancelar.addActionListener(e -> dispose());

        btnGuardar.addActionListener(e -> {
            String nombreCarrera = txtNombre.getText().trim();

            if (nombreCarrera.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Carrera nuevaCarrera = new Carrera();
            nuevaCarrera.setNombre(nombreCarrera);

            CarrerasController.saveCarreras(nuevaCarrera);

            JOptionPane.showMessageDialog(this, "Carrera guardada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });
    }
}
