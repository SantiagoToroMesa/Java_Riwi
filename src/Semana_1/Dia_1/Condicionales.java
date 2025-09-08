package Semana_1.Dia_1;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Actividad 5
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        // Actividad 6
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad < 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        // Actividad 7
        System.out.println("Ingrese un numero: (1-7)");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
