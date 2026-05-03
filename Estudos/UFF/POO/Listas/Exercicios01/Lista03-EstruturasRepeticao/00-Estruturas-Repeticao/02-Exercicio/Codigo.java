import java.util.Scanner;

public class Codigo {


    /*
    
    Exercício 2. Considere os programas a seguir, que leem um código repetidamente e imprimem o
    código lido até que o código lido seja igual a -1. O código -1 não deve ser impresso.
        a. Qual das duas soluções é a correta?
        b. Como a solução incorreta poderia ser corrigida?

*/

    // O Programa "A" Está correto
    // o Programa "B" está incorreto
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int code;
        
        /*
        System.out.println("Digite o Codigo");
        code = sc.nextInt();
        while(code != -1){ // O Programa "A" Está correto
            System.out.println("Codigo " + code);
            System.out.println("---");
            System.out.println("Digite o Codigo");
            code = sc.nextInt();
        }
        */

        /*

        do { // o Programa B está incorreto
            System.out.println("---");
            System.out.println("Digite o Codigo");
            code = sc.nextInt();
            System.out.println("Codigo " + code);
        } while (code != -1);

         */

        
        /*
        do { // Correcao do programa "B"; -> Adicionando um break e removendo verificação do while
            System.out.println("---");
            System.out.println("Digite o Codigo");
            code = sc.nextInt();
            if(code == -1) break;
            System.out.println("Codigo " + code);
        } while (true);

        
        */

        do { // Correcao do programa "B"; -> verificando antes de imprimir
            System.out.println("---");
            System.out.println("Digite o Codigo");
            code = sc.nextInt();
            if(code != -1) System.out.println("Codigo " + code);
        } while (code != -1);


        sc.close();
        
        }


}
