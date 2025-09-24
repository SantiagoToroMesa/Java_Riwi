package Semana_2.Dia_1;

import Semana_2.Dia_1.Utils.JOptionUtils;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        JOptionPane.showMessageDialog(null, "Welcome to the fruit market!");
        Fruit fruta = new Fruit("apple", 0.53, "verde", false, fecha );
        fruta.expired();
        fruta.type();
        List<Fruit> market = new ArrayList<>();
        int opcion = 1;
        do {
            String name = JOptionUtils.InputString("Enter the fruit name: ");
            double weigt = JOptionUtils.InputDouble("Enter the fruit weight: ");
            String colour = JOptionUtils.InputString("Enter the fruit colour: ");
            boolean expired = JOptionUtils.InputBoolean("is the fruit expired ? ");
            market.add(new Fruit(name, weigt, colour, expired, fecha));
            opcion++;
        }while(opcion != 3);

        for(Fruit fruit : market){
            fruit.expired();
        }

    }
}
