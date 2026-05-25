package conta;


public abstract class ContaBancaria {
    protected String numero;
    protected double saldo;

    public ContaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0; 
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numero);
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
            return;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta " + numero);
        } else {
            System.out.println("Erro: Saldo insuficiente na conta " + numero + " (Saldo: R$ " + this.saldo + ")");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumero() {
        return this.numero;
    }
}