/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Figura con Rectangulo y Triangulo
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(5, 10);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Área del rectángulo: 50.0
        System.out.println("Área del triángulo: " + triangulo.calcularArea());  // Área del triángulo: 25.0

        // Ejercicio 2: Interfaces Volador y Nadador
        Pato pato = new Pato();
        pato.volar();  // El pato está volando.
        pato.nadar();  // El pato está nadando.

        // Ejercicio 3: Uso Incorrecto de Clases Abstractas e Interfaces
        // Futbolista futbolista = new Futbolista(); // Error de compilación
        // Animal animal = new Animal(); // Error de compilación
    }
}
