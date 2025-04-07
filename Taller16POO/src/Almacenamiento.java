/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Interfaz de abstracción para el almacenamiento
interface Almacenamiento {
    void guardar(String nombreArchivo, byte[] datos);
    byte[] recuperar(String nombreArchivo);
}

// Implementación concreta para almacenamiento local
class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, byte[] datos) {
        System.out.println("Guardando localmente el archivo: " + nombreArchivo);
        // Lógica para guardar en disco local
    }
    
    @Override
    public byte[] recuperar(String nombreArchivo) {
        System.out.println("Recuperando archivo local: " + nombreArchivo);
        // Lógica para recuperar de disco local
        return new byte[0];
    }
}

// Implementación concreta para almacenamiento en la nube
class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, byte[] datos) {
        System.out.println("Subiendo a la nube el archivo: " + nombreArchivo);
        // Lógica para subir a la nube
    }
    
    @Override
    public byte[] recuperar(String nombreArchivo) {
        System.out.println("Descargando de la nube el archivo: " + nombreArchivo);
        // Lógica para descargar de la nube
        return new byte[0];
    }
}

// Clase de alto nivel que depende de la abstracción
class GestorArchivos {
    private Almacenamiento almacenamiento;
    
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardarArchivo(String nombre, byte[] datos) {
        almacenamiento.guardar(nombre, datos);
    }
    
    public byte[] cargarArchivo(String nombre) {
        return almacenamiento.recuperar(nombre);
    }
}
