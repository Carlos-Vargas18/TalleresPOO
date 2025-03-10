/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático para contar coches

    // Constructor
    public coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementa el contador cada vez que se crea un coche
    }

    // Método estático para mostrar el contador de coches
    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    // Métodos get para marca y modelo
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
