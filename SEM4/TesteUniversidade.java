package SEM4;

import java.util.*;
import SEM4.Univesidade.*;

public class TesteUniversidade {
    public static void main(String[] args) {
        Estudante e1 = new Estudante(666 , "Luke", 7.5);
        Estudante e2 = new Estudante(234, "Leia", 8.5);
        Estudante e3 = new Estudante(123, "Han", 4.5);
        Estudante e4 = new Estudante(789, "Chewie", 3.0);
        Estudante e5 = new Estudante(456 , "Kirk", 9.0);
        Estudante e6 = new Estudante(777, "Spock", 10.0);
        Estudante e7 = new Estudante(365, "Piccard", 9.5);
        Estudante e8 = new Estudante(321, "Data", 8.0);
        
        List<Estudante> l1 = new LinkedList<>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);

        List<Estudante> l2 = new LinkedList<>();
        l2.add(e5);
        l2.add(e6);
        l2.add(e7);
        l2.add(e8);

       for (Estudante e : l1) {
           System.out.println(e);
       }
       for (Estudante e : l2) {
           System.out.println(e);
       }

       System.out.println(e1.compareTo(e2));
       System.out.println(e3.compareTo(e4));

       Turma t1 = new Turma(l1);
       Turma t2 = new Turma(l2);
       t1.calculaMedia();
       System.out.println(t1);
       System.out.println(t1.maiorNota());
       System.out.println(t1.listaAprovados());

       t2.calculaMedia();
       System.out.println(t2);
       System.out.println(t2.maiorNota());
       System.out.println(t2.listaAprovados());

       t1.juntaTurma(t2);
       System.out.println(t1);
       System.out.println(t1.maiorNota());
       System.out.println(t1.listaAprovados());
    }

}
