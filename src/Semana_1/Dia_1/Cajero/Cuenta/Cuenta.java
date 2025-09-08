package Semana_1.Dia_1.Cajero.Cuenta;

public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Depósito realizado. ");
        }
        else {
            System.out.println("Cantidad inválida para depósito. ");
        }
    }

    public void retirar(int cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro realizado.");
        }
        else {
            System.out.println("Cantidad inválida para retiro. ");
        }
    }

    public void MostrarSaldo(){
        System.out.println("El saldo actual es: " + saldo);
    }
}