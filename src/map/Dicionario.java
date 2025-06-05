package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
dicionarioMap.remove(palavra);
        }            
    }

    public void exibirPalavra() {
        System.out.println(dicionarioMap);
    }

    public Map.Entry<String, String> pesquisarPorPalavra(String palavra) {
        if (dicionarioMap.containsKey(palavra)) {
            return Map.entry(palavra, dicionarioMap.get(palavra));
        }
        return null;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Casa", "Construção destinada à habitação.");
        dicionario.adicionarPalavra("Carro", "Veículo automotor de quatro rodas.");
        dicionario.adicionarPalavra("Livro", "Conjunto de folhas impressas e encadernadas.");
        dicionario.adicionarPalavra("Computador", "Máquina eletrônica de processamento de dados.");
        dicionario.adicionarPalavra("Cachorro", "Animal doméstico, mamífero da família dos canídeos.");

        // dicionario.exibirPalavra();
        System.out.println(dicionario.pesquisarPorPalavra("Computador"));
    }
}
