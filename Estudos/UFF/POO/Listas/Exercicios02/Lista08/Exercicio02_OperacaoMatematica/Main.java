import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação que deseja realizar. \n");

        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Raiz Quadrada\n");
        System.out.print("Escolha a operação desejada (1-5): ");

        try {
            int opcao = scanner.nextInt();
            char operadorSelecionado = ' ';
            boolean solicitaSegundoNumero = true;

            switch (opcao) {
                case 1:
                    operadorSelecionado = '+';
                    break;
                case 2:
                    operadorSelecionado = '-';
                    break;
                case 3:
                    operadorSelecionado = '*';
                    break;
                case 4:
                    operadorSelecionado = '/';
                    break;
                case 5:
                    operadorSelecionado = 'r';
                    solicitaSegundoNumero = false;
                    break;
                default:
                    System.out.println("Erro: Opção não está no menu.");
                    scanner.close();
                    return;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            double num2 = 0.0;
            if (solicitaSegundoNumero) {
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            }

            OperacaoMatematica operacao = new OperacaoMatematica(num1, num2, operadorSelecionado);

            try {
                double resultado = operacao.executar();
                
                if (operadorSelecionado == 'r') {
                    System.out.printf("Raiz quadrada de %.2f = %.2f\n", operacao.getOperandoA(), resultado);
                } else {
                    System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", 
                                      operacao.getOperandoA(), operacao.getOperador(), operacao.getOperandoB(), resultado);
                }
                
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro de Entrada: Apenas caracteres numéricos.");
        } finally {
            scanner.close();
        }
    }
}