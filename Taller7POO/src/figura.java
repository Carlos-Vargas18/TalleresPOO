/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//clase abstracta
public abstract class figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método concreto para mostrar el área
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
