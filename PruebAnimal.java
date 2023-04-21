/*PruebAnimal.java
 *Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 *al menos, tres métodos específicos de cada clase y redefne el/los método/s
 *cuando sea necesario. Prueba las clases creadas en un programa en el que se
 *instancien objetos y se les apliquen métodos.
 * 
 * 
 * 
 * @Steven Cubillos Garcia
 *  
 */



public class PruebAnimal {


    public static void main(String[]Args) {


        


        Perro jake = new Perro() {

        };

        System.out.println("Hola, soy Jake, un perro.");

        jake.ladrar();
        jake.setSexo("macho");
        jake.lactancia();


        Gato leona = new Gato() {
            
        };
        System.out.println("Hola, soy Leona, una gata negra.");
        leona.maullar();
        leona.comer("pescado");
        System.out.println("En fin, ahora quiero dormir");
        leona.dormir();


        Lagarto sabrina = new Lagarto(){

        };
        System.out.println("Hola, soy sabrina, una lagarta.");
        System.out.println("Quiero dormir.");
        sabrina.dormir();
        sabrina.posar();
        sabrina.trepar();



        Pinguino pingu = new Pinguino(){

        };

        System.out.println("Hola, soy pingu, un pinguino.");
        System.out.println("Quiero comer.");
        pingu.setSexo("macho");
        pingu.comer("lombrices");


        Canario zen = new Canario(){

        };

        zen.cantar();
        zen.dormir();
        zen.volar();
        zen.setEdad(4);
        zen.comer("lombrices");

            
        
            
        
        
    }
    
}
