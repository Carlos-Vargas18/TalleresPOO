/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base Transporte
class Transporte {
    public void mover() {
        System.out.println("El transporte se está moviendo");
    }
    
    public void detener() {
        System.out.println("El transporte se ha detenido");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Transporte {
    @Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando");
    }
}

// Clase derivada Coche
class Coche extends Transporte {
    @Override
    public void mover() {
        System.out.println("El coche está avanzando");
    }
}
