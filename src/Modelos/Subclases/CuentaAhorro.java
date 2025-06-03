package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaAhorro extends ATipoCuenta {

    private int saldoMinimo; // Saldo mínimo requerido

    public CuentaAhorro(int numeroDeCuenta, String titular, int saldo, int saldoMinimo) {
        super(numeroDeCuenta, titular, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void realizarGiro(int monto) {
        if (monto > 0 && (saldo - monto) >= saldoMinimo) {
            saldo -= monto;
            giros++;
            System.out.println("Giro realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto es inválido o no cumple con el saldo mínimo requerido.");
        }
    }

    

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(int saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    @Override
    public String toString() {
        return "Cuenta de Ahorro{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", giros=" + giros +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }
    
}
