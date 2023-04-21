package capitulo14;
import java.util.Scanner;

/*Ejercicio1.java
 * 
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.  
 * 

 * @Steven Cubillos Garcia
 */
public class Ejercicio1 {

    public static void main(String[]Args) {

        Scanner sc = new Scanner(System.in);{


            int[] num = new int [6];
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            int i;
            boolean error=false;

            do{

                try {
                    System.out.println("Introduzca 6 numeros y te diremos el menor y el maximo");
                    System.out.println("En caso de que haya ");
                    
                    for ( i=0; i<num.length; i++){
                        num[i]=sc.nextInt();

                        if(num[i]> maximo){
                            maximo = num[i];
                        }
                
                        if (num[i]< minimo){
                            minimo=num[i];
                        }
                    }

                    error = true;
        
                } catch (Exception e) {
                    System.out.println("El numero introducido no es compatible =(");
                    System.out.println("El error es de: "+e.getMessage());
                    System.out.println("La excepcion es de: "+e.getClass());
                    System.out.println("Pruebe con otro numero---v");
                    
                    // TODO: handle exception
                }

            }while (!error);

            System.out.println("Segun los numeros introducidos, el minimo es "+minimo+" y el maximo es "+maximo);

     sc.close();   
    }

  }
        
}


   
