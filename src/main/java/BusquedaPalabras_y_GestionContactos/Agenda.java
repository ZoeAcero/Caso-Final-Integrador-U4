package BusquedaPalabras_y_GestionContactos;

import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private List<Busqueda_de_Palabras_y_Gestion_de_Contactos.Contacto> contactos;

    public void Contacto() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Busqueda_de_Palabras_y_Gestion_de_Contactos.Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Busqueda_de_Palabras_y_Gestion_de_Contactos.Contacto contacto) {
        contactos.remove(contacto);
    }

    public void setVisible(boolean b) {
    }

    // Otros métodos para gestionar contactos
}