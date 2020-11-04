package SEM4.Univesidade;

public class Estudante implements Comparable{
    private Integer id;
    private String nome;
    private Double nota;    
// Construtor
    public Estudante(Integer id, String nome, Double nota){
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }
// Métodos Getters & Setters
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Double getNota() {
        return nota;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

// Outros Métodos
    @Override
    public String toString() {
        return getId()+ ": "+ getNome() + " Nota:" + getNota();
    }
    @Override
    public int compareTo(Object o) {
        return Double.compare(this.nota, ((Estudante)o).nota);
    }

}
