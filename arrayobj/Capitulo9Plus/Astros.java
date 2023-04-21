package arrayobj.Capitulo9Plus;

public abstract class Astros {


    //Atributos

    private double radio;
    private double rotacion;
    private double masaCuerpo;
    private double temperatura;
    private double gravedad;

    public Astros(){
        
    }


    public Astros(double radio, double rotacion, double masaCuerpo, double temperatura, double gravedad){

        this.radio=radio;
        this.rotacion=rotacion;
        this.masaCuerpo=masaCuerpo;
        this.temperatura=temperatura;
        this.gravedad=gravedad;
    }


    double getRadio(){
        return radio;

    }

    double getRotacion(){
        return rotacion;

    }

    double getMasaCuerpo(){
        return masaCuerpo;

    }

    double getTemperatura(){
        return temperatura;

    }

    double getGravedad(){
        return gravedad;

    }

    //funcion de mostrar informacion usando toString
    public String toString() {
        String info = "RADIO: "+radio+
                      "ROTACION: "+rotacion+
                      "MASA DEL CUERPO: "+masaCuerpo+
                      "TEMPERATURA: "+temperatura+
                      "GRAVEDAD: "+gravedad;
        return info;

    }

    
}
