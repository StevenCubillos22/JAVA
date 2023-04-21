public class Persona {


    String nombre;
    int edad;
    String ciudadResidencia;
    String profesion;
    String dni;

    public Persona(String s, int n, String city, String p, String d){

        nombre = s;
        edad = n;
        ciudadResidencia = city;
        profesion = p;
        dni = d;



    }


    public void mostrarDatos() {

        System.out.println("Nombre:  " +nombre);
        System.out.println("DNI:  " +dni);
        System.out.println("Edad:  " +edad);
        System.out.println("Residencia:  " +ciudadResidencia);
        System.out.println("Profesion:  " +profesion);
    }
    
}
