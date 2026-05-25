
import empresa.Funcionario;
import empresa.Estagiario;
import empresa.Vendedor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PROCESSAMENTO DA FOLHA DE PAGAMENTO ---\n");

        
        // Estagiario
        Funcionario estagiario = new Estagiario("Daniel Gomes", 1200.00);
        System.out.println("Funcionario: " + estagiario.getNome());
        System.out.println("Salario Bruto: R$ " + estagiario.getSalarioBruto());
        System.out.println("Salario Liquido: R$ " + estagiario.calcularSalarioLiquido());
        System.out.println("Imposto de renda: R$ " + estagiario.calcularImpostoRenda());

        System.out.println();

        //Vendedor
        Funcionario vendedor = new Vendedor("Maria Betania", 1400.00, 0.10); // 10% de bonus
        System.out.println("Funcionario: " + vendedor.getNome() + " (Vendedor)");
        System.out.println("Salario Bruto Base: R$ " + vendedor.getSalarioBruto());
        System.out.println("Bônus: R$ " + ((Vendedor) vendedor).calcularValorBonus());
        System.out.println("Salario Liquido: R$ " + vendedor.calcularSalarioLiquido());
        System.out.println("Imposto de renda: R$ " + vendedor.calcularImpostoRenda());

        System.out.println();


        //Vendedor 2
        Funcionario vendedor2 = new Vendedor("Joao Carlos", 1350.00, 0.10); // 10% de bonus
        System.out.println("Funcionario: " + vendedor2.getNome() + " (Vendedor)");
        System.out.println("Salario Bruto Base: R$ " + vendedor2.getSalarioBruto());
        System.out.println("Bônus: R$ " + ((Vendedor) vendedor2).calcularValorBonus());
        System.out.println("Salario Liquido: R$ " + vendedor2.calcularSalarioLiquido());
        System.out.println("Imposto de renda: R$ " + vendedor2.calcularImpostoRenda());

        System.out.println();

        //Vendedor 3
        Funcionario vendedor3 = new Vendedor("Joao Pedro", 1499.00, 0); // 10% de bonus
        System.out.println("Funcionario: " + vendedor3.getNome() + " (Vendedor)");
        System.out.println("Salario Bruto Base: R$ " + vendedor3.getSalarioBruto());
        System.out.println("Bônus: R$ " + ((Vendedor) vendedor3).calcularValorBonus());
        System.out.println("Salario Liquido: R$ " + vendedor3.calcularSalarioLiquido());
        System.out.println("Imposto de renda: R$ " + vendedor3.calcularImpostoRenda());

        System.out.println();





        
    }
}