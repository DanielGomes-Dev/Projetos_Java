package src.cliente;
public class Cliente {
    public String nome;
    public String cpf;

    public Cliente(String nome, String cpf){
        System.out.println("\n-----------\n");
        System.out.println("Iniciando Cliente: " + nome);
        System.out.println("\n-----------\n");

        this.nome = nome;
        this.cpf = cpf;
    }
}
