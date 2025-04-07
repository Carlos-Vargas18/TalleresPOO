/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base abstracta Figura
abstract class Figura {
    public abstract double calcularArea();
}

// Clase derivada Circulo
class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Figura {
    private double ancho;
    private double altura;
    
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return ancho * altura;
    }
}
