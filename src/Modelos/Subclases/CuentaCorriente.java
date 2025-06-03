package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaCorriente extends ATipoCuenta {
    public CuentaCorriente(int numeroDeCuenta, String titular, int saldo) {
        super(numeroDeCuenta, titular, saldo);
    }
    
    @Override
    public void mostrarDetallesCuenta() {
        System.out.println("Cuenta Corriente:");
        System.out.println("Número de cuenta: " + numeroDeCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}