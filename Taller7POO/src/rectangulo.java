/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class rectangulo extends figura {
    private double base;
    private double altura;

    // Constructor
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
