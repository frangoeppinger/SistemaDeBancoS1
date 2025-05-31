package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaAhorro extends ATipoCuenta {

    private double tasaInteres; // Tasa de interés anual
    private double saldoMinimo; // Saldo mínimo requerido

    public CuentaAhorro(int numeroDeCuenta, String titular, int saldo, double tasaInteres, double saldoMinimo) {
        super(numeroDeCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
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

    // Método para calcular el interés acumulado
    public double calcularInteresAnual() {
        return saldo * (tasaInteres / 100);
    }

    // Getters y setters
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    @Override
    public String toString() {
        return "Cuenta de Ahorro{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", giros=" + giros +
                ", tasaInteres=" + tasaInteres +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }
    
}
