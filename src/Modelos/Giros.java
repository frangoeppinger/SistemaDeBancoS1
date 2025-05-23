/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import Modelos.Giros;
import java.util.Scanner;

/**
 *
 * @author franciscagoeppinger
 */
public class Giros {
    //aqui borre la variable saldo porque no se actualizaba con el saldo que se iba añadiendo 
    private ConsultaDeSaldo consultaDeSaldo; // Ocupe la variable consultaDeSaldo para que se actualizara el saldo
    
    public Giros (ConsultaDeSaldo consultaDeSaldo){ 
        this.consultaDeSaldo = consultaDeSaldo;
    } 
    
    public void realizarGiro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo actual: $" + consultaDeSaldo.getSaldo());
        System.out.println("Ingrese el monto para girar: ");
        int cantidad = scanner.nextInt();

    
        if (cantidad > 0 && cantidad <= consultaDeSaldo.getSaldo()) {
            consultaDeSaldo.retirar(cantidad);
            System.out.println("Giro realizado de manera exitosa, por un monto de $" + cantidad);
            System.out.println("Saldo actual: $" + consultaDeSaldo.getSaldo());
        } else if (cantidad > consultaDeSaldo.getSaldo()) {
            System.out.println("Error: El monto a retirar excede el saldo disponible.");
        } else {
            System.out.println("Error: El monto debe ser mayor a 0.");
        }
    }
    
}
