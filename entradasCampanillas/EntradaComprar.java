/*EntradaComprar.java
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 *Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
 *con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 *venderlas.
 *Ahora. Se debe evitar que el programa se  detenga con una excepción, introduciendo el código que lee el teclado en un bloque try-catch.
*Como se indica en el ejemplo de las páginas 306 y 307 del libro, simplemente mostrando un mensaje 
 * de que los datos introducidos no son correctos y volviendo al menú para permitir introducirlo de nuevo. 
 * @Steven Cubillos Garcia
 */




package entradasCampanillas;


import java.util.Scanner;
public class EntradaComprar {


    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);{


            Zona principal = new Zona(1000);
            Zona compraventa = new Zona(200);
            Zona vip = new Zona (25);

            int eleccion = 0;



            do {

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - ");
            System.out.println("|Bienvenido a Expocoches Campanillas. Seleccione una de las opcienes:| ");
            System.out.println("1. Mostrar numero de entradas libres.                                | ");
            System.out.println("2. Vender entradas.                                                  | ");
            System.out.println("3. Salir del menu.                                                   | ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - ");

            eleccion = sc.nextInt();


            switch (eleccion) {

                case 1:
                System.out.println("Entradas libres en la sala principal -> > "+principal.getEntradasPorVender());
                System.out.println("Entradas libres en la sala compraventa -> > "+compraventa.getEntradasPorVender());
                System.out.println("Entradas libres en la sala VIP -> > "+vip.getEntradasPorVender());
                break;

                case 2:

                    int opcion = 0;

                    System.out.println("¿En que zona quiere comprar la entrada?");
                    System.out.println("1. Sala principal");
                    System.out.println("2. Sala compraventa");
                    System.out.println("3. Sala VIP");
                    opcion = sc.nextInt();

                 //Bloque try que, una vez metamos datos erroneos nos llevara al bloque catch
                try{

                    System.out.print("¿Cuantas entradas quieres comprar?");
                    int entradas = sc.nextInt();

                    switch (opcion) {

                        case 1:
                        principal.vender(entradas);

                        break;

                        case 2:
                        compraventa.vender(entradas);
                        break;

                        case 3:
                        vip.vender(entradas);
                        break;

                        default:
                        System.out.println("Error en la seleccion...");
                    }

                    //En el bloque catch se visualiza el tipo de excepcion y error y que nos devolveria al menu, con sus mensajes de error y excepcion
                } catch(Exception e) {

                    System.out.println("E X C E P C I O N: "+e.getClass());
                    System.out.println("E R R O R: "+e.getMessage());
                    System.out.println("Ha habido un error en la lectura de datos =( ");
                    System.out.println("Consulta mas detalles en el manual");
                    System.out.println(" ");
                    sc.nextLine();

                }


                case 3:
                System.out.println("¡Hasta luego!");
                break;

                default:
                System.out.println("Error en la seleccion...");


            }


            
        } while (eleccion != 3);

        sc.close();
    }


    }
    
}
