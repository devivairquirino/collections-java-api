package list.academia_alunos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlunos {

    private List<Aluno> alunoList;

    public ListaAlunos() {
        this.alunoList = new ArrayList<>();
    }

    public void adicionarAluno(String nome, Double peso, Double altura, LocalDate vencimento) {
        alunoList.add(new Aluno(nome, peso, altura, vencimento));
    }
    public void  removerAlunoPorNome(String nome){
        List<Aluno> alunosRemoverList= new ArrayList<>();

        for(Aluno a: alunoList){
            if(a.getNome().equalsIgnoreCase(nome)){
                alunosRemoverList.add(a);
            }
        }
        alunoList.removeAll(alunosRemoverList);
    }
    public void exibirLista(){
        System.out.println(alunoList);
    }


    // Ordenar
    public List<Aluno> ordenarPorNome() {
        List<Aluno> alunoPorNome = new ArrayList<>(alunoList);
        Collections.sort(alunoPorNome);
        return alunoPorNome;
    }

    public List<Aluno> ordenarPorPeso() {
        List<Aluno> alunoPorPeso = new ArrayList<>(alunoList);
        Collections.sort(alunoPorPeso, new ComparatorPorPeso());
        return alunoPorPeso;
    }

    public List<Aluno> ordenarPorVencimento() {
        List<Aluno> alunoPorVencimento = new ArrayList<>(alunoList);
        Collections.sort(alunoPorVencimento, new ComparatorPorVencimento());
        return alunoPorVencimento;
    }


    public static void main(String[] args) {
        ListaAlunos planoMensalList = new ListaAlunos();

        planoMensalList.adicionarAluno("Bruno", 80.0, 1.80, LocalDate.of(2025, 6, 15));
        planoMensalList.adicionarAluno("Isabela", 62.0, 1.63, LocalDate.of(2025, 6, 30));
        planoMensalList.adicionarAluno("Carla", 55.0, 1.60, LocalDate.of(2025, 6, 10));
        planoMensalList.adicionarAluno("Daniel", 90.0, 1.85, LocalDate.of(2025, 7, 5));
        planoMensalList.adicionarAluno("Ana", 60.0, 1.65, LocalDate.of(2025, 7, 1));
        planoMensalList.adicionarAluno("João", 78.0, 1.75, LocalDate.of(2025, 7, 3));
        planoMensalList.adicionarAluno("Felipe", 75.0, 1.78, LocalDate.of(2025, 7, 2));
        planoMensalList.adicionarAluno("Gabriela", 65.0, 1.68, LocalDate.of(2025, 6, 25));
        planoMensalList.adicionarAluno("Henrique", 85.0, 1.82, LocalDate.of(2025, 7, 8));
        planoMensalList.adicionarAluno("Eduarda", 70.0, 1.70, LocalDate.of(2025, 6, 20));

        // System.out.println(planoMensalList.ordenarPorNome());
        planoMensalList.removerAlunoPorNome("Felipe");
        planoMensalList.exibirLista();    
    }

}
