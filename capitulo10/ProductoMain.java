package capitulo10;
import java.util.ArrayList;
public class ProductoMain {

    public static void main(String[]Args){

        //Creamos nuestras cinco instancias
        Producto arroz = new Producto("Arroz", 18);
        Producto leche = new Producto("Leche", 14);
        Producto cepillo = new Producto("Cepillo", 7);
        Producto croissant = new Producto("Croissant", 30);
        Producto pasta = new Producto("Pasta", 24);

        ArrayList<Producto> recibo = new ArrayList<Producto>();

        recibo.add(arroz);
        recibo.add(leche);
        recibo.add(cepillo);
        recibo.add(croissant);
        recibo.add(pasta);

        //Se imprime nuestro listado en un for-each

        System.out.println("Contenido del recibo de compra:");

        for(Producto a: recibo){
            System.out.println(a.toString());
        }
        System.out.println(" ");

        //Eliminamos los productos de la posicion 1 y 3 del array
        recibo.remove(1);
        recibo.remove(3);


        System.out.println("Contenido del recibo de compra modificado:");

        for(Producto a: recibo){
            System.out.println(a.toString());
        }
        System.out.println(" ");


        //Añadimos una nueva instancia, situandola en la posicion 2
        Producto nuevoProducto = new Producto("Ensalada Cesar", 9);
        recibo.add(2, nuevoProducto);

        //Lo imprimimos en un for-each
        System.out.println("Contenido del recibo de compra añadiendo :");

        for(Producto a: recibo){
            System.out.println(a.toString());
        }
        System.out.println(" ");

        //Borramos todo el contenido del array
        recibo.clear();

        System.out.println("Contenido borrado :");
        for(Producto a: recibo){
            System.out.println(a.toString());
            
        }

    }

    
    
}
