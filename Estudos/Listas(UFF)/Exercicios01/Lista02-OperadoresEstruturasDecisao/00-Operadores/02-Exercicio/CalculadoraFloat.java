import java.util.Scanner;
public class CalculadoraFloat {
 

    /*
    Exercício 2: Altere o tipo das duas variáveis do Exercício 1 para ponto flutuante.

    */

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero da Soma");
        float number1 = sc.nextFloat();
        System.out.println("Digite o Segundo Numero da Soma: ");
        float number2 = sc.nextFloat();

        float soma = number1 + number2;
        float subtracao = number1 - number2;
        float multiplicacao = number1 * number2;
        float divisao = number1 / number2;

        System.out.println("A Soma de: " + number1 + " + " + number2 + " = " + soma);
        System.out.println("A Subtracao de: " + number1 + " - " + number2 + " = " + subtracao);
        System.out.println("A Multiplicacao de: " + number1 + " * " + number2 + " = " + multiplicacao);
        System.out.println("A Divisao de: " + number1 + " / " + number2 + " = " + divisao);

        sc.close();
    }
}
