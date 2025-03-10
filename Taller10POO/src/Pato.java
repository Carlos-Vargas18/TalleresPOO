/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Pato implements Volador, Nadador {
    // Implementación del método volar de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    // Implementación del método nadar de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
