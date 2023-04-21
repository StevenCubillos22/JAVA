




public abstract class Mamifero extends Animal {



    public Mamifero(){

        
    }



    public Mamifero( String sexo, int edad){

        super(sexo, edad);
        
    }


    public void lactancia(){

        if (this.getSexo().equals("hembra")) {
            System.out.println("Puedo amamantar a mis crias.");
        } else {
            System.out.println("No puedo amamantar a mis crias, no tengo esa capacidad.");
        }
    }


    public void cazar(){
        System.out.println("Cazado");
    }
}