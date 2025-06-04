package set.lista_tarefas;

public class Tarefa {
    private String descricao;
    private Boolean tarefaConcluida;

    
    public Tarefa(String descricao, Boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescrição() {
        return descricao;
    }
    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }
    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }
    public void setTarefaConcluida(Boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equalsIgnoreCase(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nTarefa [descricao= " + descricao + ", tarefaConcluida= " + tarefaConcluida + "]\n";
    }
    
    
}
