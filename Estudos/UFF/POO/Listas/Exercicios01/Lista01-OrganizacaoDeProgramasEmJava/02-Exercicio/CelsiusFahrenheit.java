import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Lista 01 - Exercicio 02");
        System.out.println("Digite a Temperatura em Celsius: ");
        int graus_celsius = sc.nextInt();
        float fahrenheit = (graus_celsius*1.8f)+32;
        
        System.out.println(graus_celsius + "°C equivalem a " + fahrenheit + "°F");

        sc.close();
    }
}
