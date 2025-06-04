package set.cadastro_produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> cadastroProdutosSet;

    public CadastroProdutos() {
        this.cadastroProdutosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroProdutosSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome= new TreeSet<>(cadastroProdutosSet);

        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorNome= new TreeSet<>(new ComparatorPorPreco());
        produtosPorNome.addAll(cadastroProdutosSet);

        return produtosPorNome;
    }
    public static void main(String[] args) {
        CadastroProdutos novoCadastro = new CadastroProdutos();

        novoCadastro.adicionarProduto(1001, "Notebook", 3500.00, 5);
        novoCadastro.adicionarProduto(1002, "Mouse", 80.00, 20);
        novoCadastro.adicionarProduto(1003, "Teclado", 150.00, 15);
        novoCadastro.adicionarProduto(1004, "Monitor", 900.00, 7);
        novoCadastro.adicionarProduto(1005, "Impressora", 600.00, 4);
        novoCadastro.adicionarProduto(1006, "Cadeira Gamer", 1200.00, 3);
        novoCadastro.adicionarProduto(1007, "Webcam", 200.00, 10);
        novoCadastro.adicionarProduto(1008, "Headset", 250.00, 12);
        novoCadastro.adicionarProduto(1009, "Pen Drive", 40.00, 50);
        novoCadastro.adicionarProduto(1010, "HD Externo", 400.00, 6);

        // System.out.println(novoCadastro.exibirProdutosPorNome());
        System.out.println(novoCadastro.exibirProdutosPorPreco());
    }
}
