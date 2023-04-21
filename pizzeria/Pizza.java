package pizzeria;

public class Pizza {



    private static int servidas = 0; 
    private static int pedidas = 0; 


    String tamano;
    String estado;
    String tipo;

    public Pizza(String tamano,  String tipo){

        this.tamano = tamano;
        this.estado = "pedida";
        this.tipo = tipo;
        Pizza.pedidas++;

    }

    

    static int getServidas(){
        return Pizza.servidas;
    }


    static int getPedidas(){
        return Pizza.pedidas;
    }



    public String toString() {
        return "Su pizza -> " +this.tipo+ " " +this.tamano+ "  |>  " +this.estado;
    }




    public void servir() {
        if (this.estado.equals("pedida")) {
            estado = "servida";
            Pizza.servidas++;
        } else {
            System.out.println("Pizza servida");
        }
    }




        
    
    
}
