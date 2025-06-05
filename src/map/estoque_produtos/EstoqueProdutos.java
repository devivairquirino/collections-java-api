package map.estoque_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();

    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirEstoque() {
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalEstoque() {
        Double result = 0.0;

        for (Map.Entry<Long, Produto> produto : estoqueProdutosMap.entrySet()) {

            int quantidade = produto.getValue().getQuantidade();
            Double preco = produto.getValue().getPreco();

            result += quantidade * preco;
        }
        return result;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        Double maisCaro = Double.MIN_VALUE;

        for (Map.Entry<Long, Produto> produto : estoqueProdutosMap.entrySet()) {
            Double preco = produto.getValue().getPreco();
            if (preco > maisCaro) {
                maisCaro = preco;
                produtoMaisCaro = produto.getValue();
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        Double maisBarato = Double.MAX_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            Double preco = p.getPreco();
            if (preco < maisBarato) {
                maisBarato = preco;
                produtoMaisBarato = p;
            }
        }

        return produtoMaisBarato;

    }

    // Retorna o produto que está em maior quantidade no estoque, considerando o
    // valor total de cada produto (quantidade * preço).
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto ProdutoMaiorQuantidadeValorTotal = null;
        Double maiorQuantidadeValorTotal = Double.MIN_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            Double precoTotal = p.getPreco()*p.getQuantidade();

            if (precoTotal > maiorQuantidadeValorTotal) {
                maiorQuantidadeValorTotal = precoTotal;
                ProdutoMaiorQuantidadeValorTotal = p;
            }
        }

        return ProdutoMaiorQuantidadeValorTotal;

    }

    public static void main(String[] args) {
        EstoqueProdutos novoEstoque = new EstoqueProdutos();

        novoEstoque.adicionarProduto(1L, "Notebook", 10, 3500.00);
        novoEstoque.adicionarProduto(2L, "Mouse", 500, 80.00);
        novoEstoque.adicionarProduto(3L, "Teclado", 30, 120.00);
        novoEstoque.adicionarProduto(4L, "Monitor", 15, 900.00);
        novoEstoque.adicionarProduto(5L, "Impressora", 8, 650.00);

        // novoEstoque.calcularValorTotalEstoque();
        System.out.println(novoEstoque.obterProdutoMaisCaro());
        System.out.println(novoEstoque.obterProdutoMaisBarato()); 
        System.out.println(novoEstoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque()); 

        // novoEstoque.exibirEstoque();

    }
}
