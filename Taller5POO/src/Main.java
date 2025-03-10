/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Clase Empleado y Gerente ===");
        pruebaEmpleadoGerente();

        System.out.println("\n=== Ejercicio 2: Clase Vehículo y Moto ===");
        pruebaVehiculoMoto();

        System.out.println("\n=== Ejercicio 3: Uso Incorrecto de protected en Datos Críticos ===");
        pruebaBanco();
    }

    // Método para probar el Ejercicio 1
    public static void pruebaEmpleadoGerente() {
        gerente gerente = new gerente("Juan Pérez", 5000.0, "Ventas");
        gerente.mostrarInformacion(); // Muestra la información del gerente
    }

    // Método para probar el Ejercicio 2
    public static void pruebaVehiculoMoto() {
        moto moto = new moto("Deportiva", "Yamaha", 600);
        moto.mostrarInformacion(); // Muestra la información de la moto

        // Intentar acceder a miembros protected desde una clase no relacionada (esto generará un error de compilación)
        // Vehiculo vehiculo = new Vehiculo("Sedán", "Toyota");
        // System.out.println(vehiculo.tipo); // Error de compilación: tipo tiene acceso protegido
    }

    // Método para probar el Ejercicio 3
    public static void pruebaBanco() {
        banco banco = new banco(1000.0);
        banco.mostrarSaldo(); // Muestra el saldo inicial

        // Modificar el saldo usando el método set
        banco.setSaldo(1500.0);
        banco.mostrarSaldo(); // Muestra el saldo actualizado

        // Intentar asignar un saldo negativo
        banco.setSaldo(-500.0); // Esto mostrará un mensaje de error
    }
}
