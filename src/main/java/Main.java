import java.util.Scanner;
import BusquedaPalabras_y_GestionContactos.*;
import Interfaz_Grafica_Avanzada.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Editor_Texto_Interactivo.*;
import Comparador_y_Contador_de_Contenido.*;


public class Main () {

    JMenuBar menuBar = new JMenuBar();


    //menus para cada una de las opciones

    JMenu menuEditorTexto = new JMenu("Editor de Texto");
    JMenu menuBusquedaGestion = new JMenu("Busqueda de Palabras y Gestion de Contactos");
    JMenu menuInterfazGrafica = new JMenu("Interfaz Grafica Avanzada");
    JMenu menuComparadorContenido = new JMenu("Comparador y Contador de Contenido");


    //agregar menus a barra de menu

    menuBar.add(menuEditorTexto);
    menuBar.add(menuBusquedaGestion);
    menuBar.add(menuInterfazGrafica);
    menuBar.add(menuComparadorContenido);


    //agregar barra menu a marco principal

    setJMenuBar(menuBar);


    //editor texto interactivo

    JMenuItem itemEditorTexto = new JMenuItem("Editor de Texto");

    itemEditorTexto.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
            editorTextoGUI.setVisible(true);
        }
    });
    menuEditorTexto.add(itemEditorTexto);



    //comparador y contador de contenido

    JMenuItem itemComparadorContenido = new JMenuItem("Comparador y Contador de Contenido");

    itemComparadorContenido.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
            comparadorContenidoGUI.setVisible(true);
        }
    });
    menuComparadorContenido.add(itemComparadorContenido);


    //busqueda de palabras y gestion de contactos

    JMenuItem itemBusquedaGestion = new JMenuItem("Busqueda de Palabras y Gestion de Contactos");

    itemBusquedaGestion.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            BusquedaGestionGUI busquedaGestionGUI = new BusquedaGestionGUI();
            busquedaGestionGUI.setVisible(true);
        }
    });
    menuBusquedaGestion.add(itemBusquedaGestion);

}
