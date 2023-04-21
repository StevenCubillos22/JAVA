package arrayobj.Capitulo9Plus;

public class Rectangulo implements Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Rectángulo - ancho: " + ancho + ", alto: " + alto + ", perímetro: " + perimetro() + ", área: " + area());
    }

    
}
