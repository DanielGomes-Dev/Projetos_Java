import java.util.HashSet;
import java.util.Set;

public class AnalisadorFrase {
    
    private String frase;

    public AnalisadorFrase(String frase) {
        setFrase(frase); 

    }
    public String getFrase() {
        return this.frase;
    }


    public void setFrase(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            throw new IllegalArgumentException("A frase fornecida não pode ser nula ou vazia.");
        }
        this.frase = frase;
    }


    public int contarPalavrasUnicas() {
        String fraseTratada = this.frase.trim().toLowerCase();
        
        String[] palavras = fraseTratada.split("\\s+");
        
        Set<String> conjuntoPalavras = new HashSet<>();
        
        for (String palavra : palavras) {
            String palavraLimpa = palavra.replaceAll("[.,;:!?]", "");
            if (!palavraLimpa.isEmpty()) {
                conjuntoPalavras.add(palavraLimpa); 
            }
        }
        
        return conjuntoPalavras.size();
    }
}