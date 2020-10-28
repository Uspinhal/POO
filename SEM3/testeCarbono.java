package SEM3;

import SEM3.Carbono.Casa;

public class TesteCarbono {
    public static void main(String[] args) {
        Casa casa = new Casa(1,2,3,4,5);

        System.out.println(casa.getNumeroPessoas());
        System.out.println(casa.getCarbonoEmitido());
    }
}
