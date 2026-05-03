import java.util.Scanner;
import java.util.stream.IntStream;

    /*

    2. 
    Crie um programa para ler um número n e 
    depois ler um vetor v com n números inteiros. 
    Ao final, ler mais um número k e 
    informar e que posições do vetor v aparece o número k. 
    Caso k não exista no vetor v apresente a mensagem "Número não encontrado".

    */

public class Vetor {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: "); 
        int n = sc.nextInt();
        int[] v = new int[n];

        int count = 0;
        while(count < n){
            System.out.println("Informe o " + (count + 1) + "º numero do vetor"); 

            v[count] = sc.nextInt();
            ++count;
        }
        System.out.println("Digite o numero que seja buscar no vetor: ");
        int k = sc.nextInt();
        int[] positions;
        int tamanhoPositions = 0;
        int[] posPositions = new int[v.length];

        for(int i = 0; i < v.length; ++i){
            if(v[i] == k){
                posPositions[tamanhoPositions] = i;
                ++tamanhoPositions;
            }
        }

        positions = new int[tamanhoPositions];

        for (int i = 0; i < tamanhoPositions; ++i){
            positions[i] = posPositions[i];
        }

        if(positions.length == 0){
            System.out.println("Número não encontrado");
        }else {

            System.out.printf("O numero %d aparece na posição: %n", k);
            for (int i = 0; i < tamanhoPositions; ++i){
                System.out.printf(positions[i] + ", ");
            }

        }

        positions = null;
        posPositions = null;
        System.out.println("");

        System.out.println("--- Metodo Clean ---");

        int[] positions2 = IntStream.range(0, v.length)
                           .filter(i -> v[i] == k)
                           .toArray();

        for (int pos : positions2){
            System.out.println(pos);
        }

        sc.close();
    }
}