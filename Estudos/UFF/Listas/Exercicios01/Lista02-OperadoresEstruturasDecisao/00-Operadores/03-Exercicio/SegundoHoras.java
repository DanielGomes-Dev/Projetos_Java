import java.util.Scanner;

public class SegundoHoras {

    /*
    Exercício 3: Leia uma variável t com um tempo qualquer em segundos e imprima esse
    valor em hora, minuto e segundo.
    */

    public static void main (String[] args){
        // Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo
        System.out.println("Digite um valor em segundos para convertelo em horas");
        Scanner sc = new Scanner(System.in);
        int _segundos = sc.nextInt();
        // double horas =  (double) segundos / 60;
        
        int horas =  _segundos / 60;
        int minutos = _segundos % 60 / 60 ;
        int segundos = _segundos % 60 % 60 ;

        System.out.println(segundos + " equivale a " + String.format("%02d", horas) + "h:" + String.format("%02d", minutos) + "m:" + String.format("%02d", segundos) + "s");
        sc.close();
    }
    
}
