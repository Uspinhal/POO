package SEM4.Univesidade;

import java.util.*;

public class Turma {

    private List<Estudante> estudantes;
    private Double mediaTurma;

// Construtor
    public Turma(List<Estudante> estudantes){
        this.estudantes = estudantes;
    }
// Métodos Getters & Setters
    public List<Estudante> getEstudantes(){
        return estudantes;
    }
    public Double getMedia(){
        return mediaTurma;
    }
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
    public void setMedia(Double media) {
        this.mediaTurma = media;
    }
// Outros Métodos
    @Override
    public String toString() {
        return "Turma [Estudantes: " + getEstudantes() + "| Média da turma: " + getMedia() + "]";
    }
    public void calculaMedia() {
        double soma = 0;
        for (Estudante estudante : estudantes) {
            soma = soma + estudante.getNota();
        }
        this.mediaTurma = soma/estudantes.size();
    }
    public Estudante maiorNota() {
        return Collections.max(estudantes);
    }
    public List<Estudante> listaAprovados() {
        List<Estudante> aprovados = new LinkedList<>();
        for (Estudante estudante : estudantes) {
            if (estudante.getNota()>=5.0) {
                aprovados.add(estudante);
            }
        }
        return aprovados;
    }
    public void juntaTurma(Turma t2) {
        estudantes.addAll(t2.getEstudantes());
        this.calculaMedia();
        t2.getEstudantes().clear();
        t2.mediaTurma = 0.0;
    }

}
