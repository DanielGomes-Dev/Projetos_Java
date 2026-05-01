import java.util.Scanner;



public class VetorInsert {

/*

    Crie um programa para ler um número n e 
    um vetor v com n números inteiros. 
    Depois, ler mais um número k e 
    um número p. 
    Em seguida, inserir o número k na posição p do vetor, 
    deslocando os números da posição p em diante para frente uma posição (o último número será perdido) e 
    imprimir o vetor resultante. 
    Caso p seja inválido apresente a mensagem "Posição inválida".

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero do vetor"); 

            v[i] = sc.nextInt();
        }

        System.out.print("Digite o numero que seja adicionar no vetor: ");
        int k = sc.nextInt();
        System.out.print("Digite a posicao que seja inserir: ");
        int p = sc.nextInt();

        if (p < 0 || p >= n) {
            System.out.println("Erro na posicao do vetor");
        } else {
            for (int i = n - 1; i > p; i--) {
                v[i] = v[i - 1];
            }

            v[p] = k;

            System.out.println("Novo Vetor:");
            for (int i = 0; i < n; i++) {
                System.out.printf(v[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}