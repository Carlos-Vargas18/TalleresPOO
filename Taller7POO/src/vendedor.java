/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class vendedor extends empleado {
    private double comision;

    // Constructor
    public vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public void calcularSalario() {
        System.out.println("El salario del vendedor incluye una comisión de: " + comision);
    }
}
