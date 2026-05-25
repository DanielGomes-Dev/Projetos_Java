import conta.ContaComum;
import conta.ContaEspecial;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIALIZANDO TESTES DO SISTEMA BANCÁRIO ---\n");

        System.out.println("ContaComum ----------\n");

        ContaComum cc = new ContaComum("111-C", 500.0);
        System.out.println("Saldo inicial R$ " + cc.getSaldo());
        cc.depositar(200.0);
        cc.sacar(100.0);
        cc.sacar(700.0); 
        System.out.println("Saldo final R$ " + cc.getSaldo() + "\n");

        System.out.println("ContaEspecial ----------\n");

        ContaEspecial ce = new ContaEspecial("222-E", 100.0, 300.0);
        System.out.println("Saldo inicial: R$ " + ce.getSaldo());
        ce.sacar(250.0); //Usar Limite
        System.out.println("Limite usado: R$ " + ce.getSaldo());
        ce.sacar(200.0);  // sacar mais q o limite permite
        ce.depositar(300.0); 
        System.out.println("Saldo final CE: R$ " + ce.getSaldo() + "\n");

        System.out.println("ContaPoupanca ----------\n");


        ContaPoupanca cp = new ContaPoupanca("333-P", 1100.0);
        System.out.println("Saldo inicial: R$ " + cp.getSaldo());
        cp.sacar(100.0);
        
        // Aplicando a taxa de rendimento de 0.5%
        cp.render(0.5); 
        System.out.println("Saldo final: R$ " + cp.getSaldo() + "\n");

    }
}