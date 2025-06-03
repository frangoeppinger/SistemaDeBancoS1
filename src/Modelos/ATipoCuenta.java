/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author franciscagoeppinger
 */

public abstract class ATipoCuenta {
    protected int numeroDeCuenta; 
    protected String titular; 
    protected int saldo; 
    protected int giros; 
    
    public ATipoCuenta(int numeroCuenta, String titular, int saldo) {
        this.numeroDeCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void mostrarDetallesCuenta(); 

    public int getNumeroCuenta() {
        return numeroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        saldo += monto;
    }

    public void retirar(int monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
