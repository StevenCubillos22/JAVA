/*BancoPrueba.java
 * Implementa una clase principal con función main para probar el funcionamiento de las tres clases:
 *Crea varias cuentas bancarias de distintos tipos, pueden estar en un ArrayList si lo deseas; prueba a
 *realizar ingresos, retiradas y transferencias; calcula los intereses y muéstralos por pantalla; etc.
 * @Steven Cubillos Garcia
 */








package arrayobj.Capitulo9Plus;

public class BancoPrueba {


    public static void main(String[]Args){



        CuentaBancaria cuenta1 = new CuentaCorriente("ES1234567890123000789012", 1000);
        CuentaBancaria cuenta2 = new CuentaAhorro("ES1234567890123456189013", 5000);
        CuentaBancaria cuenta3 = new CuentaCorriente("ES1234564440123456789014", 2000);
        
        // Se realizará algunas operaciones//
        cuenta1.ingresar(500);
        cuenta1.retirar(200);
        cuenta2.ingresar(1000);
        cuenta2.retirar(1500);
        
        
        // Calculamos los intereses y los mostramos por pantalla
        double interesesCuenta1 = cuenta1.calcularIntereses();
        double interesesCuenta2 = cuenta2.calcularIntereses();
        double interesesCuenta3 = cuenta3.calcularIntereses();
        
        System.out.println("Intereses de la cuenta 1: " + interesesCuenta1);
        System.out.println("Intereses de la cuenta 2: " + interesesCuenta2);
        System.out.println("Intereses de la cuenta 3: " + interesesCuenta3);


        // Mostramos a continuacion los datos de las cuentas por pantalla
        System.out.println("Datos de la cuenta 1: " + cuenta1.toString());
        System.out.println("Datos de la cuenta 2: " + cuenta2.toString());
        System.out.println("Datos de la cuenta 3: " + cuenta3.toString());



    






    }



    
}
