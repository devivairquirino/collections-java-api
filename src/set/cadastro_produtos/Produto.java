package set.cadastro_produtos;

import java.util.Comparator;

// nome, cod, preço e quantidade
public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, Double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nProduto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]\n";
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    

}
