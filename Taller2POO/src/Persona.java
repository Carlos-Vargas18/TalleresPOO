/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Persona {
    private String nombre;

    // Método no static que usa this correctamente
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre); // Uso correcto de this
    }
}
