/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Animal implements Volador, Nadador {
    // Atributos
    private String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método volar de la interfaz Volador
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    // Implementación del método nadar de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}
