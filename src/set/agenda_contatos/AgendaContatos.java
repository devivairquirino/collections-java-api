package set.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatosSet.add(novoContato);
    }

    public Set<Contato> exibirContatos() {
        return contatosSet;
    }
    public Contato pesquisarPorNome(String nome){
        for(Contato c: contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }

    public void atualizarNumeroContato(String nome, String novoNumero){
        for(Contato c: contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos novaAgenda = new AgendaContatos();

        novaAgenda.adicionarContato("Ana", "99999-1111");
        novaAgenda.adicionarContato("Bruno", "98888-2222");
        novaAgenda.adicionarContato("Carla", "97777-3333");
        novaAgenda.adicionarContato("Daniel", "96666-4444");
        novaAgenda.adicionarContato("Eduarda", "95555-5555");

        System.out.println(novaAgenda.exibirContatos());
        System.out.println(novaAgenda.pesquisarPorNome("Carla"));
        
        novaAgenda.atualizarNumeroContato("Ana", "1234-5678");
        System.out.println(novaAgenda.exibirContatos());
    }

}
