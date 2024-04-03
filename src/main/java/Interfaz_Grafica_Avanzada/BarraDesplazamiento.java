package Interfaz_Grafica_Avanzada;

import javax.swing.*;

public class BarraDesplazamiento extends JFrame{
    public BarraDesplazamiento() {
        JTextArea areaDeTexto = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(areaDeTexto);

        add(scrollPane);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
