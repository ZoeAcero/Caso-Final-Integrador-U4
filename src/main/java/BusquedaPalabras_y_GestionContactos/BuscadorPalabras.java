package BusquedaPalabras_y_GestionContactos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BuscadorPalabras {
    private JButton searchButton;
    private JFrame frame;
    private JTextArea textArea;
    private JTextField filePathField;
    private JTextField wordField;

    public BuscadorPalabras() {
        frame = new JFrame("Word Search");
        textArea = new JTextArea(16, 60);
        searchButton = new JButton("Search");
        filePathField = new JTextField(30);
        wordField = new JTextField(30);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchWord();
            }
        });

        frame.getContentPane().add(filePathField, "North");
        frame.getContentPane().add(wordField, "Center");
        frame.getContentPane().add(textArea, "East");
        frame.getContentPane().add(searchButton, "South");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void searchWord() {
        String filePath = filePathField.getText();
        String wordToSearch = wordField.getText();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            Map<String, Integer> wordCount = new HashMap<>();

        }
