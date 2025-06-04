package set.gerenciador_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        Aluno novoAluno = new Aluno(nome, matricula, media);
        alunosSet.add(novoAluno);
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;

        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoRemover);

    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNotasCrescente() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNotasCrescente());
        alunosPorNome.addAll(alunosSet);

        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNotasDecrescente() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNotasDecrescente());
        alunosPorNome.addAll(alunosSet);

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunos() {
        return alunosSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos novoGerenciador = new GerenciadorAlunos();

        novoGerenciador.adicionarAluno("Bruno", 1002L, 7.2);
        novoGerenciador.adicionarAluno("Eduarda", 1005L, 8.9);
        novoGerenciador.adicionarAluno("Carla", 1003L, 9.1);
        novoGerenciador.adicionarAluno("Daniel", 1004L, 6.8);
        novoGerenciador.adicionarAluno("Ana", 1001L, 8.5);

        // System.out.println(novoGerenciador.exibirAlunos());
        // System.out.println(novoGerenciador.exibirAlunosPorNome());
        System.out.println(novoGerenciador.exibirAlunosPorNotasCrescente());
        System.out.println(novoGerenciador.exibirAlunosPorNotasDecrescente());
    }

}
