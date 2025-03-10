import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int numeroMenu;
    private String nombrePlato;
    private List<String> ingredientes = new ArrayList<>();

    // Constructor
    public Menu() {}

    // Getters y Setters
    public int getNumeroMenu() {
        return numeroMenu;
    }

    public void setNumeroMenu(int numeroMenu) {
        this.numeroMenu = numeroMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}