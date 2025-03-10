/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Empleado
        Empleado empleado = new Empleado("Juan Pérez", 3000.0);
        System.out.println("Nombre del empleado: " + empleado.nombre); // Acceso directo a propiedad pública
        System.out.println("Salario inicial: " + empleado.getSalario());

        empleado.setSalario(3500.0); // Modificar salario usando método público
        System.out.println("Nuevo salario: " + empleado.getSalario());

        // Intentar acceder directamente a salario (generará error de compilación)
        // System.out.println(empleado.salario); // Error: salario tiene acceso privado

        // Ejercicio 2: Clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 5000.0, "Ahorros");
        System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta); // Acceso directo a propiedad pública
        cuenta.mostrarDetalles(); // Mostrar detalles de la cuenta

        cuenta.setSaldo(6000.0); // Modificar saldo usando método público
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());

        // Intentar acceder directamente a numeroCuenta (generará error de compilación)
        // System.out.println(cuenta.numeroCuenta); // Error: numeroCuenta tiene acceso privado

        // Ejercicio 3: Clase Utilidades
        System.out.println("Suma: " + Utilidades.sumar(10, 5));
        System.out.println("Resta: " + Utilidades.restar(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(10, 5));
        System.out.println("División: " + Utilidades.dividir(10, 5));
        System.out.println("División por cero: " + Utilidades.dividir(10, 0)); // Error controlado
    }
}
