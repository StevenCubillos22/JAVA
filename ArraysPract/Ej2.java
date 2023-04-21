package ArraysPract;
/*Implementa un programa Java que pueda generar y se muestre un array de nombre apuesta,
  de longitud 14. El programa deberá rellenarlo con numeros generados de forma aleatoria
  entre el 1 y el 3.
 * 
 */
public class Ej2 {


    public static void main(String[]Args){

        int apuesta[]=new int[14];
        int numero;

        System.out.println("A P U E S T A S:");

        for(int i = 0; i<apuesta.length; i++){
            numero= (int) (Math.random() *3) +1;
            apuesta[i]=numero;

            System.out.print(apuesta[i]+" ");
        }
    }
    
}
