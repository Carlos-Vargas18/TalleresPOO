/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Estudiante extends Persona {
    // Atributo adicional
    private String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de la clase base
        this.matricula = matricula;
    }

    // Método para mostrar detalles del estudiante
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base
        System.out.println("Matrícula: " + matricula);
    }
}
