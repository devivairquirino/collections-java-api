package academia_alunos;

import java.time.LocalDate;

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
        return nome;
    }


    
}
