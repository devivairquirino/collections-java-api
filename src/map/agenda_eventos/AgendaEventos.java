package map.agenda_eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class AgendaEventos {
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos(){
        this.agendaMap= new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
       Map<LocalDate, Evento> agendaOrdenada= new TreeMap<>(agendaMap);
       agendaOrdenada.forEach((data,evento)->{
            System.out.println("\n{\nData: "+data+evento+"\n}\n");
       });
    }
    public Map<LocalDate, Evento> obterProximoEvento(){
        Map<LocalDate, Evento> proximosEventos= new TreeMap<>();

        for(Map.Entry<LocalDate,Evento> evento : agendaMap.entrySet()){
            LocalDate hoje= LocalDate.now();
            LocalDate dataAtual= evento.getKey();
            if(dataAtual.isAfter(hoje) || dataAtual.isEqual(hoje)){
                proximosEventos.put(dataAtual, evento.getValue());
            }
        }
        return proximosEventos;
    }
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2025, 5, 10), "Show de Rock", "Banda XYZ");
        agenda.adicionarEvento(LocalDate.of(2025, 7, 5), "Feira de Livros", "Autores Locais");
        agenda.adicionarEvento(LocalDate.of(2025, 8, 15), "Festival de Cinema", "Filmes Independentes");
        agenda.adicionarEvento(LocalDate.of(2025, 9, 1), "Palestra de Tecnologia", "Especialista em IA");
        agenda.adicionarEvento(LocalDate.of(2025, 10, 20), "Exposição de Arte", "Artistas Regionais");

        // agenda.exibirAgenda();

        System.out.println(agenda.obterProximoEvento());
    }

}
