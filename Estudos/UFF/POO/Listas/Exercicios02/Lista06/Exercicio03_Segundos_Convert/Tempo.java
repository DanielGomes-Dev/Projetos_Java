public class Tempo {
    
    private int totalSegundos;
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int totalSegundos) {
        this.setTotalSegundos(totalSegundos);
    }


    public void setTotalSegundos(int totalSegundos) {
        if (totalSegundos >= 0) {
            this.totalSegundos = totalSegundos;
            this.calcularComponentes(); 
        } else {
            System.out.println("Erro: Tempo inválido. Não pode ser negativo. Atribuindo 0.");
            this.totalSegundos = 0;
            this.calcularComponentes();
        }
    }


    private void calcularComponentes() {
        this.horas = this.totalSegundos / 3600;
        int resto = this.totalSegundos % 3600;
        this.minutos = resto / 60;
        this.segundos = resto % 60;
    }


    public int getHoras() {
        return this.horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }


    public String obterTempoFormatado() {
        return this.horas + " hora(s), " + this.minutos + " minuto(s) e " + this.segundos + " segundo(s).";
    }
}