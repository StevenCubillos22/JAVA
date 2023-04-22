package arrayobj.Capitulo9Plus;

public class Planetas extends Astros {

    private double distanciaSol;
    private double orbitaSol;
    private int numSatelite;


    public Planetas(double radio, double rotacion, double masaCuerpo, double temperatura, double gravedad, double distanciaSol, 
    double orbitaSol, int numSatelite){

        super(radio, rotacion, masaCuerpo, temperatura, gravedad);
        this.distanciaSol=distanciaSol;
        this.orbitaSol=orbitaSol;
        this.numSatelite=numSatelite;
    }


    double getDistanciaSol(){
        return distanciaSol;
    }

    double getOrbitaSol(){
        return orbitaSol;
    }

    double getNumSatelite(){
        return numSatelite;
    }


    public String toString(){
        String str = super.toString();

        str = " -DISTANCIA AL SOL: "+distanciaSol+
              " ORBITA AL SOL: "+orbitaSol+
              " NUM DE SATELITES: "+numSatelite;

        return str;

    }


    
}
