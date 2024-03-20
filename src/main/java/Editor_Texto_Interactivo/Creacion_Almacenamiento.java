package Editor_Texto_Interactivo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Creacion_Almacenamiento {
    private JTextArea textArea;
    private JButton guardarButton;
    private JFrame frame;

    public Creacion_Almacenamiento() {
        frame = new JFrame("Text Editor");
        textArea = new JTextArea(16, 60);
        guardarButton = new JButton("Guardar");

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarTextToFile();
            }
        });


    }
}
