import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
        // System.out.println("Livro foi adicionado com sucesso!");
    }

    public void removerItem(String titulo) {
        List<Livro> livrosParaRemover = new ArrayList<>();

        for (Livro l : livrosList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livrosParaRemover.add(l);
            }
        }
        livrosList.removeAll(livrosParaRemover);
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro l : livrosList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro l : livrosList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(l);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (anoFinal < anoInicial) {
            throw new IllegalArgumentException("Ano final não pode ser menor que o ano inicial.");
        } else {
            List<Livro> livrosEncontrados = new ArrayList<>();
            if (!livrosList.isEmpty()) {
                

                for (Livro l : livrosList) {
                    if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                        livrosEncontrados.add(l);
                    }
                }
            }
            return livrosEncontrados;
        }
    }

    public static void main(String[] args) {
        CatalogoLivros novoCatalogo = new CatalogoLivros();

        novoCatalogo.adicionarLivro("O Físico", "Noah Gordon", 1986);
        novoCatalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        novoCatalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        novoCatalogo.adicionarLivro("1984", "George Orwell", 1949);
        novoCatalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        novoCatalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        novoCatalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        novoCatalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        novoCatalogo.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        novoCatalogo.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);

        System.out.println(novoCatalogo.pesquisarPorIntervaloAnos(1930, 1955));
    }
}