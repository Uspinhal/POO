package SEM4;

import java.util.*;

import SEM4.Univesidade.*;

public class TesteUniversidade {
    public static void main(String[] args) {
        Estudante e1 = new Estudante(666 , "Lucy", 7.5);
        Estudante e2 = new Estudante(234, "Simão", 8.5);
        List<Estudante> l1 = new LinkedList<>();
        l1.add(e1);
        l1.add(e2);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1.compareTo(e2));
        System.out.println(e2.compareTo(e1));

        Turma t1 = new Turma(l1);
        t1.calculaMedia();
        System.out.println(t1);

        }
}
