import java.util.HashSet;
import java.util.Set;

/**
 * Classe que atua como recurso compartilhado e tarefa executável.
 */
public class ContadorTask implements Runnable {
    
    // Estado compartilhado entre as threads
    private int numero = 0;
    private final Set<Integer> numeros = new HashSet<>();
    private static final int MAX = 10000;

    /**
     * Pilar da Rastreabilidade de Unidades:
     * A operação "numero++" não é atômica (ela lê, soma e atribui).
     * O modificador 'synchronized' converte esses 3 passos em uma única 
     * operação indivisível (atômica) perante as threads.
     * Ele garante que a região crítica seja acessada por uma thread por vez[cite: 146].
     */
    public synchronized int proximo() {
        return numero++;
    }

    public boolean continua() {
        return numero < MAX;
    }

    @Override
    public void run() {
        // Justificação de Ajuste: Exceções em threads não se propagam 
        // para a thread principal, logo, exigem bloco try-catch local[cite: 168, 169].
        try {
            while (continua()) {
                int proximoNumero = proximo();
                
                // Se o 'proximo()' não fosse sincronizado, teríamos Condições de Corrida[cite: 161].
                // Duas threads poderiam pegar o mesmo número e colidir no Set.
                // O método add retorna false se o elemento já existe na coleção.
                synchronized (numeros) {
                    if (!numeros.add(proximoNumero)) {
                        System.out.println("Colisão detectada no número: " + proximoNumero);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Erro na execução da thread: " + e.getMessage());
        }
    }
    
    public int getTamanhoSet() {
        return numeros.size();
    }
}