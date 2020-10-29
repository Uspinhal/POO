package SEM3;

import SEM3.Carbono.*;

public class TesteCarbono {
    public static void main(String[] args) {
        EmissorCarbono casa = new Casa(1,2,3,4,5);
        EmissorCarbono carro = new Carro("Gasolina", "4.1L", 13000);

        System.out.println(casa);
        System.out.println(carro);
    }
}
