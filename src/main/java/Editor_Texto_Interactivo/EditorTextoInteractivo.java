package Editor_Texto_Interactivo;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class EditorTextoInteractivo extends JFrame{
    private JTextArea areaTexto;


    public EditorTextoInteractivo() {
        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem guardarItem = new JMenuItem("Guardar");
        JMenuItem abrirItem = new JMenuItem("Abrir");

        guardarItem.addActionListener(e -> guardarArchivo());
        abrirItem.addActionListener(e -> abrirArchivo());

        menuArchivo.add(guardarItem);
        menuArchivo.add(abrirItem);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void guardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter out = new PrintWriter(file)) {
                out.print(areaTexto.getText());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    areaTexto.append(scanner.nextLine() + "\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditorTextoInteractivo frame = new EditorTextoInteractivo();
            frame.setVisible(true);
        });
    }
}


