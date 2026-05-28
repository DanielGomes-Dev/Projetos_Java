public class OperacaoMatematica {
    private double operandoA;
    private double operandoB;
    private char operador;

    public OperacaoMatematica(double operandoA, double operandoB, char operador) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
        this.operador = operador;
    }

    public double getOperandoA() { return operandoA; }
    public void setOperandoA(double operandoA) { this.operandoA = operandoA; }

    public double getOperandoB() { return operandoB; }
    public void setOperandoB(double operandoB) { this.operandoB = operandoB; }

    public char getOperador() { return operador; }
    public void setOperador(char operador) { this.operador = operador; }

    public double somar() {
        return this.operandoA + this.operandoB;
    }

    public double subtrair() {
        return this.operandoA - this.operandoB;
    }

    public double multiplicar() {
        return this.operandoA * this.operandoB;
    }

    public double dividir() {
        if (this.operandoB == 0.0) {
            throw new ArithmeticException("Erro: Divisão por zero não permitida.");
        }
        return this.operandoA / this.operandoB;
    }

    public double calcularRaizQuadradaA() {
        if (this.operandoA < 0.0) {
            throw new IllegalArgumentException("Erro: Não foi possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(this.operandoA);
    }


    public double executar() throws ArithmeticException, IllegalArgumentException {
        switch (this.operador) {
            case '+':
                return somar();
            case '-':
                return subtrair();
            case '*':
                return multiplicar();
            case '/':
                return dividir();
            case 'r':
                return calcularRaizQuadradaA();
            default:
                throw new IllegalArgumentException("Operador inválido ou não suportado pelo sistema.");
        }
    }
}