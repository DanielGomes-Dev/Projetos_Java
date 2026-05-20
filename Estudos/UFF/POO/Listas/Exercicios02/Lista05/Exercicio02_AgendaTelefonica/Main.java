public class Main{
    public static void main(String[] Args){

        Agenda agenda = new Agenda();

        Contato contato_01 = new Contato("Daniel Gomes", "021 98888-8888");
        Contato contato_02 = new Contato("Maria Betania", "021 98888-8889");
        
        agenda.add_contato(contato_01);
        agenda.add_contato(contato_02);

        agenda.imprime_contatos();
        agenda.remove_contato(contato_01);
        agenda.imprime_contatos();




    }
}