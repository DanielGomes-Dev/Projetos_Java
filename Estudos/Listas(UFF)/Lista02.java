import java.util.Scanner;

public class Lista02 {



    public static void exercicio3 (Scanner sc){
        // Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo
        System.out.println("Digite um valor em segundos para convertelo em horas");
        int _segundos = sc.nextInt();
        // double horas =  (double) segundos / 60;
        
        int horas =  _segundos / 60;
        int minutos = _segundos % 60 / 60 ;
        int segundos = _segundos % 60 % 60 ;



        System.out.println(segundos + " equivale a " + String.format("%02d", horas) + "h:" + String.format("%02d", minutos) + "m:" + String.format("%02d", segundos) + "s");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // exercicio1(sc);
        // exercicio2(sc);
        exercicio3(sc);


        /*
        
            `9999999999` é maior que o limite de `int` em Java.

            `int` suporta no máximo:

            ```java
            2147483647
            ```

            Como `9999999999` passa disso, `Scanner.nextInt()` lança `InputMismatchException`.

            Use `long` e `nextLong()`:

            ```java
            long segundos = scanner.nextLong();
            ```

            e faça as contas também com `long`:

            ```java
            long horas = segundos / 3600;
            long minutos = (segundos % 3600) / 60;
            long seg = segundos % 60;

            System.out.printf("%02dh:%02dm:%02ds%n", horas, minutos, seg);
            ```

            Para `9999999999`, a saída correta será:

            ```java
            2777777h:46m:39s
            ```

        */


        // float test_float = 1.3f; // So quebra na entrada do teclado temos que passar 1,3
        // System.out.println("Float " + test_float);
    }
}
