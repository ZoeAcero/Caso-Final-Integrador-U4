import BusquedaPalabras_y_GestionContactos.*;
import Busqueda_de_Palabras_y_Gestion_de_Contactos.BuscadorPalabras;
import Busqueda_de_Palabras_y_Gestion_de_Contactos.Contacto;
import Editor_Texto_Interactivo.EditorTextoInteractivo;
import Interfaz_Grafica_Avanzada.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Comparador_y_Contador_de_Contenido.*;
import ValidacionEmail_y_DiseñoGrafico.*;

public class Main extends JFrame{
    JMenuBar menuBar = new JMenuBar();

    JMenu menuEditorTexto = new JMenu("Editor de Texto");
    JMenu menuBusquedaGestion = new JMenu("Busqueda de Palabras y Gestion de Contactos");
    JMenu menuInterfazGrafica = new JMenu("Ventana de Documento");
    JMenu menuComparadorContenido = new JMenu("Comparador y Contador de Contenido");
    JMenu menuValidadorEmail = new JMenu("Validador de Email");
    JMenu menuHerramientaDibujo = new JMenu("Herramienta de Dibujo");

    public Main() {
        menuBar.add(menuEditorTexto);
        menuBar.add(menuBusquedaGestion);
        menuBar.add(menuInterfazGrafica);
        menuBar.add(menuComparadorContenido);
        menuBar.add(menuValidadorEmail);
        menuBar.add(menuHerramientaDibujo);


        this.setJMenuBar(menuBar);

        getContentPane().setBackground(Color.BLUE);
        JLabel titulo = new JLabel("UAX");
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("Arial", Font.BOLD, 200));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        setLayout(new GridBagLayout());
        add(titulo);
        getContentPane().setBackground(Color.getHSBColor(0.6f, 0.5f, 0.9f));


        JMenuItem itemEditorTexto = new JMenuItem("Editor de Texto");

        itemEditorTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EditorTextoInteractivo editorTextoGUI = new EditorTextoInteractivo();
                editorTextoGUI.setVisible(true);
            }
        });
        menuEditorTexto.add(itemEditorTexto);

        JMenuItem itemComparadorContenido = new JMenuItem("Comparador y Contador de Contenido");

        itemComparadorContenido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HerramientasTexto comparadorContenidoGUI = new HerramientasTexto();
                comparadorContenidoGUI.setVisible(true);
            }
        });
        menuComparadorContenido.add(itemComparadorContenido);


        JMenuItem itemAgenda = new JMenuItem("Agenda de Contactos");

        itemAgenda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Agenda agendaGUI = new Agenda();
                agendaGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemAgenda);


        JMenuItem itemBusquedaPalabras = new JMenuItem("Busqueda de Palabras");

        itemBusquedaPalabras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Busqueda_de_Palabras_y_Gestion_de_Contactos.BuscadorPalabras busquedaPalabrasGUI = new BuscadorPalabras();
                busquedaPalabrasGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemBusquedaPalabras);


        JMenuItem itemContactos = new JMenuItem("Gestion de Contactos");

        itemContactos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Busqueda_de_Palabras_y_Gestion_de_Contactos.Contacto gestionContactosGUI = new Contacto();
                gestionContactosGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemContactos);




        JMenuItem itemInterfazGrafica = new JMenuItem("Ventana de Documento");

        itemInterfazGrafica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaDocumento ventanaDocumentoGUI = new VentanaDocumento();
                ventanaDocumentoGUI.setVisible(true);
            }
        });
        menuInterfazGrafica.add(itemInterfazGrafica);


        JMenuItem itemValidadorEmail = new JMenuItem("Validador de Email");

        itemValidadorEmail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ValidadorEmail validadorEmailGUI = new ValidadorEmail();
                validadorEmailGUI.setVisible(true);
            }
        });
        menuValidadorEmail.add(itemValidadorEmail);


        JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

        itemHerramientaDibujo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HerramientaDibujo herramientaDibujoGUI = new HerramientaDibujo();
                herramientaDibujoGUI.setVisible(true);
            }
        });
        menuHerramientaDibujo.add(itemHerramientaDibujo);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Main frame = new Main();
                frame.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        });
    }
}

