import java.util.Scanner;

public class AnaliseFrase {

    /*
    
    Exercício 3. Escreva um programa em Java que analise uma palavra ou frase digitada pelo usuário e:
        ○ Exiba o número total de caracteres
        ○ Exiba tudo em maiúsculo
        ○ Exiba tudo em minúsculo
        ○ Conte quantas vezes a letra A aparece
    */
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in, "UTF-8");
        String frase = sc.nextLine();
        int totalCaracteres = frase.length();
        String fraseUpper = frase.toUpperCase();
        String fraseLower = frase.toLowerCase();

        int aQuantity = 0;
        // String aaa = "aáãâà"; // Depende do Enconding do Terminal para Contar A com acentos
        
        for (int i = 0; i < totalCaracteres; ++i){
            // if(
                //     fraseLower.charAt(i) == 'a' || 
                //     fraseLower.charAt(i) == 'á' || 
                //     fraseLower.charAt(i) == 'ã' || 
                //     fraseLower.charAt(i) == 'â' ||
                //     fraseLower.charAt(i) == 'à'
                
                // ) aQuantity += 1;
                
            // if(aaa.indexOf(fraseLower.charAt(i)) != -1) aQuantity += 1;

            // if(fraseLower.charAt(i) == "a") aQuantity += 1; // Não é possivel usar "" para comparar com char, apenas ''

            if(fraseLower.charAt(i) == 'a') aQuantity += 1;
            

        }


        System.out.println("Frase: " + frase);
        System.out.println("Numero total de caracteres: " + totalCaracteres);
        System.out.println("Tudo em maiúsculo: " + fraseUpper);
        System.out.println("Tudo em minúsculo: " + fraseLower);
        System.out.println("quantas vezes a letra A aparece: " + aQuantity);


        sc.close();

    }

}
