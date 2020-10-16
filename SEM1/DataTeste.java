package SEM1;

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data(10, 10, 2013);
        System.out.println("Dia: " + d1.getDia());
        System.out.println("Mês: " + d1.getMes());
        System.out.println("Ano: " + d1.getAno());
        System.out.println(d1.toString());
        d1.setData(14, 01, 2014);
        System.out.println("Dia: " + d1.getDia());
        System.out.println("Mês: " + d1.getMes());
        System.out.println("Ano: " + d1.getAno());
        System.out.println("d1: " + d1.toString());

        Data d2 = new Data(27, 04, 1981);
        System.out.println("d2: " + d2.toString());
        
        d1.trocarCom(d2);
        System.out.println("d1: " + d1.toString());
        System.out.println("d2: " + d2.toString());
    }
}