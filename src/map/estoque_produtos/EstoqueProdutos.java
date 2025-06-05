package map.estoque_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;
    
    public EstoqueProdutos(){
        this.estoqueProdutosMap= new HashMap<>();

    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirEstoque(){
        System.out.println(estoqueProdutosMap);
    }

    public static void main(String[] args) {
        EstoqueProdutos novoEstoque= new EstoqueProdutos();
        
        novoEstoque.adicionarProduto(1L, "Notebook", 10, 3500.00);
        novoEstoque.adicionarProduto(2L, "Mouse", 50, 80.00);
        novoEstoque.adicionarProduto(3L, "Teclado", 30, 120.00);
        novoEstoque.adicionarProduto(4L, "Monitor", 15, 900.00);
        novoEstoque.adicionarProduto(5L, "Impressora", 8, 650.00);

        novoEstoque.exibirEstoque();

    }
}
