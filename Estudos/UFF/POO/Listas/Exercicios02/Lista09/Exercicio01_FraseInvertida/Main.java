
public class Main {

    public static void main(String[] args) {
        try {
            String entrada = "Faça um programa que escreva a frase invertida";
            System.out.println(entrada);
            InversorFrase inversor = new InversorFrase(entrada);
            String resultado = inversor.inverterPalavras();
            System.out.println("Frase invertida");
            System.out.println(resultado);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("---------------");

            String entradaInvalida = "   ";            
            InversorFrase inversorInvalido = new InversorFrase(entradaInvalida);
            String resultado = inversorInvalido.inverterPalavras();
            System.out.println(resultado);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada com sucesso! Mensagem: " + e.getMessage());
        }
    }
}