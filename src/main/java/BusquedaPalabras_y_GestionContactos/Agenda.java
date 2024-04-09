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

    public Contacto buscarContacto(String nombre){
        for(Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre)){
                return contacto;
            }
        }
        return null;
    }

    public void actualizarContacto(String nombre, Contacto nuevosDetalles){
        Contacto contacto = buscarContacto(nombre);
        if(contacto != null){
            contacto.setNombre(nuevosDetalles.getNombre());
            contacto.setTelefono(nuevosDetalles.getTelefono());
            contacto.setEmail(nuevosDetalles.getEmail());
        }
    }

        public void listarContactos() {
            for(Contacto contacto : contactos){
                System.out.println("Nombre: " + contacto.getNombre());
                System.out.println("Telefono: " + contacto.getTelefono());
                System.out.println("Email: " + contacto.getEmail());
                System.out.println("-------------------------------");
            }
        }

        public int contarContactos(){
            return contactos.size();
        }

    public void setVisible(boolean b) {
    }
}
