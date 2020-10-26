package SEM2;
import SEM2.Formas.*;

public class TesteFormas {
    public static void main(String[] args) {
        Paralelogramo forma1 = new Paralelogramo(1, 4, 45);
        Quadrado forma2 = new Quadrado(2);

        System.out.println("Paralelogramo: ");
        System.out.println(forma1.toString());
        System.out.println(forma1.calculaArea());
        System.out.println(forma1.calculaPerimetro());
        System.out.println("Quadrado: ");
        System.out.println(forma2.toString());
        System.out.println(forma2.calculaArea());
        System.out.println(forma2.calculaPerimetro());


        forma1.setForma(2, 3, 90);

        System.out.println(forma1.toString());
        System.out.println(forma1.calculaArea());
        System.out.println(forma1.calculaPerimetro());

        
    }
}
