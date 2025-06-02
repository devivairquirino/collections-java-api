package ordenacao_pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public void mostrarListaPessoas() {
        System.out.println(pessoaList);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public List<Pessoa> ordenarPorNome(){
        List<Pessoa> pessoaPorNome = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorNome, new ComparatorPorNome());
        return pessoaPorNome;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas novaLista = new OrdenacaoPessoas();

        novaLista.adicionarPessoa("Eduarda", 19, 1.60);
        novaLista.adicionarPessoa("Carla", 22, 1.70);
        novaLista.adicionarPessoa("Daniel", 28, 1.75);
        novaLista.adicionarPessoa("Ana", 25, 1.65);
        novaLista.adicionarPessoa("Felipe", 35, 1.85);
        novaLista.adicionarPessoa("Isabela", 32, 1.72);
        novaLista.adicionarPessoa("Gabriela", 27, 1.68);
        novaLista.adicionarPessoa("João", 24, 1.82);
        novaLista.adicionarPessoa("Henrique", 40, 1.78);
        novaLista.adicionarPessoa("Bruno", 30, 1.80);

        // novaLista.mostrarListaPessoas();
        System.out.println(novaLista.ordenarPorNome());

    }
}
