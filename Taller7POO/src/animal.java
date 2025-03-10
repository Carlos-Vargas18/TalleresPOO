/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//clase abstracta incorrecta
public abstract class animal {
    // Método abstracto
    public abstract void hacerSonido();

    // Método concreto que no debe ser sobrescrito (mala práctica)
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}
