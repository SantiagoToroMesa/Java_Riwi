package Semana_2.Dia_1;

import javax.swing.*;
import java.util.Date;

public class Fruit {
    String name;
    double weight;
    String colour;
    boolean expired;
    Date expiration_date;

    public Fruit(String fruitName, double fruitWeight, String fruitColour,boolean fruitExpired, Date fruitExpiration_date){
        this.name = fruitName;
        this.weight = fruitWeight;
        this.colour = fruitColour;
        this.expired = fruitExpired;
        this.expiration_date = fruitExpiration_date;
    }

    public void expired(){
        if(expired){
            JOptionPane.showMessageDialog(null, "The fruit is expired");
        }
        else{
            JOptionPane.showMessageDialog(null, "The fruit will expired in: " + expiration_date);
        }
    }

    public void type(){
        String [] acidics = {"kiwi", "lemon", "pomelo", "orange", "apple", "uva", "arandano", "pinnaple"};
        for(String n : acidics){
            if(n == name){
                JOptionPane.showMessageDialog(null, "the fruit is acid");
            }
        }
    }
}
