/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class animal {
    protected String especie;

    // Constructor
    public animal(String especie) {
        this.especie = especie;
    }

    // Método para mostrar la especie
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
