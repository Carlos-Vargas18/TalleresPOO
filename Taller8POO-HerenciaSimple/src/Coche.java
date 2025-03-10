/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Coche extends Vehiculo {
    // Atributo adicional
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método para mostrar información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
