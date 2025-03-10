/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class vehiculo {
    protected String tipo;
    protected String marca;

    public vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}
