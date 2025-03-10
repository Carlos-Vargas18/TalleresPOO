/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Persona implements Hablador, Trabajador {
    // Atributos
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método hablar de la interfaz Hablador
    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    // Implementación del método trabajar de la interfaz Trabajador
    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}
