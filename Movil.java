

import java.text.DecimalFormat;
public class Movil extends Terminal2 {


    private String tarifa;
    private double costo = 0.0;


    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
        
    }
    
    String getTarifa(){
        return tarifa;
    }

    
    @Override
    public void llamar(Terminal2 telf, int segundos){
 
        super.llamar(telf, segundos);

        
        switch(tarifa){
            case "rata":
            costo = (double) (segundos/60) * 0.06;
            break;

            case "mono":
            costo = (double) (segundos/60) * 0.12;
            break;

            case "bisonte":
            costo = (double) (segundos/60) * 0.18;
            break;

            default:
            System.out.println("Error en la compilacion.");
        }

        

    }

    double getCosto(){
        return this.costo;
    }


    public String toString() {

        DecimalFormat formato = new DecimalFormat ("#0.00");
        return "| Nº " +getNumero()+ " > " +getDuracionLlamada()+ "s de llamada - tarificados " +formato.format(getCosto())+" euros";
    }

}
