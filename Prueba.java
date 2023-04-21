
import java.util.Scanner;
/*Ejercicio2.java
 *Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra a
continuación:
 * 
 * 
 * @Steven Cubillos Garcia
 */


public class Prueba {


    //Funcion que nos dice si una cadena de caracteres represente un numero valido
    //Devuelve verdadero si str no es nulo
    private static boolean esNumeric(String str){
        return str != null && str.matches("[0-9.]+");
 }

    public static void main(String[]Args) {

        Scanner sc = new Scanner(System.in);{



        Bici decathlon = new Bici();
        Coche toyota = new Coche();


        int kilometro1;
        int kilometro2;
        String eleccion;
        int opcionNum;


        

        System.out.println("Elige una opcion: ");
        System.out.println("1. Coge la bici y pedalea: ");
        System.out.println("2. Usa el timbre de la bici: ");
        System.out.println("3. haz un ollie con la bici: ");
        System.out.println("4. Coge el coche y acelera: ");
        System.out.println("5. Usa el turbo del coche: ");
        System.out.println("6. Haz un derrape del coche: ");
        System.out.println("7. Salir: ");

        eleccion =sc.nextLine();

        if(esNumeric(eleccion)) {
            opcionNum=Integer.parseInt(eleccion);
        } else {
            opcionNum=0;
        }



        switch (opcionNum) {

            case 1:
            System.out.println("¿Cuantos kms quieres recorrer?: ");
            kilometro1 = sc.nextInt();

            decathlon.recorrer(kilometro1);

            System.out.println("Has hecho " +kilometro1+ " kms con la bici.");

            break;


            case 2:
            decathlon.sonarTimbre();
            break;

            case 3:
            decathlon.ollie();
            break;


            case 4:
            System.out.println("¿Cuantos kms quieres recorrer?: ");
            kilometro2 = sc.nextInt();

            toyota.recorrer(kilometro2);

            System.out.println("Has hecho " +kilometro2+ " kms con el coche.");

            break;


            case 5:

            toyota.turbo();
            break;

            case 6:
            toyota.drift();
            break;


            case 7:
            System.out.println("Cerrando..");
            default:



        }




        sc.close();

    }

 }
    
}