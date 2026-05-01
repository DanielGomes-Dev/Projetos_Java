import java.util.Scanner;

public class ParImpar {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para identificar se é impar ou par");
        
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " é Par.");
        }else {
            System.out.println(number + " é Impar");
        }

        sc.close();
    }
}
