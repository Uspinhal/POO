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

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setKilometragem(Double kilometragem) {
        this.kilometragem = kilometragem;
    }
// Outros Métodos
    public double getCarbonoEmitido() {
        return 2;
    }

    @Override
    public String toString() {
        return "Carro: " + "Combustível: " + this.getCombustivel()+" | Motor: " + this.getMotor() + 
            " | km: " + this.getKilometragem();
    }
}
