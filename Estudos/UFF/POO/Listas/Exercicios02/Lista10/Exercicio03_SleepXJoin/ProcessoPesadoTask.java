class ProcessoPesadoTask implements Runnable {
    
    private final String nomeProcesso;
    private final int tempoSimuladoMs;

    public ProcessoPesadoTask(String nomeProcesso, int tempoSimuladoMs) {
        this.nomeProcesso = nomeProcesso;
        this.tempoSimuladoMs = tempoSimuladoMs;
    }

    @Override
    public void run() {
        System.out.println("-> [" + nomeProcesso + "] Iniciou seu processamento.");
        
        try {
            System.out.println("   [" + nomeProcesso + "] Vai dormir (sleep) por " + tempoSimuladoMs + " ms...");
            Thread.sleep(tempoSimuladoMs); 
            
            System.out.println("   [" + nomeProcesso + "] Acordou após o término do tempo (sleep).");
        } catch (InterruptedException e) {
            System.err.println("   [" + nomeProcesso + "] Foi interrompida enquanto dormia: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        
        System.out.println("-> [" + nomeProcesso + "] Finalizou seu processamento (Estado: Terminado).");
    }
}