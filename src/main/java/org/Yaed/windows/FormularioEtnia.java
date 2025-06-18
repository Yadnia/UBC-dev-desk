package org.Yaed.windows;

import org.Yaed.controller.EstudiantesController;
import org.Yaed.entity.Etnia;

import javax.swing.*;
import java.awt.*;

public class FormularioEtnia extends JFrame {

    private JTextField txtNombre;

    public FormularioEtnia() {
        setTitle("Agregar Etnia");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Nombre de la etnia:"));
        txtNombre = new JTextField();
        add(txtNombre);

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        add(btnGuardar);
        add(btnCancelar);

        btnCancelar.addActionListener(e -> dispose());

        btnGuardar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Etnia nueva = new Etnia();
            nueva.setNombre(nombre);
            EstudiantesController.saveEtnia(nueva);

            JOptionPane.showMessageDialog(this, "Etnia guardada correctamente.");
            dispose();
        });
    }
}
