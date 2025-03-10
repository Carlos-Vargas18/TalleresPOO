/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor por defecto que llama al constructor con dos parámetros
    public Estudiante() {
        this("Sin nombre", 0); // Llama al constructor con dos parámetros
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
