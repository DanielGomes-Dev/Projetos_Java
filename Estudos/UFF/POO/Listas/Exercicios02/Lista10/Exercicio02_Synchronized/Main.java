
/*

# Synchronized

## **Para que serve e quando usar?**

O `synchronized` permite delimitar regiões críticas do programa. 
Ele atua criando um monitor de controle, garantindo que um método ou bloco de código nunca será executado por mais de uma thread em paralelo. 
Quando uma thread deseja executar a região crítica, ela pede permissão; se outra thread já estiver executando, ela é bloqueada até o recurso ser liberado. 
Devemos utilizá-lo quando múltiplas threads acessam e manipulam dados compartilhados simultaneamente, prevenindo que a ordem de execução corrompa os dados ou cause inconsistências, fenômeno conhecido como "condições de corrida". 
Além disso, ele é essencial para garantir a atomicidade em operações que não são inerentemente atômicas no Java (como incremento de variáveis).


## **Por que não usar em todos os métodos?**

O acesso frequente a recursos compartilhados e sincronizados pode levar à contenção de *locks*, reduzindo o desempenho do programa. 
Além do problema de performance, o uso exagerado ou impróprio de múltiplos monitores pode gerar *Deadlocks*, uma situação grave onde duas ou mais threads ficam bloqueadas permanentemente, esperando por recursos que nunca serão liberados. 
Por isso, a boa prática exige minimizar os dados compartilhados para reduzir os riscos.

Para demonstrar isso, modelaremos uma classe `ContadorTask` que será acessada por múltiplas threads simultaneamente.

*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o processamento multithread...");
        
        ContadorTask contador = new ContadorTask();
        
        Thread[] threads = new Thread[10];
        

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(contador);
            threads[i].start(); 
        }
        

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join(); 
            } catch (InterruptedException e) {
                System.err.println("A thread principal foi interrompida.");
                Thread.currentThread().interrupt();
            }
        }
        

        System.out.println("Processamento finalizado!");
        System.out.println("Quantidade de números únicos processados: " + contador.getTamanhoSet());
        
        if (contador.getTamanhoSet() == 10000) {
            System.out.println("Status: SUCESSO. Nenhuma colisão!");
        } else {
            System.out.println("Status: FALHA. Ocorreram condições de corrida.");
        }
    }
}