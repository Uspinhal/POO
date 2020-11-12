package SEM6;

import SEM6.Formas.*;
public class Teste {
    public static void main(String[] args) {
        Rectangle ret = new Rectangle(2.0, 2.5);
        System.out.println("Área: " + ret.getArea());

        ret.setAltura(3.0);
        ret.setLargura(4.5);
        System.out.println("Área: " + ret.getArea());
    }
}
