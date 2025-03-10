/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Empleado {
    // Propiedades
    public String nombre; // Propiedad pública
    private double salario; // Propiedad privada

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos get y set para salario con validación
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) { // Validación para evitar salarios negativos
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
}
