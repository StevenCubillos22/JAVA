package arrayobj.Capitulo9Plus;

public class Ej14 {


    public static void main(String[] args) {
        Fichas f1 = new Fichas(6, 1);
        Fichas f2 = new Fichas(0, 4);
        Fichas f3 = new Fichas(3, 3);
        Fichas f4 = new Fichas(0, 1);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);


        System.out.println(f2.voltea());
        
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
        }
    
}
