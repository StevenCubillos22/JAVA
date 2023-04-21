

import java.text.DecimalFormat;
public class TarjetaRegalo {

    private  double saldo;
    private  String numeroT;




    public TarjetaRegalo(double saldo){
        
        this.saldo = 0;
        this.numeroT = "";

        for (int i = 0; i < 5; i++) {
            this.numeroT += (int)(Math.random() * 10);
            }

    }



     double getSaldo(){
        return saldo;
    }

     void setSaldo(double saldo) {
        this.saldo = saldo;
        }
        


     String getNumeroT(){
        return numeroT;
    }


    public void setNumeroT(String numeroT){
        this.numeroT = numeroT;

    }


    void gastar(double desembolso){


        if(saldo < 0){
            System.out.println("El saldo de su tarjeta esta completamente agotado");
        } else if (desembolso < saldo){
            System.out.println("Lo siento, no tiene suficiente saldo en su tarjeta");
        } else{
            saldo=-desembolso;
        }

    }


    

    TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta){
        double saldoAdd = this.getSaldo() +tarjeta.getSaldo(); 
        this.setSaldo(0);
        tarjeta.setSaldo(0);
        return new  TarjetaRegalo(saldoAdd);

    }


    public String toString() {

        
        DecimalFormat dosDecimales = new DecimalFormat("#0.00");
        return "Tarjeta nº " + numeroT + " - Saldo - " + dosDecimales.format(saldo) + " euros";
        }


}
    

