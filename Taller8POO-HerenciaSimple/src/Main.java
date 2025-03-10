/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Vehiculo y Coche
        Vehiculo vehiculo = new Vehiculo("Toyota", 200.0);
        Coche coche = new Coche("Ford", 220.0, 4);

        System.out.println("Información del vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformación del coche:");
        coche.mostrarInformacion();

        // Ejercicio 2: Clase Persona y Estudiante
        Persona persona = new Persona("Juan", 25);
        Estudiante estudiante = new Estudiante("Ana", 20, "A12345");

        System.out.println("\nDetalles de la persona:");
        persona.mostrarDetalles();

        System.out.println("\nDetalles del estudiante:");
        estudiante.mostrarDetalles();

        // Ejercicio 3: Clase Empleado y Gerente
        Empleado empleado = new Empleado("Carlos", 3000.0);
        Gerente gerente = new Gerente("Laura", 5000.0, "Ventas");

        System.out.println("\nDetalles del empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nDetalles del gerente:");
        gerente.mostrarDetalles();
    }
}
