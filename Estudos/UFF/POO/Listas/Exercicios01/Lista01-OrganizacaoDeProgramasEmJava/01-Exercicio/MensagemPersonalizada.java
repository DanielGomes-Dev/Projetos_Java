import java.util.Scanner;

class MensagemPersonalizada{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lista 01 - Exercicio 01");
        System.out.println("Digite seu nome: ");
        String user_name = sc.nextLine();
        System.out.println("Olá, " + user_name + "! Bem-vindo ao Java!");
        sc.close();
    }
}