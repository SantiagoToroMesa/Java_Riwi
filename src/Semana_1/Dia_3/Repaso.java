package Semana_1.Dia_3;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Imprimir un triángulo de asteriscos
        int filas = 5;
        for (int i = 0; i < filas; i++) {
            String espacios = " ".repeat(filas - i - 1);
            String asteriscos = "*".repeat(2 * i + 1);
            System.out.println(espacios + asteriscos);
        }

        // Adivina el numero secreto
        int secreto = (int) (Math.random() * 100) + 1;
        System.out.println(secreto);
        boolean encontrado = false;
        int intentos = 0;
        do {
            System.out.println("Adivina el numero (entre 1 y 100): ");
            int num = sc.nextInt();
            if(num == secreto){
                System.out.println("'Adivinaste el numero! Era: " + secreto + ". Intentos usados: " + intentos);
                encontrado = true;
            }
            else if(num > 100 || num <0){
                System.out.println("el numero debe estar en un rango de 1 a 100");
            }
            else if(num - secreto <= 5 && secreto - num <= 5){
                System.out.println("Estas muy cerca!");
                intentos++;
            }
            else if(num < secreto){
                System.out.println("El numero es mayor");
                intentos++;
            }
            else if(num > secreto){
                System.out.println("El numero es menor");
                intentos++;
            }
        }while (!encontrado);


        System.out.println("Ingrese un numero larguito");
        int num = sc.nextInt();
        String numero = String.valueOf(num);
        int longitud = numero.length();
        int [] numeritos = new int[longitud];
        for(int i = 0; i < longitud ; i++) {
           numeritos[i] = numero.charAt(i);
        }
        System.out.println(Arrays.toString(numeritos));
        //int acum = 0;

//        while(acum != longitud){
//            for(int i = 0; i < longitud; i++) {
//
//            }
//            acum++;
//        }
    }
}
