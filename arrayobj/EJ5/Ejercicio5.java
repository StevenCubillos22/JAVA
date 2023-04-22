/*Ejercicio5.java
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 *control de los artículos de un almacén. De cada artículo se debe saber el código,
 *la descripción, el precio de compra, el precio de venta y el stock (número de
 *unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 *1. Listado
 *2. Alta
 *3. Baja
 *4. Modificación
 *5. Entrada de mercancía
 *6. Salida de mercancía
 *7. Salir

 * --Ahora se mejorará implementando un arrayList
 * @Steven Cubillos Garcia
 * 
 */

package arrayobj.EJ5;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {


    public static void main(String[]Args){

        Scanner sc=new Scanner(System.in);{

            //Declaracion de atributos

            int eleccion;
            
            int stockDepositado = 0;
            int cantidad;
            double precCompra;
            double precVenta;
            String codigo="";
            String codDep=" ";
            String descripc;
            boolean encontrado;
            String precCompraString;
            String precVentaString;
            String stockDepositString;
            
            
            ArrayList<Articulo> almacen = new ArrayList<Articulo>();

            //Definimos las instancias
            almacen.add(0, new Articulo("12K2", "tiene bifrutas", 33, 39, 5));
            almacen.add(1, new Articulo("23W5", "Procede de Murcia", 22, 24, 6));
            almacen.add(2, new Articulo("31X6", "Sus proteinas son de origen vegetal", 13, 15, 7));


           //Bucle do-while 
            do{

            System.out.println("GESTISIMAL");
            System.out.println("--La logística es nuestra prioridad--");
            System.out.println("+++++++++++");
            System.out.println("Seleccione una opción:");
            System.out.println("");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            eleccion = sc.nextInt();
            sc.nextLine();
                
            //Switch que nos ayuda a elegir una de las opciones que elijamos

            switch(eleccion){

                case 1:
                    
                   
                //Se hace un listado de los productos que tengamos hasta ahora//
                System.out.println("L I S T A D O");
                  for(Articulo a : almacen) {
                    System.out.println(a);
                }
                break;

                //Damos de alta el producto introduciendo el codigo, descripcion y más
                case 2:
                System.out.println("A L T A");
                System.out.println("");
                
                System.out.println("Introduzca un codigo");
                codigo = sc.nextLine();
                
                System.out.println("Introduzca una descripcion");
                descripc = sc.nextLine();
                
                System.out.println("Introduzca un precio de compra");
                precCompraString = sc.nextLine();
                precCompra = Double.parseDouble(precCompraString);
                
                System.out.println("Introduzca un precio de venta");
                precVentaString = sc.nextLine();
                precVenta = Double.parseDouble(precVentaString);
                
                System.out.println("Por ultimo un numero de stock");
                stockDepositado = sc.nextInt();

                //Una vez leido los datos, lo guardamos en un arraylist
                
                Articulo articNuevo = new Articulo(codigo, descripc, precCompra, precVenta, stockDepositado);
                almacen.add(articNuevo);
                break;

                //Damos de baja a algun producto segun el codigo que pongamos
                case 3:
                System.out.println("B A J A: ");
                System.out.println("--------| ");
                System.out.println("Se va a dar de baja el producto.");
                System.out.println("Introduce el código para la baja: ");
                codigo=sc.nextLine();
                //Lee el codigo y lo busca

                //Se implementa el booleano 
                encontrado = false;

                //Se busca el codigo
                //Usando un if dentro de un for-each, si el codigo es igual al que se pidio, se borrara y encontrado se establece en true
                for (Articulo a : almacen) {
                    if(a.getCodigo().equals(codigo)) {
                    almacen.remove(a);
                    encontrado = true;
                    System.out.println("Se ha eliminado el artículo indicado");
                    break;
                  }
                }

                if(!encontrado) {
                    System.out.println("El artículo no ha sido encontrado");
                }
                break;


                //Se modifica cualquier articulo segun el codigo
                case 4:
                System.out.println("M O D I F I C A C I O N: ");
                System.out.println("------------------------- ");

                System.out.println("Introduzca el codigo del articulo que quiera modificar ");
                codigo=sc.nextLine();

                
                for (Articulo a : almacen) {


                    if (a.getCodigo().equals(codigo)) {

                    System.out.println("Introduzca los nuevos datos del articulo");
                    System.out.println("Introduzca una nueva descripcion");
                    descripc=sc.nextLine();
                
                    System.out.println("Introduzca un nuevo precio de compra");
                    precCompraString = sc.nextLine();
                    precCompra = Double.parseDouble(precCompraString);
                
                    System.out.println("Introduzca un nuevo precio de venta");
                    precVentaString=sc.nextLine();
                
                    System.out.println("Por ultimo un stock");
                    stockDepositString=sc.nextLine();

                    a.setDescripcion(descripc);
                    a.setPrecCompra(precCompra);
                    a.setPrecVenta(precVentaString);
                    a.setStockDepositString(stockDepositString);

                    System.out.println("Se ha modificado el artículo con éxito");
                    }
                }
                break;

                //Se pide una entrada de mercancia introduciendo un codigo que pongamos

                case 5:
                System.out.println("E N T R A D A  DE  M E R C A N C I A |");
                System.out.println("--------------------------------------");


                System.out.println("Introduzca codigo");
                codigo=sc.nextLine();

                for (Articulo a : almacen) {
                    if(a.getCodigo().equals(codigo)) {
                        System.out.println("Introduzca la cantidad de mercancia que entra");
                        cantidad=sc.nextInt();
                        sc.nextLine();

                        a.setStock(a.getStock() + cantidad);
                        System.out.println("La entrada de mercancia se ha realizado correctamente");
                        System.out.println("");
                    }
                }
                break;

              //Se da a salir una mercancia segun el codigo del producto que pongamos, que se mandará a buscar//
              //De lo contrario, nos dira que no se encuentra disponible//
                case 6:
                System.out.println("S A L I D A  M E R C A N C I A");
                System.out.println("------------------------------");
                System.out.println("Introduzca codigo");
                codDep=sc.nextLine();

                
                

                for (Articulo a : almacen) {
                    if (a.getCodigo().equals(codigo)) {
                        System.out.print("Introduzca el número de unidades que salen del almacén: ");
                        cantidad=sc.nextInt();
                        sc.nextLine();

                        if (a.getStock() < cantidad) {
                            System.out.println("No hay stock");
                        } else {
                            a.setStock(a.getStock() - cantidad);
                            System.out.println("La mercancia ha salido sin problema");
                            System.out.println("        __________");
                            System.out.println("       //  ||   //");
                            System.out.println(" _____//___||_ //___");;
                            System.out.println(" )  _          _    /");
                            System.out.println(" |_/ /________/ /___|-- .......");
                            System.out.println("__/_/________/_/______");
                            System.out.println("");
                        }

                    }
                }
                break;

            }
    
        }while(eleccion!=7);

        sc.close();
    }    

  }
}
