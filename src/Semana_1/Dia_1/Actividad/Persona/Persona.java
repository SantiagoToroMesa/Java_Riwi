package Semana_1.Dia_1.Actividad.Persona;

public class Persona {
    String nombre;
    int edad;
    double altura;
    double peso;
    String plan;
    boolean primeraVez;

    public Persona(String nombre, int edad, double altura, double peso, boolean primeraVez, String plan) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.primeraVez = primeraVez;
        this.plan = plan;
    }

    // Calcula el precio base del plan seleccionado
    public int precioPlan() {
        int precio = 0;
        switch (plan) {
            case "Basico":
                precio = 80;
                break;
            case "Premium":
                precio = 180;
                break;
            case "Plus":
                precio = 120;
                break;
            default:
                System.out.println("Plan no reconocido");
                break;
        }
        return precio;
    }

    // Calcula el porcentaje total de descuento aplicable
    public double porcentajeDescuento() {
        double descuento = 0.0;
        if (primeraVez) {
            descuento += 0.10; // 20% por primera vez
        }
        if (edad >= 16 && edad <= 20) {
            descuento += 0.10; // 20% por edad
        }
        // Evitar que el descuento supere el 50% por reglas de negocio (opcional)
        if (descuento > 0.20) {
            descuento = 0.50;
        }
        return descuento;
    }

    // Retorna el precio final aplicando los descuentos al plan
    public int precioFinal() {
        int base = precioPlan();
        double desc = porcentajeDescuento();
        int total = (int) Math.round(base * (1 - desc));
        return total;
    }

    // Métodos utilitarios para mostrar información
    public void mostrarDetallePago() {
        int base = precioPlan();
        double desc = porcentajeDescuento();
        int total = precioFinal();
        System.out.println("Detalle de pago para " + nombre + ":");
        System.out.println("Plan: " + plan);
        System.out.println("Precio base: $" + base);
        System.out.println("Descuento aplicado: " + (int) Math.round(desc * 100) + "%");
        System.out.println("Precio Final: $" + total);
        bmi();
    }

    public void bmi(){
        double bmi = peso / (altura * altura);
        if (bmi < 18.5) {
            System.out.println("Bajo peso");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Peso normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}
