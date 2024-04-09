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
            public void paintComponent(Graphics DebugGraphics g) {
                super.paintComponents(g);
                if (puntoInicio != null && puntoFinal != null) {
                    g.drawLine(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y);
                }
            }
        };

        panelDibujo.addMouseMotionListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                puntoInicio = new Point(e.getX() , e.getY());
                puntoFinal = puntoInicio;
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                puntoFinal = null;
                puntoInicio = null;
            }
        });


        panelDibujo.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                puntoFinal = new Point(e.getX(), e.getY());
                repaint();
            }
        });

        add(panelDibujo);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                HerramientaDibujo frame = new HerramientaDibujo();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }







