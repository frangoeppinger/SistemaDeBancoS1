package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class LineaDeCredito extends ATipoCuenta {

    private double limiteCredito; // Límite de crédito disponible
    private double tarifaPorUso; 

    public LineaDeCredito(int numeroDeCuenta, String titular, int saldo, int limiteCredito, int tarifaPorUso) {
        super(numeroDeCuenta, titular, saldo);
        this.limiteCredito = limiteCredito;
        this.tarifaPorUso = tarifaPorUso;
    }

    @Override
    public void realizarGiro(int monto) {
        if (monto > 0 && (saldo + monto) <= limiteCredito) {
            saldo += monto;
            saldo -= tarifaPorUso; 
            giros++;
            System.out.println("Giro realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto es inválido o excede el límite de crédito permitido.");
        }
    }

    // Para consultar el límite de crédito disponible
    public double consultarLimiteCredito() {
        return limiteCredito - saldo; 
    }

    
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTarifaPorUso() {
        return tarifaPorUso;
    }

    public void setTarifaPorUso(double tarifaPorUso) {
        this.tarifaPorUso = tarifaPorUso;
    }

}
