package map.agenda_eventos;

public class Evento {
    private String nome;
    private String atracao;
    
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    public String getNome() {
        return nome;
    }
    public String getatracao() {
        return atracao;
    }
    @Override
    public String toString() {
        return "\nEvento: " + nome + "\nAtração: " + atracao;
    }
    
    
}
