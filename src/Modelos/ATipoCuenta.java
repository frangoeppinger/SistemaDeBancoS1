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
    
    // Constructor
    public ATipoCuenta(int numeroDeCuenta, String titular, int saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.giros = 0; //para que inicie con 0 giros hechos
    }
    
        // Métodos comunes para todas las cuentas
    public abstract void realizarGiro(int monto); 
    
    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    // Getters y setters
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getGiros() {
        return giros;
    }
    
    public void setGiros(int giros) {
        this.giros = giros;
    }
}
