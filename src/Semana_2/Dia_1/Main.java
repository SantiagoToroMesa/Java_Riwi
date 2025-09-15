package Semana_2.Dia_1;

import Semana_2.Dia_1.Utils.JOptionUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the fruit market!");
        Fruit fruta = new Fruit("apple", 0.53, "verde", false, new Date(2024, 05, 3));
        fruta.expired();
        fruta.type();
        List<Fruit> market = new ArrayList<>();
        int opcion = 1;
        do {
            String name = JOptionUtils.InputString("Enter the fruit name: ");
            Double weigt = JOptionUtils.InputDouble("Enter the fruit weight: ");
            String colour = JOptionUtils.InputString("Enter the fruit colour: ");
            boolean expired = JOptionUtils.InputBoolean("is the fruit expired ? ");
            Date date = new Date();
            market.add(new Fruit(name, weigt, colour, expired, date));
            opcion++;
        }while(opcion != 3);

        for(Fruit fruit : market){
            fruit.expired();
        }

    }
}
