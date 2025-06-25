package org.Yaed.windows.forms;

import org.Yaed.controller.BecasController;
import org.Yaed.entity.Beca;

import javax.swing.*;
import java.awt.*;

public class FormularioBeca extends JFrame {

    private JTextField txtNombre;

    public FormularioBeca() {
        setTitle("Agregar Beca");
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrada en pantalla
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Nombre de la beca:"));
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

            Beca beca = new Beca();
            beca.setNombre(nombre);
            BecasController.saveBeca(beca);

            JOptionPane.showMessageDialog(this, "Beca guardada correctamente.");
            dispose();
        });
    }
}
