package conta;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }


    public void render(double percentual) {
        if (percentual > 0) {
            double fatorRendimento = percentual / 100.0;
            double rendimentoCalculado = this.saldo * fatorRendimento;
            this.saldo = this.saldo + rendimentoCalculado;
            
            System.out.println("Conta Poupança " + numero + " rendeu R$ " + rendimentoCalculado + " (" + percentual + "%)");
        } else {
            System.out.println("Erro: O percentual de rendimento deve ser maior que zero.");
        }
    }
}
