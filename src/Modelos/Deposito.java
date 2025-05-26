/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import Modelos.Deposito;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author franciscagoeppinger
 */
public class Deposito {

    public void realizarDeposito(ConsultaDeSaldo consultaDeSaldo) {
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.print("Ingrese el monto a depositar: ");
        int monto = scanner.nextInt();

        if (monto > 0) {
            consultaDeSaldo.depositar(consultaDeSaldo.getSaldo() + monto);
            System.out.println("Deposito realizado de manera exitosa!");
            System.out.println("Se han depositado $" + Math.round(monto) + " pesos en la cuenta.");
        } else {
            System.out.println("El monto debe ser mayor a 0. Intente nuevamente.");
        }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido. Intente nuevamente."); 
            //Manejo de error para que no anden colocando letras
            scanner.nextLine();
        }
    }
}
