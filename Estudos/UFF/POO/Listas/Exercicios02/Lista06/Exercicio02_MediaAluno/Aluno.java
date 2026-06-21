public class Aluno {
    
    private String nome;
    private double trabalho1;
    private double p1;
    private double trabalho2;
    private double p2;

    public Aluno(String nome) {
        this.nome = nome;
        this.trabalho1 = 0.0;
        this.p1 = 0.0;
        this.trabalho2 = 0.0;
        this.p2 = 0.0;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(double nota) {
        if (validarNota(nota)) {
            this.trabalho1 = nota;
        }
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double nota) {
        if (validarNota(nota)) {
            this.p1 = nota;
        }
    }

    public double getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(double nota) {
        if (validarNota(nota)) {
            this.trabalho2 = nota;
        }
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double nota) {
        if (validarNota(nota)) {
            this.p2 = nota;
        }
    }

    private boolean validarNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            return true;
        } else {
            System.out.println("Erro: A nota informada (" + nota + ") é inválida. Deve estar entre 0 e 10.");
            return false;
        }
    }


    public double calcularMedia() {
        return (this.trabalho1 + this.p1 + this.trabalho2 + this.p2) / 4.0;
    }


    public String verificarStatus() {
        double media = calcularMedia();
        
        if (media > 6.0) {
            return "Aprovado";
        } else if (media >= 4.0 && media <= 6.0) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }
}