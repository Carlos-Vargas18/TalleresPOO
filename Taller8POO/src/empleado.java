/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class empleado extends persona {
    private String departamento;

    // Constructor
    public empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llama al constructor de la clase base (Persona)
        this.departamento = departamento;
    }

    // Sobrescribe el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base (Persona)
        System.out.println("Departamento: " + departamento);
    }
}
