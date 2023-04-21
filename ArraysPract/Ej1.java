package ArraysPract;

/*Implementa un programa en java que genere y muestre una tabla de nombres quiniela,
 de 14 filas y 3 columnas, y se rellene con los valores: 1 2 3, en cada fila.
 * 
 * 
 */

import java.util.Scanner;
public class Ej1 {

    public static void main(String[]Args){

  

            String[][] tabla = new String[14][3];

            //Se crea el array con sus numeros

            for (int i = 0; i < 14; i++) {
              for (int j=0; j<3; j++) {
                tabla[i][j] = String.valueOf(j + 1);
              }
          }
    }



    //Se muestra nuestro array una vez mostrado los numeros generados
    System.out.println("Tabla: ");
      for (int i = 0; i < 14; i++) {
        for (int j = 0; j < 3; j++) {
          System.out.print(tabla[i][j]+" ");
        }
      System.out.println();
    }

          

    }






        


        
