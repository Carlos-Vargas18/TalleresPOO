/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Persona con Interfaces Hablador y Trabajador
        Persona persona = new Persona("Juan");
        persona.hablar();  // Juan está hablando.
        persona.trabajar(); // Juan está trabajando.

        // Ejercicio 2: Clase Animal con Interfaces Volador y Nadador
        Animal animal = new Animal("Pato");
        animal.volar();  // Pato está volando.
        animal.nadar();  // Pato está nadando.

    }
}
