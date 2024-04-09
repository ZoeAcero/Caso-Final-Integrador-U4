package Comparador_y_Contador_de_Contenido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class HerramientaComparacion {
    private JList<String> documentList;
    private JButton compareButton;
    private JFrame frame;
    private JTextArea textArea;

    public void Comparador_Contenido() {
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

    private void compareDocuments() {
        List<String> selectedDocuments = documentList.getSelectedValuesList();
        if (selectedDocuments.size() == 2) {
            try {
                BufferedReader reader1 = new BufferedReader(new FileReader(selectedDocuments.get(0)));
                BufferedReader reader2 = new BufferedReader(new FileReader(selectedDocuments.get(1)));

                String line1 = reader1.readLine();
                String line2 = reader2.readLine();

                while (line1 != null || line2 != null) {
                    if (line1 == null || line2 == null) {
                        textArea.append("The documents are not the same.\n");
                        return;
                    } else if (!line1.equals(line2)) {
                        textArea.append("Difference found:\n" + line1 + "\n" + line2 + "\n");
                        return;
                    }


                    line1 = reader1.readLine();
                    line2 = reader2.readLine();
                }

                textArea.append("The documents are the same.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            textArea.append("Please select exactly two documents to compare.\n");
        }
    }

    public static void main(String[] args) {
        new HerramientaComparacion();
    }

    public void setVisible(boolean b) {
    }
}

