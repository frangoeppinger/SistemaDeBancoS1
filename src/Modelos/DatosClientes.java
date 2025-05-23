/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Scanner;

/**
 *
 * @author franciscagoeppinger
 */
public class DatosClientes {
    
    private int rut;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String calle;
    private int numeroCalle;
    private int comuna;
    private int numeroTelefono;
    private int numeroCuenta;

    
    
    public DatosClientes(int rut, String nombre, String apellido1, String apellido2, String calle, int numeroCalle, int comuna, int numeroTelefono, int numeroCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.comuna = comuna;
        this.numeroTelefono = numeroTelefono;
        this.numeroCuenta = numeroCuenta;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Aqui se registran los datos del cliente
    public void registrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el RUT del cliente: ");
        setRut(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Ingrese el nombre del cliente: ");
        setNombre(scanner.nextLine());

        System.out.print("Ingrese el primer apellido del cliente: ");
        setApellido1(scanner.nextLine());

        System.out.print("Ingrese el segundo apellido del cliente: ");
        setApellido2(scanner.nextLine());

        System.out.print("Ingrese la calle del cliente: ");
        setCalle(scanner.nextLine());

        System.out.print("Ingrese el número de la calle: ");
        setNumeroCalle(scanner.nextInt());

        System.out.print("Ingrese la comuna: ");
        setComuna(scanner.nextInt());

        System.out.print("Ingrese el número de teléfono: ");
        setNumeroTelefono(scanner.nextInt());

        System.out.print("Ingrese el número de cuenta corriente: ");
        setNumeroCuenta(scanner.nextInt());

        System.out.println("Cliente registrado exitosamente.");
    }
    
    //Aqui se consultan los datos del cliente
    public void consultarDatosCliente() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Datos del cliente:  " + 
                "Rut: " + rut + 
                " Nombre: " + nombre + 
                " Apellidos: " + apellido1 +  apellido2 + 
                " Dirección. Calle: " + calle + 
                " Numero: " + numeroCalle + 
                " Comuna: " + comuna + 
                " Telefono: " + numeroTelefono + 
                " Cuenta: " + numeroCuenta ;
    }
    
    
    
    
}
