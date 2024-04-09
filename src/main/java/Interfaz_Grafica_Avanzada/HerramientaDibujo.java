package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HerramientaDibujo extends JFrame{
    private Point puntoInicio = null;
    private Point puntoFin = null;

    public HerramientaDibujo() {
        JPanel panelDibujo = new JPanel();
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (puntoInicio != null && puntoFinal != null) {
                g.drawLine(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y);
            }
        }
    };

    
        }

}
