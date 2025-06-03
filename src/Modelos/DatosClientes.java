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
public class DatosClientes implements IDatosCliente {
    private int rut;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String calle;
    private int numeroCalle;
    private String comuna;
    private int numeroTelefono;
    private int numeroCuenta;
    private String tipoCuenta; 

    public DatosClientes(int rut, String nombre, String apellido1, String apellido2, String calle, int numeroCalle, String comuna, int numeroTelefono, String tipoCuenta, int numeroCuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.comuna = comuna;
        this.numeroTelefono = numeroTelefono;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuentaPorSeleccion(int seleccion) {
        switch (seleccion) {
            case 1:
                this.tipoCuenta = "Corriente";
                break;
            case 2:
                this.tipoCuenta = "Ahorro";
                break;
            case 3:
                this.tipoCuenta = "Línea de crédito";
                break;
            default:
                System.out.println("Selección inválida. No se asignó un tipo de cuenta.");
                this.tipoCuenta = "No especificado";
                break;
        }
    }
    

    @Override
    public int getRut() {
        return rut;
    }

    @Override
    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) { 
            // para que no coloquen mas de 1 nombre o se equivoquen y coloquen apellido
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe ser una sola palabra sin espacios.");
        }
    }

    @Override
    public String getApellido1() {
        return apellido1;
    }

    @Override
    public void setApellido1(String apellido1) {
        if (apellido1.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
            this.apellido1 = apellido1;
        } else {
            throw new IllegalArgumentException("El primer apellido debe ser una sola palabra sin espacios.");
        }
    }
    

    @Override
    public String getApellido2() {
        return apellido2;
    }

    @Override
    public void setApellido2(String apellido2) {
        if (apellido2.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
            this.apellido2 = apellido2;
        } else {
            throw new IllegalArgumentException("El segundo apellido debe ser una sola palabra sin espacios.");
        }
    }

    @Override
    public String getCalle() {
        return calle;
    }

    @Override
    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public int getNumeroCalle() {
        return numeroCalle;
    }

    @Override
    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    @Override
    public String getComuna() {
        return comuna;
    }

    @Override
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String gettipoCuenta() {
        return tipoCuenta;
    }

    @Override
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Aqui se registran los datos del cliente
    public void registrarCliente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el RUT del cliente: ");
        setRut(scanner.nextInt());
        scanner.nextLine(); 

        boolean datoValido = false;
        
        while (!datoValido) {
            System.out.print("Ingrese el nombre del cliente: ");
            try {
                setNombre(scanner.nextLine());
                datoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        datoValido = false;
        while (!datoValido) {
            System.out.print("Ingrese el primer apellido del cliente: ");
            try {
                setApellido1(scanner.nextLine());
                datoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        datoValido = false;
        while (!datoValido) {
            System.out.print("Ingrese el segundo apellido del cliente: ");
            try {
                setApellido2(scanner.nextLine());
                datoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        System.out.print("Ingrese la calle del cliente: ");
        setCalle(scanner.nextLine());

        System.out.print("Ingrese el número de la calle: ");
        setNumeroCalle(scanner.nextInt());

        System.out.print("Ingrese la comuna: ");
        setComuna(scanner.next());

        System.out.print("Ingrese el número de teléfono: ");
        setNumeroTelefono(scanner.nextInt());

        System.out.print("Ingrese el tipo de cuenta: ");
        setTipoCuenta(scanner.next());
        
        System.out.print("Ingrese el número de cuenta: ");
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
                " Rut: " + rut + 
                " Nombre: " + nombre + 
                " Apellidos: " + apellido1 + "  " +  apellido2 + 
                " Dirección. Calle: " + calle + 
                " Número: " + numeroCalle + 
                " Comuna: " + comuna + 
                " Teléfono: " + numeroTelefono + 
                "Tipo de Cuenta: " + tipoCuenta +
                " Cuenta: " + numeroCuenta ;
    }
}
