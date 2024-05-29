public class Proveedor {
    private String nombre;
    private String email;
    private String telefono;
    private String servicios;

    public Proveedor() {
    }

    public Proveedor(String nombre, String email, String telefono, String servicios) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.servicios = servicios;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    
}
