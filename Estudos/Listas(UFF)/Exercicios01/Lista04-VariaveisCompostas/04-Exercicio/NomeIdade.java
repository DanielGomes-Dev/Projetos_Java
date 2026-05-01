import java.util.Scanner;

public class NomeIdade {

    /*
    
    4. Leia o nome e a idade de 10 pessoas e liste as pessoas
        – Em ordem alfabética
        – Em ordem crescente de idade
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            nomes[i] = sc.next();
            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nomes[j].compareToIgnoreCase(nomes[j + 1]) > 0) {

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;

                    int tempIdade = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempIdade;
                }
            }
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (idades[j] > idades[j + 1]) {

                    int tempIdade = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempIdade;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        System.out.println("\n--- Lista em Ordem Alfabética ---");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i] + " - " + idades[i] + " anos");
        }

        System.out.println("\n--- Lista por Ordem de Idade ---");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i] + " - " + idades[i] + " anos");
        }

        sc.close();
    }
}