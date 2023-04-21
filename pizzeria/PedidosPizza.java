/*PedidosPizza.java
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
 * siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * @Steven Cubillos Garcia
 * 
 */





package pizzeria;


public class PedidosPizza {

    public static void main(String[]Args) {

        Pizza pe1 = new Pizza("Mediana", "Margarita");
        Pizza pe2 = new Pizza("Familiar", "Funghi");

        pe2.servir();

        Pizza pe3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(pe1);
        System.out.println(pe2);
        System.out.println(pe3);
        pe2.servir();

        System.out.println("| PIZZAS PEDIDAS  |> " +Pizza.getPedidas());
        System.out.println("| PIZZAS SERVIDAS |> " +Pizza.getServidas());
        
    }
    
}