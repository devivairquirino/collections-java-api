package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, String telefone){
        agendaContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        agendaContatosMap.remove(nome);
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public static void main(String[] args) {
        AgendaContatos novaAgenda= new AgendaContatos();

        novaAgenda.adicionarContato("Ana", "11999990001");
        novaAgenda.adicionarContato("Bruno", "11999990002");
        novaAgenda.adicionarContato("Carlos", "11999990003");
        novaAgenda.adicionarContato("Diana", "11999990004");
        novaAgenda.adicionarContato("Eduardo", "11999990005");

        novaAgenda.removerContato("Bruno");

        novaAgenda.exibirContatos();
    }
    
}
