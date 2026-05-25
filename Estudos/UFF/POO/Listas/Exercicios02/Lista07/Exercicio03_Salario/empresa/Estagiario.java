package empresa;


public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBruto) {
        super(nome, salarioBruto); 
    }


    public double calcularImpostoRenda() { //Polimorfismo
        return 0.0;
    }
}