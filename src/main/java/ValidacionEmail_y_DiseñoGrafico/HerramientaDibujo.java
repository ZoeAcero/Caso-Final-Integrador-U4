package ValidacionEmail_y_DiseñoGrafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HerramientaDibujo extends JFrame {
    private JPanel panelDibujo;

    public HerramientaDibujo() {
        panelDibujo = new JPanel() {
            Point pointStart = null;
            Point pointEnd = null;
            {
                addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        pointStart = e.getPoint();
                    }

                    public void mouseReleased(MouseEvent e) {
                        pointStart = null;
                    }
                });
                addMouseMotionListener(new MouseAdapter() {
                    public void mouseMoved(MouseEvent e) {
                        pointEnd = e.getPoint();
                    }

                    public void mouseDragged(MouseEvent e) {
                        pointEnd = e.getPoint();
                        repaint();
                    }
                });
            }
            public void paint(Graphics g) {
                super.paint(g);
                if (pointStart != null) {
                    g.setColor(Color.RED);
                    g.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
                }
            }
        };

        setContentPane(panelDibujo);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

