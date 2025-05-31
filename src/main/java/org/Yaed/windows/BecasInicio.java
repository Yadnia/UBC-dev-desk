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

        Color bgColor = new Color(10, 20, 60);
        Color sideColor = new Color(20, 30, 90);
        Color textColor = Color.WHITE;
        Font font = new Font("SansSerif", Font.PLAIN, 14);

        // Panel lateral izquierdo (menú)
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(bgColor);
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setPreferredSize(new Dimension(180, getHeight()));

        JLabel title = new JLabel("UBC");
        title.setFont(new Font("Serif", Font.BOLD, 18));
        title.setForeground(textColor);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(Box.createVerticalStrut(20));
        menuPanel.add(title);
        menuPanel.add(Box.createVerticalStrut(20));

        setVisible(true);
    }

    private JLabel createRoleLabel(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        return label;
    }
}
