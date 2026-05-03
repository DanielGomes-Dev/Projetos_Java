import java.util.Scanner;

public class AlunoNota {

    /*
    
    1. Crie um programa para ler inicialmente o número de alunos de uma turma. 
    Em seguida, leia as notas dos alunos dessa turma. 
    Ao final, imprima a média da turma e as notas acima da média.

    */
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de Alunos: ");
        int qtdAlunos = sc.nextInt();
        float[] notas;
        notas = new float[qtdAlunos];
        
        float somaNota = 0;

        // for (int i = 0; i < qtdAlunos; ++i){ // sem usar vetores
        //     System.out.printf("Digita a nota do Aluno: %d%n", i+1);
        //     somaNota += sc.nextFloat();
        // }
        // float media = somaNota/qtdAlunos;

        
        for (int i = 0; i < qtdAlunos; ++i){
            System.out.printf("Digita a nota do Aluno: %d%n", i+1);
            notas[i] = sc.nextFloat();
        }
        
        for (int i = 0; i < notas.length; ++i){
            somaNota += notas[i];
        }
        float media = somaNota/notas.length;
        


        System.out.printf("A média de notas da Turma foi de: %.2f%n", media);

        sc.close();

    }

}
