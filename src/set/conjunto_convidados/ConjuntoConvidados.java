package set.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        Convidado novo = new Convidado(nome, codigoConvite);
        if (convidadoSet.contains(novo)) {
            System.out.println("Convidado com código " + codigoConvite + " já existe!");
        } else {
            convidadoSet.add(novo);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjunto = new ConjuntoConvidados(null);

        conjunto.adicionarConvidado("Ana", 101);
        conjunto.adicionarConvidado("Bruno", 102);
        conjunto.adicionarConvidado("Carla", 103);
        conjunto.adicionarConvidado("Daniel", 104);
        conjunto.adicionarConvidado("Eduarda", 105);

        conjunto.removerConvidadoPorCodigoConvite(102);
        conjunto.exibirConvidados();

        System.out.println(conjunto.contarConvidados());
    }
}
