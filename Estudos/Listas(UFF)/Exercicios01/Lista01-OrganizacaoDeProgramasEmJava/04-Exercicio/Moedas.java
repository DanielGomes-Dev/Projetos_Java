import java.util.Scanner;

public class Moedas {
      
    public static void  main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em 'centavos' e indicaremos a menor quantidade de moedas que representa esse valor: ");
        int moedas = sc.nextInt();

        int coin1Real = moedas / 100;

        int coin50Cent = moedas % 100 / 50;

        int coin25Cent = moedas % 100 % 50 / 25;
        // int coin25Cent = moedas % 150 / 25; -> Não funciona Ex: 260

        int coin10Cent = moedas % 100 % 50 % 25 / 10;

        int coin5Cent = moedas % 100 % 50 % 25 % 10 / 5;
        
        int coin1Cent = moedas % 100 % 50 % 25 % 10 % 5;

        System.out.println("Para o valor " + moedas + " centavos a menor quantidade de moedas é: ");

        if(coin1Real!=0){
            if (coin1Real>1) System.out.println(coin1Real + " Moedas de 1 real");
            else System.out.println(coin1Real + " Moeda de 1 real");
        }


        
        if(coin50Cent!=0){
            System.out.println(coin50Cent + " Moeda de 50 centavos");
        }

        
        if(coin25Cent!=0){
            System.out.println(coin25Cent + " Moeda de 25 centavos");
        }

        if(coin10Cent!=0){
            if (coin10Cent>1) System.out.println(coin10Cent + " Moedas de 10 centavos");
            else System.out.println(coin10Cent + " Moeda de 10 centavos");
        }

        if(coin5Cent!=0){
            System.out.println(coin5Cent + " Moeda de 5 centavos");
        }

        if(coin1Cent!=0){
            if (coin1Cent>1) System.out.println(coin1Cent + " Moedas de 1 centavos");
            else System.out.println(coin1Cent + " Moeda de 1 centavos");
        }
        
        sc.close();
    }
}
