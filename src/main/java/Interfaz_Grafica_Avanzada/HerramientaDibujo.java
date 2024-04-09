package Interfaz_Grafica_Avanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HerramientaDibujo extends JFrame{
    private Point puntoInicio = null;
    private Point puntoFinal = null;

    public HerramientaDibujo() {
        JPanel panelDibujo = new JPanel();
            @Override
            protected void paintComponent(Graphics DebugGraphics g) {
                super.paintComponents(g);
                if (puntoInicio != null && puntoFinal != null) {
                    g.drawLine(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y);
                }
            }
        };

         panelDibujo.addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            puntoInicio = new Point(e.getX(), e.getY());
            puntoFinal = puntoInicio;
            panelDibujo.repaint();
        }

        
