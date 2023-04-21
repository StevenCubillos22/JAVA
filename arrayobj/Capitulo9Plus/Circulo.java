package arrayobj.Capitulo9Plus;

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void escalar(double escala) {
        radio *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Círculo - radio: " + radio + ", perímetro: " + perimetro() + ", área: " + area());
    }
    
}
