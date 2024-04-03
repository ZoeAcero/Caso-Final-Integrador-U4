package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;

public class VentanaMultiple {
    public static void main(String[] args) {
        EventQueve.invokeLater(() -> {
            try {
                JFrame frame1 = crearVentana("Ventana 1", 100, 100);
                JFrame frame2 = crearVentana("Ventana 2", 500, 100);
                JFrame frame3 = crearVentana("Ventana 3", 700, 100);

                frame1.setVisible(true);
                frame2.setVisible(true);
                frame3.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }

    private static JFrame crearVentana(String titulo, int x, int y) {
        JFrame frame = new JFrame(titulo);
        frame.setBounds(x, y, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
