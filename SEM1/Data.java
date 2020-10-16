package SEM1;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
// Métodos getters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
// Método Setter
    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
// Método toString
    public String toString() {
        return dia + "/" + mes + "/" + ano;      
    }
// Método trocarCom
    public void trocarCom(Data d2) {
        Data auxData = new Data(this.dia, this.mes, this.ano);
        this.setData(d2.dia, d2.mes, d2.ano);
        d2.setData(auxData.dia, auxData.mes, auxData.ano);
    }
}