/*ejercicio1.java
 * Utiliza la clase Gato para crear un array de cuatro gatos e
 * introduce los datos de cada uno de ellos mediante un bucle.
 * Muestra a continuacion los datos de todos los gatos usando tambien un bucle.
 * 
 * @Steven Cubillos Garcia
 * 
 */


package arrayobj;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);{


            //No declaramos variables porque usaremos el setter y getter//

            Gatitos pipa = new Gatitos();

            pipa.comer(14);

            

          //Definimos el array//
            Gatitos[] gato = new Gatitos[4];

            gato[0] = new Gatitos();
            gato[1] = new Gatitos();
            gato[2] = new Gatitos();
            gato[3] = new Gatitos();



            System.out.println("Introduzca los datos del gato mas abajo v v v");
            

          //Creamos un bucle que, primero, se limite a coger los datos que pide
            for (int i = 0; i < gato.length; i++){
                System.out.println(" ");
                System.out.println("GATO NUMERO " +i);

                System.out.println("Nombre:");
                gato[i].setNombre(sc.next());

                System.out.println("Sexo:");
                gato[i].setSexo(sc.next());

                System.out.println("Raza:");
                gato[i].setRaza(sc.next());

                System.out.println("Edad:");
                gato[i].setEdad(sc.nextInt());

                System.out.println("----------");

            }


            //Ahora creamos otro bucle que se limite a mostrar todos los datos introducidos//

            System.out.println("Resultados de los datos");

            for(int i =0; i<gato.length; i++){

                System.out.println("Gato Nº "+i);
                System.out.println("------------------");
                System.out.println("NOMBRE: "+gato[i].getNombre());
                System.out.println("------------------");
                System.out.println("SEXO: "+gato[i].getSexo());
                System.out.println("------------------");
                System.out.println("RAZA: "+gato[i].getRaza());
                System.out.println("------------------");
                System.out.println("EDAD: "+gato[i].getEdad());
                System.out.println("------------------");

            }

            sc.close();
        }

    }

}
