package Comparador_y_Contador_de_Contenido;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HerramientasTexto {
    private JFrame parentFrame;

    public HerramientasTexto(JFrame parentFrame) {
        this.parentFrame = parentFrame;
    }

    public void compararArchivos() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        if (fileChooser.showOpenDialog(parentFrame) == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            if (files.length != 2) {
                JOptionPane.showMessageDialog(parentFrame, "Por favor, selecciona exactamente dos archivos para comparar.");
                return;
            }
            try {
                String contenido1 = new String(Files.readAllBytes(files[0].toPath()));
                String contenido2 = new String(Files.readAllBytes(files[1].toPath()));
                if (contenido1.equals(contenido2)) {
                    JOptionPane.showMessageDialog(parentFrame, "Los archivos son iguales.");
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "Los archivos son diferentes.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void analizarTexto() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(parentFrame) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(file)) {
                Map<String, Integer> frecuenciaPalabras = new HashMap<>();
                int totalPalabras = 0;
                while (scanner.hasNext()) {
                    String palabra = scanner.next();
                    frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    totalPalabras++;
                }
                JOptionPane.showMessageDialog(parentFrame, "Total de palabras: " + totalPalabras + "\nFrecuencia de palabras: " + frecuenciaPalabras);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
