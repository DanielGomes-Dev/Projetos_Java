import java.util.Scanner;

public class Calculadora {

    /*
        Exercício 1: 
        - Leia duas variáveis inteiras e 
        - imprima a soma, subtração, multiplicação e divisão entre elas.
    */

       public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero da Soma");
        int number1 = sc.nextInt();
        System.out.println("Digite o Segundo Numero da Soma: ");
        int number2 = sc.nextInt();

        int soma = number1 + number2;
        int subtracao = number1 - number2;
        int multiplicacao = number1 * number2;
        float divisao = (float) number1 / number2;

        System.out.println("A Soma de: " + number1 + " + " + number2 + " = " + soma);
        System.out.println("A Subtracao de: " + number1 + " - " + number2 + " = " + subtracao);
        System.out.println("A Multiplicacao de: " + number1 + " * " + number2 + " = " + multiplicacao);
        System.out.println("A Divisao de: " + number1 + " / " + number2 + " = " + divisao);

        
        
        sc.close();
    }
}
