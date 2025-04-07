/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base para demostración de uso incorrecto
class Instrumento {
    public void tocar() {
        System.out.println("Tocando un instrumento.");
    }
}

// Clase derivada con método adicional
class Guitarra extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra.");
    }
    
    public void afinar() {
        System.out.println("Afinando la guitarra.");
    }
}
