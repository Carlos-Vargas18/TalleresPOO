/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Gerente extends Empleado {
    // Atributo adicional
    private String departamento;

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    // Método para mostrar detalles del gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}
