package conta;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        if (limite >= 0) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
            return;
        }

        double saldoDisponivelComLimite = this.saldo + this.limite;

        if (valor <= saldoDisponivelComLimite) {
            this.saldo -= valor; 
            System.out.println("Saque especial de R$ " + valor + " realizado com sucesso na conta " + numero);
        } else {
            System.out.println("\n--- Erro no Saque ---");
            System.out.println("Falha ao tentar sacar: " + valor);
            System.out.println("Saldo disponivel: R$ " + this.saldo);
            System.out.println("Limite Maximo R$ " + this.limite);
            System.out.println("--- Erro no Saque ---\n");


        }
    }

    public double getLimite() {
        return limite;
    }
}
