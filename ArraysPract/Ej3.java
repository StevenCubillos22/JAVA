package ArraysPract;

public class Ej3 {

    public static void main(String[] args) {
        // Crear la tabla de quiniela
        String[][] tablaQuiniela = new String[14][3];
        
        // Rellenar la tabla con los valores 1, 2 y 3
        for (int fila = 0; fila < tablaQuiniela.length; fila++) {
            for (int columna = 0; columna < tablaQuiniela[fila].length; columna++) {
                tablaQuiniela[fila][columna] = String.valueOf(columna + 1);
            }
        }
        
        // Generar el array de apuesta
        int[] apuesta = new int[14];
        for (int i = 0; i < apuesta.length; i++) {
            apuesta[i] = (int) (Math.random() * 3) + 1;
        }
        
        // Mostrar la apuesta y la tabla de quiniela con el resaltado
        for (int fila = 0; fila < tablaQuiniela.length; fila++) {
            for (int columna = 0; columna < tablaQuiniela[fila].length; columna++) {
                if (tablaQuiniela[fila][columna].equals(String.valueOf(apuesta[fila]))) {
                    System.out.print("*" + tablaQuiniela[fila][columna] + "* ");
                } else {
                    System.out.print(tablaQuiniela[fila][columna] + " ");
                }
            }
            System.out.println();
        }
    }
    
}
