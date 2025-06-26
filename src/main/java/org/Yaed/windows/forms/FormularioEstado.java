package org.Yaed.windows.forms;

import org.Yaed.controller.EstudiantesController;
import org.Yaed.entity.EstadoEstudiante;

import javax.swing.*;
import java.awt.*;

public class FormularioEstado extends JFrame {

    private JTextField txtNombre;

    public FormularioEstado() {
        setTitle("Agregar Estado");
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrada en pantalla
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Nombre del estado:"));
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

            EstadoEstudiante estado = new EstadoEstudiante(nombre);
            estado.setNombre(nombre);
            EstudiantesController.saveEstadoEstudiante(estado);

            JOptionPane.showMessageDialog(this, "Estado guardado correctamente.");
            dispose();
        });
    }
}
