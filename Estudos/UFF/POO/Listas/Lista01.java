import java.util.Scanner;

public class Lista01 {
    /*
    Para ler um byte: sc.nextByte()
    Para ler um short: sc.nextShort()
    Para ler um int: sc.nextInt()
    Para ler um long: sc.nextLong()
    Para ler um float: sc.nextFloat()
    Para ler um double: sc.nextDouble()
    Para ler um boolean: sc.nextBoolean()
    Para ler uma String até o próximo espaço em branco: sc.next()
    Para ler uma String até o final da linha (incluindo espaços): sc.nextLine()
    */

   
   
   public static void exercicio1(Scanner sc){
       // 1 - Crie um programa que peça ao usuário para digitar seu nome e, em seguida, exiba uma mensagem personalizada com o nome informado.
       
       System.out.println("Exercicio 1");
       System.out.println("Digite seu nome: ");
       String user_name = sc.nextLine();
       System.out.println("Olá " + user_name);
    }
    public static void exercicio2(Scanner sc){
        // 2 - Crie um programa que converta uma temperatura fornecida em graus Celsius para Fahrenheit usando a fórmula: F=(C×1.8)+32

        System.out.println("Exercicio 2");
        System.out.println("Digite a temperatura em Celsius: ");
        int graus_celsius = sc.nextInt();
        float fahrenheit = (graus_celsius*1.8f)+32;
        System.out.println(graus_celsius + "ºC Equivale a " + fahrenheit + "ºF");
    }

    public static void exercicio3(Scanner sc){

        // 3 - Crie um programa que peça um número ao usuário e diga se ele é par ou ímpar.

        System.out.println("Digite um numero para identificar se é impar ou par");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println( number + " é Par.");
        }else {
            System.out.println(number + " é Impar");
        }

    }

    public static void exercicio4(Scanner sc){
        // 4 - Crie um programa para, a partir de um valor informado em centavos, indicar a menor quantidade de moedas que representa esse valor
        // – Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
        /*
        
        – Exemplo: para o valor 290 centavos, a menor quantidade de moedas é 2 moedas
        de 1 real, 1 moeda de 50 centavos, 1 moeda de 25 centavos, 1 moeda de 10
        centavos e 1 moeda de 5 centavos
        
        */
        System.out.println("Informe um valor em 'centavos' e indicaremos a menor quantidade de moedas que representa esse valor: ");
        int moedas = sc.nextInt();

        int coin1Real = moedas / 100;

        int coin50cent = moedas % 100 / 50;

        int coin25cent = moedas % 100 % 50 / 25;
        // int coin25cent = moedas % 150 / 25; -> Não funciona Ex: 260

        int coin10cent = moedas % 100 % 50 % 25 / 10;

        int coin5cent = moedas % 100 % 50 % 25 % 10 / 5;
        
        int coin1cent = moedas % 100 % 50 % 25 % 10 % 5;

        System.out.println(coin1Real + " Moedas de 1 real");
        System.out.println(coin50cent + " Moedas de 50 centavos");
        System.out.println(coin25cent + " Moedas de 25 centavos");
        System.out.println(coin10cent + " Moedas de 10 centavos");
        System.out.println(coin5cent + " Moedas de 5 centavos");
        System.out.println(coin1cent + " Moedas de 1 centavos");


    }



    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // exercicio1(sc);
        // exercicio2(sc);
        // exercicio3(sc);
        exercicio4(sc);


    }
    
}
