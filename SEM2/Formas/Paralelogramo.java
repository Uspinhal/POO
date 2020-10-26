package SEM2.Formas;

public class Paralelogramo {
    private double altura;
    private double base;
    private double angulo;

// Construtor
    public Paralelogramo(double altura, double base, double angulo) {
        this.altura = altura;
        this.base = base;
        this.angulo = angulo * Math.PI/180;
    }

// Métodos Getters
    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }
    public double getAngulo(){
        return angulo;
    }

// Métodos Setters
    public void setForma(double altura, double base, double angulo) {
        this.angulo = angulo * Math.PI/180;
        this.altura = altura;
        this.base = base;
    }

// Métodos diversos
    public String toString() {
        return "Base: " + getBase() + "| Altura: " + getAltura() + "| Ângulo: " + getAngulo();
    }

    public final Double calculaArea() {
        return base*altura;
    }
    public final Double calculaPerimetro() {
        return 2*(base+altura/Math.sin(angulo));
    }
}
