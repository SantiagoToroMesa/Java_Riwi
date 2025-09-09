package Semana_1.Dia_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Investigacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El cofre ordenado
        int nums[] = {8,2,7,4,9};
        System.out.println("Numero en la posicion inicial: " + nums[0]);
        System.out.println("Numero en la ultima posicion: " + nums[4]);

        System.out.println("Ingrese la posicion del arreglo la cual quieras mostrar: ");
        int buscar = sc.nextInt();
        if(buscar >= 0 && buscar < nums.length){
            System.out.println("El numero en la posicion " + buscar + " es: " + nums[buscar] + " puedes cambiar su valor:");
            nums[buscar] = sc.nextInt();
            System.out.println(nums[buscar]);
            for(int n : nums){
                System.out.print(n + " ");
            }

        } else {
            System.out.println("Posicion fuera de rango.");
        }

        // La mochila mágica
        ArrayList<String> mochila = new ArrayList<>();
        mochila.add("Espada");
        mochila.add("Pocion");
        mochila.add("mapa");
        System.out.println("\n" + mochila.get(1));
        mochila.remove(0);
        System.out.println("Contenido de la mochila: " + mochila);

        // Mapa del tesoro
        HashMap<String , Integer> mapa = new HashMap<>();
        mapa.put("oro", 100);
        mapa.put("plata", 50);
        mapa.put("Diamantes", 10);
        System.out.println("Cantidad de Diamantes: " + mapa.get("Diamantes"));
        mapa.put("oro", 200);
        System.out.println("Cantidad de oro actualizada: " + mapa.get("oro"));
    }
}
