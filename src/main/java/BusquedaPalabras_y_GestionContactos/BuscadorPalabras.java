package Busqueda_de_Palabras_y_Gestion_de_Contactos;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuscadorPalabras extends JFrame {
    private JFrame parentFrame;

    public BuscadorPalabras(JFrame parentFrame) {
        this.parentFrame = parentFrame;
    }

    public void buscarPalabra(String palabraBuscada) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(parentFrame) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(file)) {
                Map<String, Integer> frecuenciaPalabras = new HashMap<>();
                while (scanner.hasNext()) {
                    String palabra = scanner.next();
                    frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                }
                int frecuencia = frecuenciaPalabras.getOrDefault(palabraBuscada, 0);
                JOptionPane.showMessageDialog(parentFrame, "La palabra '" + palabraBuscada + "' aparece " + frecuencia + " veces.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}