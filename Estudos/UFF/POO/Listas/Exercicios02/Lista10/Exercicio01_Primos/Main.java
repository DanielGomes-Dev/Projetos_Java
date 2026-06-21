import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        System.out.print("Informe o valor 'n' (limite superior para contagem de números primos): ");
        
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Erro: Entrada inválida. Você deve inserir um número inteiro válido.");
            return;
        } finally {
            scanner.close(); 
        }
        
        if (n < 0) {
            System.out.println("No domínio matemático atual, não estamos processando números negativos.");
            return;
        }

        int pontoCorteMetade = n / 2;
        
        CalculadorPrimosTask tarefa1 = new CalculadorPrimosTask(0, pontoCorteMetade);
        CalculadorPrimosTask tarefa2 = new CalculadorPrimosTask(pontoCorteMetade + 1, n);
        
        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        
        System.out.println("Iniciando a busca concorrente em duas Threads...");
        t1.start();
        t2.start();
        

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.err.println("A thread principal foi interrompida enquanto aguardava as tarefas: " + e.getMessage());
            Thread.currentThread().interrupt(); 
        }
        
        int totalPrimos = tarefa1.getQuantidadePrimosEncontrados() + tarefa2.getQuantidadePrimosEncontrados();
        
        System.out.println("\nProcessamento finalizado!");
        System.out.println("\nO número total de primos encontrados entre 0 e " + n + " é: " + totalPrimos);
    }
}