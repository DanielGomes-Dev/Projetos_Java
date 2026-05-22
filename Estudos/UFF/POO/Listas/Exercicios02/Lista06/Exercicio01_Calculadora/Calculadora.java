public class Calculadora {
    
    private double memoria;

    public Calculadora() {
        this.memoria = 0.0;
    }

    public double getMemoria() {
        return this.memoria;
    }

    public void somar(double valor) {
        this.memoria += valor;
    }

    public void subtrair(double valor) {
        this.memoria -= valor;
    }

    public void multiplicar(double valor) {
        this.memoria *= valor;
    }

    public void dividir(double valor) {
        if (valor == 0) {
            System.out.println("Erro: Não é possível realizar divisão por zero. A operação foi cancelada.");
        } else {
            this.memoria /= valor;
        }
    }

    public void limparMemoria() {
        this.memoria = 0.0;
    }
}