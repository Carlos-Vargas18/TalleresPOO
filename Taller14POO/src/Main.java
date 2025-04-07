/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Taller LSP (Principio de Sustitución de Liskov) ===");
        
        // Ejercicio 1: Figuras Geométricas
        System.out.println("\n--- Ejercicio 1: Sistema de Figuras Geométricas ---");
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
        // Ejercicio 2: Cuentas Bancarias
        System.out.println("\n--- Ejercicio 2: Sistema de Cuentas Bancarias ---");
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1000, 5.0);
        
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        System.out.println("Saldo cuenta normal: $" + cuenta1.consultarSaldo());
        
        cuentaAhorros.depositar(500);
        cuentaAhorros.retirar(200);
        ((CuentaAhorros)cuentaAhorros).aplicarInteres(); // Método específico
        System.out.println("Saldo cuenta ahorros: $" + cuentaAhorros.consultarSaldo());
        
        // Ejercicio 3: Transporte
        System.out.println("\n--- Ejercicio 3: Refactorización de Clases de Transporte ---");
        Transporte transporte1 = new Bicicleta();
        Transporte transporte2 = new Coche();
        
        transporte1.mover();
        transporte1.detener();
        
        transporte2.mover();
        transporte2.detener();
        
        System.out.println("\n=== Fin del taller LSP ===");
    }
}