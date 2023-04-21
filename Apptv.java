public class Apptv {


    public static void main(String[]Args) {

        Televisor tv1 = new Televisor();
        System.out.println("El canal por defecto de tv1 es: " +tv1.canal);
        tv1.canal = 8;

        System.out.println("El canal del primer televisor es el: " +tv1.getCanal());


        Televisor tv2 = new Televisor(6);
        System.out.println("El canal por defecto de tv2 es " +tv2.canal);
        System.out.println("El canal del segundo televisor  es " +tv2.getCanal());
        
    }
    
}
