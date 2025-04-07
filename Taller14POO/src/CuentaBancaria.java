/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base CuentaBancaria
class CuentaBancaria {
    protected double saldo;
    
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado: $" + monto);
    }
    
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retirado: $" + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
    
    public double consultarSaldo() {
        return saldo;
    }
}

// Clase derivada CuentaAhorros
class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;
    
    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres() {
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
        System.out.println("Interés aplicado: $" + interes);
    }
    
    // Sobreescribimos retirar para mantener el mismo comportamiento
    @Override
    public void retirar(double monto) {
        super.retirar(monto);
    }
}
