package Busqueda_de_Palabras_y_Gestion_de_Contactos;

public class Contacto {
    private String nombre;
    private String email;
    private String numeroTelefono;

    public Contacto(String nombre, String email, String numeroTelefono) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public Contacto() {

    }

    // Getters y setters para nombre, email y numeroTelefono

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setVisible(boolean b) {
    }
}

