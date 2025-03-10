/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Estudiante
        Estudiante estudiante = new Estudiante("Juan", 20, 8.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        // Intentar acceder directamente a propiedades privadas (generará error de compilación)
        // System.out.println(estudiante.nombre); // Error: nombre tiene acceso privado

        // Ejercicio 2: Clase Coche
        Coche coche = new Coche("Toyota", "Corolla", 180.0);
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

        coche.acelerar(20.0);
        System.out.println("Nueva Velocidad Máxima: " + coche.getVelocidadMaxima());

        // Intentar acceder directamente a propiedades privadas (generará error de compilación)
        // System.out.println(coche.velocidadMaxima); // Error: velocidadMaxima tiene acceso privado

        // Ejercicio 3: Uso Incorrecto de private
        Producto producto = new Producto(100.0);
        producto.actualizarPrecio(-50.0); // No hay validación, se permite un precio negativo
        //System.out.println("Precio actualizado sin validación: " + Producto.actualizarPrecio(-50.0));
    }
}
