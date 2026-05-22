public class Calculadora {
    
    // Atributo privado para garantir o encapsulamento.
    // Assim, impedimos que classes externas modifiquem o valor da memória diretamente.
    private double memoria;

    // Construtor: Método especial usado para inicializar a instância da classe.
    public Calculadora() {
        this.memoria = 0.0; // Estado inicial da memória é 0
    }

    // Método de Acesso (Getter) para leitura segura do atributo.
    public double getMemoria() {
        return this.memoria;
    }

    // Comportamentos / Operações matemáticas
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
        // Validação adequada: protege a memória de uma alteração inválida (divisão por zero)
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