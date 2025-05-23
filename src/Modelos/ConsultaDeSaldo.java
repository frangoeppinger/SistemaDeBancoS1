/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author franciscagoeppinger
 */
public class ConsultaDeSaldo {
    private int saldo;

    public ConsultaDeSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() { // getter para obtener el saldo, no se pone setter porque es un numero que no se puede cambiar
        return saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(int monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else if (monto > saldo) {
            System.out.println("Error: El monto a retirar excede el saldo disponible.");
        } else {
            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }


}
