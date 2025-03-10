/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Clase Coche con Contador de Instancias ===");
        pruebaCoche();

        System.out.println("\n=== Ejercicio 2: Clase Matematicas con Métodos static ===");
        pruebaMatematicas();

        System.out.println("\n=== Ejercicio 3: Uso Incorrecto de static ===");
        pruebaPersona();
    }

    // Método para probar el Ejercicio 1
    public static void pruebaCoche() {
        // Crear varios coches
        coche coche1 = new coche("Toyota", "Corolla");
        coche coche2 = new coche("Honda", "Civic");
        coche coche3 = new coche("Ford", "Mustang");

        // Mostrar el contador de coches creados
        coche.mostrarContador(); // Debe mostrar: Total de coches creados: 3
    }

    // Método para probar el Ejercicio 2
    public static void pruebaMatematicas() {
        // Realizar operaciones matemáticas
        int suma = matematicas.sumar(10, 5);
        int resta = matematicas.restar(10, 5);
        int multiplicacion = matematicas.multiplicar(10, 5);
        double division = matematicas.dividir(10, 5);

        // Mostrar los resultados
        System.out.println("Suma: " + suma); // 15
        System.out.println("Resta: " + resta); // 5
        System.out.println("Multiplicación: " + multiplicacion); // 50
        System.out.println("División: " + division); // 2.0

        // Intentar dividir por cero
        matematicas.dividir(10, 0); // Error: No se puede dividir por cero.
    }

    // Método para probar el Ejercicio 3
    public static void pruebaPersona() {
        // Crear una instancia de Persona
        persona persona = new persona("Juan Pérez");

        // Mostrar el nombre usando el método no estático
        persona.mostrarNombre(); // Nombre: Juan Pérez
    }
}
