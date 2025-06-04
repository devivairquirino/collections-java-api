package set.conjunto_palavra_unica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavraUnica {
    private Set<String> palavrasSet;

    public ConjuntoPalavraUnica() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        if(palavrasSet.contains(palavra)){
            System.out.println("A palavra "+palavra+" já existe no conjunto!");
        }
        else{
            palavrasSet.add(palavra);
        }
    }
    public void removerPalavra(String palavra){
        String palavraRemover=null;
        for(String p : palavrasSet){
            if(p.equalsIgnoreCase(palavra)){
                palavraRemover=p;
                break;
            }
        }
        if(palavraRemover==null){
            System.out.println("Palavra não encontrada!");
        }else{
            palavrasSet.remove(palavraRemover);
        }
    }
    public void verificarPalavra(String palavra){
        Boolean encontrada= false;

        for(String p: palavrasSet){
            if(p.equalsIgnoreCase(palavra)){
                encontrada=true;
                break;
            }
        }
        if(encontrada){
            System.out.println("A palavra "+palavra+" foi encontrada no conjunto!");
        }
        else{
            System.out.println("A palavra "+palavra+" não foi encontrada e pode ser adicionada!");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavraUnica novoConjunto= new ConjuntoPalavraUnica();

        novoConjunto.adicionarPalavra("maçã");
        novoConjunto.adicionarPalavra("abobora");
        novoConjunto.adicionarPalavra("abacaxi");
        // novoConjunto.adicionarPalavra("abacaxi");

        novoConjunto.verificarPalavra("null");
        novoConjunto.verificarPalavra("ABACAXI");
        novoConjunto.verificarPalavra("abacaxi");

        novoConjunto.removerPalavra("MAÇÃ");
        novoConjunto.exibirPalavrasUnicas();
    }
    
}
