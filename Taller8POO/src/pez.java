/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class pez extends animal {
    private String tipoDeAgua;

    // Constructor
    public pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de la clase base (Animal)
        this.tipoDeAgua = tipoDeAgua;
    }

    // Método para mostrar detalles del pez
    public void mostrarDetalles() {
        super.mostrarEspecie(); // Llama al método de la clase base (Animal)
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
