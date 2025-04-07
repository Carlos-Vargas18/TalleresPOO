/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase Producto (solo contiene datos del producto)
class Producto {
    private String nombre;
    private double precio;
    private String codigo;
    
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCodigo() { return codigo; }
}

// Clase para generar etiquetas de productos
class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("=== ETIQUETA DEL PRODUCTO ===");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("============================");
    }
}

// Clase para cálculos de precios
class CalculadoraPrecioService {
    public double calcularPrecioConDescuento(Producto producto, double descuento) {
        return producto.getPrecio() * (1 - descuento);
    }
    
    public double calcularPrecioConImpuesto(Producto producto, double impuesto) {
        return producto.getPrecio() * (1 + impuesto);
    }
}
