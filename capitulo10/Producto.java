package capitulo10;
import java.util.ArrayList;
public class Producto {

    private String nombre;
    private int cantidad;

    //Establecemos el constructor
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "| "+nombre + ": " + cantidad + " ";
    }
    
}
