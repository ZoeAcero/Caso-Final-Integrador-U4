package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class VentanaDocumento extends JFrame {
    private JTextArea areaTexto;
    private JLabel etiquetaPosicion;

    public VentanaDocumento() {
        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        add(scrollPane, BorderLayout.CENTER);

        etiquetaPosicion = new JLabel();
        add(etiquetaPosicion, BorderLayout.SOUTH);

        areaTexto.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                etiquetaPosicion.setText("Posición del ratón: " + e.getX() + ", " + e.getY());
            }
        });

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
