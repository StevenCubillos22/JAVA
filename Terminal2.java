public class Terminal2 {


     //Atributos privados//

     private String numero;
     private int duracionLlamada;
 
 
     public Terminal2(String numero){
         this.numero=numero;
         this.duracionLlamada= 0;
     }
 
 
     //Metodos get para los atributos privados//
     String getNumero(){
         return this.numero;
     }
 
     int getDuracionLlamada(){
         return this.duracionLlamada;
     }
 
    //Este metodo permite tomar dos variables, la primera de la misma clase ya que se refiere a una instancia que se quiera poner y la otra variable son los segundos de tipo int//
    //Por una parte, cogemos la variable duracionLlamada que se contabiliza en el contador segundos que forma parte de la instancia que usa este void//
    //Por otra parte, se suma en el contador los segundos de la instancia que pongamos en Telf, dando resultado la duracion total del numero que llame a otro numero// 
     public void llamar(Terminal2 telf, int segundos){
 
         this.duracionLlamada = ++segundos;
         telf.duracionLlamada = ++segundos;
 
     }
 
 
     public String toString() {
         return "| Nº " +numero+ " > " +duracionLlamada+ "s de llamada";
     }
    
}
