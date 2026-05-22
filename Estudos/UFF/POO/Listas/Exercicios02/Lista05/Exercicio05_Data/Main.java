public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO TESTES DA CLASSE DATA ---\n");

        System.out.println("Data Valida, não bissexta");
        Data d1 = new Data(15, 5, 2023);
        System.out.println("Valida: " + d1.dataValida());
        System.out.println("bissexto: " + d1.anoBissexto());
        System.out.print("imprime: ");
        d1.imprime();
        System.out.println();

        System.out.println("Data Valida, bissexta");
        Data d2 = new Data(29, 2, 2024);
        System.out.println("Valida " + d2.dataValida());
        System.out.println("bissexto " + d2.anoBissexto());
        System.out.print("imprime: ");

        d2.imprime("-");
        System.out.println();

        System.out.println("Data invalida");
        Data d3 = new Data(30, 2, 2024);
        System.out.println("Valida " + d3.dataValida());
        System.out.println("bissexto " + d3.anoBissexto());
        System.out.print("imprime: ");
        d3.imprime();
        System.out.println();
        
        System.out.println("\n--- FIM DOS TESTES ---");
    }
}