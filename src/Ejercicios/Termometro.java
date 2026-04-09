package Ejercicios;

public class Termometro {
    // Atributo privado
    private double celsius;

    // Constructor
    public Termometro(double temperaturaInicial) {
        setCelsius(temperaturaInicial);
    }

    // Método Setter con validación
    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        } else {
            System.out.println("Error: La temperatura no puede ser menor al cero absoluto (-273.15°C).");
            this.celsius = -273.15;
        }
    }

    // Método para obtener Celsius
    public double getCelsius() {
        return celsius;
    }

    // Método para convertir y retornar Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}