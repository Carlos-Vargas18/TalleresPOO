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
        System.out.println("=== Taller DIP (Principio de Inversión de Dependencias) ===");
        
        // Ejercicio 1: Sistema de Autenticación
        System.out.println("\n--- Ejercicio 1: Sistema de Autenticación ---");
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAuth = new GestorAutenticacion(authLocal);
        System.out.println("Resultado autenticación local: " + 
                          gestorAuth.verificarCredenciales("admin", "1234"));
        
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        gestorAuth = new GestorAutenticacion(authOAuth);
        System.out.println("Resultado autenticación OAuth: " + 
                          gestorAuth.verificarCredenciales("user@mail.com", "password123"));
        
        // Ejercicio 2: Sistema de Almacenamiento
        System.out.println("\n--- Ejercicio 2: Sistema de Almacenamiento ---");
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoLocal);
        gestorArchivos.guardarArchivo("documento.txt", "Datos del documento".getBytes());
        
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        gestorArchivos = new GestorArchivos(almacenamientoNube);
        gestorArchivos.cargarArchivo("backup.zip");
        
        // Ejercicio 3: Sistema de Reportes
        System.out.println("\n--- Ejercicio 3: Sistema de Reportes ---");
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorReportes = new GestorReportes(pdf);
        gestorReportes.crearReporte("Datos de ventas 2023");
        
        GeneradorReporte excel = new ReporteExcel();
        gestorReportes = new GestorReportes(excel);
        gestorReportes.crearReporte("Datos de inventario");
        
        System.out.println("\n=== Fin del taller DIP ===");
    }
}
