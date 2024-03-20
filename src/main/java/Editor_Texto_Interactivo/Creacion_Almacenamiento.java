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

        frame.getContentPane().add(textArea, "Centro");
        frame.getContentPane().add(guardarButton, "Norte");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private void guardarTextToFile() {
        try {
            FileWriter writer = new FileWriter("texto.txt");
            writer.write(textArea.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
   
    public static void main(String[] args) {
          new Creacion_Almacenamiento();
     }

}

