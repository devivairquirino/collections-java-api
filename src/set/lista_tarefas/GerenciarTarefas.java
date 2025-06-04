package set.lista_tarefas;

public class GerenciarTarefas {
    public static void main(String[] args) {
        ListaTarefas novaListaTarefas = new ListaTarefas();
        
        novaListaTarefas.adicionarTarefa("Estudar Java");
        novaListaTarefas.adicionarTarefa("Fazer exercícios físicos");
        novaListaTarefas.adicionarTarefa("Ler um livro");
        novaListaTarefas.adicionarTarefa("Organizar a mesa");
        novaListaTarefas.adicionarTarefa("Revisar anotações");

        // novaListaTarefas.limparListaTarefas();
        novaListaTarefas.marcarTarefaConcluida("Revisar anotações");
        novaListaTarefas.marcarTarefaConcluida("Organizar a mesa");
        novaListaTarefas.marcarTarefaConcluida("Ler um livro");

        novaListaTarefas.marcarTarefaPendente("Ler um livro");

        System.out.println(novaListaTarefas.obterTarefasConcluidas());
        System.out.println(novaListaTarefas.obterTarefasPendentes());
        // System.out.println(novaListaTarefas.exibirTarefas());
    }
}
