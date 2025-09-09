package Semana_1.Dia_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            menu();
            System.out.println("Seleccione una opcion (1-3) o 0 para salir: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    array();
                    break;
                case 2:
                    arrayList();
                    break;
                case 3:
                    HashMap();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void array(){
        Scanner sc = new Scanner(System.in);

        int nums[] = {8,6,5,4,3};
        for (int num : nums){
            System.out.print((num * 2) + " ");
        }
        int nums2[] = new int[6];

        System.out.println("\nIngrese 6 numeros: ");
        for (int i = 0; i < nums2.length; i++){
            System.out.println("Numero " + (i + 1) + ": ");
            nums2[i] = sc.nextInt();

        }
        for (int n : nums2){
            System.out.print(n + " ");
        }
    }

    public static void arrayList(){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Andres");
        nombres.add("Samuel");
        nombres.add("Jose");
        for (String n : nombres){
            System.out.println("\nHola, " + n);
        }
    }

    public static void HashMap(){
        HashMap<Integer, String> Persona = new HashMap<>();
        Persona.put(1023768904, "Andres");
        Persona.put(1098765432, "Samuel");
        Persona.put(1234567890, "Jose");
        for(Integer key : Persona.keySet()){
            System.out.println(key + " " + Persona.get(key) );
        }
    }

    public static void menu(){
        System.out.println("\n----- Menu de Ejercicios -----");
        System.out.println("1. Arreglos (Arrays)");
        System.out.println("2. Listas (ArrayList)");
        System.out.println("3. Mapas (HashMap)");
        System.out.println("------------------------------");
    }
}
