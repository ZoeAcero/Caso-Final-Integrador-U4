package Comparador_y_Contador_de_Contenido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HerramientaComparacion {
    private JList<String> documentList;
    private JButton compareButton;
    private JFrame frame;
    private JTextArea textArea;

    public Comparador_Contenido() {
        frame = new JFrame("Document Comparison");
        documentList = new JList<>(new String[]{"doc1.txt", "doc2.txt"});
        textArea = new JTextArea(16, 60);
        compareButton = new JButton("Compare");

        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compareDocuments();
            }
        });

        frame.getContentPane().add(documentList, "West");
        frame.getContentPane().add(textArea, "Center");
        frame.getContentPane().add(compareButton, "South");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
