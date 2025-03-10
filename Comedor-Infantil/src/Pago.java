public class Pago {
    private String dniPagador;
    private String nombreCompleto;
    private String direccion;
    private String telefono;
    private String numeroCuentaBancaria;

    // Constructor
    public Pago() {}

    // Getters y Setters
    public String getDniPagador() {
        return dniPagador;
    }

    public void setDniPagador(String dniPagador) {
        this.dniPagador = dniPagador;
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

    public String getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }
}
