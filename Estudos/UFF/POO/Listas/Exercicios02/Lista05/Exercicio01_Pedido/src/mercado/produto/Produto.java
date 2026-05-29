package src.mercado.produto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        System.out.println("\n-----------\n");
        System.out.println("Criando Produto: " + nome);
        System.out.println("\n-----------\n");

        this.nome = nome;
        this.preco = preco;
    }

    public String getNomeProduto(){
        return this.nome;
    }

    
    public double getPrecoProduto(){
        return this.preco;
    }
}