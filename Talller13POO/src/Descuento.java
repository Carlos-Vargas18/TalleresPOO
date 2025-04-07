/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base abstracta para descuentos (cerrada para modificación)
abstract class Descuento {
    public abstract double aplicarDescuento(double precio);
}

// Descuento por porcentaje (extensión del sistema)
class DescuentoPorcentaje extends Descuento {
    private double porcentaje;
    
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje / 100);
    }
}

// Descuento fijo (extensión del sistema)
class DescuentoFijo extends Descuento {
    private double cantidad;
    
    public DescuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public double aplicarDescuento(double precio) {
        return precio - cantidad;
    }
}

// Clase para procesar descuentos (cerrada para modificación)
class ProcesadorDescuentos {
    public void procesarDescuento(Descuento descuento, double precioOriginal) {
        double precioFinal = descuento.aplicarDescuento(precioOriginal);
        System.out.printf("Precio original: $%.2f | Precio con descuento: $%.2f\n", 
                         precioOriginal, precioFinal);
    }
}
