import java.util.HashSet;
import java.util.Set;


public class ContadorTask implements Runnable {
    
    private int numero = 0;
    private final Set<Integer> numeros = new HashSet<>();
    private static final int MAX = 10000;


    public synchronized int proximo() {
        return numero++;
    }

    public boolean continua() {
        return numero < MAX;
    }

    @Override
    public void run() {
        try {
            while (continua()) {
                int proximoNumero = proximo();
                

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