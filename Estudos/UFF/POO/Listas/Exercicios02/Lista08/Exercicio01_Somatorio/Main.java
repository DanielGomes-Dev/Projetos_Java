import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {

        CalculadoraSomatorio calculadora = new CalculadoraSomatorio();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite numeros inteiros positivos para somar.");
        System.out.println("Para encerrar e ver o resultado, digite 0 ou um número negativo.\n");

        boolean continuarLeitura = true;

        while (continuarLeitura) {

            try {
                System.out.print("Informe um número inteiro: ");
                int numeroDigitado = scanner.nextInt();

                continuarLeitura = calculadora.adicionarNumero(numeroDigitado);

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Erro: Entrada inválida! Você deve digitar obrigatoriamente um número inteiro.");
                scanner.next(); // Limpar o buffer do teclado
            }
        }

        System.out.printf("\nSomatório Total: %d\n", calculadora.getSomatorio());

        scanner.close();
    }
}