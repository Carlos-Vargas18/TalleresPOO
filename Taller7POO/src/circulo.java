/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class circulo extends figura {
    private double radio;

    // Constructor
    public circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
