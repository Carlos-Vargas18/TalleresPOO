import java.util.ArrayList;
import java.util.List;

public class Niño {
    private String numeroMatricula;
    private String nombreCompleto;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String fechaBaja;
    private List<PersonaAutorizada> personasAutorizadas = new ArrayList<>();
    private Pago pago;
    private List<Alergia> alergias = new ArrayList<>();
    private List<ConsumoComida> consumoComidas = new ArrayList<>();

    // Constructor
    public Niño() {}

    // Getters y Setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<PersonaAutorizada> getPersonasAutorizadas() {
        return personasAutorizadas;
    }

    public void setPersonasAutorizadas(List<PersonaAutorizada> personasAutorizadas) {
        this.personasAutorizadas = personasAutorizadas;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public List<ConsumoComida> getConsumoComidas() {
        return consumoComidas;
    }

    public void setConsumoComidas(List<ConsumoComida> consumoComidas) {
        this.consumoComidas = consumoComidas;
    }

}

