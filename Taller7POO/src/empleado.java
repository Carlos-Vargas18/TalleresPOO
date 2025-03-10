/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//calse abstracta
public abstract class empleado {
    protected String nombre;

    // Constructor
    public empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para calcular el salario
    public abstract void calcularSalario();

    // Método concreto para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        calcularSalario();
    }
}
