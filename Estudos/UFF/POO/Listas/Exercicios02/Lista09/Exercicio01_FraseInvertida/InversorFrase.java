import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class InversorFrase {

    private final String fraseOriginal;


    public InversorFrase(String fraseOriginal) {
        if (fraseOriginal == null || fraseOriginal.trim().isEmpty()) {
            throw new IllegalArgumentException("A frase fornecida não pode ser nula ou vazia.");
        }
        this.fraseOriginal = fraseOriginal;
    }


    public String inverterPalavras() {
        String[] palavrasVetor = this.fraseOriginal.trim().split("\\s+");
        
        List<String> listaPalavras = new ArrayList<>(Arrays.asList(palavrasVetor));
        
        Collections.reverse(listaPalavras);
        
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = 0; i < listaPalavras.size(); i++) {
            fraseInvertida.append(listaPalavras.get(i));
            
            if (i < listaPalavras.size() - 1) {
                fraseInvertida.append(" ");
            }
        }
        
        return fraseInvertida.toString();
    }

    public String getFraseOriginal() {
        return this.fraseOriginal;
    }
}