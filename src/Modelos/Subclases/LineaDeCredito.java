package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class LineaDeCredito extends ATipoCuenta {
    private double limiteCredito;
    private double tasaInteres;

    public LineaDeCredito(int numeroDeCuenta, String titular, int saldo, int limiteCredito, double tasaInteres) {
        super(numeroDeCuenta, titular, saldo);
        this.limiteCredito = limiteCredito;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void mostrarDetallesCuenta() {
        System.out.println("Línea de Crédito:");
        System.out.println("Número de cuenta: " + numeroDeCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Límite de crédito: $" + limiteCredito);
        System.out.println("Tasa de interés: " + tasaInteres + "%");
    }
}
