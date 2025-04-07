/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller SRP (Principio de Responsabilidad Única) ===");
        
        // Ejercicio 1: Libro
        System.out.println("\n--- Ejercicio 1: Refactorización de la clase Libro ---");
        Libro libro = new Libro("Clean Code", "Robert C. Martin", "978-0132350884");
        ReporteLibroService reporteService = new ReporteLibroService();
        LibroRepository libroRepo = new LibroRepository();
        
        reporteService.generarReporte(libro);
        libroRepo.guardarLibro(libro);
        
        // Ejercicio 2: Producto
        System.out.println("\n--- Ejercicio 2: Separación de responsabilidades en Producto ---");
        Producto producto = new Producto("Laptop", 1500.00, "PROD-001");
        EtiquetaService etiquetaService = new EtiquetaService();
        CalculadoraPrecioService precioService = new CalculadoraPrecioService();
        
        etiquetaService.generarEtiqueta(producto);
        System.out.println("Precio con descuento (10%): $" + 
                          precioService.calcularPrecioConDescuento(producto, 0.10));
        System.out.println("Precio con impuesto (15%): $" + 
                          precioService.calcularPrecioConImpuesto(producto, 0.15));
        
        // Ejercicio 3: Autenticación
        System.out.println("\n--- Ejercicio 3: Separar la lógica de autenticación ---");
        Usuario usuario = new Usuario("admin", "password123");
        AutenticacionService authService = new AutenticacionService();
        ValidacionService validacionService = new ValidacionService();
        
        System.out.println("Validación de username: " + 
                          validacionService.validarUsername(usuario.getUsername()));
        System.out.println("Validación de password: " + 
                          validacionService.validarPassword(usuario.getPassword()));
        System.out.println("Autenticación exitosa: " + 
                          authService.autenticar(usuario, "password123"));
        
        System.out.println("\n=== Fin del taller SRP ===");
    }
}
