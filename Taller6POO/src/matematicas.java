/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class matematicas {
    // Método estático para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método estático para multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método estático para dividir
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return (double) a / b;
    }
}
