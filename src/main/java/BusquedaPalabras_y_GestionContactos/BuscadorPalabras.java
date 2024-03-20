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
}
