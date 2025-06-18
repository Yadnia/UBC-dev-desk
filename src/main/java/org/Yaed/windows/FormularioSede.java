package org.Yaed.windows;

import org.Yaed.controller.CarrerasController;
import org.Yaed.entity.Sede;

import javax.swing.*;
import java.awt.*;

public class FormularioSede extends JFrame {

    private JTextField txtNombre;

    public FormularioSede() {
        setTitle("Agregar Sede");
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrada en pantalla
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Nombre de la sede:"));
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

            Sede nueva = new Sede();
            nueva.setNombre(nombre);
            CarrerasController.saveSede(nueva);

            JOptionPane.showMessageDialog(this, "Sede guardada correctamente.");
            dispose();
        });
    }
}
