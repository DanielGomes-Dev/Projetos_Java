import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            
            System.out.println("\nEstado da memória: " + calc.getMemoria());
            System.out.println("Opções:");
            System.out.println("    (1) Somar");
            System.out.println("    (2) Subtrair");
            System.out.println("    (3) Multiplicar");
            System.out.println("    (4) Dividir");
            System.out.println("    (5) Limpar memória");
            System.out.println("    (6) Sair do programa");
            System.out.println("");
            System.out.print("Qual opção você deseja? ");
            
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o valor a ser operado: ");
                double valor = sc.nextDouble();
                
                switch (opcao) {
                    case 1:
                        calc.somar(valor);
                        break;
                    case 2:
                        calc.subtrair(valor);
                        break;
                    case 3:
                        calc.multiplicar(valor);
                        break;
                    case 4:
                        calc.dividir(valor);
                        break;
                }
            } else if (opcao == 5) {
                calc.limparMemoria();
                System.out.println("Memória limpa com sucesso!");
            } else if (opcao == 6) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Escolha um número entre 1 e 6.");
            }
        }
        
        sc.close();
    }
}