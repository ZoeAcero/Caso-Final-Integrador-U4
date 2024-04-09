import BusquedaPalabras_y_GestionContactos.*;
import Editor_Texto_Interactivo.EditorTextoInteractivo;
import Interfaz_Grafica_Avanzada.*;
import javax.swing.*;
import java.awt.event.*;
import Comparador_y_Contador_de_Contenido.*;

public class Main extends JFrame{
    JMenuBar menuBar = new JMenuBar();

    JMenu menuEditorTexto = new JMenu("Editor de Texto");
    JMenu menuBusquedaGestion = new JMenu("Busqueda de Palabras y Gestion de Contactos");
    JMenu menuInterfazGrafica = new JMenu("Interfaz Grafica Avanzada");
    JMenu menuComparadorContenido = new JMenu("Comparador y Contador de Contenido");

    public Main() {
        menuBar.add(menuEditorTexto);
        menuBar.add(menuBusquedaGestion);
        menuBar.add(menuInterfazGrafica);
        menuBar.add(menuComparadorContenido);

        this.setJMenuBar(menuBar);

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

        JMenuItem itemBusquedaGestion = new JMenuItem("Busqueda de Palabras y Gestion de Contactos");

        itemBusquedaGestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Busqueda_de_Palabras_y_Gestion_de_Contactos.BuscadorPalabras busquedaGestionGUI = new Busqueda_de_Palabras_y_Gestion_de_Contactos.BuscadorPalabras();
                busquedaGestionGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemBusquedaGestion);

        JMenuItem itemAgendaContactos = new JMenuItem("Agenda de Contactos");

        itemAgendaContactos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Agenda agendaGUI = new Agenda();
                agendaGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemAgendaContactos);


        JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

        itemHerramientaDibujo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaDocumento ventanaDocumentoGUI = new VentanaDocumento();
                ventanaDocumentoGUI.setVisible(true);
            }
        });
        menuInterfazGrafica.add(itemHerramientaDibujo);
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

