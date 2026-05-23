import model.Animal;
import model.Homem;
import model.Cao;
import model.Gato;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[10];
        Random geradorAleatorio = new Random();


        for (int i = 0; i < animais.length; i++) {
            int escolha = geradorAleatorio.nextInt(3);

            if (escolha == 0) {
                animais[i] = new Homem();
                System.out.println(i+1 + "º Animal: Homem instanciado.");
            } else if (escolha == 1) {
                animais[i] = new Cao();
                System.out.println(i+1 + "º Animal: Cão instanciado.");
            } else {
                animais[i] = new Gato();
                System.out.println(i+1 + "º Animal: Gato instanciado.");
            }
        }
        System.out.println("----------");

        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                System.out.println(i+1 + "º animal diz:"  + animais[i].fala() );
            } else {
                System.out.println("Alerta: Objeto não inicializado na posição [" + i + "].");
            }
        }
    }
}