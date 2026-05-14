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

    public void imprime_contatos(){
        for (Contato contato : lista_contato) {
            System.out.printf("%s - %s%n", contato.name, contato.number);
        }
    }

    public static void main (String[] args){
        Contato contato_01 = new Contato("Daniel Gomes", "021 98888-8888");
        Contato contato_02 = new Contato("Maria Betania", "021 98888-8889");
        
        Agenda agenda = new Agenda();
        agenda.add_contato(contato_01);
        agenda.add_contato(contato_02);

        agenda.imprime_contatos();


    }
}

