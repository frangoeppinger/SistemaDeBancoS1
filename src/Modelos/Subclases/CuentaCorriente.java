package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaCorriente extends ATipoCuenta {

    private double limiteSobregiro; // Límite de sobregiro permitido
    private double tarifaPorGiro; // Tarifa asociada a cada giro

    public CuentaCorriente(int numeroDeCuenta, String titular, int saldo, double limiteSobregiro, double tarifaPorGiro) {
        super(numeroDeCuenta, titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
        this.tarifaPorGiro = tarifaPorGiro;
    }

    @Override
    public void realizarGiro(int monto) {
        if (monto > 0 && (saldo - monto) >= -limiteSobregiro) {
            saldo -= monto;
            saldo -= tarifaPorGiro; // Descontar la tarifa por giro
            giros++;
            System.out.println("Giro realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto es inválido o excede el límite de sobregiro permitido.");
        }
    }

    // Método para consultar el límite de sobregiro disponible
    public double consultarLimiteSobregiro() {
        return limiteSobregiro;
    }

    // Getters y setters
    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getTarifaPorGiro() {
        return tarifaPorGiro;
    }

    public void setTarifaPorGiro(double tarifaPorGiro) {
        this.tarifaPorGiro = tarifaPorGiro;
    }
}