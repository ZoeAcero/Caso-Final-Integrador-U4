package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeguimientoRaton extends JFrame {
    private JLabel etiquetaPosicionRaton;

    public SeguimientoRaton() {
        etiquetaPosicionRaton = new JLabel();
        add(etiquetaPosicionRaton, BorderLayout.SOUTH);
    }
}
