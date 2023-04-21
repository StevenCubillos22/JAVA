package capitulo14.Ejercicio2;
import java.io.IOException;
import java.io.FileNotFoundException;


/*Ejercicio2.java

*Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

 * En el mismo ejercicio,  genere una excepción de forma aleatoria de entre
las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
IndexOutOfBoundsException y ArithmeticException
 *
 * @Steven Cubillos Garcia
 */
public class Ej2 {

    public static void main(String[]Args) {

    //Creamos dos instancias, ambos machos
    Gato marth = new Gato("macho");
    Gato lucio = new Gato("macho");


        //Bloque try-catch que usa la funcion de aparea
    try {

       marth.come("pescado");
       marth.apareaCon(lucio);
      } catch (ExcepcionApareamientoImposible e) {
        // TODO: handle exception
       System.out.println("Al ser gatos del mismo sexo no se pueden aparear");
      }  catch (IOException e) {
        System.out.println("Error generado, de tipo -->" + e.getClass().getSimpleName());
      } catch (NumberFormatException | IndexOutOfBoundsException | ArithmeticException ed) {
        System.out.println("Error generado, de tipo -->"+ ed.getClass().getSimpleName());
      } catch (FileNotFoundException en) {
        System.out.println("Error generado, de tipo -->"+ en.getClass().getSimpleName());
      }
   
    }

}
    

