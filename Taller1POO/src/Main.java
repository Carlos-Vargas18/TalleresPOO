/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Clase Libro
        Libro libro1 = new Libro(); // Constructor por defecto
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96); // Constructor parametrizado

        System.out.println("Detalles del libro 1 (constructor por defecto):");
        libro1.mostrarDetalles();

        System.out.println("\nDetalles del libro 2 (constructor parametrizado):");
        libro2.mostrarDetalles();

        // Ejercicio 2: Clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(); // Constructor por defecto
        CuentaBancaria cuenta2 = new CuentaBancaria("123456789", "Ahorros"); // Constructor con dos parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("987654321", 1500.0, "Corriente"); // Constructor con tres parámetros

        System.out.println("\nDetalles de la cuenta 1 (constructor por defecto):");
        cuenta1.mostrarDetalles();

        System.out.println("\nDetalles de la cuenta 2 (constructor con dos parámetros):");
        cuenta2.mostrarDetalles();

        System.out.println("\nDetalles de la cuenta 3 (constructor con tres parámetros):");
        cuenta3.mostrarDetalles();

        // Ejercicio 3: Clase Estudiante
        Estudiante estudiante1 = new Estudiante(); // Constructor por defecto
        Estudiante estudiante2 = new Estudiante("Juan", 20); // Constructor con nombre y edad
        Estudiante estudiante3 = new Estudiante("Ana", 22, "Matemáticas"); // Constructor con todos los parámetros

        System.out.println("\nDetalles del estudiante 1 (constructor por defecto):");
        estudiante1.mostrarDetalles();

        System.out.println("\nDetalles del estudiante 2 (constructor con nombre y edad):");
        estudiante2.mostrarDetalles();

        System.out.println("\nDetalles del estudiante 3 (constructor con todos los parámetros):");
        estudiante3.mostrarDetalles();

        // Ejercicio Final: Proyecto Integrador
        System.out.println("\nIngrese los datos para un nuevo libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro3 = new Libro(titulo, autor, paginas);
        System.out.println("\nDetalles del libro ingresado:");
        libro3.mostrarDetalles();

        scanner.close();
    }
}
