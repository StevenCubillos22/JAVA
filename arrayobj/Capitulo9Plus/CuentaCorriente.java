package arrayobj.Capitulo9Plus;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double interes = getInteresAnualBasico() * getSaldo();
        anadir(interes);
    }




    
}
