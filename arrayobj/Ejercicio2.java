package arrayobj;

public class Ejercicio2 {


    public static void main(String[]Args){

        


          //Definimos el array//
            Gatitos[] gato = new Gatitos[4];

            gato[0] = new Gatitos("Leona", "hembra", "comun europea", 3);
            gato[1] = new Gatitos("Din", "macho", "persa", 6);
            gato[2] = new Gatitos("Jake", "macho", "montes", 7);
            gato[3] = new Gatitos("Maria", "hembra", "bengala", 4);



            //Ahora creamos otro bucle que se limite a mostrar todos los datos introducidos//

            System.out.println("Resultados de los datos");

            for(int i =0; i<gato.length; i++){

                System.out.println("GATO Nº "+i);
                System.out.println("------------------");
                System.out.println("NOMBRE: "+gato[i].getNombre());
                System.out.println("------------------");
                System.out.println("SEXO: "+gato[i].getSexo());
                System.out.println("------------------");
                System.out.println("RAZA: "+gato[i].getRaza());
                System.out.println("------------------");
                System.out.println("EDAD: "+gato[i].getEdad());
                System.out.println("------------------");
                System.out.println(" ");
                System.out.println(" ");

            }


    }
    
}
