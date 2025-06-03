/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Scanner;

/**
 *
 * //author franciscagoeppinger
 */
public class DatosClientes implements IMostrarInformacion {
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
        if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) { 
            // para que no coloquen mas de 1 nombre o se equivoquen y coloquen apellido
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe ser una sola palabra sin espacios.");
        }
    }

    
    public String getApellido1() {
        return apellido1;
    }

    
    public void setApellido1(String apellido1) {
        if (apellido1.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
            this.apellido1 = apellido1;
        } else {
            throw new IllegalArgumentException("El primer apellido debe ser una sola palabra sin espacios.");
        }
    }
    

    
    public String getApellido2() {
        return apellido2;
    }

    
    public void setApellido2(String apellido2) {
        if (apellido2.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
            this.apellido2 = apellido2;
        } else {
            throw new IllegalArgumentException("El segundo apellido debe ser una sola palabra sin espacios.");
        }
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

    
    public String getComuna() {
        return comuna;
    }

    
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    
    public String gettipoCuenta() {
        return tipoCuenta;
    }

    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
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
    public void mostrarInformacion() {
        System.out.println("Información del cliente:");
        System.out.println("Rut Cliente: " + rut);
        System.out.println("Nombre: " + nombre + " " + apellido1 + " " + apellido2);
        System.out.println("Dirección: " + calle + " " + numeroCalle + ", " + comuna);
        System.out.println("Teléfono: " + numeroTelefono);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
