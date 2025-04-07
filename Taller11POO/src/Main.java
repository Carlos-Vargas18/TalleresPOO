/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller de Polimorfismo en Java ===");
        System.out.println("\n--- Ejercicio 1: Figuras ---");
        
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 6.0);
        Figura figuraGenerica = new Figura();
        
        figura1.calcularArea();    // Polimorfismo: llama a calcularArea de Circulo
        figura2.calcularArea();    // Polimorfismo: llama a calcularArea de Rectangulo
        figuraGenerica.calcularArea(); // Llama al método de la clase base
        
        System.out.println("\n--- Ejercicio 2: Personas ---");
        
        Persona persona1 = new Estudiante("Ingeniería Informática");
        Persona persona2 = new Profesor("Programación Orientada a Objetos");
        Persona personaGenerica = new Persona();
        
        persona1.presentarse();    // Polimorfismo: llama a presentarse de Estudiante
        persona2.presentarse();    // Polimorfismo: llama a presentarse de Profesor
        personaGenerica.presentarse(); // Llama al método de la clase base
        
        System.out.println("\n--- Ejercicio 3: Uso incorrecto ---");
        
        Instrumento miInstrumento = new Guitarra();
        miInstrumento.tocar();     // Correcto: polimorfismo funciona
        
        // La siguiente línea daría error de compilación (descomentar para ver el error)
        // miInstrumento.afinar(); // Error: afinar() no existe en Instrumento
        
        System.out.println("(El error de compilación está comentado en el código)");
        
        System.out.println("\n--- Ejercicio 4: Vehículos ---");
        
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();
        Vehiculo vehiculoGenerico = new Vehiculo();
        
        vehiculo1.mover();    // Polimorfismo: llama a mover de Coche
        vehiculo2.mover();    // Polimorfismo: llama a mover de Bicicleta
        vehiculoGenerico.mover(); // Llama al método de la clase base
        
        System.out.println("\n=== Fin del taller ===");
    }
}
