/*BancoPrueba.java
 * Implementa una clase principal con función main para probar el funcionamiento de las tres clases:
 *Crea varias cuentas bancarias de distintos tipos, pueden estar en un ArrayList si lo deseas; prueba a
 *realizar ingresos, retiradas y transferencias; calcula los intereses y muéstralos por pantalla; etc.
 * @Steven Cubillos Garcia
 */

package Capitulo9Plus.Banco;
public class BancoPrueba {


    public static void main(String[]Args){



        CuentaBancaria cuenta1 = new CuentaCorriente("ES123456789087110789012", 1000);
        CuentaBancaria cuenta2 = new CuentaAhorro("ES1234067890123456189011", 5000);
        CuentaBancaria cuenta3 = new CuentaCorriente("ES1224564440122476689014", 2000);
        
        // Se realizará algunas operaciones//
        cuenta1.ingresar(500);
        cuenta1.retirar(200);
        cuenta2.ingresar(1000);
        cuenta2.retirar(1500);
        
        
        // Calculamos los intereses y los mostramos por pantalla
        double interesesCuenta1 = cuenta1.getSaldo();
        double interesesCuenta2 = cuenta2.getSaldo();
        double interesesCuenta3 = cuenta3.getSaldo();
        
        System.out.println("Intereses de la cuenta 1: " + interesesCuenta1);
        System.out.println("Intereses de la cuenta 2: " + interesesCuenta2);
        System.out.println("Intereses de la cuenta 3: " + interesesCuenta3);


        // Mostramos los datos de las cuentas por pantalla
        System.out.println("C U E N T A  1");
        System.out.println("D A T O S: ");
        System.out.println(cuenta1.toString());
        System.out.println("` ` ` ` ` ` ` ` ");
        System.out.println("C U E N T A  2");
        System.out.println("D A T O S: ");
        System.out.println(cuenta2.toString());
        System.out.println("` ` ` ` ` ` ` ` ");
        System.out.println("C U E N T A  3");
        System.out.println("D A T O S: ");
        System.out.println(cuenta3.toString());
        System.out.println("` ` ` ` ` ` ` ` ");

    }
    
}
