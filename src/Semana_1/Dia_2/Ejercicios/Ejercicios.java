package Semana_1.Dia_2.Ejercicios;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calcular el factorial de un numero
        System.out.println("Ingrese un numero para calcular su factorial: ");
        int numero = sc.nextInt();
        factorial(numero);

        // Juego del adivinador
        int secreto = (int) (Math.random() * 100) + 1;
        int intentos = 10;
        int contint = 0;
        boolean estado;

        do {
            System.out.println("Adivina el numero (entre 1 y 100). Intentos restantes: " + intentos);
            int num = sc.nextInt();
            estado = adivinadora(num, secreto);
            intentos--;
            contint++;
            if (!estado && intentos == 0) {
                System.out.println("Has perdido todos tus intentos. El numero era: " + secreto);
                break;
            }
        } while (intentos > 0 && estado == false);
        if (estado) {
            System.out.println("¡Adivinaste el numero! Era: " + secreto + ". Intentos usados: " + contint);
        }

        // Sumatoria
        int suma = 0;
        while(true){
            System.out.println("Ingrese un numero para agregar a la sumartoria (0 para salir): ");
            int numsumar = sc.nextInt();
            if(numsumar == 0){
                System.out.println("Saliendo...");
                break;
            }
            suma += numsumar;
            System.out.println("La sumatoria es: " + suma);
        }

        // Tabla de multiplicar
        for(int i = 1; i<6; i++){
            tabla(i);
        }
    }

    public static void factorial(int num){
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    
    public static boolean adivinadora(int num, int secreto){
        if (num < 1 || num > 100) {
            System.out.println("Numero fuera de rango. Intente de nuevo.");
            return false;
        }
        if (num == secreto) {
            return true;
        }
        if (num < secreto) {
            System.out.println("Pista: El numero secreto es mayor.");
        } else {
            System.out.println("Pista: El numero secreto es menor.");
        }
        return false;
    }



    public static void tabla(int num) {
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}
