package SEM2.Formas;


public class Quadrado extends Paralelogramo{
    public Quadrado(double lado){
        super(lado, lado, 90);
    }

    public double getLado(){
        return super.getBase();
    }

    public void setLado(double lado) {
       super.setForma(lado, lado, 90); 
    }

}
