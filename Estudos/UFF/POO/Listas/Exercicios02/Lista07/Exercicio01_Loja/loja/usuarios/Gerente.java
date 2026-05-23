package loja.usuarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String senha) {
        super(nome, senha);
    }


    public void fecharCaixa() {
        System.out.println("Gerente [" + this.nome + "] realizou o fechamento do caixa com sucesso.");
    }
}