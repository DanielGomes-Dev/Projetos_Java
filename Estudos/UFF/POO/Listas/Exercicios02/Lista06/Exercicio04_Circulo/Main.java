
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Circulo ---");
                
        System.out.println("Digite a coordenada X do centro: ");
        int x = sc.nextInt();
        
        System.out.println("Digite a coordenada Y do centro: ");
        int y = sc.nextInt();
        
        System.out.println("Digite o valor do raio: ");
        int raio = sc.nextInt();
        
        Circulo meuCirculo = new Circulo(x, y, raio);
        
        System.out.println("\n--- Propriedades do Círculo Criado ---");
        System.out.println("Centro no plano: (" + meuCirculo.getX() + ", " + meuCirculo.getY() + ")");
        System.out.println("Raio: " + meuCirculo.getRaio());
        
        System.out.printf("Área Calculada: %.4f\n", meuCirculo.calcularArea());
        System.out.printf("Perímetro Calculado: %.4f\n", meuCirculo.calcularPerimetro());
        

        sc.close();
    }
}