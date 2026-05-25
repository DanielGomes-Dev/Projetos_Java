package empresa;

public class Vendedor extends Funcionario {
    private double percentualBonus; 

    public Vendedor(String nome, double salarioBruto, double percentualBonus) {
        super(nome, salarioBruto);
        setPercentualBonus(percentualBonus);
    }

    public double getPercentualBonus() {
        return this.percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        if (percentualBonus >= 0) {
            this.percentualBonus = percentualBonus;
        } else {
            throw new IllegalArgumentException("O percentual de bônus não pode ser negativo.");
        }
    }

    public double calcularValorBonus() {
        return getSalarioBruto() * this.percentualBonus;
    }

    public double calcularImpostoRenda() {
        double montanteTotal = getSalarioBruto() + calcularValorBonus();
        
        if (montanteTotal <= 900.00) {
            return 0.0;
        } else if (montanteTotal <= 1500.00) {
            return montanteTotal * 0.15;
        } else {
            return montanteTotal * 0.20;
        }
    }

    public double calcularSalarioLiquido() {
        double totalRecebido = getSalarioBruto() + calcularValorBonus();
        return totalRecebido - calcularImpostoRenda();
    }
}