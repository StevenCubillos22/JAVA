
/*TarjetaPrograma.java
 * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
 *las tarjetas regalo. Como primer paso para implementar la aplicación, es
*necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
*se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
*un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
*se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
*creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
*número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
*originales se quedarían con 0 € de saldo.
 * 
 * @Steven Cubillos Garcia
 */



public class TarjetaPrograma {


    public static void main(String[]Args) {

        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);

        System.out.println(t1);
        System.out.println(t2);

        t1.gastar(45.90);
        t2.gastar(5);
        t2.gastar(200);
        t1.gastar(3.55);

        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
    }
    
}
