public class Televisor {


     int canal;

     public Televisor() {
        canal = 1;
     }


    public Televisor(int valorCanal) {
        setCanal(valorCanal);
    }

    public void subirCanal(){
        setCanal(canal+1);
    }

    public void bajarCanal(){
        setCanal(canal-1);
    }
    
    public int getCanal(){
        return canal;
    }


    public void setCanal(int valorCanal) {
        if (valorCanal < 1 || valorCanal >= 100) canal = 1;
        else canal = valorCanal;
    }
}
