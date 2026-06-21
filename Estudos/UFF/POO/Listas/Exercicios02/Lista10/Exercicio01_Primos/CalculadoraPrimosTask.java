class CalculadorPrimosTask implements Runnable {
    
    private final int limiteInferior;
    private final int limiteSuperior;
    private int quantidadePrimosEncontrados;

    public CalculadorPrimosTask(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.quantidadePrimosEncontrados = 0;
    }

    @Override
    public void run() {

        try {
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                if (isPrimo(i)) {
                    System.out.println(i);
                    this.quantidadePrimosEncontrados++;
                }
            }
        } catch (Exception e) {
            System.err.println("Erro inesperado na thread do intervalo [" 
                + limiteInferior + "-" + limiteSuperior + "]: " + e.getMessage());
        }
    }

    private boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false; 
        
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getQuantidadePrimosEncontrados() {
        return quantidadePrimosEncontrados;
    }
}