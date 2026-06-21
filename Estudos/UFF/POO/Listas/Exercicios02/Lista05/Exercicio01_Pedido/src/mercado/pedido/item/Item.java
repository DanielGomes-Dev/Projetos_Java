package src.mercado.pedido.item;
import src.mercado.produto.Produto;

public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        System.out.println("Gerando Item para o Carrinho");
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getTotalPrice() {
        return this.produto.getPrecoProduto() * this.quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    
    public Produto getProduct(){
        return this.produto;
    }
}