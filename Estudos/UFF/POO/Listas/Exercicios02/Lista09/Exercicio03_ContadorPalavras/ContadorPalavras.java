import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {

    private final Map<String, Integer> contagem;

    public ContadorPalavras() {
        this.contagem = new HashMap<>(); // Uso de HashMap conforme material complementar
    }


    public void contar(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            throw new IllegalArgumentException("A frase fornecida não pode ser nula ou vazia.");
        }

        this.contagem.clear();

        String fraseTratada = frase.toLowerCase()
                                   .replaceAll("[.,\\/#!$%^&*;:{}=\\-_`~()?]", "");

        String[] palavras = fraseTratada.split("\\s+");

        for (String palavra : palavras) {
            if (palavra.isEmpty()) {
                continue;
            }

            int frequenciaAtual = this.contagem.getOrDefault(palavra, 0);
            this.contagem.put(palavra, frequenciaAtual + 1); 
        }
    }

    public Map<String, Integer> getContagem() {
        return Collections.unmodifiableMap(this.contagem);
    }
}