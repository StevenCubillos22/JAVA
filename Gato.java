public abstract class Gato extends Mamifero {




    public Gato(){


    }



    public Gato( String sexo, int edad) {

        super(sexo, edad);
        
    }


    public void maullar() {
        System.out.println("Miaaauuuu");
       }


    void ronronea() {
        System.out.println("mrrrrrr");
       }
    
}
