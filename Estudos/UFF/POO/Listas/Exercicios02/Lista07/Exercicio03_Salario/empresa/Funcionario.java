package empresa;


public abstract class Funcionario {
    private String nome;
    private double salarioBruto;

    public Funcionario(String nome, double salarioBruto) {
        this.nome = nome;
        setSalarioBruto(salarioBruto);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        if (salarioBruto >= 0) {
            this.salarioBruto = salarioBruto;
        } else {
            throw new IllegalArgumentException("O salário bruto não pode ser negativo.");
        }
    }

    public double calcularImpostoRenda() { // Polimorfismo
        double bruto = getSalarioBruto();
        if (bruto <= 900.00) {
            return 0.0;
        } else if (bruto <= 1500.00) {
            return bruto * 0.15;
        } else {
            return bruto * 0.20;
        }
    }

    public double calcularSalarioLiquido() {
        return getSalarioBruto() - calcularImpostoRenda();
    }
}
