import java.util.Scanner; 

public class Main {


    public static int lerSegundosDoUsuario(Scanner scanner) {
        System.out.print("Digite o tempo em segundos a ser convertido: ");
        return scanner.nextInt();
    }


    public static void escreverResultado(Tempo tempoObjeto) {
        System.out.println(tempoObjeto.obterTempoFormatado());
        
        System.out.println("Horas extraídas: " + tempoObjeto.getHoras());
        System.out.println("Minutos extraídos: " + tempoObjeto.getMinutos());
        System.out.println("Segundos extraídos: " + tempoObjeto.getSegundos());
        System.out.println("----------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int segundosInformados = lerSegundosDoUsuario(sc);
        Tempo meuTempo = new Tempo(segundosInformados);

        escreverResultado(meuTempo);

        sc.close();
    }
}