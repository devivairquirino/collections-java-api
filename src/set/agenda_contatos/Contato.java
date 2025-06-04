package set.agenda_contatos;

public class Contato {
    private String nome;
    private String numeroTelefone;

    
    public Contato(String nome, String numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public String toString() {
        return "\nContato [nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
}
