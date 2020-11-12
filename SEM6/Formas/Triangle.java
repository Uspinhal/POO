package SEM6.Formas;

public class Triangle extends Shapes {
    private Double a;
    private Double b;
    private Double c;

//  Construtor
    public Triangle(Double a, Double b, Double c) {
        if (a>=(b+c) || b>=(a+c) || c>=(a+b)) {
            setError("Um lado deve ser maior que a soma dos outros dois");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
// Getters & Setters 

// Outros Métodos
    public Double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private void setError(String arg) {
        throw new IllegalArgumentException(arg);
    }
}
