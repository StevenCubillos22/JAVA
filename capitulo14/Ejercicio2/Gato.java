package capitulo14.Ejercicio2;

public class Gato {

    

        // atributos ///////////////////////////
    
        String color, raza, sexo;
        int edad;
        double peso;
    
        // métodos ///////////////////////////////
    
        // constructor
    
        Gato (String s) {
         this.sexo = s;
        }
    
    
        // getter
        String getSexo() {
         return this.sexo;
        }
    
    
        /**
        * Hace que el gato maulle
        */
    
    
        void maulla() {
         System.out.println("Miauuuu");
        }
    
        /**
        * Hace que el gato ronronee
        */
    
        void ronronea() {
         System.out.println("mrrrrrr");
        }
        /**
        * Hace que el gato coma.
        * A los gatos les gusta el pescado, si le damos otra comida
        * la rechazará.
        *
        * @param comida la comida que se le ofrece al gato
        */
    
    
        void come(String comida) {
            if (comida.equals("pescado")) {
              System.out.println("Hmmmm, gracias");
            } else {
              System.out.println("Lo siento, yo solo como pescado");
            }
        }
            
    
            void peleaCon(Gato contrincante) {
              if (this.sexo.equals("hembra")) {
                System.out.println("no me gusta pelear");
             } else {
               if (contrincante.getSexo().equals("hembra")) {
                   System.out.println("no peleo contra gatitas");
              } else {
                 System.out.println("ven aquí que te vas a enterar");
                 }
                }
              }
    
              //Funcion apareamiento
    
              Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
                if(this.sexo.equals(pareja.getSexo())) {
                  throw new ExcepcionApareamientoImposible();
                  
                } else { 
                    //Math random que elige una de las dos opciones al azar, macho o hembra

                  String sexoNacimiento = (int) (Math.random() * 2) == 0 ? "macho" : "hembra";
                  Gato cria = new Gato(sexoNacimiento);
                  System.out.println("Ha nacido una nueva cria!!, es un "+sexoNacimiento);
                  return cria;
                }
              }
    
    
            }
    

