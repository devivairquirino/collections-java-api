package map.livraria_online;

import java.util.Comparator;

public class Livro {

    private String titulo;
    private String autor;
    private Double preco;
    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "\nLivro>> \ntitulo: " + titulo + ", autor: " + autor + ", preco: " + preco + "\n";
    }

    
}

class ComparatorPorPreco implements Comparator<Livro>{

    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }

}