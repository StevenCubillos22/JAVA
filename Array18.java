public class Array18 {


    public static void main(String[] args) {


        int[] num = new int[10];

        int[] ordenados = new int [10];
        int indiceMenor = 0;
        int indiceMayor = 9;


        //Aqui generamos numeros aleatorios entre 0 y 200

        for(int i = 0; i <num.length; i++){
            num[i] = (int)(Math.random()*201);
        }


        //Mostramos el array original junto al indice//

        System.out.println("ARRAY :");
        System.out.println("-----------------------------");

        for(int i=0; i < num.length; i++) {
            System.out.println(i + " - "+num[i]);
        }

       //Con este bucle ordenamos los numeros igul o menores de 100, y 
        for (int i = 0; i<num.length; i++){
            if (num[i] <= 100) {
                ordenados[indiceMenor] = num[i];
                indiceMenor += 2;
            } else {
                ordenados[indiceMayor] = num[i];
                indiceMayor -= 2;
            }
        }


        //condicional dentro de un array que complete los numeros que falta
        for (int i = 0; i<num.length; i++){
            if(ordenados[i] == 0){
                if(indiceMenor <= 9){
                    ordenados[i] = num[indiceMenor++];
                } else {
                    ordenados[i] = num[indiceMayor--];
                }
            }
        }


        //Generamos el Array una vez ordenado con los cambios realizados//
        System.out.println("ARRAY ORDENADO :");
        
        for(int i=0; i<ordenados.length; i++){
            System.out.println(i+ " - "+ordenados[i]);
        }


        
    }
    
}
