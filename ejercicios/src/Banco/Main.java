package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("123456789", 1000.0);
        Cliente cliente2 = new Cliente("987654321", 500.0);

        System.out.println("Bienvenido al Sistema de Pago en Línea");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar Pago");
            System.out.println("2. Mostrar Historial de Operaciones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI del cliente: ");
                    String dni = scanner.nextLine();

                    Cliente cliente = null;
                    if (dni.equals(cliente1.getDni())) {
                        cliente = cliente1;
                    } else if (dni.equals(cliente2.getDni())) {
                        cliente = cliente2;
                    } else {
                        System.out.println("Cliente no encontrado.");
                        continue;
                    }

                    System.out.println("Saldo actual: $" + cliente.getCuenta().getSaldo());

                    System.out.print("Ingrese la cantidad a pagar: $");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.println("Seleccione el método de pago:");
                    System.out.println("1. PayPal");
                    System.out.println("2. Tarjeta de Crédito");
                    System.out.println("3. Transferencia Bancaria");
                    System.out.print("Seleccione una opción: ");

                    int metodoPagoSeleccionado = scanner.nextInt();
                    scanner.nextLine(); 

                    IMetodoPago metodoPago = null;
                    switch (metodoPagoSeleccionado) {
                        case 1:
                            metodoPago = new Paypal();
                            break;
                        case 2:
                            metodoPago = new TarjetaCredito();
                            break;
                        case 3:
                            metodoPago = new TransferenciaBancaria();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            continue;
                    }

                    if (metodoPago.realizarPago(cantidad)) {
                        System.out.println("Pago exitoso!");
                        System.out.println("Nuevo saldo: $" + cliente.getCuenta().getSaldo());
                    } else {
                        System.out.println("No se pudo realizar el pago. Saldo insuficiente o límite de intentos alcanzado.");
                    }
                    break;
                case 2:
                    Banco.mostrarHistorialOperaciones();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el Sistema de Pago en Línea. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
