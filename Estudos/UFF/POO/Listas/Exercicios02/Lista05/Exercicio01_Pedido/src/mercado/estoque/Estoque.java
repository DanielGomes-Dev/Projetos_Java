package src.mercado.estoque;

import java.util.ArrayList;
import java.util.List;

import src.mercado.produto.Produto;
import src.mercado.estoque.produto_estoque.ProdutoEstoque;

public class Estoque {

    private List<ProdutoEstoque> produtos = new ArrayList<>();


    public Estoque(){

        System.out.println("\n-----------\n");
        System.out.println("Iniciando Estoque");
        System.out.println("\n-----------\n");

    }

    public void setProdutosEstoque(Produto produto, int quantidade){
        System.out.printf("Adicionando %d %s ao estoque de produtos.\n", quantidade, produto.getNomeProduto());
        ProdutoEstoque produtoEstoque = new ProdutoEstoque(produto, quantidade);
        produtos.add(produtoEstoque);
    }

    public List<ProdutoEstoque> getProdutosEstoque(){
        return produtos;
    }
}
