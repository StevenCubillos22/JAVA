/*
 * 
 */
package Capitulo9Plus.Fichitas;

public class Fichas {


    
    private int lado1;
    private int lado2;



    public Fichas(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    }


    Fichas voltea() {
    return new Fichas(lado2, lado1);
    }


    boolean encaja(Fichas ficha) {
     return (lado1 == ficha.lado1) || (lado1 == ficha.lado2) ||
     (lado2 == ficha.lado1) || (lado2 == ficha.lado2);
    }


    @Override
      public String toString() {
       return "[" + lado1 + " | " + (lado2 == 0 ? " " : lado2) + ']';
    }
    
}
