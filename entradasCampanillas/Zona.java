package entradasCampanillas;

public class Zona {


    private int entradasPorVender;


    public Zona(int n){

        entradasPorVender=n;

    };


    public int getEntradasPorVender(){
        return entradasPorVender;
    }



    //Funciones que le queremos asignar


    public void vender(int n) {

        if(this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas se encuentra agotadas para esa zona");

        } else if (this.entradasPorVender > n) {
            System.out.println("Solo me quedan" +this.entradasPorVender+ " entradas para esta zona");
        }
    }


    
}
