package ArraysPract;
import java.util.Scanner;
public class Ej5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Ingrese el tamaño de los arrays: ");
            int tamaño = scanner.nextInt();
            
            // Crear el primer array
            int[] primerArray = new int[tamaño];
            
            // Rellenar el primer array con valores aleatorios entre 300 y 400
            for (int i = 0; i < primerArray.length; i++) {
                primerArray[i] = (int) (Math.random() * 101) + 300;
            }
            
            // Crear el segundo array con el mismo tamaño que el primer array
            int[] segundoArray = new int[primerArray.length];
            
            // Copiar los valores del primer array al segundo en orden inverso
            for (int i = 0; i < primerArray.length; i++) {
                segundoArray[i] = primerArray[primerArray.length - 1 - i];
            }
            
            // Mostrar ambos arrays
            System.out.println("Primer array:");
            for (int i = 0; i < primerArray.length; i++) {
                System.out.print(primerArray[i] + " ");
            }
            System.out.println();
            
            System.out.println("Segundo array:");
            for (int i = 0; i < segundoArray.length; i++) {
                System.out.print(segundoArray[i] + " ");
            }
            System.out.println();
            
            // Calcular la suma total de los valores del primer array
            int sumaTotal = 0;
            for (int i = 0; i < primerArray.length; i++) {
                sumaTotal += primerArray[i];
            }
            
            // Mostrar la suma total, el mayor y el menor número del primer array
            int mayor = primerArray[0];
            int menor = primerArray[0];
            for (int i = 1; i < primerArray.length; i++) {
                if (primerArray[i] > mayor) {
                    mayor = primerArray[i];
                }
                if (primerArray[i] < menor) {
                    menor = primerArray[i];
                }
            }
            
            System.out.println("Suma total de los valores: " + sumaTotal);
            System.out.println("Mayor número: " + mayor);
            System.out.println("Menor número: " + menor);
        }
    
}
