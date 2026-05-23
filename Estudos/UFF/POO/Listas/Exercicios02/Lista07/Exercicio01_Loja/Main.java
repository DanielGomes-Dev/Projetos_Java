import loja.usuarios.Cliente;
import loja.usuarios.Funcionario;
import loja.usuarios.Gerente;

public class Main {

    /*
    
    Como é a hierarquia de herança desse sistema no que se refere a controle de usuários?
    
    - Usuario
        - Funcionario
            - Gerente
        - Cliente
    
    */
    public static void main(String[] args) {
        System.out.println("--- INICIALIZANDO LOJA ---\n");

        Cliente cliente = new Cliente(
            "Daniel Gomes", 
            "123", 
            "123.456.789-00",
            "daniel@email.com",
            "Rua A" 
            );
            
        System.out.println("Cliente Cadastrado: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Endereco: " + cliente.getEndereco());

        System.out.println("----------------------------------------");

        Funcionario funcionario = new Funcionario(
            "João Vendedor",
            "456");

        System.out.println("Funcionário Operacional: " + funcionario.getNome());
        funcionario.venderProduto("Notebook Gamer", 1);
        System.out.println("----------------------------------------");

        Gerente gerente = new Gerente("Carlos Gerente", "321");
        System.out.println("Gerente do Sistema: " + gerente.getNome());
        
        gerente.venderProduto("Smartphone Premium", 2); 
        
        gerente.fecharCaixa();
        System.out.println("----------------------------------------");
    }
}
