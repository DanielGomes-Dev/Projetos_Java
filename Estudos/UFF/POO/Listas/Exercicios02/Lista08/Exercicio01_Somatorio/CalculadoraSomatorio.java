class CalculadoraSomatorio {
    private int somatorio;

    public CalculadoraSomatorio() {
        this.somatorio = 0;
    }


    public boolean adicionarNumero(int numero) {
        if (numero <= 0) {
            return false;
        }

        this.somatorio += numero;
        return true;
    }


    public int getSomatorio() {
        return this.somatorio;
    }
}