package Ejercicios;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;
    private int pin;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial, int pinSecreto) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.pin = pinSecreto;
    }

    // Método para retirar con validacion de pin
    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == this.pin) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto +" Nuevo saldo: $ " + this.saldo);
        } else {
        	System.out.println("Error:Saldo insuficiente para retirar $"+ monto);
        	 }
    }else {
    	System.out.println("Error: Pin incorrecto, acceso denegado");
    }
      }

    // Muestra datos
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " Saldo actual: $ " + saldo);
    }
}