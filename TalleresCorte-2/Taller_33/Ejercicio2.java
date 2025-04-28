/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_33;

/**
 *
 * @author vargas
 */
public class Ejercicio2 {
    
 private int numero;
    private String nombre;
    private String apellidos;
    private String movil;

    // Constructor
    public Ejercicio2(int numero, String nombre, String apellidos, String movil) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
    }

    // Métodos getter y setter
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getMovil() { return movil; }
    public void setMovil(String movil) { this.movil = movil; }
}
