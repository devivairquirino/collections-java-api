package academia_alunos;

import java.time.LocalDate;
import java.util.Comparator;

public class Aluno {
    private String nome;
    private Double peso;
    private Double altura;
    private LocalDate vencimento;
    
    public Aluno(String nome, Double peso, Double altura, LocalDate vencimento) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.vencimento = vencimento;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    @Override
    public String toString() {
        return "\nAluno [nome= " + nome + ", peso= " + peso + ", altura= " + altura + ", vencimento= " + vencimento + "]\n";
    }
}
class ComparatorPorPeso implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getPeso(), a2.getPeso());
    }
    
}
class ComparatorPorVencimento implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.getVencimento().compareTo(a2.getVencimento());
    }
    
}
