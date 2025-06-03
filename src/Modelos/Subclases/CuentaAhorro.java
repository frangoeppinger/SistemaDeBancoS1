package Modelos.Subclases;

import Modelos.ATipoCuenta;

public class CuentaAhorro extends ATipoCuenta {
        private int limiteDeposito;
    
        public CuentaAhorro(int numeroDeCuenta, String titular, int saldo, int limiteDeposito) {
            super(numeroDeCuenta, titular, saldo);
            this.limiteDeposito = limiteDeposito;
        }
    
        @Override
        public void mostrarDetallesCuenta() {
            System.out.println("Cuenta de Ahorro:");
            System.out.println("Número de cuenta: " + numeroDeCuenta);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: $" + saldo);
            System.out.println("Límite de depósito: $" + limiteDeposito);
        }
}
