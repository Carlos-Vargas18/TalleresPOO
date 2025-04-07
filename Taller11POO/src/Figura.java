/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base Figura
class Figura {
    public void calcularArea() {
        System.out.println("Calculando área de una figura genérica.");
    }
}

// Clase derivada Circulo
class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.printf("Área del círculo con radio %.2f: %.2f\n", radio, area);
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.printf("Área del rectángulo (base %.2f, altura %.2f): %.2f\n", base, altura, area);
    }
}