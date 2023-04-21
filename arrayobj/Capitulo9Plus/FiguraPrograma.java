/*FiguraPrograma
 * Crea una clase ProgramaFiguras con un main en el que realizar las siguientes pruebas:
 * 1. Crea un ArrayList figuras.
 * 2. Añade figuras de varios tipos.
 * 3. Muestra la información de todas las figuras.
 * 4. Escala todas las figuras con escala = 2.
 * 5. Muestra de nuevo la información de todas las figuras.
 * 6. Escala todas las figuras con escala = 0.1.
 * 7. Muestra de nuevo la información de todas las figuras.
 * 
 * @Steven Cubillos Garcia
 */









package arrayobj.Capitulo9Plus;

public class FiguraPrograma {
    public static void main(String[] args) {


        //Creamos un array de figuras de 4 elementos
        Figura[] figuras = new Figura[4];
        figuras[0] = new Cuadrado(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Triangulo(3, 7);
        figuras[3] = new Circulo(2);


        //Se imprime informacion de las figuras

        System.out.println("Información de las figuras antes de escalar:");
        for (Figura figura : figuras) {
            figura.imprimir();
        }

        //Escala cada figura 2 veces su tamaño original
        for (Figura figura : figuras) {
            figura.escalar(2);
        }


        //Se imprime la informacion despues de hacerle la escala

        System.out.println("Información de las figuras después de escalar con escala = 2:");
        for (Figura figura : figuras) {
            figura.imprimir();
        }

        for (Figura figura : figuras) {
            figura.escalar(0.1);
        }

        System.out.println("Información de las figuras después de escalar con escala = 0.1:");
        for (Figura figura : figuras) {
            figura.imprimir();
        }
    }
}