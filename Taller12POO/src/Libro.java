/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase Libro (solo contiene datos del libro)
class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
}

// Clase para generar reportes de libros
class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("=== Reporte del Libro ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("========================");
    }
}

// Clase para persistencia de libros
class LibroRepository {
    public void guardarLibro(Libro libro) {
        System.out.println("Guardando libro en la base de datos: " + libro.getTitulo());
        // Lógica para guardar en BD
    }
    
    public void eliminarLibro(Libro libro) {
        System.out.println("Eliminando libro de la base de datos: " + libro.getTitulo());
        // Lógica para eliminar de BD
    }
}
