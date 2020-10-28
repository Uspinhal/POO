package SEM3.Carbono;

public class Carro implements EmissorCarbono {
    private String combustivel;
    private String motor;
    private Double kilometragem;

// Construtor
    public Carro(String combustivel, String motor, double kilometragem){
        this.combustivel = combustivel;
        this.motor = motor;
        this.kilometragem = kilometragem;
    }
// Getters & Setters
    public String getCombustivel() {
        return combustivel;
    }
    public String getMotor() {
        return motor;
    }
    public double getKilometragem() {
        return kilometragem;
    }
// Outros Métodos
    public double getCarbonoEmitido() {
        return 2;
    }
}
