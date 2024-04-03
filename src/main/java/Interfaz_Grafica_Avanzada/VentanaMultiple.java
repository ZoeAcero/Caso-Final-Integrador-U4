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

                
            }

        });
    }
}
