package ArraysPract;

/*Implementa un programa en java que genere y muestre una tabla de nombres quiniela,
 de 14 filas y 3 columnas, y se rellene con los valores: 1 2 3, en cada fila.
 * 
 * 
 */

import java.util.Scanner;
public class Ej1 {

    public static void main(String[]Args){

  

             // Crear la tabla de quiniela
        String[][] tablaQuiniela = new String[14][3];
        
        // Rellenar la tabla con los valores 1, 2 y 3
        for (int fila = 0; fila < tablaQuiniela.length; fila++) {
            for (int columna = 0; columna < tablaQuiniela[fila].length; columna++) {
                tablaQuiniela[fila][columna] = String.valueOf(columna + 1);
            }
        }
        
        // Mostrar la tabla de quiniela
        for (int fila = 0; fila < tablaQuiniela.length; fila++) {
            for (int columna = 0; columna < tablaQuiniela[fila].length; columna++) {
                System.out.print(tablaQuiniela[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}






        


        
