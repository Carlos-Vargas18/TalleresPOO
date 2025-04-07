/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Interfaz de abstracción para generación de reportes
interface GeneradorReporte {
    void generarReporte(String datos);
}

// Implementación concreta para reportes PDF
class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte PDF con datos: " + datos);
        // Lógica específica para PDF
    }
}

// Implementación concreta para reportes Excel
class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte Excel con datos: " + datos);
        // Lógica específica para Excel
    }
}

// Clase de alto nivel que depende de la abstracción
class GestorReportes {
    private GeneradorReporte generador;
    
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }
    
    public void crearReporte(String datos) {
        generador.generarReporte(datos);
    }
}
