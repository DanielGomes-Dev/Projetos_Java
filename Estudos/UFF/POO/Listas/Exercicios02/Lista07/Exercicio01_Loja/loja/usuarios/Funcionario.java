package loja.usuarios;

public class Funcionario extends Usuario {

    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }

    public void venderProduto(String produto, int quantidade) {
        if (quantidade > 0) {
            System.out.println("Funcionário [" + this.nome + "] realizou a venda de " 
                                + quantidade + " unidade(s) de: " + produto);
        } else {
            System.out.println("Erro: Quantidade de venda inválida.");
        }
    }
}