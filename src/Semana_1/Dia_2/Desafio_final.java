package Semana_1.Dia_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Desafio_final {

    public static void main(String[] args) {
        int codigos[] = {172, 129, 117};
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");

        HashMap<String, Integer>oro = new HashMap<>();
        oro.put(nombres.get(0), 152);
        oro.put(nombres.get(1), 189);
        oro.put(nombres.get(2), 147);

        String ganador = "";
        int maximo = 0;
        for(String n : nombres){
            if (oro.get(n) > maximo){
                maximo = oro.get(n);
                ganador = n;
            }
        }
        System.out.println("El ganador es: " + ganador + " con un total de: " + maximo + " piezas de oro.");

    }

}
