package arrayobj.Capitulo9Plus;

public class Satelites extends Astros {

    private double distancPlaneta;
    private double orbPlanetaria;
    private String planetaPertenec;


    public Satelites(){
        
    }



    public Satelites(double radio, double rotacion, double masaCuerpo, double temperatura, double gravedad, double
    distancPlaneta, double orbPlanetaria, String planetaPertenec){
        super(radio, rotacion, masaCuerpo, temperatura, gravedad);

        this.distancPlaneta=distancPlaneta;
        this.orbPlanetaria=orbPlanetaria;
        this.planetaPertenec=planetaPertenec;

    }

    public double getDistancPlaneta(){
        return distancPlaneta;
    }

    public double getOrbPlanetaria(){
        return orbPlanetaria;
    }

    public String getPlanetaPertenec(){
        return planetaPertenec;
    }

    public String toString(){
        String str = super.toString();

        str="DISTANCIA PLANETA: "+distancPlaneta+
            "ORBITA PLANET: "+orbPlanetaria+
            "PLANETA PERTENECIENTE"+planetaPertenec;

        return str;
     }


    
}
