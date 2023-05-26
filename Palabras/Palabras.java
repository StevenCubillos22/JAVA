package Palabras;

/*
 * IMPORTANTE: <java Palabras.java help> es el comando para ver todas las opciones de este programa
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
public class Palabras {

    public static void main(String[] args){
    String palabraBuscada = "";
    String palabraBuscada2 = "";
        String nombreFichero = "";
        ArrayList<String> textoOriginal = new ArrayList<>();
        ArrayList<String> texto = new ArrayList<>();
        boolean printHelp = false;
        
        
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-f":
                    nombreFichero = args[i + 1];
                    textoOriginal = leerTodoFichero(nombreFichero);
                    texto = leerTodoFichero(nombreFichero);
                    break;
                case "help":
                    printHelp = true;
                    break;
                case "-w": // SI
                    try{
                    nombreFichero = args[i+1];
                    BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
                    System.out.println(nombreFichero);
                    texto.addAll(leerTodoFichero("Tema11intro.txt"));
              
                    for(String palabra: texto){
                        
                    
                  
                       
                        bw.write(palabra);
                    }
                    bw.close();


                    
                } catch(IOException e){
                    System.out.println("Error" + e.getClass() + e.getMessage());
                }
                  break;
            }
        }
        
        if (printHelp) {
            obtenerAyuda(nombreFichero);
            return;
        }

        File fichero = new File(nombreFichero);
       
       
        

        
       
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            for(int i=0; i<args.length; i++){
                switch(args[i]) {

                    case "-c":
                        palabraBuscada = args[i+1];
                        contarPalabras(texto, palabraBuscada);
                        break;
                
                    case "-m":
                       imprimirminuscula(texto);
                        break;

                    case "-M":
                    imprimirmayuscula(texto);
                    break;


                    case "-n": // FUNCIONA
                    palabraBuscada = args[i+1];
                    palabraBuscada2 = args[i+2];              
                    borrarAparicion(texto, palabraBuscada, i, palabraBuscada2);
                    break;


                    case "-b":
                    palabraBuscada = args[i+1];
                    borrar(texto, palabraBuscada);
                    break;

                    case "-o":
                    imprimir(textoOriginal);
                    break;

                    case "-A": // FUNCIONA
                    palabraBuscada = args[i+1];
                    ordenarAlfabeticamente(texto);
                    break;

                    case "-a": //FUNCIONA
                    contarTodasLasPalabras(texto);
                    break;



                    case "-p": // FUNCIONA
                    palabraBuscada = args[i+1];
                    buscarPosiciones(texto, palabraBuscada);
                    break;


                    case "-l": //FUNCIONA
                    palabraBuscada = args[i+1];
                    int resultado=(buscarLineas(texto, palabraBuscada));

                    if (resultado== -1){

                        System.out.println("La palabra " +palabraBuscada+ " no se ha podido encontrar. ");
                    } else {
                        System.out.println("La linea en la que aparece la palabra  "+palabraBuscada+ " es: "+resultado);
                    }
                    break;

                    case "-r": // FUNCIONA
                    alterarPalabras(texto);
                    break;

                    case "-R": // FUNCIONA
                    desordenarTexto(texto);
                    break;

                    

         
                }
            }
        }
            catch(IOException e){
                System.out.println("Error" + e.getMessage());
            }
        }
    
    
    public static void contarPalabras (ArrayList<String> texto, String palabraBuscada) {
        int cuenta = 0;
        for (String palabra: texto) {
            if (palabra.toLowerCase().contains(palabraBuscada.toLowerCase())) { //Para no distinguir mayúsculas-minúsculas
                cuenta++;
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Apariciones de "  + palabraBuscada.toLowerCase() +   " : " + cuenta);
        System.out.println("------------------------------------------------------------------------------");
    }

    public static int contarAparicionesInt(String palabra, ArrayList<String> texto){
        int cuenta = 0;
        for (String p: texto){
            if (p.toLowerCase().contains(palabra.toLowerCase())) { //Para no distinguir mayúsculas-minúsculas
                cuenta++;
            }
        }
        return cuenta;
    } 

//Funcion que obtiene el nombre del fichero en un bucle
//Este bucle recorre los args que devuelve si esta el archivo, sino, te devuelve null
public static String obtenerNombreFichero(String[] args) {
    for(int i = 0; i<args.length; i++){
       if(args[i].equals("-f")){
        return args[i+1];
       } 
    }
   return "t.txt";
}

 

public static ArrayList<String> leerTodoFichero(String nombreFichero) {
    ArrayList<String> textoLeido = new ArrayList<>();
    String espacio = " ";

    try {//Implementamos un try-catch para controlar error de lectura en el archivo
        //Leemos el archivo con bufferedreader, seguido de un while//
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
        String linea = br.readLine();
  
        while (linea != null) {
            String[] palabras = linea.split(" ");
            for(String palabra : palabras) {
                textoLeido.add(palabra);   
                textoLeido.add(espacio);
            }
          
            linea = br.readLine();
        }
        br.close();
        
    } catch (Exception e) {
        System.out.println("Error en fichero: " + e.getMessage());
    }
    return textoLeido;
}


public static ArrayList<String> minusculas(String nombreFichero) {
    ArrayList<String> textoLeido = new ArrayList<>();
    String espacio = " ";
    try {
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
        String linea = br.readLine();
  
        while (linea != null) {
            String[] palabras = linea.split(" ");
            for(String palabra : palabras) {
                textoLeido.add(palabra.toLowerCase());
                textoLeido.add(espacio);
                System.out.println("\n");
            }
          
            linea = br.readLine();
        }
        br.close();
    } catch (IOException e) {
        System.out.println("Error en fichero: " + e.getMessage());
    }
    return textoLeido;
}



public static void imprimir (ArrayList<String> texto) {
    for (String p: texto) {
        System.out.print(p);
    }
}

public static void imprimirminuscula (ArrayList<String> texto) {
    for (String p: texto) {
        System.out.print(p.toLowerCase());
    }
}

public static void imprimirmayuscula (ArrayList<String> texto) {
    for (String p: texto) {
        System.out.print(p.toUpperCase());
    }
}


public static void borrar(ArrayList<String> texto, String palabra){
    ArrayList<String> nuevoTexto = new ArrayList<>(); // nuevo ArrayList para almacenar los elementos que deseamos mantener
    
    for(String p : texto) {
        if (!p.toLowerCase().equals(palabra.toLowerCase())) { // si la palabra actual no es la que deseamos eliminar, la agregamos al nuevo ArrayList
            nuevoTexto.add(p);
        }
    }
    
    texto.clear(); // borramos el ArrayList original
    texto.addAll(nuevoTexto); // agregamos los elementos del nuevo ArrayList al ArrayList original
    imprimir(texto);
}



//-n funcion
public static void borrarAparicion(ArrayList<String> texto, String palabraBuscada, int num, String palabraBuscada2) {
    int contador = 0; // declaramos un int que nos ayude a almacenar las veces de apariciones
    
    // Recorremos el texto para contar y eliminar  ocurrencias de la palabra
    for (int i = 0; i < texto.size(); i++) {
        if (texto.get(i).equalsIgnoreCase(palabraBuscada)) {
            contador++;
            if (contador == num) {
                texto.remove(i);
                System.out.println("Se ha eliminado la " + palabraBuscada2 + " aparicion de la palabra " + palabraBuscada + " del texto.");
                
            }
        }         
    }

}



public static void restaurarTexto(ArrayList<String> texto, ArrayList<String> textoOriginal) {
    texto.clear(); // borramos el texto modificado
    texto.addAll(textoOriginal); // restauramos el texto original
    imprimir(texto);
}


/**
 * @param palabras
 */


 //-A
public static void ordenarAlfabeticamente(ArrayList<String> palabras) {

    Collections.sort(palabras);//Usando el metodo sort para ordenar las palabras alfabeticamente del arrayList
    int apariciones = 0; //Se cuenta el numero de apariciones

    for (String p : palabras) { //Bucle for-each para recorrer las palabras del arrayList
       
      
            apariciones = contarAparicionesInt(p, palabras);
    
        System.out.println(p + ": " + apariciones);
        
    }

}


//-a
public static void contarTodasLasPalabras(ArrayList<String> texto) {
    ArrayList<String> palabras = new ArrayList<>();

    //Bucle for-each para recorrer todas las palabras y contabilizarlas
    for (String palabra : texto) {
        if (!palabras.contains(palabra)) {
            palabras.add(palabra);
        }
    }

    // Ordenamos la lista de palabras según el número de apariciones
    Collections.sort(palabras, (p1, p2) -> contarAparicionesInt(p2, texto) - contarAparicionesInt(p1, texto));
    // Imprimir la lista ordenada de palabras y su número de apariciones
    for (String palabra : palabras) {
        int cuenta = contarAparicionesInt(palabra, texto);
        
        System.out.println(palabra + ": " + cuenta); 
    }
}



//-p
public static void  buscarPosiciones(ArrayList<String> texto, String palabraBuscada) {
    ArrayList<Integer> posiciones = new ArrayList<Integer>();

    boolean esta= false;
    
    for (int i = 0; i < texto.size(); i++) {

        if (texto.get(i).toLowerCase().contains(palabraBuscada.toLowerCase())) {
            posiciones.add(i); // Agregamos 1 para que las posiciones empiecen en 1 y no desde 0

            esta=true;
        }
    }

    if (esta==true){
        System.out.print("La palabra "+palabraBuscada+ " esta en las posiciones (o en una) :  ");
        
        for(int posicion: posiciones) {

            System.out.print(posicion+", ");

        }
    } else {

        System.out.println("La palabra " +palabraBuscada+ " no se ha podido encontrar. ");
    }

}


//-l

public static int buscarLineas(ArrayList<String> texto, String palabraBuscada) {
    
    int contador=1;

    for (int i = 0; i < texto.size(); i++) {
        
        if (texto.get(i) == ("\n")){
            contador++;
        }

        if (texto.get(i).toLowerCase().contains(palabraBuscada.toLowerCase())) {
           
            return contador;
        }
        
    }

    return -1;


}
    




//-r

public static void alterarPalabras(ArrayList<String> texto) {
    for (int i = 0; i < texto.size(); i++) {

        String linea = texto.get(i); //Obtenemos la linea de texto usando un getter
        String[] palabras = linea.split(" ");//Dividimas la linea de array usando split
        ArrayList<String> palabrasDesordenadas = new ArrayList<>(palabras.length);//Creamos un arraylist con el objetivo de almacenar las palabras ya desordenadas
        
        for (String palab : palabras) {
            palabrasDesordenadas.add(palab);
        }

        Collections.shuffle(palabrasDesordenadas);
        String lineaDesordenada = String.join(" ", palabrasDesordenadas);
        texto.set(i, lineaDesordenada);//Usamos un setter para cambiar la linea original con la desordenada
        System.out.println(texto);
    }
}

//-R

public static void desordenarTexto(ArrayList<String> texto) {
    for (int i = 0; i < texto.size(); i++) {

        String linea = texto.get(i);
        String[] palabras = linea.split(" ");
        ArrayList<String> palabrasDesordenadas = new ArrayList<>(palabras.length);
        
        for (String palabra : palabras) {
            palabrasDesordenadas.add(palabra);
        }

        Collections.shuffle(palabrasDesordenadas);
        String lineaDesordenada = String.join(" ", palabrasDesordenadas);
        texto.set(i, lineaDesordenada);
        System.out.print(texto);
    }
}



// MENU DE AYUDA


public static void obtenerAyuda(String help){
   
    System.out.print("\u001B[34m"); // azul
    System.out.println(" ______   __     ______     __  __     ______     ______     ______     ______    ");
    System.out.println("/\\  ___\\ /\\ \\   /\\  ___\\   /\\ \\_\\ \\   /\\  ___\\   /\\  == \\   /\\  __ \\   /\\  ___\\   ");
    System.out.println("\\ \\ \\__ \\\\ \\ \\  \\ \\ \\____  \\ \\  __ \\  \\ \\ \\__ \\  \\ \\  __<   \\ \\ \\/\\ \\  \\ \\___  \\  ");
    System.out.println(" \\ \\_____\\\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\/\\_____\\ ");
    System.out.println("  \\/_____/ \\/_/   \\/_____/   \\/_/\\/_/   \\/_____/   \\/_/ /_/   \\/_____/   \\/_____/ ");
    System.out.print("\u001B[0m"); // reset
System.out.println();
System.out.println();
    System.out.println("Bienvenido al programa de consultas y modificaciones para ficheros de textos!\nCreditos: Victor Valverde Olmedo y Steven Cubillos Garcia");
    System.out.println("");
    System.out.print("\u001B[31m"); //rojo
    System.out.println();
    System.out.println();
    System.out.println("===================================================");
    System.out.println("F U N C I O N E S   D E   B U S Q U E D A");
    System.out.println("===================================================");
    System.out.print("\u001B[0m"); // reset
    System.out.println();
    System.out.println();
    System.out.println("Usa el comando java Palabras.java -f Tema11intro.txt <opcion>");
    System.out.println("-c: Cuenta la palabra que se pasa como parametro");
    System.out.println("-a: Cuenta todas las palabras, imprimiendo una lista de todas las palabras del texto y el numero de apariciones, ordenadas por esto ultimo");
    System.out.println("-A: Igual que la anterior, pero ordenando las palabras alfabeticamente.");
    System.out.println("-p: Devuelve la posicion en el texto (contando palabras) de cada aparicion de la palabra que se pasa por parametro, con los numeros separados por comas.");
    System.out.println("-l: Devuelve el numero de linea en la que se encuentra cada aparicion de la palabra que se pasa por parametro.");
    System.out.print("\u001B[32m"); // verde
    System.out.println();
    System.out.println();
    System.out.println("===================================================");
    System.out.println("F U N C I O N E S   D E   M O D I F I C A C I O N");
    System.out.println("===================================================");
    System.out.print("\u001B[0m"); // reset
    System.out.println();
    System.out.println();
    System.out.println("-r: Desordena todas las palabras de cada linea aleatoriamente. No tiene parametro de palabra.");
    System.out.println("-R: Desordena todas las palabras del texto completo aleatoriamente. No tiene parametro de palabra.");
    System.out.println("-m: Devuelve todo el texto en minuscula. No tiene parametro de palabra.");
    System.out.println("-M: Devuelve todo el texto en mayuscula. No tiene parametro de palabra.");
    System.out.println("-b: Borra cada aparicion de la palabra pasada como parametro.");
    System.out.println("-n: Usada con -b, borra la aparicion n de la palabra pasada como parametro. Ejemplo que borra la segunda aparicion de la palabra fichero: java Palabras -b fichero -n 2 -f Tema11intro.txt");
    System.out.println("-o: Restaura el texto a su estado original. No tiene parametro de palabra.");
    System.out.print("\u001B[34m"); // azul
    System.out.println();
    System.out.println();
    System.out.println("===================================================");
    System.out.println("E S C R I B I R    E N    E L    F I C H E R O");
    System.out.println("===================================================");
    System.out.print("\u001B[0m"); // reset
    System.out.println();
    System.out.println();
    System.out.println("-w: Ademas de imprimir el resultado, lo escribe en un archivo que se pasa como parametro. Por ejemplo: ja");
 }
}
