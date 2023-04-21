package arrayobj;

public class Gatitos {
    
    private String nombre, sexo, raza;
    private int edad;
    //declaramos esta variable static porque 
    public static int sardinas = 10;


    public Gatitos(String nombre, String sexo, String raza, int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.raza=raza;
        this.edad=edad;
    }




    public static void reducirSardinas(){
        Gatitos.sardinas--;
    }


    //Funcion de comer sardinas a los gatos
    public  void comer (int veces){
    
        for(int i=1; i<=veces; i++){

            if(Gatitos.sardinas>0){
                System.out.println("ñam ñam ñam...");
                Gatitos.reducirSardinas();
            } else if(Gatitos.sardinas == 0){
                System.out.println("Ya no queda comida");
                Gatitos.reducirSardinas();
            } else {
                System.out.print("");
            }

        }
    }


    public String getNombre(){
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getSexo(){
        return sexo;
    }

    void setSexo(String sexo){
        this.sexo=sexo;
    }

    public String getRaza(){
        return raza;

    }

    void setRaza(String raza){
        this.raza=raza;
    }


    public int getEdad(){
        return edad;
    }

    void setEdad(int edad){

        this.edad = edad;

    }  
}
