package Editor_Texto_Interactivo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Navegacion_Listado {
    private JList<String> documentList;
    private JButton cargarButton;
    private JFrame frame;
    private JTextArea textArea;

    public Navegacion_Listado() {
        frame = new JFrame("Document List");
        documentList = new JList<>(new String[]{"doc1.txt", "doc2.txt"});
        textArea = new JTextArea(16, 60);
        JButton openButton = new JButton("Abierto");

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });


        frame.getContentPane().add(documentList, "West");
        frame.getContentPane().add(textArea, "Center");
        frame.getContentPane().add(openButton, "South");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void openDocument() {
        String selectedDocument = documentList.getSelectedValue();
        if (selectedDocument != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedDocument))) {
                textArea.read(reader, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        new Navegacion_Listado();
    }
}

