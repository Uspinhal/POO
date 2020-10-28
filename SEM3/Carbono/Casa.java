package SEM3.Carbono;

public class Casa implements EmissorCarbono{
    private double consumoMensalEnergiaReal;
    private double consumoMensalEnergiakWh;
    private double consumoMensalGasReal;
    private double consumoMensalGasBotijao;
    private int numeroPessoas;

// Construtor
    public Casa(double consumoMensalEnergiaReal, double consumoMensalEnergiakWh, 
                double consumoMensalGasReal, double consumoMensalGasBotijao, int numeroPessoas){
        this.consumoMensalEnergiaReal = consumoMensalEnergiaReal;
        this.consumoMensalEnergiakWh = consumoMensalEnergiakWh;
        this.consumoMensalGasReal = consumoMensalGasReal;
        this.consumoMensalGasBotijao = consumoMensalGasBotijao;
        this.numeroPessoas = numeroPessoas;  
    }

// Métodos getters & setters
    public double getConsumoMensalEnergiaReal() {
        return consumoMensalEnergiaReal;
    }
    public double getConsumoMensalEnergiakWh() {
        return consumoMensalEnergiakWh;
    }
    public double getConsumoMensalGasReal() {
        return consumoMensalGasReal;
    }
    public double getConsumoMensalGasBotijao() {
        return consumoMensalGasBotijao;
    }
    public int getNumeroPessoas() {
        return numeroPessoas;
    }
    public void setConsumoMensalEnergiaReal(double consumoMensalEnergiaReal) {
        this.consumoMensalEnergiaReal = consumoMensalEnergiaReal;
    }
    public void setConsumoMensalEnergiakWh(double consumoMensalEnergiakWh) {
        this.consumoMensalEnergiakWh = consumoMensalEnergiakWh;
    }
    public void setConsumoMensalGasReal(double consumoMensalGasReal) {
        this.consumoMensalGasReal = consumoMensalGasReal;
    }
    public void setConsumoMensalGasBotijao(double consumoMensalGasBotijao) {
        this.consumoMensalGasBotijao = consumoMensalGasBotijao;
    }
    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

// Outros Métodos
    public double getCarbonoEmitido() {
        return 1;
    }

}
