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
        openButton = new JButton("Open");

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });
}
