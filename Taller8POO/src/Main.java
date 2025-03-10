/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Clase Persona y Empleado ===");
        pruebaPersonaEmpleado();

        System.out.println("\n=== Ejercicio 2: Clase Animal y Pez ===");
        pruebaAnimalPez();

        System.out.println("\n=== Ejercicio 3: Uso Incorrecto de super ===");
        pruebaUsoIncorrecto();
    }

    // Método para probar el Ejercicio 1
    public static void pruebaPersonaEmpleado() {
        // Crear una instancia de Empleado
        empleado empleado = new empleado("Juan Pérez", 30, "Ventas");

        // Mostrar detalles del empleado
        empleado.mostrarDetalles(); // Nombre, Edad y Departamento
    }

    // Método para probar el Ejercicio 2
    public static void pruebaAnimalPez() {
        // Crear una instancia de Pez
        pez pez = new pez("Tiburón", "Agua salada");

        // Mostrar detalles del pez
        pez.mostrarDetalles(); // Especie y Tipo de agua
    }

    // Método para probar el Ejercicio 3
    public static void pruebaUsoIncorrecto() {
        // Intentar usar super en un contexto incorrecto (esto generará errores de compilación)
        // super.tipo = "Orquídea"; // Error de compilación

        // Intentar acceder a un atributo privado de la clase base
        // Planta planta = new Planta("Orquídea");
        // System.out.println(planta.tipo); // Error de compilación: tipo es privado
    }
}
