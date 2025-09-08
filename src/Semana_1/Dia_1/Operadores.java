package Semana_1.Dia_1;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        // Actividad 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int n2 = sc.nextInt();
        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicacion: " + (n1 * n2));
        System.out.println("Division: " + (n1 / n2));
        System.out.println("Modulo: " + (n1 % n2));

        // Actividad 3
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println(edad > 18);

        // Actividad 4
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = sc.nextInt();
        System.out.println(numero > 0 && numero2 > 0);
        System.out.println(numero > 100 || numero2 > 100);
        System.out.println(numero != numero2);
    }

}