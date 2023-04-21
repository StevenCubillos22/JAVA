package capitulo14;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*ProbarFunciones.java
 * Haz un programa llamado ProbarExcepciones.java con un solo archivo y 5 funciones (métodos) en él, que utilice el método main.
Haz un menú con 5 opciones. Cada una de las opciones debe usar una de las 5 funciones:
- 1: Provoca un error "StackOverFlowError"
- 2: Provoca una excepción "NumberFormatException"
- 3: Provoca una excepción "ArrayIndexOutOfBoundsException"
- 4: Provoca una excepción "FileNotFoundException"
- 5: Provoca una excepción "ArithmeticException"

Haz un bloque try-catch múltiple en el main, de forma que sea en el main donde se capture la excepción, y no en la función.

Esto significa que cada función debe incluir un "thows" con el tipo de excepción. 
 * 
 * @Steven Cubillos Garcia
 */
public class ProbarFunciones {

    //Se tiene que arrojar un throws arithmetic exception

    public static int dividir (int x, int y) throws ArithmeticException {

        return x/y;
    }

    //Se tiene que arrojar un number format exception

    public static int media (int x, int y) throws NumberFormatException {

        return (x+y) / 2;
    }

    //Se tiene que arrojar un array index out of bounds

    public static int generaArray() throws ArrayIndexOutOfBoundsException {
		int num [] = {1, 2, 3, 4, 5};

        return num[5];
		
		
	   }


    //Se tiene que generar un stack overflow

    public static int factor(int x){

         return x *factor(x-1);
    }



    //Funcion que genera un FileNotFoundException

    public static void archivo() throws FileNotFoundException{
        throw new FileNotFoundException("No se pudo encontrar el archivo");
    }


    public static void main (String[]Args){

        Scanner sc=new Scanner(System.in);


            int resultado;
            int resultado2;
            int resultado3;
            int resultado5;
            String linea = "";


            try {

                                
                int eleccion;
    
                System.out.println("Pon un numero del 1 al 5y te diremos que error es");
                System.out.println("1-ArithmeticException");
                System.out.println("2-NumberFormatException");
                System.out.println("3-ArrayIndexOutOfBoundsException");
                System.out.println("4-FileNotFoundException");
                System.out.println("5-StackOverflowError");

                eleccion = sc.nextInt();

                //Switch que selecciona los casos y te muestra su error
                switch (eleccion) {

                    case 1:
                    resultado=dividir(6, 0);
                    break;

                    case 2:
                    sc.nextLine();
                    resultado2=media(sc.nextInt(),sc.nextInt());
                    break;

                    case 3:
                    resultado3=generaArray();
                    break;

                    case 4: //Bloque try-catch enfocado a leer ficher
                    try {
                        //Se lee el fichero
                        System.out.println("Introduce ahora el nombre del archivo ");
                        System.out.println("- Recuerda que el nombre del archivo tiene que terminar en .txt");
                        BufferedReader arch = new BufferedReader(new FileReader(sc.next()));
                        
                        while (linea != null) {
                            System.out.println(linea);
                            System.out.println("Se ha encontrado el archivo!! ");
                            linea = arch.readLine();
                        }
                        arch.close();

                        //aqui se introduce catch, uno si no se encuentra, y otro si hay problema de lectura
                    } catch (FileNotFoundException fa) { 
                        System.out.println("El fichero indicado no se puede localizar =( ");
                    } catch (IOException fu) { 
                        System.out.println("Ha ocurrido problemas de lectura del fichero, lo sentimos =( ");
                    }
                    break;

                    case 5:
                    resultado5=factor(5);
                    break;

                    default:
                        System.out.println("");

                }

    
            } catch (ArithmeticException e) {
             System.out.println("Has puesto cero =(( ArithmeticException");
            } catch (NumberFormatException en) {
                System.out.println("Error decimal. NumberFormatException ");
            } catch (ArrayIndexOutOfBoundsException env) {
                System.out.println("Error en el Array. ArrayIndexOutOfBoundsException");
            } catch (StackOverflowError envi) {
                System.out.println("Error del tipo Stackoverflow");
            }

    }

}
