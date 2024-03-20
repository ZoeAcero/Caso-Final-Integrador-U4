package Comparador_y_Contador_de_Contenido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalisisTexto {
    private JButton analyzeButton;
    private JFrame frame;
    private JTextArea textArea;
    private JTextField filePathField;

    public AnalisisTexto() {
        frame = new JFrame("Text Analysis");
        textArea = new JTextArea(16, 60);
        analyzeButton = new JButton("Analyze");
        filePathField = new JTextField(30);

        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                analyzeText();
            }
        });
}
