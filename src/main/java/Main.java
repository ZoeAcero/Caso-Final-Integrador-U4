import java.util.Scanner;
import BusquedaPalabras_y_GestionContactos.*;
import Interfaz_Grafica_Avanzada.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Editor_Texto_Interactivo.*;
import Comparador_y_Contador_de_Contenido.*;

public class Main {

    JMenuBar menuBar = new JMenuBar();

    JMenu menuEditorTexto = new JMenu("Editor de Texto");
    JMenu menuBusquedaGestion = new JMenu("Busqueda de Palabras y Gestion de Contactos");
    JMenu menuInterfazGrafica = new JMenu("Interfaz Grafica Avanzada");
    JMenu menuComparadorContenido = new JMenu("Comparador y Contador de Contenido");

    Main() {
        menuBar.add(menuEditorTexto);
        menuBar.add(menuBusquedaGestion);
        menuBar.add(menuInterfazGrafica);
        menuBar.add(menuComparadorContenido);

        this.setJMenuBar(menuBar);

        JMenuItem itemEditorTexto = new JMenuItem("Editor de Texto");

        itemEditorTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
                editorTextoGUI.setVisible(true);
            }
        });
        menuEditorTexto.add(itemEditorTexto);

        JMenuItem itemComparadorContenido = new JMenuItem("Comparador y Contador de Contenido");

        itemComparadorContenido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
                comparadorContenidoGUI.setVisible(true);
            }
        });
        menuComparadorContenido.add(itemComparadorContenido);

        JMenuItem itemBusquedaGestion = new JMenuItem("Busqueda de Palabras y Gestion de Contactos");

        itemBusquedaGestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BusquedaGestionGUI busquedaGestionGUI = new BusquedaGestionGUI();
                busquedaGestionGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemBusquedaGestion);

        JMenuItem itemAgendaContactos = new JMenuItem("Agenda de Contactos");

        itemAgendaContactos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgendaContactosGUI agendaContactosGUI = new AgendaContactosGUI();
                agendaContactosGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemAgendaContactos);

        JMenuItem itemValidadorEmail = new JMenuItem("Validador de Email");

        itemValidadorEmail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ValidadorEmailGUI validadorEmailGUI = new ValidadorEmailGUI();
                validadorEmailGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemValidadorEmail);

        JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

        itemHerramientaDibujo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HerramientaDibujoGUI herramientaDibujoGUI = new HerramientaDibujoGUI();
                herramientaDibujoGUI.setVisible(true);
            }
        });
        menuInterfazGrafica.add(itemHerramientaDibujo);
    }
}
