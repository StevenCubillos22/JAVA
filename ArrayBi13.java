/*Ejercicio13
 * 
 * 
 * 
 * @Steven Cubillos Garcia
 */


public class ArrayBi13 {

    public static void main(String[]Args) {

        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];



        //Rellenamos el array con num aleatorios entre 140 y 210
        for (int i = 0; i < estaturas.length; i++) {

            for(int j =0; j<estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }

        }


        //Se muestra el array con sus estaturas//
        System.out.println("Estaturas por país:");
        for (int i = 0; i < paises.length; i++) {
            System.out.print(paises[i] + ": ");

            for (int j = 0; j < estaturas[i].length; j++) {
                System.out.print(estaturas[i][j] + " ");
            }
            System.out.println();
        }

        //Se calculara la estatura media, minima y maxima por pais
        int[] estaturaMedia = new int[4];
        int[] estaturaMinima = new int[4];
        int[] estaturaMaxima = new int[4];

        for (int i = 0; i < paises.length; i++) {
            int sumaEstaturas = 0;
            int minEstatura = Integer.MAX_VALUE;
            int maxEstatura = Integer.MIN_VALUE;


            for (int j = 0; j < estaturas[i].length; j++) {
                sumaEstaturas += estaturas[i][j];
                if (estaturas[i][j] < minEstatura) {
                    minEstatura = estaturas[i][j];
                }
                if (estaturas[i][j] > maxEstatura) {
                    maxEstatura = estaturas[i][j];
                }
            }

            estaturaMedia[i] = sumaEstaturas / estaturas[i].length;
            estaturaMinima[i] = minEstatura;
            estaturaMaxima[i] = maxEstatura;
        }


        //Se procede a mostrar los resultados//

        System.out.println();
        System.out.println("Resultados:");
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] + ":");
            System.out.println("Estatura media: " + estaturaMedia[i] + " cm");
            System.out.println("Estatura mínima: " + estaturaMinima[i] + " cm");
            System.out.println("Estatura máxima: " + estaturaMaxima[i] + " cm");
            System.out.println();
        }

    }




    
}
