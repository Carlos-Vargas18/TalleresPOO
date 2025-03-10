/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class gerente extends empleado {
    private double bono;

    // Constructor
    public gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}
