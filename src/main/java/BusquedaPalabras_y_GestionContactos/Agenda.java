package BusquedaPalabras_y_GestionContactos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto){
        contactos.remove(contacto);
    }
}
