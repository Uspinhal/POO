package SEM6;

import SEM6.Formas.*;
public class Teste {
    public static void main(String[] args) {
        Rectangle ret = new Rectangle(2.0, 2.5);
        System.out.println("Área do retangulo: " + ret.getArea());

        ret.setAltura(3.0);
        ret.setLargura(4.5);
        System.out.println("Área do retângulo: " + ret.getArea());

        Circle circ = new Circle(1.0);
        System.out.println("Área do circulo: " + circ.getArea());

        circ.setRaio(2.0);
        System.out.println("Área do circulo: " + circ.getArea());

        Triangle tri = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Área do triângulo: " + tri.getArea());
    }
}
