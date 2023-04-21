





public abstract class Vehiculo {



    private static int vehiculosCreados= 0; 
    private static int kmTotales= 0;
    


    //esto es un atributo de instancia que es el que contiene un valor especifico
    private int kmRecorridos;


    public Vehiculo(){
        this.kmRecorridos = 0;
    }


    
    public int getkmRecorridos(){
        return this.kmRecorridos;
    }



    public static int getvehiculosCreados(){
        return Vehiculo.vehiculosCreados;  //Corresponde al conjunto de vehiculo, ya que no tiene this
    }



    public static int getKmTotales(){
        return Vehiculo.kmTotales;  
    }



    public void recorrer(int km) {
        this.kmRecorridos += km;
        Vehiculo.kmTotales += km;
    }





}