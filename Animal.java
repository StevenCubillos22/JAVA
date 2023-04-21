


public abstract class Animal {

    //atributos//

    String sexo;
    int edad;


    //La construccion de la clase con sus atributos correspondientes


    public Animal(){

        
    }
    

    public Animal( String sexo, int edad) {
        
        this.sexo = sexo;
        this.edad = edad;
        
    }


    

    //Metodo get y set para cada atributo



    String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }




    //Funciones de la clase animal//

    void comer(String comida){
        if (comida.equals("carne")) {
            System.out.println("Hmmmm, esta rico, gracias");
          } else {
            System.out.println("No, somos carnivoros");
          }

          if (comida.equals("pescado")) {
            System.out.println("Hmmmm, muy fresco, gracias");
          } else {
            System.out.println("No, no me gusta mucho esto");
          }

          if (comida.equals("lombrices")) {
            System.out.println("Hmmmm, muy crujientes, y de tierra, gracias");
          } else {
            System.out.println("No, no me gusta, solo carne y pescado");
          }


        
      }

    void dormir(){
        System.out.println("zz..zz....zZZZzzz...zz");
    }


}