public class PersonaAutorizada {
    private String dni;
    private String nombreCompleto;
    private String direccion;
    private String telefono;
    private String relacionConNino;

    // Constructor
    public PersonaAutorizada() {}

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRelacionConNino() {
        return relacionConNino;
    }

    public void setRelacionConNino(String relacionConNino) {
        this.relacionConNino = relacionConNino;
    }
}
