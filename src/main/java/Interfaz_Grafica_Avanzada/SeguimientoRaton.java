package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeguimientoRaton extends JFrame {
    private JLabel etiquetaPosicionRaton;

    public SeguimientoRaton() {
        etiquetaPosicionRaton = new JLabel();
        add(etiquetaPosicionRaton, BorderLayout.SOUTH);

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                etiquetaPosicionRaton.setText("Posicion del raton: " + e.getX() + ", Y=" + e.getY());
            }
        });

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SeguimientoRaton frame = new SeguimientoRaton();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
