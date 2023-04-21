package arrayobj.Capitulo9Plus;

public class Triangulo implements Figura {
    private double ancho;
    private double alto;

    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        return 2 * ancho + Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
    }

    @Override
    public double area() {
        return (ancho * alto) / 2;
    }

    @Override
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Triángulo - base: " + ancho + ", altura: " + alto + ", perímetro: " + perimetro() + ", área: " + area());
    }

    
}
