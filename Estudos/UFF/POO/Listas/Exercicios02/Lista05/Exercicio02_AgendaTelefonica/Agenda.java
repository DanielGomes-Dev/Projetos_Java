import java.util.ArrayList;
import java.util.List;


public class Agenda {

    private List<Contato> lista_contato = new ArrayList<>();

    public Agenda(){
        System.out.println("Agenda iniciada!");
    }

    public void add_contato(Contato contato){
        this.lista_contato.add(contato);
        System.out.println("Contato Adicionado Com Sucesso");
    }

    public void remove_contato(Contato contato){
        System.out.println(contato);
        boolean foiRemovido = this.lista_contato.remove(contato);
        if (foiRemovido) {
        System.out.println("Contato Removido Com Sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    public void imprime_contatos(){
        for (Contato contato : lista_contato) {
            System.out.printf("%s - %s%n", contato.name, contato.number);
        }
    }
}

