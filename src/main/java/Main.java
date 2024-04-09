import java.util.Scanner;
import BusquedaPalabras_y_GestionContactos.*;
import Interfaz_Grafica_Avanzada.*;
import javax.swing.*;
import java.awt.event.*;
import Editor_Texto_Interactivo.*;
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
                AnalisisTexto editorTextoGUI = new AnalisisTexto();
                editorTextoGUI.setVisible(true);
            }
        });
        menuEditorTexto.add(itemEditorTexto);

        JMenuItem itemComparadorContenido = new JMenuItem("Comparador y Contador de Contenido");

        itemComparadorContenido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HerramientaComparacion comparadorContenidoGUI = new HerramientaComparacion();
                comparadorContenidoGUI.setVisible(true);
            }
        });

        menuComparadorContenido.add(itemComparadorContenido);

        JMenuItem itemBusquedaGestion = new JMenuItem("Busqueda de Palabras y Gestion de Contactos");

        itemBusquedaGestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BuscadorPalabras busquedaGestionGUI = new BuscadorPalabras();
                busquedaGestionGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemBusquedaGestion);

        JMenuItem itemAgendaContactos = new JMenuItem("Agenda de Contactos");

        itemAgendaContactos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Agenda agendaContactosGUI = new Agenda();
                agendaContactosGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemAgendaContactos);
        

        JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

        itemHerramientaDibujo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HerramientaDibujo herramientaDibujoGUI = new HerramientaDibujo();
                herramientaDibujoGUI.setVisible(true);
            }
        });
        menuInterfazGrafica.add(itemHerramientaDibujo);
    }

    private void setJMenuBar(JMenuBar menuBar) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                JOptionPane JDptionPane = null;
                JDptionPane.showMessageDialog(null, e.getMessage());
            }
        });
    }
}
