import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        
        String entradaUsuario = scanner.nextLine();
        
        try {
            AnalisadorFrase analisador = new AnalisadorFrase(entradaUsuario);
            
            int totalUnicas = analisador.contarPalavrasUnicas();
            
            System.out.printf("Frase analisada: \"%s\"\n", analisador.getFrase());
            System.out.printf("Número de palavras não repetidas: %d\n", totalUnicas);
            
        } catch (IllegalArgumentException e) {
            System.err.println("\nErro: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nPrograma encerrado com sucesso.");
        }
    }
}