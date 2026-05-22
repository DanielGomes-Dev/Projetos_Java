public class Main {
    public static void main(String[] args) {
        System.out.println("Conta Corrente");

        System.out.println("--- Criando uma nova Conta Corrente ---");
        ContaCorrente conta = new ContaCorrente("12345", "Daniel Gomes", 1.00);
        
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.printf("Saldo Inicial: R$ %,.2f%n%n", conta.getSaldo());
        
        System.out.println("R$ " + conta.getSaldo());
        conta.depositar(500.00);
        System.out.println("R$ " + conta.getSaldo());

        conta.sacar(300.00);      
        System.out.println("R$ " + conta.getSaldo());

        conta.sacar(199.00);     
        
        System.out.println("--- Criando uma nova Conta Corrente ---");
        ContaCorrente conta2 = new ContaCorrente("12346", "Daniel Santos", -1.00);
        


    }
}