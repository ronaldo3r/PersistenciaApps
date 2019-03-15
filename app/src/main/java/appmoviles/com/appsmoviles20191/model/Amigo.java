package appmoviles.com.appsmoviles20191.model;

public class Amigo {

    private String id;
    private String nombre;
    private String edad;
    private String telefono;
    private String email;

    //Serializar
    public Amigo(){

    }

    public Amigo(String id, String nombre, String edad, String telefono, String email) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
