
/*


## Sleep

* **O método `Thread.sleep(long millis)`:** Rastreia o **tempo**. Ele faz com que a *thread atual* (aquela que executou a instrução) pause sua execução e entre no estado de *Espera Temporizada* por um número designado de milissegundos. Ele não depende do estado de nenhuma outra thread, apenas do relógio do sistema.

Usamos `sleep()` quando queremos simular um atraso intrínseco, dar uma pausa proposital em um processamento contínuo (como um *polling*) ou ceder a CPU momentaneamente. 

## Join

* **O método `join()`:** Rastreia o **estado**. Ele é chamado a partir de uma instância de *outra* thread (ex: `t1.join()`) e faz com que a *thread atual* (geralmente a `main`) pare e entre no estado de *Espera* até que a thread `t1` atinja o estado *Terminado*.

Usamos `join()` quando temos uma dependência de dados: a thread principal não pode continuar até que a thread secundária tenha finalizado sua tarefa e consolidado seus resultados.


*/

public class Main {
    public static void main(String[] args) {
        System.out.println("[MAIN] Thread principal iniciada.");
        
        ProcessoPesadoTask tarefa = new ProcessoPesadoTask("Processo-A", 3000);
        
        Thread threadA = new Thread(tarefa);
        
        System.out.println("[MAIN] Disparando a Thread secundária...");
        threadA.start(); 
        
        try {
            System.out.println("[MAIN] Chamando threadA.join(). A Main ficará bloqueada aguardando...");
            
            threadA.join(); 
            
            System.out.println("[MAIN] threadA.join() liberado! Isso significa que a threadA terminou de fato.");
        } catch (InterruptedException e) {
            System.err.println("[MAIN] A thread principal foi interrompida enquanto aguardava: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        
        System.out.println("[MAIN] Thread principal finalizada de forma segura e sincronizada.");
    }
}