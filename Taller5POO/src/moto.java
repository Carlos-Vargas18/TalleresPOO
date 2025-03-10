/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class moto extends vehiculo {
    private int cilindrada;

    public moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        mostrarDetalles(); // Accede al método protegido de la clase base
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
