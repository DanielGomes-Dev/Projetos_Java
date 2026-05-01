import java.util.Scanner;

public class ProdutoDesconto {

    /*
    Exercício 6: Faça um programa que para cada produto informado (nome, preço e
    quantidade), escreva o nome do produto comprado e o valor total a ser pago, considerando
    que são oferecidos descontos pelo número de unidades compradas, segundo as opções
    abaixo:
        a. Até 10 unidades: valor total
        b. de 11 a 20 unidades: 10% de desconto
        c. de 21 a 50 unidades: 20% de desconto
        d. acima de 50 unidades: 25% de desconto
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite o preço do produto: ");
        float preco = sc.nextFloat();

        float valorTotal;
        if(quantidade > 0 && quantidade <= 10){
            valorTotal = quantidade*preco;
        } else if (quantidade > 10 && quantidade <= 20){
            valorTotal = quantidade*preco*0.9f;
        } else if (quantidade > 20 && quantidade <= 50){
            valorTotal = quantidade*preco*0.8f;
        } else if (quantidade > 50){
            valorTotal = quantidade*preco*0.75f;
        } else {
            valorTotal = 0;
        }

        System.out.printf("Produto: %s%n Quantidade: %d%n Valor total a ser pago: R$%.2f%n", nome, quantidade, valorTotal);
        sc.close();
    }
}
