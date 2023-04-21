package arrayobj.Capitulo9Plus;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void escalar(double escala) {
        lado *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado - lado: " + lado + ", perímetro: " + perimetro() + ", área: " + area());
    } 
    
}
