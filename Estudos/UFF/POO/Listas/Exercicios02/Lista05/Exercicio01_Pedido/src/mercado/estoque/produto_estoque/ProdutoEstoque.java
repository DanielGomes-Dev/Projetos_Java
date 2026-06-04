package src.mercado.estoque.produto_estoque;

import src.mercado.produto.Produto;

public class ProdutoEstoque {

    public Produto produto;
    public int quantidade;

    

    public ProdutoEstoque(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
}
