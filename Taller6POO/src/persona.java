/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//uso correcto del static
public class persona {
    private String nombre; // Atributo no estático

    // Constructor
    public persona(String nombre) {
        this.nombre = nombre;
    }

    // Método no estático para mostrar el nombre
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

//uso incorrecto del estatic
//public class Persona {
    //private String nombre; // Atributo no estático

    // Constructor
    //public Persona(String nombre) {
        //this.nombre = nombre}
// Método estático que intenta acceder a un atributo no estático (incorrecto)public static void mostrarNombre() {
        // System.out.println("Nombre: " + nombre); // Error de compilación: No se puede acceder a 'nombre' desde un contexto estático}