/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Producto {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor que utiliza this para diferenciar atributos de parámetros
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
    }
}
