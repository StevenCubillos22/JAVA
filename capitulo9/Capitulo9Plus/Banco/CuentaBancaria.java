package Capitulo9Plus.Banco;

public abstract class CuentaBancaria {



    private String iban;
    private double saldo;
    private static double interesAnualBasico = 0.01;

    

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        anadir(cantidad);
    }

    public void retirar(double cantidad) {
        anadir(-cantidad);
    }


    public void traspasar(double cantidad, CuentaBancaria cuentaDestino) {
        retirar(cantidad);
        cuentaDestino.ingresar(cantidad);
    }

    public void anadir(double cantidad) {
        saldo += cantidad;
    }

    public abstract void calcularIntereses(); 

    
    public String toString() {
        return "Cuenta con el IBAN " + iban + "\nSaldo disponible: " + saldo;
                
    }
    
    public static double getInteresAnualBasico() {
        return interesAnualBasico;
    }

    
}
