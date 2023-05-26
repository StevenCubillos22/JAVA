/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1;


/**
 *
 * @author Steven Cubillos Garcia
 */
public class Gato {
private String nombre;
private String imagen;


public Gato(String nombre, String imagen) {
this.nombre = nombre;
this.imagen = imagen;

}

public String getNombre() {
return nombre;
}

public String getImagen() {
return imagen;
}




public String maulla() {
return "<img src='" + imagen + "' width='80'>Miauuuuuuuu<br>";
}


public String come(String comida) {
        return "<img src='" + imagen + "' width='80'> Estoy comiendo " + comida + "<br>";
    }

    public String habla(String mensaje) {
        return "<div class='bocadillo'><img src='" + imagen + "' width='80'>" + mensaje + "<br></div>";
    }



    public String frases(Gato g1, Gato g2, Gato g3) {
    String frase = "";

    if (this.equals(g1)) {
        frase = ">" + g1.getNombre() + " Le pregunto a " + g2.getNombre() + ": ¿De dónde eres?";
        frase += "<br> " + g2.getNombre() + ": Soy de Pizarra";
        frase += "<br>Y yo " + g1.getNombre() + " ,me gustaría cocinar crema de verduras";
    } else if (this.equals(g2)) {
        frase = ">" + g2.getNombre() + " y le pregunto a " + g3.getNombre() + ": ¿Qué te gustaría cocinar?";
        frase += "<br>Respuesta de " + g3.getNombre() + ": Me gustaría cocinar frijoles";
        frase += "<br>Y yo " + g2.getNombre() + " mi animal tóxico son los perros";
    } else if (this.equals(g3)) {
        frase = ">" + g3.getNombre() + " y le pregunto a " + g1.getNombre() + ": ¿Cuál sería tu animal tóxico?";
        frase += "<br>Respuesta de " + g1.getNombre() + ": Mi animal tóxico son los grillos";
        frase += "<br>Y yo " + g3.getNombre() + " soy de Málaga";
    }

    return habla(frase);
    }
}



