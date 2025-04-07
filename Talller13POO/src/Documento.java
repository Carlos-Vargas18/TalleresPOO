/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Interfaz base para exportación de documentos (cerrada para modificación)
// Clase base abstracta (como en los ejemplos del taller)
abstract class ExportadorDocumento {
    public abstract void exportar(String contenido);
}

class ExportadorPDF extends ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

class ExportadorWord extends ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word: " + contenido);
    }
}
