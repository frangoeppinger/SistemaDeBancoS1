package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaCorriente extends ATipoCuenta {

    public CuentaCorriente(int numeroDeCuenta, String titular, int saldo) {
        super(numeroDeCuenta, titular, saldo);
    }

    @Override
    public void realizarGiro(int monto) {
        saldo -= monto;
        giros++;
        System.out.println("Giro realizado con éxito. Nuevo saldo: $" + saldo);
    }

}