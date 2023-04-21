package arrayobj.Capitulo9Plus;

public class AstrosPrueba {

    public static void main(String[]Args){


        // Creamos un planeta con su clase, definiendo
        Planetas tierra = new Planetas(6378.1, 23.93, 5.97e24, 15, 9.8, 149.6e6, 365.24, 1);
        System.out.println(tierra.toString());

        // Creamos una luna
        Satelites luna = new Satelites(1737.1, 27.32, 7.35e22, -173, 1.62, 384400, 27.32, "Tierra");
        System.out.println(luna.toString());

        // Creamos un planeta con satélites
        Planetas jupiter = new Planetas(69911, 9.93, 1.898e27, -145, 24.79, 778.3e6, 4332.59, 79);
        Satelites io = new Satelites(1821.6, 1.77, 8.94e22, -143, 1.79, 421800, 1.77, "Jupiter");
        Satelites europa = new Satelites(1560.8, 3.55, 4.8e22, -143, 1.31, 671100, 3.55, "Jupiter");
        Satelites callisto = new Satelites(2410.3, 16.69, 1.08e23, -123, 1.23, 1882700, 16.69, "Jupiter");
        
        System.out.println(jupiter.toString());
        System.out.println(tierra.toString());
        System.out.println(io.toString());
        System.out.println(europa.toString());
        System.out.println(callisto.toString());
    
    }




        
    }
    

