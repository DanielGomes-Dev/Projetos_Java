
import java.util.Scanner;

class CalcularDistanciaPercorridaConsumoCombustivel {
    // Exercício 4: Faça um programa que leia a distância percorrida por um carro, o tempo gasto e a quantidade de gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o consumo de combustível (Km/l).
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida pelo carro (KM) : ");
        float distancia = sc.nextFloat();
        
        System.out.println("Digite o Tempo gasto para percorrer essa Distancia em (Hora) : ");
        float tempo = sc.nextFloat();

        System.out.println("Digite a quantidade de Gasolina consumida (Litros) : ");
        float gasolina = sc.nextFloat();
       
        float velocidadeMedia = (float) distancia/tempo; 
        float consumoCombustivel = (float) distancia/gasolina;

        System.out.println("Foram Consumidos " + String.format("%.2f", consumoCombustivel) + " Litros de Gasolina por Kilometro Rodado" );
        System.out.println("A velocidade média desse carro durante o trajeto foi de " + String.format("%.2f", velocidadeMedia));
        sc.close();
        
    }


}