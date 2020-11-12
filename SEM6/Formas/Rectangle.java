package SEM6.Formas;

public class Rectangle extends Shapes {
    private Double altura;
    private Double largura;

// Construtor
    public Rectangle(Double altura, Double largura) {
        if(altura <=0 || largura <=0) {
            throw new IllegalArgumentException("Os parâmetros devem ser maiores que zero");
        } else {
            this.altura = altura;
            this.largura = largura;
        }
    }
// Getters & Setters
    public Double getAltura() {
        return this.altura;
    }
    public double getLargura(){
        return this.largura;
    }
    public void setAltura(Double altura) {
        if (altura <=0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero");
        } else {
            this.altura = altura;
        }
    }
    public void setLargura(Double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("A largura de ser maior que zero");
        } else {
            this.largura = largura;
        }
    }
// Outros métodos
    public Double getArea() {
        return altura*largura;
    }
}
