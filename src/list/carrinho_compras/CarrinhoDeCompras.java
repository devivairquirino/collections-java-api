package list.carrinho_compras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public Double calcularValorTotal(){
        Double resultado=0.0;
        for(Item i: itemList){
            resultado+=i.getPreco()*i.getQuantidade();
        }
        return resultado;
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();

        novoCarrinho.adicionarItem("lapis", 2.5, 10);
        novoCarrinho.adicionarItem("caneta", 3.0, 5);
        novoCarrinho.adicionarItem("borracha", 1.5, 8);
        novoCarrinho.adicionarItem("caderno", 15.0, 2);
        novoCarrinho.adicionarItem("mochila", 80.0, 1);
        novoCarrinho.adicionarItem("estojo", 12.0, 1);
        novoCarrinho.adicionarItem("marca-texto", 4.5, 3);
        novoCarrinho.adicionarItem("régua", 2.0, 2);
        novoCarrinho.adicionarItem("apontador", 1.0, 4);
        novoCarrinho.adicionarItem("livro", 30.0, 2);

        novoCarrinho.exibirItens();
        System.out.println(novoCarrinho.calcularValorTotal());

    }

}