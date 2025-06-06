/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

import Modelos.ATipoCuenta;
import Modelos.ConsultaDeSaldo;
import Modelos.DatosClientes;
import Modelos.Deposito;
import Modelos.Giros;
import Modelos.Subclases.CuentaAhorro;
import Modelos.Subclases.CuentaCorriente;
import Modelos.Subclases.LineaDeCredito;

/**
 *
 * @author franciscagoeppinger
 */
public class SistemaDeBancoS1 {
    private static ConsultaDeSaldo consultaDeSaldo; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        consultaDeSaldo = new ConsultaDeSaldo(0); 
        ATipoCuenta cuenta = null;
        Giros giros = new Giros(consultaDeSaldo);
        DatosClientes cliente = null;

        while (opcion != 6) {
            try {
                System.out.println("=====================================");
                System.out.println("---Bienvenido al sistema de Bank Boston---");
                System.out.println("Seleccione su tipo de cuenta: 1.Corriente 2.Ahorro 3.Linea de credito");
                int tipoCuentaSeleccion = scanner.nextInt();
                scanner.nextLine();
                
                switch (tipoCuentaSeleccion) {
                    case 1:
                        cuenta = new CuentaCorriente(0, "Titular Corriente", 0);
                        break;
                    case 2:
                        cuenta = new CuentaAhorro(0, "Titular Ahorro", 0, 5000);
                        break;
                    case 3:
                        cuenta = new LineaDeCredito(456789123, "Titular Crédito", 0, 10000,5.0);
                        break;
                    default:
                        System.out.println("Selección inválida. Por favor, elija un tipo de cuenta válido.");
                        continue;
                }
                cuenta.mostrarDetallesCuenta();
                
                System.out.println("Seleccione una opción:");
                System.out.println("1. Depositos");
                System.out.println("2. Giros");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Registrar nuevo cliente");
                System.out.println("5. Consultar datos de clientes");
                System.out.println("6. Salir");
                System.out.println("=====================================");
                System.out.print("Ingrese aqui el numero de opcion: ");

                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Depósitos");
                        Deposito deposito = new Deposito();
                        deposito.realizarDeposito(consultaDeSaldo); 
                        consultaDeSaldo.mostrarSaldo();
                        break;
                    case 2:
                        if (consultaDeSaldo.getSaldo() <= 0) {
                            System.out.println("No hay saldo suficiente para realizar un giro. Realice un depósito primero.");
                        } else {
                            System.out.println("Giros");
                            giros.realizarGiro(); 
                            consultaDeSaldo.mostrarSaldo(); 
                        }
                        break;
                    case 3:
                        System.out.println("Consultar saldo");
                        consultaDeSaldo.mostrarSaldo();
                        break;
                    case 4:
                        System.out.println("Registrar nuevo cliente");
                        cliente = new DatosClientes(0, "", "", "", "", 0, "", 0,"", 0);
                        cliente.registrarCliente();
                        break;
                    case 5:
                        if (cliente == null) {
                            System.out.println("No hay cliente registrado. Registre un cliente primero.");
                        } else {
                            System.out.println("Consultar datos de clientes");
                            cliente.mostrarInformacion(); // Usar el método de la interface
                            System.out.println("Saldo actual: $" + consultaDeSaldo.getSaldo());
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido. Intente nuevamente.");
                scanner.nextLine();
            } catch (NullPointerException e) {
                System.out.println("Error: Operación no válida. Asegúrese de registrar un cliente primero.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Gracias por usar el sistema de banco. ¡Hasta luego!");
    }
}
