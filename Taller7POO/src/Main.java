/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Clase Figura y Clases Derivadas ===");
        pruebaFiguras();

        System.out.println("\n=== Ejercicio 2: Clase Empleado y Clases Derivadas ===");
        pruebaEmpleados();

        System.out.println("\n=== Ejercicio 3: Uso Incorrecto de Clases Abstractas ===");
        pruebaAnimales();
    }

    // Método para probar el Ejercicio 1
    public static void pruebaFiguras() {
        // Crear un círculo y un rectángulo
        circulo circulo = new circulo(5.0);
        rectangulo rectangulo = new rectangulo(4.0, 6.0);

        // Mostrar el área de las figuras
        circulo.mostrarArea(); // Área del círculo
        rectangulo.mostrarArea(); // Área del rectángulo
    }

    // Método para probar el Ejercicio 2
    public static void pruebaEmpleados() {
        // Crear un gerente y un vendedor
        gerente gerente = new gerente("Juan Pérez", 1000.0);
        vendedor vendedor = new vendedor("Carlos Gómez", 500.0);

        // Mostrar los detalles de los empleados
        gerente.mostrarDetalles(); // Detalles del gerente
        vendedor.mostrarDetalles(); // Detalles del vendedor
    }

    // Método para probar el Ejercicio 3
    public static void pruebaAnimales() {
        // Crear un perro
        perro perro = new perro();
        perro.hacerSonido(); // El perro ladra
        perro.dormir(); // El animal está durmiendo (mala práctica)

        // Intentar instanciar una clase abstracta (esto generará un error de compilación)
        // Animal animal = new Animal(); // Error: No se puede instanciar una clase abstracta
    }
}
