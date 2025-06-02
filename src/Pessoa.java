public class Pessoa {
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(String nome, int idade, Double altura){
        this.nome = nome;
        this.idade= idade;
        this.altura= altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                "}\n";
    }
    
}
