public class ContaCorrente {
    private String numeroConta;
    private String titular;
    private double saldo;
    private double taxaOperacao = 1.5f;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial) {
        this.setNumeroConta(numeroConta);
        this.setTitular(titular);
        
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
            System.out.println("Conta criada com sucesso!");

        } else {
            System.out.println("O saldo inicial não pode ser negativo.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %,.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }


    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
        }
        else {
            double valorDescontado = valor + taxaOperacao;
            if (valorDescontado <= this.saldo) {
                this.saldo -= valorDescontado;
                System.out.printf("Saque de R$ %,.2f realizado com sucesso.%n", valor);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta != null && !numeroConta.trim().isEmpty()) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("O número da conta não pode ser vazio.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("O nome do titular não pode ser vazio.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
