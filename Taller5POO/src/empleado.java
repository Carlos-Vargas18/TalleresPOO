/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class empleado {
    protected String nombre;
    protected double salario;

    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
