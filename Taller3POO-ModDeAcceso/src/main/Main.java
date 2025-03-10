/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Main {
    public static void main(String[] args) {
        // Prueba de Producto
        Producto producto = new Producto("Laptop", 1500.99, 10);
        System.out.println("--- Producto ---");
        producto.mostrarInfo();
        
        // Prueba de Moto
        Moto moto = new Moto();
        System.out.println("--- Vehículo ---");
        // System.out.println(moto.tipo); // Error: tipo no es accesible fuera del paquete
        
        // Prueba de Persona
        Persona persona = new Persona("Carlos", 25);
        System.out.println("--- Persona ---");
        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.edad);
    }
}

