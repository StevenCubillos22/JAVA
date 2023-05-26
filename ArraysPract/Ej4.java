package ArraysPract;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();
        
        // Crear el array
        int[] array = new int[tamaño];
        
        // Rellenar el array con números aleatorios entre 300 y 400
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(300, 400);
        }
        
        // Mostrar el array generado
        System.out.println("Array generado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    // Método para generar un número aleatorio en un rango dado
    private static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
}
