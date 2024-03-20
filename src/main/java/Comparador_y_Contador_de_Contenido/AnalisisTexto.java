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


        frame.getContentPane().add(filePathField, "North");
        frame.getContentPane().add(textArea, "Center");
        frame.getContentPane().add(analyzeButton, "South");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void analyzeText() {
        String filePath = filePathField.getText();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            Map<String, Integer> wordCount = new HashMap<>();


            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
                line = reader.readLine();
            }

            textArea.append("Number of words: " + wordCount.size() + "\n");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                textArea.append(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        }
