package Semana_1.Dia_1.Actividad;

import Semana_1.Dia_1.Actividad.Persona.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese su altura (en metros)");
        String alturaInput = sc.nextLine().replace(",", ".");
        double altura = Double.parseDouble(alturaInput);

        System.out.println("Ingrese su peso (en kg)");
        String pesoInput = sc.nextLine().replace(",", ".");
        double peso = Double.parseDouble(pesoInput);

        System.out.println("¿Es su primera vez? (s/n)");
        String primeraVezInput = sc.nextLine().trim().toUpperCase();
        boolean primeraVez = !primeraVezInput.isEmpty() && primeraVezInput.charAt(0) == 'S';

        System.out.println("Ingrese el plan (Basico, Premium, Plus)");
        String plan = sc.nextLine().trim();
        if (!plan.isEmpty()) {
            plan = plan.substring(0, 1).toUpperCase() + plan.substring(1).toLowerCase();
        }

        Persona persona = new Persona(nombre, edad, altura, peso, primeraVez, plan);
        persona.mostrarDetallePago();
    }
}
