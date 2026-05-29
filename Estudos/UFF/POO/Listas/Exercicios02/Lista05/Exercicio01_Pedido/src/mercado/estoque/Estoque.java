package src.mercado.estoque;

import java.util.ArrayList;
import java.util.List;

import src.mercado.produto.Produto;
import src.mercado.estoque.produto_estoque.ProdutoEstoque;
// import src.mercado.item_pedido;

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

    // private int getProdutosEstoque(Produto produto, Pedido pedido){
    //     List<ItemPedido> itens = pedido.getItens();
    //     int quantidade_no_carrinho = 0;
    //     for (ItemPedido item : itens) {
    //         Produto produto_carrinho = item.produto;
    //         if(produto_carrinho.nome == produto.nome){
    //             quantidade_no_carrinho += item.quantidade;
    //         }
    //     }

    //     int quantidade_disponivel = produto.quantidadeEstoque - quantidade_no_carrinho; 

    //     return quantidade_disponivel;
    // }
}
