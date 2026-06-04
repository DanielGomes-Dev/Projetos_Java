import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContadorPalavras contador = new ContadorPalavras();

        System.out.print("Digite uma frase para analisar: ");
        String frase = scanner.nextLine();

        try {
            contador.contar(frase);
            
            Map<String, Integer> resultado = contador.getContagem();

            for (String palavra : resultado.keySet()) {
                Integer total = resultado.get(palavra);
                System.out.printf("Palavra: '%s' \n\t Ocorrencias: %d%n", palavra, total);
            }
            
        } catch (IllegalArgumentException e) {
            System.err.printf("%nErro: %s%n", e.getMessage());
        } finally {
            scanner.close();
        }
    }
}