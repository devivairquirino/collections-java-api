package map;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavra(){
        this.contagemPalavraMap= new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavraMap.put(palavra, contagem);
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavraMap);
    }
    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
        Map.Entry<String, Integer> maisFrequente= null;
        int maiorContagem= Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> palavra: contagemPalavraMap.entrySet()){
            int contagemAtual= palavra.getValue();
            if(contagemAtual>maiorContagem){
                maiorContagem=contagemAtual;
                maisFrequente= palavra;
            }
        }
        return maisFrequente;
    }
    public static void main(String[] args) {
    ContagemPalavra contagem = new ContagemPalavra();

    contagem.adicionarPalavra("java", 5);
    contagem.adicionarPalavra("python", 3);
    contagem.adicionarPalavra("csharp", 2);
    contagem.adicionarPalavra("javascript", 7);
    contagem.adicionarPalavra("ruby", 1);
    contagem.adicionarPalavra("go", 4);
    contagem.adicionarPalavra("kotlin", 2);
    contagem.adicionarPalavra("swift", 3);
    contagem.adicionarPalavra("php", 6);
    contagem.adicionarPalavra("typescript", 20);

    // contagem.exibirContagemPalavras();
    System.out.println(contagem.encontrarPalavraMaisFrequente());;
}
    
}
