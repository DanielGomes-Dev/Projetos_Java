import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n = sc.nextInt();

        System.out.println("Digite outros 2 numeros para verificar se o primeiro esta entre eles ou não");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        if (n1 > n2){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        if(n < n1){
            System.out.printf("%d Está antes do intervalo %d - %d%n", n, n1, n2);
        } else if (n > n2){
            System.out.printf("%d Está depois do intervalo %d - %d%n", n, n1, n2);
        } else {
            System.out.printf("%d Está dentro do intervalo %d - %d%n", n, n1, n2);

        }

        sc.close();
    }
}
