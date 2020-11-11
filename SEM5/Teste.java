package SEM5;


import SEM4.Univesidade.*;

public class Teste {
    public static void main(String[] args) {
        Estudante e1 = new Estudante(666 , "Luke", 7.5);
        Estudante e2 = new Estudante(234, "Leia", 8.5);
        Estudante e3 = new Estudante(123, "Han", 4.5);
        Estudante e4 = new Estudante(789, "Chewie", 3.0);

        Estudante[] vec=new Estudante[4];
        vec[0]=e1;
        vec[1]=e2;
        vec[2]=e3;
        vec[3]=e4;
        ordenarSelecao(vec, vec.length);
        for (Estudante e : vec) {
            System.out.println(e);
        }
    }
    public static <T extends Comparable<T>> void ordenarSelecao(T[] vec, int n) {
        for (int i = 0; i <= n-2; i++) {
            int min= i;
            for (int j = i+1; j <= n-1; j++) {
                if (vec[j].compareTo(vec[min])<0) {
                    min = j;
                }
            }
        T aux = vec[min];
        vec[min]=vec[i];
        vec[i]=aux;
        }
    }   
}
