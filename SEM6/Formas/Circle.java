package SEM6.Formas;

public class Circle extends Shapes {
    private Double raio;

// Construtor
    public Circle(Double raio){
        if (raio <=0) {
            setError("O Raio");
        } else {
            this.raio = raio;
        }
    }
// Getters & Setters
    public Double getRaio() {
        return this.raio;
    }
    public void setRaio(Double raio) {
        if (raio <=0) {
            setError("O Raio");
        } else {
            this.raio = raio;
        }
    }

// Outros métodos
    private void setError(String arg) {
        throw new IllegalArgumentException(arg + " deve ser maior que zero.");
    }
    public Double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
