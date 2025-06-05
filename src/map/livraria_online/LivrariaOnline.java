package map.livraria_online;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void exibirLivrosOrdenadosPorPreco() {
        livrariaMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(new ComparatorPorPreco()))
                .forEach(entry -> {
                    System.out.println("Link: " + entry.getKey() + entry.getValue());
                });
    }

    public static void main(String[] args) {
    LivrariaOnline livraria = new LivrariaOnline();

    livraria.adicionarLivro("978-85-333-0227-9", "O Senhor dos Anéis", "J.R.R. Tolkien", 89.90);
    livraria.adicionarLivro("978-85-250-1234-5", "Dom Casmurro", "Machado de Assis", 39.50);
    livraria.adicionarLivro("978-85-325-1234-1", "A Revolução dos Bichos", "George Orwell", 29.90);
    livraria.adicionarLivro("978-85-333-0456-3", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 25.00);
    livraria.adicionarLivro("978-85-250-5678-9", "1984", "George Orwell", 42.00);

    livraria.exibirLivrosOrdenadosPorPreco();
}
}
