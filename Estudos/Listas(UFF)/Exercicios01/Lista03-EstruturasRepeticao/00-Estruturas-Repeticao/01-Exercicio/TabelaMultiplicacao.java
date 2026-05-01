
public class TabelaMultiplicacao {
    /*
    
    Exercício 1. Construa a tabela de multiplicação de números de 1 a 10
    (Ex.: 1 x 1 = 1, 1 x 2 = 2, etc.).
    
    */
    public static void main (String[] args){

        int tabelas = 10;
        int mult = 10;

        for (int i = 0; i<=tabelas; ++i) {
            System.out.println("--- Tabela de " + i + " ---");

            for (int j = 0; j <= mult; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
            System.out.println("---");
        }
        
    }
}
