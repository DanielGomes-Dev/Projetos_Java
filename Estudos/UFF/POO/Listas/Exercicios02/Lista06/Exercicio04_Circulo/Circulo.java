public class Circulo {
    private int x;
    private int y;
    private int raio;


    public Circulo(int x, int y, int raio) {
        this.x = x; 
        this.y = y;
        
        this.setRaio(raio);
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return this.raio;
    }


    public void setRaio(int raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            // caso o r <= 0
            this.raio = 1;
            System.out.println("Raio inválido, valor '1' sera selecionado como padrao para o raio.");

        }
    }

   
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}