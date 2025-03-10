import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un niño
        Niño niño = new Niño();
        niño.setNumeroMatricula("12345");
        niño.setNombreCompleto("Juan Pérez");
        niño.setFechaNacimiento("01/01/2018");
        niño.setFechaIngreso("01/09/2023");

        // Crear una persona autorizada
        PersonaAutorizada personaAutorizada = new PersonaAutorizada();
        personaAutorizada.setDni("12345678A");
        personaAutorizada.setNombreCompleto("María López");
        personaAutorizada.setRelacionConNino("Madre");

        // Asignar la persona autorizada al niño
        niño.getPersonasAutorizadas().add(personaAutorizada);

        // Crear un pago
        Pago pago = new Pago();
        pago.setDniPagador("12345678A");
        pago.setNombreCompleto("María López");
        pago.setNumeroCuentaBancaria("ES1234567890123456789012");
        niño.setPago(pago);

        // Crear una alergia
        Alergia alergia = new Alergia();
        alergia.setIngredienteProhibido("Cacahuetes");
        niño.getAlergias().add(alergia);

        // Crear un menú
        Menu menu = new Menu();
        menu.setNumeroMenu(1);
        menu.setNombrePlato("Macarrones con tomate");
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Macarrones");
        ingredientes.add("Tomate");
        menu.setIngredientes(ingredientes);

        // Registrar consumo de comida
        ConsumoComida consumoComida = new ConsumoComida();
        consumoComida.setFecha("01/10/2023");
        consumoComida.setMenu(menu);
        niño.getConsumoComidas().add(consumoComida);

        // Construir el mensaje en formato de lista
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("=== Información del Niño ===\n");
        mensaje.append("- Número de matrícula: ").append(niño.getNumeroMatricula()).append("\n");
        mensaje.append("- Nombre completo: ").append(niño.getNombreCompleto()).append("\n");
        mensaje.append("- Fecha de nacimiento: ").append(niño.getFechaNacimiento()).append("\n");
        mensaje.append("- Fecha de ingreso: ").append(niño.getFechaIngreso()).append("\n");
        mensaje.append("\n=== Persona Autorizada ===\n");
        mensaje.append("- Nombre: ").append(niño.getPersonasAutorizadas().get(0).getNombreCompleto()).append("\n");
        mensaje.append("- Relación: ").append(niño.getPersonasAutorizadas().get(0).getRelacionConNino()).append("\n");
        mensaje.append("\n=== Información de Pago ===\n");
        mensaje.append("- Pagador: ").append(niño.getPago().getNombreCompleto()).append("\n");
        mensaje.append("- Número de cuenta: ").append(niño.getPago().getNumeroCuentaBancaria()).append("\n");
        mensaje.append("\n=== Alergias ===\n");
        mensaje.append("- Ingrediente prohibido: ").append(niño.getAlergias().get(0).getIngredienteProhibido()).append("\n");
        mensaje.append("\n=== Última Comida Consumida ===\n");
        mensaje.append("- Fecha: ").append(niño.getConsumoComidas().get(0).getFecha()).append("\n");
        mensaje.append("- Menú: ").append(niño.getConsumoComidas().get(0).getMenu().getNombrePlato()).append("\n");
        mensaje.append("- Ingredientes: ").append(String.join(", ", niño.getConsumoComidas().get(0).getMenu().getIngredientes())).append("\n");

        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Detalles del Niño", JOptionPane.INFORMATION_MESSAGE);
    }
}