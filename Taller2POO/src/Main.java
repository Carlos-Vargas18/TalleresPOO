/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Producto
        Producto producto1 = new Producto("Laptop", 1200.0);
        System.out.println("Detalles del producto 1:");
        producto1.mostrarProducto();

        // Ejercicio 2: Clase Estudiante
        Estudiante estudiante1 = new Estudiante(); // Constructor por defecto
        Estudiante estudiante2 = new Estudiante("Juan", 20); // Constructor con dos parámetros

        System.out.println("\nDetalles del estudiante 1 (constructor por defecto):");
        estudiante1.mostrarDetalles();

        System.out.println("\nDetalles del estudiante 2 (constructor con dos parámetros):");
        estudiante2.mostrarDetalles();

        // Ejercicio 3: Evitar Errores con this
        //Persona persona = new Persona();
        // persona.mostrarNombre(); // Esto no funcionará porque el método no está definido en el código corregido
    }
}
