/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base Vehiculo
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Coche
class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche avanza por la carretera.");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta pedalea por el camino.");
    }
}
