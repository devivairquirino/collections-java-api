package set.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
        private Set<Tarefa> tarefasSet;

        public ListaTarefas(){
            this.tarefasSet= new HashSet<>();
        }
        public void adicionarTarefa(String descricao){
            Tarefa novaTarefa= new Tarefa(descricao, false);
            if(tarefasSet.contains(novaTarefa)){
                throw new IllegalArgumentException("Tarefa já existe na Lista!");
            }
            tarefasSet.add(novaTarefa);
        }
        public Set<Tarefa> exibirTarefas(){
            return tarefasSet;
        }
        public int contarTarefas(){
            return tarefasSet.size();
        }
        public Set<Tarefa> obterTarefasConcluidas(){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();

            for (Tarefa tarefa : tarefasSet) {
                if(tarefa.getTarefaConcluida()){
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
        }
        public Set<Tarefa> obterTarefasPendentes(){
            Set<Tarefa> tarefasPendentes = new HashSet<>();

            for (Tarefa tarefa : tarefasSet) {
                if(!tarefa.getTarefaConcluida()){
                    tarefasPendentes.add(tarefa);
                }
            }
            return tarefasPendentes;
        }
        public void marcarTarefaConcluida(String descricao){
            for(Tarefa tarefa: tarefasSet){
                if(tarefa.getDescrição().equalsIgnoreCase(descricao)){
                    tarefa.setTarefaConcluida(true);
                    break;
                }
            }
        }
        public void marcarTarefaPendente(String descricao){
            for(Tarefa tarefa: tarefasSet){
                if(tarefa.getDescrição().equalsIgnoreCase(descricao)){
                    tarefa.setTarefaConcluida(false);
                    break;
                }
            }
        }
        public void limparListaTarefas(){
            tarefasSet.clear();
        }
    }