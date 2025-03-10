/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    // No se proporcionan métodos get y set
    public void actualizarPrecio(double nuevoPrecio) {
        // No se realiza ninguna validación
        precio = nuevoPrecio;
    }
}
