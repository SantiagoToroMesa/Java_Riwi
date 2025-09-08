package Semana_1.Dia_1.Cajero;

import Semana_1.Dia_1.Cajero.Cuenta.Cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = null; // empieza sin cuenta

        while (true) {
            menu();
            System.out.print("Seleccione una opción: ");

            int opcion;
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Ingrese un número del menú.");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cuenta != null) {
                        System.out.print("Ya existe una cuenta. ¿Desea crear una nueva? (s/n): ");
                        String resp = sc.nextLine().trim().toLowerCase();
                        if (!resp.equals("s")) break;
                    }
                    System.out.print("Ingrese el nombre del titular: ");
                    String titular = sc.nextLine().trim();
                    System.out.print("Ingrese el saldo inicial: ");
                    int saldoInicial;
                    try {
                        saldoInicial = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Saldo inválido. Se establecerá en 0.");
                        saldoInicial = 0;
                    }
                    cuenta = new Cuenta(titular, saldoInicial);
                    System.out.println("Cuenta creada para " + titular + " con saldo inicial de $" + saldoInicial);
                    break;

                case 2:
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta (opción 1).");
                        break;
                    }
                    System.out.print("Ingrese la cantidad a depositar: ");
                    try {
                        int cantidad = Integer.parseInt(sc.nextLine().trim());
                        cuenta.depositar(cantidad);
                    } catch (NumberFormatException e) {
                        System.out.println("Monto inválido.");
                    }
                    break;

                case 3:
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta (opción 1).");
                        break;
                    }
                    System.out.print("Ingrese la cantidad a retirar: ");
                    try {
                        int cantidadretiro = Integer.parseInt(sc.nextLine().trim());
                        cuenta.retirar(cantidadretiro);
                    } catch (NumberFormatException e) {
                        System.out.println("Monto inválido.");
                    }
                    break; // <- importantísimo el break aquí

                case 4:
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta (opción 1).");
                    } else {
                        cuenta.MostrarSaldo();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    public static void menu() {
        System.out.println("\n----- Menú -----");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Salir");
        System.out.println("----------------");
    }
}